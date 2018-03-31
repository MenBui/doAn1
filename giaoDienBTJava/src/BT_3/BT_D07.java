
package BT_3;

import java.util.Scanner;


public class BT_D07 {
    public static String BT_D07(String arr) {
        String s="";
	char  [] str = arr.toCharArray();
	s+="Xau sau khi doi:\n";
	for (int i = 0; i < str.length; i++) {
	    if (Character.isDigit(str[i])) {
		str[i]='$';
	    }
	    s+=str[i];
	}
	s+="\nMSSV: 20166461";
       s+="Họ Tên: Bùi Thị Mến";
        return s;
    }
}


