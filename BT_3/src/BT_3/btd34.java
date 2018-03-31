
package BT_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class btd34 {
   public static void main(String[] args) throws Exception {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Nhap ten cua ban: ");
String name = in.readLine();	
StringTokenizer str = new StringTokenizer(name);
int count = str.countTokens();

switch(count) {
case 2: 
System.out.println("Ho: " + str.nextToken());
System.out.println("Ten: " + str.nextToken());
break;

case 3: 
System.out.println("Ho: " + str.nextToken());
System.out.println("Chu lot: " + str.nextToken());
System.out.println("Ten: " + str.nextToken());
break;	

case 4: 
System.out.println("Ho: " + str.nextToken());
System.out.println("Chu lot: " + str.nextToken() + " " + str.nextToken());
System.out.println("Ten: " + str.nextToken());
break;	
}
}
}

