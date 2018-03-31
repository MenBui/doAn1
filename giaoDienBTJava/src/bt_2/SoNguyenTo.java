
package bt_2;

import java.util.Scanner;



public class SoNguyenTo {
    public static void main(String[] args){
        System.out.println("Nhap vao so de kiem tra: ");
         Scanner sc = new Scanner(System.in);
         int k = sc.nextInt();
         if (kiemTraSoNguyenTo(k)){
             System.out.println("So vua nhap la so nguyen to!");
         } else{
             System.out.println("So vu nhap KHONG la so nguyen to!");
         }
    }
    public static boolean kiemTraSoNguyenTo(int k){
        if(k<2){
            return false;
        }
        for(int i=2; i<=(int)Math.sqrt(k);i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
}
