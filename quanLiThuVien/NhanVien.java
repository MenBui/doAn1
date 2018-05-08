/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

/**
 *
 * @author menbt
 */
public class NhanVien {

    private String MaNV;
    private String TenNV;
    private String NgaySinh;
    private String GioiTinh;
    private String SoCMND;
    private String SoDT;
    private String Email;
    private String QueQuan;

    NhanVien() {

    }

    public NhanVien(String MaNV, String TenNV, String NgaySinh, String GioiTinh, String SoCMND, String SoDT, String Email, String QueQuan) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SoCMND = SoCMND;
        this.SoDT = SoDT;
        this.Email = Email;
        this.QueQuan = QueQuan;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

}
