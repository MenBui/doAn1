
package bt_2;

import java.util.Scanner;

public class BT_C12 {
   static String a = new String();
	static String b = new String();
	static void Input(){
		Scanner Inp = new Scanner(System.in);
		a = Inp.nextLine();
		b = Inp.nextLine();
	}
	
	static boolean Check(){
		int i = 0;
		int m = a.length();
		int j = 0;
		int n = b.length();
		
		while(i <= m - 1 && j <= n - 1){
			if(a.charAt(i) == b.charAt(j)){
				i ++;
				j ++;
			}
			else {
				j ++;
			}
		}
		if(i < m - 1 || ((i == m - 1) && a.charAt(m - 1) != b.charAt(j)))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Input();
		if(Check()){
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
	}

}
