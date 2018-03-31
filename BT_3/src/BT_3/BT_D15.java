
package BT_3;

import java.util.Scanner;

public class BT_D15 {
    public static void main(String[] agrs) {
          System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
	Scanner sc=new Scanner(System.in);
	System.out.print("Nhap vao xau S1: ");
	String S1= sc.nextLine();
	StringBuilder SS1= new StringBuilder(S1);
		
	System.out.print("Nhap vao xau S2: ");
	String S2= sc.nextLine();
		
	SS1.insert(((SS1.length()/2)),S2) ; 
		
	System.out.print("Xau S1 sau khi chen vao S2:"+SS1 );
		
		
    }

}
