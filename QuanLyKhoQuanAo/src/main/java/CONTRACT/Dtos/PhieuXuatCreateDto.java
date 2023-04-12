/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTRACT.Dtos;

/**
 *
 * @author ADMIN
 */
public class PhieuXuatCreateDto {
	private String Maphieuxuat;
	private String Tensp;
	private int Soluongxuat;
	public PhieuXuatCreateDto() {
		
	}
	public PhieuXuatCreateDto(String maphieuxuat, String tensp, int soluongxuat) {
		Maphieuxuat = maphieuxuat;
		Tensp = tensp;
		Soluongxuat = soluongxuat;
	}
	public String getMaphieuxuat() {
		return Maphieuxuat;
	}
	public void setMaphieuxuat(String maphieuxuat) {
		Maphieuxuat = maphieuxuat;
	}
	public String getTensp() {
		return Tensp;
	}
	public void setTensp(String tensp) {
		Tensp = tensp;
	}
	public int getSoluongxuat() {
		return Soluongxuat;
	}
	public void setSoluongxuat(int soluongxuat) {
		Soluongxuat = soluongxuat;
	}
	@Override
	public String toString() {
		return "PhieuXuatCreateDto [Maphieuxuat=" + Maphieuxuat + ", Tensp=" + Tensp + ", Soluongxuat=" + Soluongxuat
				+ "]";
	}
	
	
}

