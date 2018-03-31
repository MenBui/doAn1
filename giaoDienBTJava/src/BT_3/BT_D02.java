
package BT_3;

import java.util.Scanner;

public class BT_D02 {
    public static String BT_D02(String str){
       String s="";
       
       Scanner sc = new Scanner (System.in);
      
       int dem=0;
       for(int i=0;i<str.length();i++){
       if(str.charAt(i)=='a' && str.charAt(i+1)=='b' && str.charAt(i+2)=='c' ){
       dem+=1;
       }
       }
       s+="Số lần xuất hiện xâu con abc là:"+dem;
       s+="\nMSSV: 20166461";
       s+="Họ Tên: Bùi Thị Mến";
        return s;
    }
}