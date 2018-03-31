
package BT_T1;

import java.util.Scanner;
public class BT_A10 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên N: ");
        int n = sc.nextInt();
        System.out.println("Ước số nguyên tố của "+n+" là: ");
        
        for(int i=1;i<=(int)n/2;i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(n)){
                System.out.print(n+"\n");
                break;
            }
            else if(n%i==0){
                if (SoNguyenTo.kiemTraSoNguyenTo(i)) {
                    System.out.print(i +" ");
                }
            }
        }
    }
}
