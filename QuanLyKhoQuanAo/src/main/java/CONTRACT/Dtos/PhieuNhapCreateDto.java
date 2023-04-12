/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTRACT.Dtos;

/**
 *
 * @author ADMIN
*/
public class PhieuNhapCreateDto {
	private String Maphieunhap;
    private int Soluongnhap;
    private double DonGia;
    
    public PhieuNhapCreateDto() {
    }

    public PhieuNhapCreateDto(String Maphieunhap, int Soluongnhap, double DonGia) {
        this.Maphieunhap = Maphieunhap;
        this.Soluongnhap = Soluongnhap;
        this.DonGia = DonGia;
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

    public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	@Override
    public String toString() {
        return "PhieuNhapCreateDto{" + "Maphieunhap=" + Maphieunhap + ", Soluongnhap=" + Soluongnhap + ", DonGia=" + DonGia + '}';
    }

   
    
}

