package quanlithuvien;

import quanlithuvien.ConnectionDB;
import quanlithuvien.QLDG;
import quanlithuvien.DocGia;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        class ExcelHelperDG {

    public static
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

    public static
            ArrayList<DocGia> read(String fileName) throws Exception {
        File myFile = new File(fileName);
        ArrayList<DocGia> lstDocGia = new ArrayList<DocGia>();

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
                    String[] s = new String[8];
                    Cell cell = row.getCell(0);
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

                    Date Date = row.getCell(2).getDateCellValue();
                    if (Date == null) {
                        s[2] = "";
                    }
                    else {
                        s[2] = date.format(Date).toString();
                    }

                    s[3] = "" + (int) row.getCell(3).getNumericCellValue();

                    cell = row.getCell(4);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[4] = "";
                    }
                    else {
                        s[4] = cell.getStringCellValue();
                    }
                    cell = row.getCell(5);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[5] = "";
                    }
                    else {
                        s[5] = cell.getStringCellValue();
                    }
                    cell = row.getCell(6);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[6] = "";
                    }
                    else {
                        s[6] = cell.getStringCellValue();
                    }
                    cell = row.getCell(7);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[7] = "";
                    }
                    else {
                        s[7] = cell.getStringCellValue();
                    }

                    DocGia DG = new DocGia(s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7]);
                    lstDocGia.add(DG);
                }

            }

        }
        catch (Exception ex) {
            Logger.getLogger(ExcelHelperDG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstDocGia;

    }

    public static
            void readDG(String excelPath) throws Exception {
        ArrayList<DocGia> lstDocGia = read(excelPath);
        int dem = 0;
        try {
            for (int i = 0; i < lstDocGia.size(); i++) {

                if (lstDocGia.get(i).getEmail().equals("") || lstDocGia.get(i).getSoDT().equals("") || lstDocGia.get(i).getMaDG().equals("") || lstDocGia.get(i).getTenDG().equals("")
                        || lstDocGia.get(i).getSoCMND().equals("")) {
                    JOptionPane.showMessageDialog(null, "Không được bỏ trống các ô dữ liệu của độc giả thứ " + (i + 1), "Lỗi", JOptionPane.OK_OPTION);
                }

                else if (!checksymbol.checksymbol(lstDocGia.get(i).getSoCMND())) {
                    JOptionPane.showMessageDialog(null, "Số CMND của độc giả thứ " + (i + 1) + " phải là kiểu số nguyên!", "Lỗi", JOptionPane.OK_OPTION);
                }
                else if (!checksymbol.checksymbol(lstDocGia.get(i).getSoDT())) {
                    JOptionPane.showMessageDialog(null, "Số điện thoại của độc giả thứ " + (i + 1) + " phải là kiểu số nguyên!", "Lỗi", JOptionPane.OK_OPTION);
                }
                else if (!lstDocGia.get(i).getMaDG().startsWith("DG")) {
                    JOptionPane.showMessageDialog(null, "Mã độc giả thứ " + (i + 1) + " phải bắt đầu bằng ký tự 'D"
                            + "G' !");
                }
                else {
                    Connection con = ConnectionDB.getConnectDB();
                    Statement st1 = con.createStatement();
                    String sql = "SELECT * FROM Bangdocgia WHERE [Mã độc giả]='" + lstDocGia.get(i).getMaDG()+ "'";
                    ResultSet rs = st1.executeQuery(sql);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Mã của độc giả thứ " + (i + 1) + " đã tồn tại.");
                    }
                    else {
                        sql = "INSERT INTO Bangdocgia  VALUES(?,?,?,?,?,?,?,?)";
                        PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                        st.setString(1, lstDocGia.get(i).getMaDG());
                        st.setString(2, lstDocGia.get(i).getTenDG());
                        st.setString(3, lstDocGia.get(i).getNgaySinh());
                        st.setString(4, lstDocGia.get(i).getGioiTinh());
                        st.setString(5, lstDocGia.get(i).getSoCMND());
                        st.setString(6, lstDocGia.get(i).getSoDT());
                        st.setString(7, lstDocGia.get(i).getEmail());
                        st.setString(8, lstDocGia.get(i).getQueQuan());
                        st.execute();
                        dem++;
                    }
                }

            }
            JOptionPane.showMessageDialog(null, "Thêm thành công " + dem + " độc giả!");
        }
        catch (SQLException ex) {
            Logger.getLogger(DocGia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Có lỗi. Chưa thêm thành công!", "Lỗi", JOptionPane.OK_OPTION);

        }

    }
}
