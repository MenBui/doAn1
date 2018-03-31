
package BT_T1;
import java.util.Scanner;

public class BT_A02 extends SoNguyenTo{
    public static String BT_A02(int n) {
       String s="";
         int dem =0;
        int soNguyen =0;
       
        while(dem<n){
            if(SoNguyenTo.kiemTraSoNguyenTo(soNguyen)){
                s+=soNguyen + " ";
                dem+=1;
            }
            soNguyen+=1;
        }
        if(s=="")s+="không có số nguyên tố nào cả";
         s+="\nMSSV: 20166461";
         s+="Họ Tên: Bùi Thị Mến";
         return(s);
    }
}
