
package BT_3;

import java.util.Scanner;

public class BT_D12 {
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
		if (arr.length == 1)
		System.out.print("Nguoi nay khong co ten dem!");
		else {
		if ((arr[arr.length - 2].equals("thi")) || arr[arr.length - 2].equals("Thi")) {
			dem++;			
		}
		}
	}
	System.out.print("So sinh vien ten dem la 'Thi' la:" + dem );	
    }
}


