package quanlithuvien;

import quanlithuvien.ConnectionDB;
import quanlithuvien.Sach;
import quanlithuvien.quanLisach;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class ExcelHelperSach {

    public static ArrayList<Sach> read(String fileName) throws Exception {
        File myFile = new File(fileName);
        ArrayList<Sach> lstSach = new ArrayList<Sach>();

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
                    } else {
                        s[0] = cell.getStringCellValue();
                    }

                    cell = row.getCell(1);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[1] = "";
                    } else {
                        s[1] = cell.getStringCellValue();
                    }

                    cell = row.getCell(2);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[2] = "";
                    } else {
                        s[2] = cell.getStringCellValue();
                    }

                    cell = row.getCell(3);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[3] = "";
                    } else {
                        s[3] = cell.getStringCellValue();
                    }

                    cell = row.getCell(4);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[4] = "";
                    } else {
                        s[4] = cell.getStringCellValue();
                    }
                    

                    
                    Sach SA = new Sach(s[0], s[1], s[2], s[3], s[4], (int) row.getCell(5).getNumericCellValue(), (int) row.getCell(6).getNumericCellValue(), (int) row.getCell(7).getNumericCellValue());
                    
                    lstSach.add(SA);
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(ExcelHelperSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstSach;

    }

    public static void readSach(String excelPath) throws Exception {
        ArrayList<Sach> lstSach = read(excelPath);
        int dem = 0;
        try {
            for (int i = 0; i < lstSach.size(); i++) {

                if (lstSach.get(i).getMaSach().equals("") || lstSach.get(i).getTenSach().equals("") || lstSach.get(i).getTacGia().equals("") || lstSach.get(i).getTheLoai().equals("")) {
                    JOptionPane.showMessageDialog(null, "Không được bỏ trống các ô dữ liệu của cuốn sách thứ " + (i + 1), "Lỗi", JOptionPane.OK_OPTION);
                } else if (!checksymbol.checksymbol("" + lstSach.get(i).getDonGia())) {
                    JOptionPane.showMessageDialog(null, "Đơn giá của cuốn sách thứ " + (i + 1) + " phải là kiểu số nguyên!", "Lỗi", JOptionPane.OK_OPTION);
                } else if (!checksymbol.checksymbol("" + lstSach.get(i).getNamXB())) {
                    JOptionPane.showMessageDialog(null, "Năm xuất bản của cuốn sách thứ " + (i + 1) + " phải là kiểu số nguyên!", "Lỗi", JOptionPane.OK_OPTION);
                } else if (!checksymbol.checksymbol("" + lstSach.get(i).getSoLuong())) {
                    JOptionPane.showMessageDialog(null, "Số lượng của cuốn sách thứ " + (i + 1) + " phải là kiểu số nguyên!", "Lỗi", JOptionPane.OK_OPTION);
                } else {
                    Connection con = ConnectionDB.getConnectDB();
                    Statement st1 = con.createStatement();
                    String sql = "SELECT * FROM Bangsach WHERE [Mã sách]='" + lstSach.get(i).getMaSach() + "'";
                    ResultSet rs = st1.executeQuery(sql);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Mã của cuốn sách thứ " + (i + 1) + " đã tồn tại.");
                    } else {
                        sql = "INSERT INTO Bangsach VALUES(?,?,?,?,?,?,?,?)";
                        PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                        st.setString(1, lstSach.get(i).getMaSach());
                        st.setString(2, lstSach.get(i).getTenSach());
                        st.setString(3, lstSach.get(i).getTacGia());
                        st.setString(4, lstSach.get(i).getTheLoai());
                        st.setString(5, lstSach.get(i).getNhaXB());
                        st.setString(6, "" + lstSach.get(i).getDonGia());
                        st.setString(7, "" + lstSach.get(i).getSoLuong());
                        st.setString(8, "" + lstSach.get(i).getNamXB());
                        
                        st.execute();
                        dem++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Thêm thành công " + dem + " cuốn sách!");
        } catch (SQLException ex) {
            Logger.getLogger(Sach.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Có lỗi. Chưa thêm thành công!", "Lỗi", JOptionPane.OK_OPTION);

        }

    }

}
