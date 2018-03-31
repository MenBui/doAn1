
package BT_T1;

import java.util.Scanner;
public class BT_A08 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên N: ");
        int n = sc.nextInt();
        for(int i=1;i<=(int)n/2;i++){
            if(n%i==0){
                if (SoNguyenTo.kiemTraSoNguyenTo(i)) {
                    System.out.println("Ước số nguyên tố nhỏ nhất của "+n+" là: ");
                    System.out.print(i +" ");
                    break;
                }
            }
        }
        
    }
}
