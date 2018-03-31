
package bt_2;

import java.util.Scanner;

public class BT_C10 {
   
		static int Count(int arr[],int index, int amount){
		int leng = 1;
		for(int i = index + 1 ; i < amount ; i ++){
			if(arr[i] == arr[i - 1]){
				leng ++;
			}else {
				break;
			}
		}
		return leng;
	}
	
	static String Seek(int [] arr,int amount){
            int []B=new int[amount];
            String s="";
		int maxLeng = 0;
		int index = 0,t=0;
		for(int i = 0 ; i < amount - 1; i ++){
			int leng = Count(arr,i, amount);
                        
                        if (leng == maxLeng) {
                            B[t]=i;
                            t++;
                        }
			if(leng > maxLeng){
				for (int j=0;j<t;j++){
                                    B[j]='\0';
                                }
                                t=0;
                                B[t]=i;
                                t++;
				maxLeng = leng;
			}
		}
		s+="Chi so: ";
                for (int i=0;i<t;i++){
                    s+=B[i]+" ";
                }
                s+="\n Độ dài: "+maxLeng;
                return s;
	}
	public static String BT_C10( int [] arr) {
		String s="";
		int amount=arr.length;
                
		s+=Seek(arr, amount);
               return s;   
	}
}
