
package BT_3;

import java.util.Scanner;

public class BT_D10 {
     public static void main(String[] args){
    System.out.println("\nMSSV: 20166461");
    System.out.println("Họ Tên: Bùi Thị Mến");
    System.out.print("Nhập vào số lượng String:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    	sc.nextLine();
    String[] str = new String[n];
    int maxlength=0,save=0;
    System.out.println("Nhập vào các String");
    for(int i=0;i<n;i++){
    str[i] = sc.nextLine();
        if(str[i].length()>maxlength){
           maxlength=str[i].length();
           save=i;
        }
    }
        System.out.println("Xâu dài nhất là:"+str[save]);    
    }
}
   