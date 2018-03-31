
package BT_T1;
import java.util.Scanner;

public class BT_B01 {
    public static String BT_B01(int n) {
        String s="";
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Tổng S"+n+" bằng: ");
        float k=0;
        for(int i=0; i<=n;i++){
            k +=f(i);
        }
       s+=k;
        s+="\nMSSV: 20166461";
       s+="Họ Tên: Bùi Thị Mến";
       return s;
    }
    public static double f(int n){
        if(n==0){
            return 0;
        }
        return (float)2/(n*(1+n));
    }
}
