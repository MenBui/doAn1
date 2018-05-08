/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doituongquanly;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Lê Anh Tuấn
 */
public class ReadNhanVienFromExcel {
    private Object getCellValue(Cell cell) {
	    switch (cell.getCellType()) {
	    case Cell.CELL_TYPE_STRING:
	        return cell.getStringCellValue();
	 
	    case Cell.CELL_TYPE_BOOLEAN:
	        return cell.getBooleanCellValue();
	 
	    case Cell.CELL_TYPE_NUMERIC:
	        return cell.getNumericCellValue();
	    }
	 
	    return null;
	}
	
	public List<NhanVien> readNhanVienFromExcelFile(String excelFilePath) throws IOException {
	    List<NhanVien> listNhanViens = new ArrayList<>();
	    FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	 
	    Workbook workbook = getWorkbook(inputStream, excelFilePath);
	    Sheet firstSheet = workbook.getSheetAt(0);
	    Iterator<Row> iterator = firstSheet.iterator();
	 
	    while (iterator.hasNext()) {
	        Row nextRow = iterator.next();
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        NhanVien aNhanVien = new NhanVien();
	 
	        while (cellIterator.hasNext()) {
	            Cell nextCell = cellIterator.next();
	            int columnIndex = nextCell.getColumnIndex();
	 
	            switch (columnIndex) {
	            case 0:
	                aNhanVien.setMANV((String) getCellValue(nextCell));
	                break;
	            case 1:
	                aNhanVien.setTENNHANVIEN((String) getCellValue(nextCell));
	                break;
	            case 2:
	                aNhanVien.setNGAYSINH((String) getCellValue(nextCell));
	                break;
                    case 3:
                        aNhanVien.setGIOITINH((String) getCellValue(nextCell));
                        break;
                    case 4:
                        aNhanVien.setSODIENTHOAI((String) getCellValue(nextCell));
                        break;
                    case 5:
                        aNhanVien.setEMAIL((String) getCellValue(nextCell));
                        break;
                    case 6:
                        aNhanVien.setCHUCVU((String) getCellValue(nextCell));
                        break;
	            }
                   
	 
	 
	        }
	        listNhanViens.add(aNhanVien);
	    }
	 
	    workbook.close();
	    inputStream.close();
	 
	    return listNhanViens;
	}
        
        private Workbook getWorkbook(FileInputStream inputStream, String excelFilePath)
	        throws IOException {
	    Workbook workbook = null;
	 
	    if (excelFilePath.endsWith("xlsx")) {
	        workbook = new XSSFWorkbook(inputStream);
	    } else if (excelFilePath.endsWith("xls")) {
	        workbook = new HSSFWorkbook(inputStream);
	    } else {
	        throw new IllegalArgumentException("The specified file is not Excel file");
	    }
	 
	    return workbook;
	}
}
