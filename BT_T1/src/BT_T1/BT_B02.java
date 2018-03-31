
package BT_T1;
import java.util.Scanner;
public class BT_B02 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số nguyên N");
        int n =sc.nextInt();
        System.out.println("Tổng S"+n+" là:");
        float s=0;
        for(int i=1;i<=n;i++){
            s +=(float)1/tinhGiaiThua(i);
        }
        System.out.println(s);
    }
    public static int tinhGiaiThua(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*tinhGiaiThua(n-1);
        }
    }
}
