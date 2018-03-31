
package BT_3;

import java.util.Scanner;


public class BT_D08 {
    public static String BT_D08(String str,String str1) {
        String s=""; 
	
		
	int lengthstr= str.length();
	int dem=0;
	for(int i=0;i<str1.length()-lengthstr+1;i++) {
	if(str.equals(str1.substring(i, i+lengthstr))) {
	    dem++;
	}
	}
	s+="So lan xuat hien cua xau do la: "+dem ;
	s+="\nMSSV: 20166461";
         s+="Họ Tên: Bùi Thị Mến";	
        return s;
    }

}
