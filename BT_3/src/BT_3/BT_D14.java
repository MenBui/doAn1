
package BT_3;

import java.util.Scanner;


public class BT_D14 {
     public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 so N bat ky: ");
		int N = sc.nextInt();
		System.out.println("Xau S1= “1111100000”. ");
		String str = "1111100000";
		StringBuilder Sn = new StringBuilder(str);
		if (N == 1)
			System.out.println("Xau S1= “1111100000”. ");
		else {
			for (int i = 1; i < N; i++)
				Sn = doiViTri(Sn, N);
		}
		System.out.println("Xau Sn= " + Sn);		
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
