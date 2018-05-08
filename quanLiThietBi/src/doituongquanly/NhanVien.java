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
public class NhanVien {
    private String MANV;
    private String TENNHANVIEN;
    private String NGAYSINH;
    private String GIOITINH;
    private String SODIENTHOAI;
    private String EMAIL;
    private String CHUCVU;

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTENNHANVIEN() {
        return TENNHANVIEN;
    }

    public void setTENNHANVIEN(String TENNHANVIEN) {
        this.TENNHANVIEN = TENNHANVIEN;
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

    public String getCHUCVU() {
        return CHUCVU;
    }

    public void setCHUCVU(String CHUCVU) {
        this.CHUCVU = CHUCVU;
    }

    public NhanVien(String MANV, String TENNHANVIEN, String NGAYSINH, String GIOITINH, String SODIENTHOAI, String EMAIL, String CHUCVU) {
        this.MANV = MANV;
        this.TENNHANVIEN = TENNHANVIEN;
        this.NGAYSINH = NGAYSINH;
        this.GIOITINH = GIOITINH;
        this.SODIENTHOAI = SODIENTHOAI;
        this.EMAIL = EMAIL;
        this.CHUCVU = CHUCVU;
    }

    public NhanVien() {
        super();
    }
    
    
    
}
