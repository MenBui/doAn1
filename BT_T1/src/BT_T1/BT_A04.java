
package BT_T1;

public class BT_A04 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        System.out.println("Các số nhỏ hơn 100 chia hết cho 3,7 là: ");
        for(int i=1;i<100;i++){
            if(i%3==0 && i%7==0){
                System.out.print(i + " ");
            }
        }
    }
}
