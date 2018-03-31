
package BT_T1;

import java.util.Scanner;


public class BT_A09 {
   public static void main(String[] args) {
       System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
    int n;   
    Scanner nhap = new Scanner(System.in);
    System.out.println("Nhap so nguyen: ");
    n = nhap.nextInt();
    while(n<2)
    {
       System.out.println("Ban vua nhap mot so khong hop le.Vui long nhap lai: ");
       n = nhap.nextInt();
    }
    for(int i=2; i<=n;i++)
    {
       while(n%i==0)
       {
          n=n/i;
          if(n==1)
              System.out.print(i);
          else
              System.out.print(i+" x ");
       }
       if (n==1)
          break;
    }
 }
}