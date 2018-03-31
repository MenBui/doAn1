
package BT_3;

import java.util.Scanner;

public class BT_D02 {
    public static void main (String[] args){
       System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
       System.out.print("Nhập vào một chuỗi kí tự:");
       Scanner sc = new Scanner (System.in);
       String str= sc.nextLine();
       int dem=0;
       for(int i=0;i<str.length();i++){
       if(str.charAt(i)=='a' && str.charAt(i+1)=='b' && str.charAt(i+2)=='c' ){
       dem+=1;
       }
       }
       System.out.println("Số lần xuất hiện xâu con abc là:"+dem);
    }
}