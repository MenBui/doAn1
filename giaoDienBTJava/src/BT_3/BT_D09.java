
package BT_3;

import java.util.Scanner;

public class BT_D09 {
    public static String BT_D09(String str,int i,int j) {
         String s=""; 
	
		
		System.out.print("j=");
		
		if(i>str.length()||j>str.length()) {
		s+="i va j khong hop le!.Thoat khoi chuong trinh! ";
		}
		else {s+="Xau sau khi doi cho vi tri 'i' va 'j':";
			StringBuilder str1 = new StringBuilder(str);
			char temp;
				temp = str1.charAt(i);
			str1.insert(i, str1.charAt(j));
			str1.deleteCharAt(i + 1);
			str1.insert(j, temp);
			str1.deleteCharAt(j + 1);
			s+=str1;
		}
	    s+="\nMSSV: 20166461";
            s+="\nHọ Tên: Bùi Thị Mến";	
        return s;
	}

}