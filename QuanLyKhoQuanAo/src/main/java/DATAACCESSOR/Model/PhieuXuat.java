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

public class PhieuXuat {
	private String Maphieuxuat;
	private String Tensp;
	private int Soluongxuat;
	private Date Ngayxuat;
	private boolean IsDelete;
	public PhieuXuat() {
	
	}
	public PhieuXuat(String maphieuxuat, String tensp, int soluongxuat, Date ngayxuat, boolean isDelete) {
		this.Maphieuxuat = maphieuxuat;
		this.Tensp = tensp;
		this.Soluongxuat = soluongxuat;
		this.Ngayxuat = ngayxuat;
		this.IsDelete = isDelete;
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
	public Date getNgayxuat() {
		return Ngayxuat;
	}
	public void setNgayxuat(Date ngayxuat) {
		Ngayxuat = ngayxuat;
	}
	public boolean isIsDelete() {
		return IsDelete;
	}
	public void setIsDelete(boolean isDelete) {
		IsDelete = isDelete;
	}
	@Override
	public String toString() {
		return "PhieuXuat [Maphieuxuat=" + Maphieuxuat + ", Tensp=" + Tensp + ", Soluongxuat=" + Soluongxuat
				+ ", Ngayxuat=" + Ngayxuat + ", IsDelete=" + IsDelete + "]";
	}
	
	
	
}

