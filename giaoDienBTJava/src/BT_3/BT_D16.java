
package BT_3;

import java.util.Scanner;


public class BT_D16 {
    public static String BT_D16( String S1,String S2) {
         String s="";
	char[] arr1 = S1.toCharArray();
	char[] arr2 = S2.toCharArray();
	if (S1.length() > S2.length()) {
		s+="S1 khong phai xau con cua S2! ";
	} 
        else {
	int kt = S2.length();
	for (int i = 0; i < S2.length(); i++) {
	int dem = 0;
	for (int j = 0; j < S1.length(); j++) {
	if (arr2[i] == arr1[j]) {
		dem++;
	}
	}
	if (dem == 0)
	kt--;
	}
	if (kt >= S1.length())
	s+="S1 la xau con cua S2!";
	else
	s+="S1 khong phai xau con cua S2! ";
	}
        s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến";        
        return s;
    }
}
