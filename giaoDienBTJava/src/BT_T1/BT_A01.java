
package BT_T1;
import java.lang.Math;
import java.util.Scanner;
public class BT_A01 extends SoNguyenTo {
    public static String BT_A01(int n) {
        
     String s="";
        for(int i=0;i<n;i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(i)){
            }
            else{
                s+=i + " ";
            }
        }
        if (s=="") s+="Không có số nguyên tố nào";
        s+="\nMSSV: 20166461";
        s+="HỌ TÊN: Bùi Thị Mến";
        return s;
    }
    
}
