
package bt_2;

import java.util.Scanner;

public class BT_C09 {
  public static void main(String[] args) {
      System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
      int sobangc=0, solonhonc=0, sonhohonc=0;
     System.out.print("Nhập số phần tử của mảng: ");
     Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
      System.out.print("Nhập số c: ");
      int c = sc.nextInt();
        for (int i=0; i < n; i++) {
                
            if(arr[i]==c){
                sobangc+=1;
            }
            if(arr[i]>c){
                solonhonc+=1;
            }
            if(arr[i]<c){
                sonhohonc+=1;
            }   
        } 
        System.out.println("Có "+sobangc+" số bằng c ");
        System.out.println("Có "+solonhonc+" số lớn hơn c ");
        System.out.println("Có "+sonhohonc+" số nhỏ hơn c ");
  }
}

