
package BT_T1;
import java.util.Scanner;
public class BT_A07 {
    public static String BT_A07(int n) {
        String s="";
        int countChiaHet = 0, countChiaDu1 = 0, countChiaDu2 = 0, countChiaDu3 = 0;
        int[] chiaHet =new int[20];
        int[] chiaDu1 =new int[20];
        int[] chiaDu2 =new int[20];
        int[] chiaDu3 =new int[20];
        for(int i=1;i<n;i++){
            int tG =i%5; 
            switch(tG){
                case 0:
                    chiaHet[countChiaHet]=i;
                    countChiaHet +=1;
                    break;
                case 1:
                    chiaDu1[countChiaDu1]=i;
                    countChiaDu1 +=1;
                    break;
                case 2:
                    chiaDu2[countChiaDu2]=i;
                    countChiaDu2 +=1;
                    break;
                case 3:
                    chiaDu3[countChiaDu3]=i;
                    countChiaDu3 +=1;
                    break;
                default:
                    break;
            }
        }
        s+="Trong các số tự nhiên < 100 có: \n->"+countChiaHet+ " số chia hết cho 5 đó là các số";
        for(int i=0;i<countChiaHet;i++){
            s+=chiaHet[i] + " ";
        }
        s+="\n->"+countChiaDu1+ " số chia cho 5 dư 1 đó là các số";
        for(int i=0;i<countChiaDu1;i++){
            s+=chiaDu1[i] + " ";
        }
        s+="\n->"+countChiaDu2+ " số chia cho 5 dư 2 đó là các số";
        for(int i=0;i<countChiaDu2;i++){
            s+=chiaDu2[i] + " ";
        }
        s+="\n->"+countChiaDu3+ " số chia cho 5 dư 3 đó là các số";
        for(int i=0;i<countChiaDu3;i++){
            s+=chiaDu3[i] + " ";
        }if(s=="")s+=" Không có số nào cả";
        s+="\nMSSV: 20166461";
        s+="Họ Tên: Bùi Thị Mến";
        return (s);
    }
}
