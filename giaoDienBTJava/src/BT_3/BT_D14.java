
package BT_3;

import java.util.Scanner;


public class BT_D14 {
     public static String BT_D14(String [] str,int N) {
        String s="";
		
		
		System.out.println("Xau S1= “1111100000”. ");
		String str1 = "1111100000";
		StringBuilder Sn = new StringBuilder(str1);
		if (N == 1)
			s+="Xau S1= “1111100000”. ";
		else {
			for (int i = 1; i < N; i++)
				Sn = doiViTri(Sn, N);
		}
		s+="Xau Sn= " + Sn;
                s+="\nMSSV: 20166461";
                s+="Họ Tên: Bùi Thị Mến";
         return s;
    }
	static StringBuilder doiViTri(StringBuilder a, int N) {
		StringBuilder str = new StringBuilder(a);
		char temp;
		for (int i = 0; i < 9; i++) {
			temp = str.charAt(i);
			str.insert(i, str.charAt(i + 1));
			str.deleteCharAt(i + 1);
			str.insert(i + 1, temp);
			str.deleteCharAt(i + 2);
		}
		return str;
	}
  
}
