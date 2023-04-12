/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTRACT.Dtos;

/**
 *
 * @author ADMIN
 */
import BUSINESS.Mapper.MapperUser;

import java.util.Date;

public class UserCreateDto {
    private String makh;
    private String tenkh;
    private String diachi;
    private String sdt;

    public UserCreateDto() {
    }

    public String getMakh() {
        return makh;
    }

    @Override
    public String toString() {
        return "UserCreateDto{" +
                "makh='" + makh + '\'' +
                ", tenkh='" + tenkh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public UserCreateDto(String makh, String tenkh, String diachi, String sdt) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sdt = sdt;
    }
}
