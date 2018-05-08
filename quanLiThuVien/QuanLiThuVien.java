
package quanlithuvien;

import java.sql.*;



public class QuanLiThuVien { 
    static ConnectionDB kn=new ConnectionDB();
    public static void main(String [] args){
    Connection cn=kn.getConnectDB();
    Statement stm=null;
    ResultSet rs=null;
    String sql="select * from Bangdocgia";
        try {
          stm=cn.createStatement();
          rs=stm.executeQuery(sql);
          while(rs.next()){
              System.out.println("Mã độc giả:"+rs.getString(1)+"\tHọ và tên:"+rs.getString(2)+
                      "\t Ngày sinh:"+rs.getDate(3)+"\tGiới tính:"+rs.getString(4)+
                      "\t Số CMND:"+rs.getString(5)+"\t Số điện thoại:"+rs.getString(6)+"\tEmail:"+rs.getString(7)+"\t Quê quán:"+rs.getString(8));
          
          }
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
    }
    
}
