
package bt_2;

import java.util.Scanner;

public class BT_C05 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        int songuyento = 0, hopso = 0 ;
     System.out.print("Nhập số phần tử của mảng: ");
     Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }  
         for(int i=0;i<n;i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(arr[i])){
                System.out.println(arr[i]+" là số nguyên tố ");
                songuyento+=1;
            }
            else{
                System.out.println(arr[i]+" là hợp số ");
                hopso+=1;
            }
            
        }
       System.out.println(" có "+songuyento+" số nguyên tố ");
       System.out.println(" có "+hopso+" hợp số ") ;
    }   
}
