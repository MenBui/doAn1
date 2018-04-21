package quanlithuvien;


import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Number;

public class ipBangDocGia {

    public static void main(String[] args) throws IOException,BiffException {
        File f = new File("C:\\Users\\menbt\\Desktop\\bangDocGia1.xls");
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s = wb.getSheet(0);
        int row = s.getRows();
        int col = s.getColumns();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Cell c = s.getCell(i, j);
                System.out.print(c.getContents()+"\t\t");

            }
            System.out.println("");

        }

    }

}
