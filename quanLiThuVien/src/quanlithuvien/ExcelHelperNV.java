package quanlithuvien;

import quanlithuvien.ConnectionDB;
import quanlithuvien.NhanVien;
import quanlithuvien.quanLiNhanVien;
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
public class ExcelHelperNV {

    public static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

    public static ArrayList<NhanVien> read(String fileName) throws Exception {
        File myFile = new File(fileName);
        ArrayList<NhanVien> lstNhanVien = new ArrayList<NhanVien>();

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

                    Date Date = row.getCell(2).getDateCellValue();
                    if (Date == null) {
                        s[2] = "";
                    } else {
                        s[2] = date.format(Date).toString();
                    }

                    s[3] = "" + (int) row.getCell(3).getNumericCellValue();

                    cell = row.getCell(4);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[4] = "";
                    } else {
                        s[4] = cell.getStringCellValue();
                    }
                    cell = row.getCell(5);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[5] = "";
                    } else {
                        s[5] = cell.getStringCellValue();
                    }
                    cell = row.getCell(6);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[6] = "";
                    } else {
                        s[6] = cell.getStringCellValue();
                    }
                    cell = row.getCell(7);
                    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                        s[7] = "";
                    } else {
                        s[7] = cell.getStringCellValue();
                    }
                    NhanVien NV = new NhanVien(s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7]);
                    lstNhanVien.add(NV);
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(ExcelHelperNV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstNhanVien;

    }

    public static void readNV(String excelPath) throws Exception {
        ArrayList<NhanVien> lstNhanVien = read(excelPath);
        int dem = 0;
        try {
            for (int i = 0; i < lstNhanVien.size(); i++) {

                if (lstNhanVien.get(i).getEmail().equals("") || lstNhanVien.get(i).getSoDT().equals("") || lstNhanVien.get(i).getMaNV().equals("") || lstNhanVien.get(i).getTenNV().equals("")
                        || lstNhanVien.get(i).getSoCMND().equals("")) {
                    JOptionPane.showMessageDialog(null, "Không được bỏ trống các ô dữ liệu của nhân viên thứ " + (i + 1), "Lỗi", JOptionPane.OK_OPTION);
                } else if (!checksymbol.checksymbol(lstNhanVien.get(i).getSoCMND())) {
                    JOptionPane.showMessageDialog(null, "Số CMND của nhân viên thứ " + (i + 1) + " phải là kiểu số nguyên!", "Lỗi", JOptionPane.OK_OPTION);
                } else if (!checksymbol.checksymbol(lstNhanVien.get(i).getSoDT())) {
                    JOptionPane.showMessageDialog(null, "Số điện thoại của nhân viên thứ " + (i + 1) + " phải là kiểu số nguyên!", "Lỗi", JOptionPane.OK_OPTION);
                } else if (!lstNhanVien.get(i).getMaNV().startsWith("NV")) {
                    JOptionPane.showMessageDialog(null, "Mã nhân viên thứ " + (i + 1) + " phải bắt đầu bằng ký tự 'NV' !");
                } else {
                    Connection con = ConnectionDB.getConnectDB();
                    Statement st1 = con.createStatement();
                    String sql = "SELECT * FROM Bangnhanvien WHERE [Mã NV]='" + lstNhanVien.get(i).getMaNV() + "'";
                    ResultSet rs = st1.executeQuery(sql);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Mã của nhân viên thứ " + (i + 1) + " đã tồn tại.");
                    } else {
                        sql = "INSERT INTO Bangnhanvien VALUES(?,?,?,?,?,?,?,?)";
                        PreparedStatement st = (PreparedStatement) con.prepareStatement(sql);
                        st.setString(1, lstNhanVien.get(i).getMaNV());
                        st.setString(2, lstNhanVien.get(i).getTenNV());
                        st.setString(3, lstNhanVien.get(i).getNgaySinh());
                        st.setString(4, lstNhanVien.get(i).getGioiTinh());
                        st.setString(5, lstNhanVien.get(i).getSoCMND());
                        st.setString(6, lstNhanVien.get(i).getSoDT());
                        st.setString(7, lstNhanVien.get(i).getEmail());
                        st.setString(8, lstNhanVien.get(i).getQueQuan());
                        st.execute();
                        dem++;
                    }
                }

            }
            JOptionPane.showMessageDialog(null, "Thêm thành công " + dem + " nhân viên!");
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Có lỗi. Chưa thêm thành công!", "Lỗi", JOptionPane.OK_OPTION);

        }

    }
}
