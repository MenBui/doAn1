
package BT_3;

import java.util.Scanner;


public class BT_D08 {
    public static void main(String[] agrs) {
         System.out.println("\nMSSV: 20166461");
         System.out.println("Họ Tên: Bùi Thị Mến");
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap vao xau ban dau: ");
	String Xaubo= sc.nextLine();
	System.out.println("Nhap vao xau con can tim kiem: ");
	String Xaucon= sc.nextLine();
		
	int lengthCon= Xaucon.length();
	int dem=0;
	for(int i=0;i<Xaubo.length()-lengthCon+1;i++) {
	if(Xaucon.equals(Xaubo.substring(i, i+lengthCon))) {
	    dem++;
	}
	}
	System.out.print("So lan xuat hien cua xau do la: "+dem );
		
    }

}
