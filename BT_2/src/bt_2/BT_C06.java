
package bt_2;

import java.util.Scanner;

public class BT_C06 {
     public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Số trong dãy thỏa mãn điều kiện là ước thực sự của một số khác trong dãy là \n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && arr[j]%arr[i]==0){
                    System.out.print(arr[i]+" ");
                    break;
                }
                else{
                    
                }
            }
        }
        
     }
}