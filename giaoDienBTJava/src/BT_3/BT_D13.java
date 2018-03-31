
package BT_3;

import java.util.Scanner;


public class BT_D13 {
    public static String BT_D13(String [] sinhvien,int N) {
         String s="";
	
	
	int dem = 0;
	for (int i = 0; i < N; i++) {
		String[] arr = sinhvien[i].trim().split(" ");
		char a = arr[arr.length - 1].charAt(0);
		if (a == 'h' || a == 'H') {
		dem++;
		}
	}
		s+="So sinh vien ten bat dau bang 'H' la:" + dem ;

		s+="\nMSSV: 20166461";
                 s+="Họ Tên: Bùi Thị Mến";
        return s;
    }

}
