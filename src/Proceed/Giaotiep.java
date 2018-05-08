/*
interface dùng để trao đổi dữ liệu,thông điệp giữa các class
ở đây, tạo interface để các thuộc tính của các lớp đối tượng có thể sử dụng được ở jframe
*/
package Proceed;

/**
 *
 * @author Trần Khắc Quân
 */
public interface Giaotiep {
    public Object toObject();
}
/*Vấn đề gặp phải là không thể đọc file và liên kết các thuộc tính trong các lớp khác nhau được chứa
trong các package khác nhau lại. Chính vì vậy nhóm đã tìm hiểu và tìm thấy phương thức toObject như
trình bày bên trên*/