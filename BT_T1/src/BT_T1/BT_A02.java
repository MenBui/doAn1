
package BT_T1;
import java.util.Scanner;

public class BT_A02 extends SoNguyenTo{
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        int dem =0;
        int soNguyen =0;
        System.out.println("20 số nguyên tố đầu tiên là: ");
        while(dem<20){
            if(SoNguyenTo.kiemTraSoNguyenTo(soNguyen)){
                System.out.print(soNguyen + " ");
                dem+=1;
            }
            soNguyen+=1;
        }
    }
}
