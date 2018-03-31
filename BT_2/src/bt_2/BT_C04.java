
package bt_2;

import java.util.Arrays;
import java.util.Scanner;

public class BT_C04 {
     public static void main(String[] args) {
         System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
     System.out.print("Nhập số phần tử của mảng: ");
     Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
               int max=arr[0];
               for (int i = 0; i < n; i++) {
               if (arr[i]>max) {
                    max=arr[i];
                }
                }
        System.out.println("giá trị lớn nhất: "+max);
        int vitri = Arrays.binarySearch(arr,max);
         System.out.println("vi tri cua " +max+" trong mang la "+vitri); 
    }            
}
    

