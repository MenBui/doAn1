
package BT_T1;

import java.util.Scanner;
public class BT_B04 {
    public static String BT_B04(int n) {
        
        String s="";
        Scanner sc= new Scanner(System.in);
        
        
        s+=F(n);
       for( int i=1;i<=n;i++)
           s+= " "+F(i) ;
           
          if(s=="") 
        s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến";
        return s;
    }
    public static long F(int n){
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return F(n-1)+ F(n-2);
               
        }   
    }
}
