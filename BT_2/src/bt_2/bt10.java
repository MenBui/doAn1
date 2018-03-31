
package bt_2;

import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        int tong =1;
        int chiSo =0;
        for(int i=n; i>1;i--){
            for(int j=0; j<n-i+1;j++){
                for( int k=j;k<i+j;k++){
                    if(arr[k]==arr[1+k]){
                        tong +=1;
                        chiSo =k;
                    }
                    else{
                        break;
                    }
                }
                if(tong==i){
                    System.out.println("dãy số nguyên dài nhất có giá trị bằng nhau là "+arr[chiSo]);
                    System.out.println("bắt đầu từ phần tử" + chiSo);
                }
                
            }
            
        }
    }
}
