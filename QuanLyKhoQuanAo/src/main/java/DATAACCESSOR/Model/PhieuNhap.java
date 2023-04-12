/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATAACCESSOR.Model;

/**
 *
 * @author ADMIN
 */
import java.util.Date;

public class PhieuNhap {
	
	    private String Maphieunhap;
	    private int Soluongnhap;	   
	    private String Nhacungcap;
	    private double DonGia;
	    private Date Ngaynhap;
	    private boolean IsDelete;
	
	    public PhieuNhap() {
	    }

	    public PhieuNhap(String Maphieunhap, int Soluongnhap, String Nhacungcap,double DonGia, Date Ngaynhap, boolean IsDelete) {
	        this.Maphieunhap = Maphieunhap;
	        this.Soluongnhap = Soluongnhap;
	        this.Ngaynhap = Ngaynhap;
	        this.Nhacungcap = Nhacungcap;
	        this.DonGia = DonGia;
	        this.IsDelete = IsDelete;
	    }

	    public String getMaphieunhap() {
	        return Maphieunhap;
	    }

	    public void setMaphieunhap(String Maphieunhap) {
	        this.Maphieunhap = Maphieunhap;
	    }

	    public int getSoluongnhap() {
	        return Soluongnhap;
	    }

	    public void setSoluongnhap(int Soluongnhap) {
	        this.Soluongnhap = Soluongnhap;
	    }

	    public Date getNgaynhap() {
	        return Ngaynhap;
	    }

	    public void setNgaynhap(Date Ngaynhap) {
	        this.Ngaynhap = Ngaynhap;
	    }

	    public String getNhacungcap() {
	        return Nhacungcap;
	    }

	    public void setNhacungcap(String Nhacungcap) {
	        this.Nhacungcap = Nhacungcap;
	    }

	    public double getDonGia() {
	        return DonGia;
	    }

	    public void setDonGia(double DonGia) {
	        this.DonGia = DonGia;
	    }

	    public boolean isIsDelete() {
	        return IsDelete;
	    } 

	    public void setIsDelete(boolean IsDelete) {
	        this.IsDelete = IsDelete;
	    }
	  
	    @Override
	    public String toString() {
	        return "PhieuNhap{" + "Maphieunhap=" + Maphieunhap + ", Soluongnhap=" + Soluongnhap + ", Ngaynhap=" + Ngaynhap + ", Nhacungcap=" + Nhacungcap + ", DonGia=" + DonGia + ", IsDelete=" + IsDelete + '}';
	    }

	    
	

}

