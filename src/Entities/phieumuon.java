/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Proceed.Giaotiep;
import java.io.Serializable;

/**
 *
 * @author Nguyễn Thị Anh
 */
public class phieumuon implements Serializable,Giaotiep{
     private int madausach;
    private int maphieumuon;
    private int madocgia;
     private String ngaymuon;

    public int getMadausach() {
        return madausach;
    }

    public void setMadausach(int madausach) {
        this.madausach = madausach;
    }

    public int getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(int maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public int getMadocgia() {
        return madocgia;
    }

    public void setMadocgia(int madocgia) {
        this.madocgia = madocgia;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    @Override
    public Object toObject() {
         return new Object[]{
            this.getMadausach(),this.getMaphieumuon(), this.getMadocgia(), this.getNgaymuon()
        };
    }
     
}
