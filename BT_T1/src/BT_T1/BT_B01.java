
package BT_T1;
import java.util.Scanner;

public class BT_B01 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số tự nhiên N ");
        int n =sc.nextInt();
        System.out.println("Tổng S"+n+" bằng: ");
        float s=0;
        for(int i=0; i<=n;i++){
            s +=f(i);
        }
        System.out.println(s);
    }
    public static double f(int n){
        if(n==0){
            return 0;
        }
        return (float)2/(n*(1+n));
    }
}
