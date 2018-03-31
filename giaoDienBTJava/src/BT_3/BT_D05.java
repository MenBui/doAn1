
package BT_3;

import java.util.Scanner;

public class BT_D05 {
    public static String BT_D05(String str){
       
    String s="";
       for(int i=0;i<str.length();i++){
       if(str.charAt(i)=='1' ){
           s+="0";
       }
       else{
           s+="1";
       }
       }
       s+="\nMSSV: 20166461";
       s+="\nHọ Tên: Bùi Thị Mến";
        return s;
    }
}
