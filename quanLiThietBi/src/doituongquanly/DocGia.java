/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doituongquanly;

/**
 *
 * @author Lê Anh Tuấn
 */
public class DocGia {
    private String MADOCGIA;
    private String TENDOCGIA;
    private String NGAYSINH;
    private String GIOITINH;
    private String SODIENTHOAI;
    private String EMAIL;
    private String QUEQUAN;

    public String getMADOCGIA() {
        return MADOCGIA;
    }

    public void setMADOCGIA(String MADOCGIA) {
        this.MADOCGIA = MADOCGIA;
    }

    public String getTENDOCGIA() {
        return TENDOCGIA;
    }

    public void setTENDOCGIA(String TENDOCGIA) {
        this.TENDOCGIA = TENDOCGIA;
    }

    public String getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(String NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getSODIENTHOAI() {
        return SODIENTHOAI;
    }

    public void setSODIENTHOAI(String SODIENTHOAI) {
        this.SODIENTHOAI = SODIENTHOAI;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getQUEQUAN() {
        return QUEQUAN;
    }

    public void setQUEQUAN(String QUEQUAN) {
        this.QUEQUAN = QUEQUAN;
    }

    public DocGia(String MADOCGIA, String TENDOCGIA, String NGAYSINH, String GIOITINH, String SODIENTHOAI, String EMAIL, String QUEQUAN) {
        this.MADOCGIA = MADOCGIA;
        this.TENDOCGIA = TENDOCGIA;
        this.NGAYSINH = NGAYSINH;
        this.GIOITINH = GIOITINH;
        this.SODIENTHOAI = SODIENTHOAI;
        this.EMAIL = EMAIL;
        this.QUEQUAN = QUEQUAN;
    }

    public DocGia() {
        super();
    }
    
    
}
