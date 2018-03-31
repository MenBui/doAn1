
package bt_2;

import java.util.Arrays;
import java.util.Scanner;
public class BT_C03 {
    
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
              int min=arr[0];
               for (int i = 0; i < n; i++) {
               if (arr[i]<min) {
                    min=arr[i];
                }
                }
        System.out.println("giá trị nhỏ nhất: "+min);
        int vitri = Arrays.binarySearch(arr,min);
         System.out.println("vi tri cua " +min+" trong mang la "+vitri); 
    }            
}
    

