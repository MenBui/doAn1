
package bt_2;

import java.util.Scanner;

public class BT_C02 {

    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        Scanner sc =new Scanner(System.in);
        System.out.printf("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.printf("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ",i );
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(arr[i])){
                System.out.print(arr[i]+" ");
            }
         }
            
        }
    
}
