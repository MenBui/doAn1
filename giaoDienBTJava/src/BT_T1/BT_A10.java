
package BT_T1;

import java.util.Scanner;
public class BT_A10 {
    public static String BT_A10(int n) {
        String s="";
        Scanner sc = new Scanner(System.in);

       s+="Ước số nguyên tố của " +n+ " là: ";
        
        for(int i=1;i<=(int)n/2;i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(n)){
                System.out.print(n+"\n");
                break;
            }
            else if(n%i==0){
                if (SoNguyenTo.kiemTraSoNguyenTo(i)) {
                   s+=i +" ";
                }
            }
        }if(s=="")s+="Không có số nào cả";
       s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến";
        return s;
    }
}
