
package BT_T1;

public class BT_A05 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        System.out.println("Các số từ 1000 đến 2000 chia hết cho 3,5,7 là: ");
        for(int i=1001;i<2000;i++){
            if(i%3==0 && i%5==0 && i%7==0){
                System.out.print(i + " ");
            }
        }
    }
}
