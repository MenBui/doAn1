
package bt_2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class BT_C07 {
    public static String BT_C07(int [] arr) {
       String s="";
        int dem=0;            
              int min=arr[0];
               for (int i = 0; i <arr.length; i++) {
               if (arr[i]<min) {
                    min=arr[i];
                }          
               if(arr[i]==min){
                   dem+=1;  
               }
               }
               if(dem==1){
               s+="Số tự nhiên nhỏ nhất không bằng số nào trong dãy trên là:"+min;
               }
               else{             
                   s+="Không có số tự nhiên nào nhỏ nhất không bằng số nào trong dãy trên";
            }
                
          s+="\nMSSV: 20166461";
          s+="\nHọ Tên: Bùi Thị Mến";  
          return s;
    }
}