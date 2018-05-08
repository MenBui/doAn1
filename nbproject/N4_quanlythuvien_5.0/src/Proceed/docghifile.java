//phần này để ghi các thông tin vào File và đọc File đã lưu.
package Proceed;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author Trần Khắc Quân
 */
public class docghifile {
    public void ghi(List list,String fileName){//tạo hàm ghi
        try   // thực thi code trong "try" này
            (FileOutputStream fos=new FileOutputStream(new File(fileName))){ //FileOutputStream cung cấp cho ta khả năng viết dữ liệu xuống file dưới dạng luồng bytes
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        }
        catch (Exception e){                                                //xử lý ngoại lệ
            System.out.println("got an exception");
        }
        /*
        -lý do 1 sử dụng cấu trúc try catch ở đây vì sai khi khởi tạo hàm ghi thông tin vào file thì lúc này vẫn chư có file
        vì vậy nếu không có xử lý ngoại lệ, chương trình sẽ dừng và lỗi. 
        -lý do thứ 2 là khi viết tới hàm này, Netbeans IDE báo lỗi và gợi ý sử dụng try catch*/
    }
     public ArrayList doc(String fileName){//tạo hàm đọc file
         ArrayList<Giaotiep> list;//tạo ra 1 danh sách dựa trên phương thức Giao tiếp đã làm
        list = new ArrayList();//khởi tạo mảng "list"
        try(FileInputStream fos=new FileInputStream(new File(fileName))){//FileInputStream cung cấp cho bạn khả năng đọc nội dung từ một file dưới dạng luồng bytes
            ObjectInputStream oos = new ObjectInputStream(fos);
            list = (ArrayList<Giaotiep>) oos.readObject();//đọc File rồi xuất sang mảng "list"
        }catch (Exception e){
            System.out.println("got an exception");
        }
        
        //lý do sử dụng cấu trúc try catch tương tự bên trên đã trình bày
        return list;
    }

    }

