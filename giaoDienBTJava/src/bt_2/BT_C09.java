
package bt_2;

import java.util.Scanner;

public class BT_C09 {
  public static String BT_C09(int [] arr,int c) {
      String s="";
      int sobangc=0, solonhonc=0, sonhohonc=0;
     
    
        for (int i=0; i <arr.length; i++) {
                
            if(arr[i]==c){
                sobangc+=1;
            }
            if(arr[i]>c){
                solonhonc+=1;
            }
            if(arr[i]<c){
                sonhohonc+=1;
            }   
        } 
        s+="\nCó "+sobangc+" số bằng c ";
        s+="\nCó "+solonhonc+" số lớn hơn c ";
        s+="\nCó "+sonhohonc+" số nhỏ hơn c ";
        s+="\nMSSV: 20166461";
        s+="\nHọ Tên: Bùi Thị Mến";
        return s;
  }
}

