
package bt_2;

import java.util.Scanner;

public class BT_C02 {

    public static String BT_C02(int [] arr) {
        String s="";
        
        for(int i=0;i<arr.length;i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(arr[i])){
                s+=arr[i] + " ";
            }
         }
        s+="\nMSSV: 20166461";
        s+="\nHọ Tên: Bùi Thị Mến";   
        return s;
    }
    
}
