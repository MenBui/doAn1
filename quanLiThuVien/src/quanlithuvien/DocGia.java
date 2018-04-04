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
public class DocGia {

    private String MaDG;
    private String TenDG;
    private String NgaySinh;
    private String GioiTinh;
    private String SoCMND;
    private String SoDT;
    private String Email;
    private String QueQuan;

    DocGia() {

    }

    public DocGia(String MaDG, String TenDG, String NgaySinh, String GioiTinh, String SoCMND, String SoDT, String Email, String QueQuan) {
        this.MaDG = MaDG;
        this.TenDG = TenDG;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SoCMND = SoCMND;
        this.SoDT = SoDT;
        this.Email = Email;
        this.QueQuan = QueQuan;
    }

    public String getMaDG() {
        return MaDG;
    }

    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    public String getTenDG() {
        return TenDG;
    }

    public void setTenDG(String TenDG) {
        this.TenDG = TenDG;
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
