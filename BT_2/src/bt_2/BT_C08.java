
package bt_2;

import java.util.Scanner;


public class BT_C08 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
    int n, i, c;
    Scanner sc= new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = sc.nextInt();
     while (n <= 0); 
    int arr[] = new int[n];
    System.out.println("Nhập các phần tử của mảng: \n");
    for (i = 0; i < n; i++) {
        System.out.printf("a[%d] = ", i);
        arr[i] = sc.nextInt();
    } 
    System.out.println("Nhập số nguyên k: ");
    int k = sc.nextInt();
    for (c = i = 0; i < n; i++) {
        if (arr[i] != k) {
            arr[c] = arr[i];
            c++;
        }
    }   
    n = c; 
    System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
    for (i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}
}