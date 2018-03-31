
package BT_2;

import java.util.Scanner;
public class BT_C01{

    public static String BT_C01( int [] arr) {
        String s="";
        int i;
        int temp = arr[0];
        for (i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
       
        for (i = 0; i < arr.length; i++)
            s+=arr[i] + " ";
        s+="\nMSSV: 20166461";
        s+="\nHọ Tên: Bùi Thị Mến";
        return s;
    }
}

