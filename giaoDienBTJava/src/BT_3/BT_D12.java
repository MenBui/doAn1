
package BT_3;

import java.util.Scanner;

public class BT_D12 {
    public static String BT_D12(String [] sinhvien,int N) {
         String s="";  
	
	
		
	
	int dem = 0;
	for (int i = 0; i < N; i++) {
		String[] arr = sinhvien[i].trim().split(" ");
		if (arr.length == 1)
		s+="Nguoi nay khong co ten dem!";
		else {
		if ((arr[arr.length - 2].equals("thi")) || arr[arr.length - 2].equals("Thi")) {
			dem++;			
		}
		}
	}
	s+="So sinh vien ten dem la 'Thi' la:" + dem ;
        s+="\nMSSV: 20166461";
       s+="Họ Tên: Bùi Thị Mến";
        return s;
    }
}


