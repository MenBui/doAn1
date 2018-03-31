/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT_T1;
import java.util.Scanner;

public class BT_A03 extends SoNguyenTo {
 
    
    public static String BT_A03 (int n,int m){
       if(n>m){
       int tg=n;
       n=m;
       m=tg;
       }
           
           String s="";
        for(int i=n;i<=m; i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(i)){
                s+=i + " ";
            }
        }
        if(s=="")s+="Không có số nguyên tố nằm giữa " +n+ " và "+m;
        s+="\nMSSV: 20166461";
      s+="Họ Tên: Bùi Thị Mến";
      return(s);
    }
}
