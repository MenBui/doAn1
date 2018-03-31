
package BT_3;

import java.util.Scanner;

public class BT_D09 {
    public static void main(String[] agrs) {
          System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap vao xau ban dau: ");
		String Xaubo = sc.nextLine();
		System.out.print("Nhap vao i va j:\ni=");
		int i = sc.nextInt();
		System.out.print("j=");
		int j = sc.nextInt();
		if(i>Xaubo.length()||j>Xaubo.length()) {
		System.out.println("i va j khong hop le!.Thoat khoi chuong trinh! ");
		}
		else { System.out.println("Xau sau khi doi cho vi tri 'i' va 'j':");
			StringBuilder str = new StringBuilder(Xaubo);
			char temp;
				temp = str.charAt(i);
			str.insert(i, str.charAt(j));
			str.deleteCharAt(i + 1);
			str.insert(j, temp);
			str.deleteCharAt(j + 1);
			System.out.println(str);
		}
		
	}

}