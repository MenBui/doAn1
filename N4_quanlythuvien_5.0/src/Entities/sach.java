package Entities;

import Proceed.Giaotiep;
import java.io.Serializable;

/**
 *
 * @author Đinh Thu Hà
 */
public class sach implements Serializable,Giaotiep{ //lớp sách kế thừa lớp interface Giaotiep, dùng implement vì đây là quan hệ giữa lớp và interfacce
      private int masach,soluong;//khai báo biến mã sách và số lượng. kiểu số nguyên và phương thức truy cập là private
    private String tensach,tacgia,theloai, tinhtrang;//
/*sử dụng private vì có những trường hợp sau bắt buộc phải dùng ở dạng private để an toàn cho đối tượng.
    1.Những thuộc tính có tính biến đổi dữ liệu khi nhập và lấy dữ liệu
    2.Những phương thức chỉ dùng trong nội bộ trong lớp đó, không có sử dụng bên ngoài lớp
  Ở đây thuộc trường hợp thứ nhất.
    Tuy nhiên, để sử dụng được các thuộc tính trên ở các lớp khác hoặc package khác thì chúng ta cần public
    chúng ra như đã trình bày ở dưới đây.*/
    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    

    @Override  //ghi đè các thuộc tính của lớp Giao tiếp. lý do có lớp Giao tiếp sẽ được đề cập ở phần giải thích của lớp đó.
    public Object toObject() {
        return new Object[]{
            this.getMasach(),this.getTensach(),this.getTheloai(),this.getTacgia(), this.getSoluong(),this.getTinhtrang()
        };
    }

    }
   
