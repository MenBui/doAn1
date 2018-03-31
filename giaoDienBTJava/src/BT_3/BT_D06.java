
package BT_3;

import java.util.Scanner;


public class BT_D06 {
    public static String BT_D06(String str){
        String s="";
       
      
       String reverse = new StringBuffer(str).reverse().toString();
       s+="Chuỗi kí tự ngược lại chuỗi kí tự cho trước là: "+reverse;
        s+="\nMSSV: 20166461";
       s+="Họ Tên: Bùi Thị Mến";
        return s;
    }
}
