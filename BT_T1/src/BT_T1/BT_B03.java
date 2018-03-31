
package BT_T1;
import java.util.Scanner;
public class BT_B03 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        System.out.println("Nhập số tự nhiên N");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Tổng S"+n+" là:");
        float s=0;
        for(int i=1;i<=n;i++){
            s +=(float)1/mauSo(i);
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
    public static int mauSo(int n){
        if(n==1){
            return 1;
        }
        else{
            return tinhGiaiThua(n)+mauSo(n-1);
        }
    }
}
