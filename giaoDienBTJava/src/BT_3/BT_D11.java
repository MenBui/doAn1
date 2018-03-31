
package BT_3;

import java.util.Scanner;

public class BT_D11{
    public static String BT_D11(String [] sinhvien,int N) {
                String s="";
		
		
		
		
		int dem = 0;
		for (int i = 0; i < N; i++) {
			String [] arr = sinhvien[i].trim().split(" ");
			if ((arr[arr.length-1].equals("an"))||arr[arr.length-1].equals("An")) {
				dem++;
			}
		}
		s+="So sinh vien ten An la:" + dem ;

                s+="\nMSSV: 20166461";
                s+="Họ Tên: Bùi Thị Mến";
        return s;
	}
}


