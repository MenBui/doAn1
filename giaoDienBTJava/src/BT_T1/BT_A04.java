
package BT_T1;

public class BT_A04 {
    public static String BT_A04(int n) {
        
        String s="";
        for(int i=1;i<n;i++){
            if(i%3==0 && i%7==0){
                s+=i + " ";
            }
        }if(s=="")s+="không có số nào cả";
        s+="\nMSSV: 20166461";
       s+="Họ Tên: Bùi Thị Mến";
        return(s);
    }
}
