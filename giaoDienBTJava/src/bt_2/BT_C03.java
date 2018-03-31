
package bt_2;

import java.util.Arrays;
import java.util.Scanner;
public class BT_C03 {
    
   public static String BT_C03(int [] arr) {
       String s="";
     
              int min=arr[0];
               for (int i = 0; i <arr.length; i++) {
               if (arr[i]<min) {
                    min=arr[i];
                }
                }
        s+="\ngiá trị nhỏ nhất: "+min;
        int vitri = Arrays.binarySearch(arr,min);
         s+="\nvi tri cua " +min+" trong mang la "+vitri; 
         s+="\nMSSV: 20166461";
        s+="\nHọ Tên: Bùi Thị Mến";
        return s;
    }            
}
    

