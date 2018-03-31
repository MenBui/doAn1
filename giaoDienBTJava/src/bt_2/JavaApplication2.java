
package bt_2;

import java.util.Scanner;

public class JavaApplication2 {

   
     int a[];
public boolean KiemTraNguyenTo(int n){
  
    if(n<2)
    {
        return false;
    }

    for(int i=2; i<=Math.sqrt(n); i++)
    {
        if(n%i==0){
        return false;
}
    }
    return true;
}
public void nhapMang(){
    Scanner  scan = new Scanner(System.in);
    System.out.print("Nhap so phan tu cua mang: ");
    int n=scan.nextInt();
    a = new int[n];
    for (int i=0; i<a.length;i++)
    {
        System.out.print("Nhap phan tu thu"+(i+1)+": ");
        a[i] = scan.nextInt();
    }
}
public void xuatMang()
{
    for (int i=0; i<a.length;i++){
        System.out.print(a[i]+ "\t");
}
        System.out.println();
}
public void xuatSoNguyenTo(){
    for (int i=0; i<a.length;i++){
        if(KiemTraNguyenTo (a[i])){
            System.out.print(a[i]+ "\t");
}
        System.out.print(" ");
    }
}
    public static void main(String[] args) {
       JavaApplication2 kt = new JavaApplication2();
         kt.nhapMang();
         System.out.println("Mảng đã nhập là:");
         kt.xuatMang();
         System.out.println("Các số nguyên tố trong mảng đã nhập: ");
         kt.xuatSoNguyenTo();
    }
    }
   