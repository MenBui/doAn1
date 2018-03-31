
package bt_2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class BT_C07 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        int dem=0;
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
               if(arr[i]==min){
                   dem+=1;  
               }
               }
               if(dem==1){
               System.out.println("Số tự nhiên nhỏ nhất không bằng số nào trong dãy trên là:"+min);
               }
               else{             
                   System.out.println("Không có số tự nhiên nào nhỏ nhất không bằng số nào trong dãy trên");
            }
                
                
    }
}