
package BT_3;

import java.util.Scanner;

public class BT_D15 {
    public static String BT_D15( String S1,String S2) {
         String s=""; 
	
	StringBuilder SS1= new StringBuilder(S1);
		
	SS1.insert(((SS1.length()/2)),S2) ; 
		
	s+="Xau S1 sau khi chen vao S2:"+SS1;
	s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến";	
        return s;
		
    }

}
