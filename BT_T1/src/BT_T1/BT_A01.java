
package BT_T1;
import java.lang.Math;
import java.util.Scanner;
public class BT_A01 extends SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
     System.out.println("Các hợp số nhỏ hơn 100 là: ");
        for(int i=0;i<100;i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(i)){
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println("\nMSSV: 20166461");
        System.out.println("HỌ TÊN: Bùi Thị Mến");
    }
}
