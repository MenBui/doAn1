
package BT_3;

import java.util.Scanner;


public class BT_D13 {
    public static void main(String[] args) {
         System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap vao so luong sinh vien: ");
	int N = sc.nextInt();
        String[] sinhvien = new String[N];
	sc.nextLine();

	System.out.println("Nhap vao ten ten cac sinh vien: ");
	for (int i = 0; i < N; i++) {
	System.out.print("Sinh vien " + (i + 1) + ":");
	sinhvien[i] = sc.nextLine();
	}
	int dem = 0;
	for (int i = 0; i < N; i++) {
		String[] arr = sinhvien[i].trim().split(" ");
		char a = arr[arr.length - 1].charAt(0);
		if (a == 'h' || a == 'H') {
		dem++;
		}
	}
		System.out.print("So sinh vien ten bat dau bang 'H' la:" + dem );

		
    }

}
