
package BT_T1;

public class BT_A05 {
    public static String BT_A05(int n,int m) {
       String s="";
        
        for(int i=n;i<m;i++){
            if(i%3==0 && i%5==0 && i%7==0){
                s+=i + " ";
            }
        }if(s=="")s+="không có số nào cả";
         s+="\nMSSV: 20166461";
         s+="Họ Tên: Bùi Thị Mến";
         return(s);
    }
}
