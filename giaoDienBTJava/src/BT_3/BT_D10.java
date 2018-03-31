
package BT_3;

import java.util.Scanner;

public class BT_D10 {
     public static String BT_D10(String [] arr,int n){
    String s="";
   
    int maxlength=0,save=0;
    
    for(int i=0;i<n;i++){
    
        if(arr[i].length()>maxlength){
           maxlength=arr[i].length();
           
        }
    }
        s+="Xâu dài nhất là:\n";    
        for (int i=0;i<n;i++){
            if (arr[i].length()==maxlength)
                s+=arr[i]+"\n";
        }
        s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến";
         return s;
    }
}
   