package Home;

import ConnectSQL.Connect;
import ConnectSQL.MuonTra;
import ConnectSQL.TaiKhoan;
import com.mysql.jdbc.PreparedStatement;
import giaodien.QL_MuonTra;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Bi Trẩn
 */
public
        class ExcelHelperTK {

    public static
            ArrayList<TaiKhoan> read(String fileName) throws Exception {
        File myFile = new File(fileName);
        ArrayList<TaiKhoan> lstTaiKhoan = new ArrayList<TaiKhoan>();

        int u;
        try {

            FileInputStream fis = new FileInputStream(myFile);
// Finds the workbook instance for XLSX file 
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
// Return first sheet from the XLSX workbook 
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
// Get iterator to all the rows in current sheet 

            for (int i = 1; i <= mySheet.getLastRowNum(); i++) {

                Row row = mySheet.getRow(i);// For each row, iterate through each columns 
                if (row != null && row.getLastCellNum() > 0) {
                    String[] s = new String[10];
                    Cell cell;
                    cell = row.getCell(0);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[0] = "";
                    }
                    else {
                        s[0] = cell.getStringCellValue();
                    }

                    cell = row.getCell(1);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[1] = "";
                    }
                    else {
                        s[1] = cell.getStringCellValue();
                    }
                    cell = row.getCell(2);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[2] = "";
                    }
                    else {
                        s[2] = cell.getStringCellValue();
                    }
                    cell = row.getCell(3);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[3] = "";
                    }
                    else {
                        s[3] = cell.getStringCellValue();
                    }
                    cell = row.getCell(4);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[4] = "";
                    }
                    else {
                        s[4] = cell.getStringCellValue();
                        if (s[4].toLowerCase().equals("admin"))s[4]="Admin";
                        else if (s[4].toLowerCase().equals("thủ thư")) s[4]="Thủ thư";
                        else s[4]="Độc giả";
                        
                    }

                    TaiKhoan TK = new TaiKhoan(s[0], s[1], s[2], s[3], s[4]);
                    lstTaiKhoan.add(TK);
                }

            }

        }
        catch (Exception ex) {
            Logger.getLogger(ExcelHelperTK.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstTaiKhoan;

    }

    public static
            void readTK(String excelPath) throws Exception {
        ArrayList<TaiKhoan> lstTaiKhoan = read(excelPath);
        int dem = 0;
        try {
            for (int i = 0; i < lstTaiKhoan.size(); i++) {

                if (lstTaiKhoan.get(i).getUsername().equals("") || lstTaiKhoan.get(i).getPassword().equals("")) {
                    JOptionPane.showMessageDialog(null, "Không được bỏ trống các username và password của tài khoản thứ " + (i + 1), "Lỗi", JOptionPane.OK_OPTION);
                }

                else if (!checkSymbol.checkNumber(lstTaiKhoan.get(i).getSoDT())) {
                    JOptionPane.showMessageDialog(null, "Số điện thoại của tài khoản thứ "+(i+1)+" phải là kiểu số nguyên!", "Lỗi", JOptionPane.OK_OPTION);
                }
                
                else if (lstTaiKhoan.get(i).getQuyen().equals("Admin")) {
                    JOptionPane.showMessageDialog(null, "Không thể thêm tài khoản thứ " + (i + 1) + " là Admin!", "Lỗi", JOptionPane.OK_OPTION);
                }

                else {
                    Connection con = Connect.Connect();

                    String sql = "INSERT INTO taikhoan(username,password,soDT,Email,quyen) VALUES(?,?,?,?,?)";
                    PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                    st.setString(1, lstTaiKhoan.get(i).getUsername());
                    st.setString(2, lstTaiKhoan.get(i).getPassword());
                    st.setString(3, lstTaiKhoan.get(i).getSoDT());
                    st.setString(4, lstTaiKhoan.get(i).getEmail());
                    st.setString(5, lstTaiKhoan.get(i).getQuyen());
                    st.execute();
                    dem++;
                }

            }
            JOptionPane.showMessageDialog(null, "Thêm thành công " + dem + " tài khoản!");
        }
        catch (SQLException ex) {
            Logger.getLogger(QL_MuonTra.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Có lỗi. Chưa thêm thành công!", "Lỗi", JOptionPane.OK_OPTION);

        }

    }
}
