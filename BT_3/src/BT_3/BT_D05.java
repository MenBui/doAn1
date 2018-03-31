
package BT_3;

import java.util.Scanner;

public class BT_D05 {
    public static void main (String[] args){
       System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
       System.out.print("Nhập vào một chuỗi kí tự:");
       Scanner sc = new Scanner (System.in);
       String str= sc.nextLine();
       for(int i=0;i<str.length();i++){
       if(str.charAt(i)=='1' ){
           System.out.print("0");
       }
       else{
           System.out.print("1");
       }
       }
    }
}
