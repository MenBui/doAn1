/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT_T1;
import java.util.Scanner;

public class BT_A03 extends SoNguyenTo {
    
    public static void main(String[] args){
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        System.out.println("Các số nguyên tố từ 1000 đến 2000 là: ");
        for(int i=1000;i<=2000; i++){
            if(SoNguyenTo.kiemTraSoNguyenTo(i)){
                System.out.print(i + " ");
            }
        }
    }
}
