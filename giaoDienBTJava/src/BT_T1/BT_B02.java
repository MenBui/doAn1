
package BT_T1;
import java.util.Scanner;
public class BT_B02 {
    public static String BT_B02(int n) {
       String s="";
        Scanner sc =new Scanner(System.in);
        
       s+="Tổng S"+n+" là:";
        float k=0;
        for(int i=1;i<=n;i++){
            k +=(float)1/tinhGiaiThua(i);
        }if(s=="")s+="Không có số nào cả";
        s+=k;
         s+="\nMSSV: 20166461";
         s+="Họ Tên: Bùi Thị Mến";
         return s;
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
