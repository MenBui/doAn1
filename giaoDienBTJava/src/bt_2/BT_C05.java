
package bt_2;

import java.util.Scanner;

public class BT_C05 {
    public static String BT_C05(int [] arr) {
       String s="";
        int songuyento = 0, hopso = 0 ;         
         for(int i=0;i<arr.length;i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(arr[i])){
                s+=arr[i]+" là số nguyên tố ";
                songuyento+=1;
            }
            else{
                s+=arr[i]+" là hợp số ";
                hopso+=1;
            }            
        }
       s+="\n có "+songuyento+" số nguyên tố ";
       s+=" \ncó "+hopso+" hợp số " ;
       s+="\nMSSV: 20166461";
        s+="\nHọ Tên: Bùi Thị Mến";
        return s;
    }   
}
