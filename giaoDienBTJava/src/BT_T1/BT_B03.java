
package BT_T1;
import java.util.Scanner;
public class BT_B03 {
    public static String BT_B03(int n) {
        String s="";
        
        Scanner sc =new Scanner(System.in);
       
        s+="Tổng S"+n+" là:";
        float k=0;
        for(int i=1;i<=n;i++){
            k +=(float)1/mauSo(i);
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
    public static int mauSo(int n){
        if(n==1){
            return 1;
        }
        else{
            return tinhGiaiThua(n)+mauSo(n-1);
        }
    }
}
