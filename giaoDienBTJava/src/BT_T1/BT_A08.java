
package BT_T1;

import java.util.Scanner;
public class BT_A08 {
    public static String BT_A08(int n ) {
        String s="";
        Scanner sc = new Scanner(System.in);
        
        
        for(int i=1;i<=(int)n/2;i++){
            if(n%i==0){
                if (SoNguyenTo.kiemTraSoNguyenTo(i)) {
                   s+="Ước số nguyên tố nhỏ nhất của "+n+" là: ";
                    s+=i +" ";
                    break;
                }
            }
        }if(s=="")s+="Không có số nào cả";
       s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến"; 
        return s;
    }
}
