
package bt_2;

import java.util.Arrays;
import java.util.Scanner;

public class BT_C04 {
     public static String BT_C04(int [] arr) {
        String s=""; 
     
               int max=arr[0];
               for (int i = 0; i <arr.length; i++) {
               if (arr[i]>max) {
                    max=arr[i];
                }
                }
        s+="\ngiá trị lớn nhất: "+max;
        int vitri = Arrays.binarySearch(arr,max);
         s+="\nvi tri cua " +max+" trong mang la "+vitri; 
         s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến";
        return s;
    }            
}
    

