
package BT_T1;

public class BT_A06 {
    public static void main(String[] args) {
        System.out.println("\nMSSV: 20166461");
        System.out.println("Họ Tên: Bùi Thị Mến");
        int dem=0;
        int soNguyen =1;
        System.out.println("5 số hoàn hảo đầu tiên là :");
        while(dem<5){
            if(soHoanHao(soNguyen)){
                System.out.print(soNguyen + " ");
                dem += 1;
            }
            soNguyen += 1;
        }
    }
    public static boolean soHoanHao(int n){
        int tong=0;
        for(int i=1;i<=(int)n/2;i++){
            if(n%i==0){
                tong+=i;
            }
        }
        if(tong==n&&n!=1){
            return true;
        }
        else return false;
    }
}
