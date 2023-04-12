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

public class SanPham {
    private String masp;
    private String tensp;//
    private float giaban;//
    private int soluongtonkho;//
    private String motasanpham;//
    private String Manhacungcap;//
    private String nhacungcap;
    private Date NgayTao;
    private boolean IsDelete;


    public SanPham(String masp, String tensp, float giaban, int soluongtonkho, String motasanpham, String manhacungcap, String nhacungcap, Date ngayTao, boolean isDelete) {
        this.masp = masp;
        this.tensp = tensp;
        this.giaban = giaban;
        this.soluongtonkho = soluongtonkho;
        this.motasanpham = motasanpham;
       this.Manhacungcap = manhacungcap;
        this.nhacungcap = nhacungcap;
        NgayTao = ngayTao;
        IsDelete = isDelete;
    }

    public SanPham() {
    }

    public SanPham(String masp, String tensp, float giaban, int soluongtonkho, String motasanpham, String nhacungcap, Date ngayTao, boolean isDelete) {
        this.masp = masp;
        this.tensp = tensp;
        this.giaban = giaban;
        this.soluongtonkho = soluongtonkho;
        this.motasanpham = motasanpham;
        this.nhacungcap = nhacungcap;
        NgayTao = ngayTao;
        IsDelete = isDelete;
    }

    public String getMasp() {
        return masp;
    }

    public String getTensp() {
        return tensp;
    }

    public float getGiaban() {
        return giaban;
    }

    public int getSoluongtonkho() {
        return soluongtonkho;
    }

    public String getMotasanpham() {
        return motasanpham;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public boolean isDelete() {
        return IsDelete;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    public void setSoluongtonkho(int soluongtonkho) {
        this.soluongtonkho = soluongtonkho;
    }

    public void setMotasanpham(String motasanpham) {
        this.motasanpham = motasanpham;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    public void setNgayTao(Date ngayTao) {
        NgayTao = ngayTao;
    }

    public void setDelete(boolean delete) {
        IsDelete = delete;
    }

    public String getManhacungcap() {
        return Manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        Manhacungcap = manhacungcap;
    }
    
    public String PrintlnSanPham() {
    	return masp +"="+ tensp +"="+ giaban +"="+ soluongtonkho +"="+ motasanpham +"="+ Manhacungcap +"="+ nhacungcap +"="+ NgayTao +"="+ IsDelete;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", giaban=" + giaban +
                ", soluongtonkho=" + soluongtonkho +
                ", motasanpham='" + motasanpham + '\'' +
                ", Manhacungcap='" + Manhacungcap + '\'' +
                ", nhacungcap='" + nhacungcap + '\'' +
                ", NgayTao=" + NgayTao +
                ", IsDelete=" + IsDelete +
                '}';
    }
}
