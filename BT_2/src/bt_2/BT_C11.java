
package bt_2;

import java.util.Scanner;


public class BT_C11 {
   static int A[] = new int[100];
	
	public static void Input(int amount){
		Scanner Inp = new Scanner(System.in);
		for(int i = 0 ; i < amount ; i ++){
			A[i] = Inp.nextInt();
		}
	}
		static int Count(int index, int amount){
		int leng = 1;
		for(int i = index + 1 ; i < amount ; i ++){
			if(A[i] > A[i - 1]){
				leng ++;
			}else {
				break;
			}
		}
		return leng;
	}
	
	static void Seek(int amount){
		int maxLeng = 0;
		int index = 0;
		for(int i = 0 ; i < amount - 1; i ++){
			int leng = Count(i, amount);
			if(leng > maxLeng){
				index = i;
				maxLeng = leng;
			}
		}
		System.out.print("Chi so: " + index + "\nDo dai: " + maxLeng);
	}
	public static void main(String[] args) {
		Input(20);
		Seek(20);
	}

}