
package bt_2;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;


public class VD {
static boolean nguyento(int gh){
if (gh<3) {
return true;
}
for (int i = 3; i <= sqrt(gh); i++) {
if (gh%i==0) {
return false;
}
}
return true;
}
public static void main(String[] args) {
int arrInt[];
int n;
Scanner input =new Scanner(System.in);
System.out.println("nhap so phan tu n=: ");
n=input.nextInt();
arrInt = new int[n];
for (int i = 0; i < n; i++) {
System.out.println("nhap a[" +i+"] =");
arrInt[i]=input.nextInt();
}
for (int i = 0; i < n; i++) {
System.out.print(" a[" +i+"] =" + arrInt[i]+";");
}
int min=arrInt[0];
int max=arrInt[0];
for (int i = 0; i < n; i++) {
if (arrInt[i]<min) {
min=arrInt[i];
}
if (arrInt[i]>max) {
max=arrInt[i];
}
}
System.out.println("gia tri nho nhat: "+min);
System.out.println("gia tri lon nhat: "+max);
int dem=0;
for (int i = 0; i < n; i++) {
if (arrInt[i]%2==0) {
dem++;
}
}
System.out.println("so phan tu chan la: "+dem);
for (int i = 0; i < n; i++) {
if (nguyento(arrInt[i])) {
System.out.println("phan tu a["+i+"] ="+arrInt[i]+"nguyen to");
}
}
Arrays.sort(arrInt);
for (int i = 0; i < n; i++) {
System.out.print(" a[" +i+"] =" + arrInt[i]+";");
}
int x;
System.out.println("nhap x: ");
x=input.nextInt();
int vitri = Arrays.binarySearch(arrInt,x);
System.out.println("vi tri cua " +x+"trong mang la "+vitri);
}
}