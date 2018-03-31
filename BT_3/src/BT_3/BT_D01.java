
package BT_3;

import java.util.Scanner;

public class BT_D01 {
    public static void main(String[] args) {
       System.out.println("\nMSSV: 20166461");
       System.out.println("Họ Tên: Bùi Thị Mến");
       System.out.print("Nhập vào họ tên:");
       Scanner sc = new Scanner (System.in);
       String str= sc.nextLine();
        str = str.replaceAll("\\s+"," ");
        System.out.println(str);
    }
}