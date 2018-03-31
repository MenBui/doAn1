
package BT_3;

import java.util.Scanner;


public class BT_D07 {
    public static void main(String[] agrs) {
          System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao xau ban dau: ");
	String Xaubo = sc.nextLine();

	char[] str = Xaubo.toCharArray();
	System.out.print("Xau sau khi doi:\n");
	for (int i = 0; i < str.length; i++) {
	    if (Character.isDigit(str[i])) {
		str[i]='$';
	    }
	    System.out.print(str[i]);
	}
	
    }
}


