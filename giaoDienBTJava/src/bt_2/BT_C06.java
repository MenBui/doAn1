
package bt_2;

import java.util.Scanner;

public class BT_C06 {
     public static String BT_C06(int[] arr) {
        
        String s="";
        s+="Số trong dãy thỏa mãn điều kiện là ước thực sự của một số khác trong dãy là \n";
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[j]%arr[i]==0){
                    s+=arr[i]+" ";
                    break;
                }
                else{
                    
                }
            }
        }
        s+="\nMSSV: 20166461";
        s+="\nHọ Tên: Bùi Thị Mến";
        return s;
     }
}