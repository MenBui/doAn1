
package BT_T1;

import sun.applet.Main;

public class BT_A06 {
    public static String BT_A06(int n) {
     double  result;
     double tmp;
     double p=2;
     int j;
     int dem=0;
     String s="";
     while (dem<n){
         tmp=(Math.pow(2.0,p)-1);
     int flag=1;
     for (j=2;j<tmp;j++)
         if(tmp%j==0){
         flag=0;
         break;
         }
     if(flag==1){
     result=tmp * (Math.pow(2.0,p-1));
     s+=(int)result+" ";
     dem++;
     }
     p++;
    }if(s=="")s+="không có số nào cả";
    s+="\nMSSV: 20166461";
       s+="Họ Tên: Bùi Thị Mến";
    return s;
    
    }
}
