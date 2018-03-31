
package BT_3;

import java.util.Scanner;


public class BT_D06 {
    public static void main (String[] args){
       System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
       System.out.print("Nhập vào một chuỗi kí tự:");
       Scanner sc = new Scanner (System.in);
       String str= sc.nextLine();
       String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Chuỗi kí tự ngược lại chuỗi kí tự cho trước là: "+reverse);
}
}
