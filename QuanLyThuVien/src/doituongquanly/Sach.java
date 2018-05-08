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


import java.util.*;

public class Sach {
    
    private String MASACH;
    private String TENSACH;
    private String THELOAI;
    private String TACGIA;
    private String NHA_XB;
    private int SOLUONG;

    public String getMASACH() {
        return MASACH;
    }

    public void setMASACH(String MASACH) {
        this.MASACH = MASACH;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }

    public String getTHELOAI() {
        return THELOAI;
    }

    public void setTHELOAI(String THELOAI) {
        this.THELOAI = THELOAI;
    }

    public String getTACGIA() {
        return TACGIA;
    }

    public void setTACGIA(String TACGIA) {
        this.TACGIA = TACGIA;
    }

    public String getNHA_XB() {
        return NHA_XB;
    }

    public void setNHA_XB(String NHA_XB) {
        this.NHA_XB = NHA_XB;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public Sach(String MASACH, String TENSACH, String THELOAI, String TACGIA, String NHA_XB, int SOLUONG) {
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.THELOAI = THELOAI;
        this.TACGIA = TACGIA;
        this.NHA_XB = NHA_XB;
        this.SOLUONG = SOLUONG;
    }

    public Sach() {
        super();
    }

    
    
    
    
    
    
    
}
