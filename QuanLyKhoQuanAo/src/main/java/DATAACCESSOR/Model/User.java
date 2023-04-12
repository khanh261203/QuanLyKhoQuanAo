/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATAACCESSOR.Model;

/**
 *
 * @author ADMIN
 */

import CONTRACT.Dtos.UserLoginDto;
import java.util.Date;

public class User {
    private String makh;
    private String tenkh;
    private String diachi;
    private String sdt;
    private Date ngaytao;
    private boolean IsDelete;

     public User(String makh, String tenkh, String diachi, String sdt, Date ngaytao, boolean isDelete) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.ngaytao = ngaytao;
        IsDelete = isDelete;
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public String getMakh() {
        return makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public void setDelete(boolean delete) {
        IsDelete = delete;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public boolean isDelete() {
        return IsDelete;
    }

  
    

    @Override
    public String toString() {
        return "User{" +
                "makh='" + makh + '\'' +
                ", tenkh='" + tenkh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", ngaytao=" + ngaytao +
                ", IsDelete=" + IsDelete +
                '}';
    }

    public String PrintlnUser() {
		// TODO Auto-generated method stub
		return makh+'='+tenkh+'='+diachi+'='+sdt+'='+ngaytao+'='+IsDelete;
	}
}

