
package BT_3;

import java.util.Scanner;


public class BT_D16 {
    public static void main(String[] agrs) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap vao xau S1: ");
	String S1 = sc.nextLine();
	System.out.print("Nhap vao xau S2: ");
	String S2 = sc.nextLine();
	char[] arr1 = S1.toCharArray();
	char[] arr2 = S2.toCharArray();
	if (S1.length() > S2.length()) {
		System.out.print("S1 khong phai xau con cua S2! ");
	} 
        else {
	int kt = S2.length();
	for (int i = 0; i < S2.length(); i++) {
	int dem = 0;
	for (int j = 0; j < S1.length(); j++) {
	if (arr2[i] == arr1[j]) {
		dem++;
	}
	}
	if (dem == 0)
	kt--;
	}
	if (kt >= S1.length())
	System.out.print("S1 la xau con cua S2!");
	else
	System.out.print("S1 khong phai xau con cua S2! ");
	}		
    }
}
