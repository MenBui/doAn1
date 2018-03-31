package BT_T1;

import java.util.Scanner;


public class BT_A09 {
   public static String BT_A09(int n) {
       String s=n+"=";    
       int i;
       for (i=2;i<=n;i++){
           while ((n>0) && (n%i==0)){
               s+=i+"x";
               n/=i;
           }
       }
        s=s.substring(0, s.length()-1);
        s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến";
        return s;
   }
}