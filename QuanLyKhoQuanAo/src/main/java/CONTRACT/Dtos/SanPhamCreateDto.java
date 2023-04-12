/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTRACT.Dtos;

/**
 *
 * @author ADMIN
 */
public class SanPhamCreateDto {
    private String masp;
    private String tensp;//
    private float giaban;//
    private int soluongtonkho;//
    private String motasanpham;//
    private String Manhacungcap;//

    public SanPhamCreateDto() {
    }

    public SanPhamCreateDto(String masp, String tensp, float giaban, int soluongtonkho, String motasanpham, String manhacungcap) {
        this.masp = masp;
        this.tensp = tensp;
        this.giaban = giaban;
        this.soluongtonkho = soluongtonkho;
        this.motasanpham = motasanpham;
        Manhacungcap = manhacungcap;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    public int getSoluongtonkho() {
        return soluongtonkho;
    }

    public void setSoluongtonkho(int soluongtonkho) {
        this.soluongtonkho = soluongtonkho;
    }

    public String getMotasanpham() {
        return motasanpham;
    }

    public void setMotasanpham(String motasanpham) {
        this.motasanpham = motasanpham;
    }

    public String getManhacungcap() {
        return Manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        Manhacungcap = manhacungcap;
    }

    @Override
    public String toString() {
        return "SanPhamCreateDto{" +
                "masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", giaban=" + giaban +
                ", soluongtonkho=" + soluongtonkho +
                ", motasanpham='" + motasanpham + '\'' +
                ", Manhacungcap='" + Manhacungcap + '\'' +
                '}';
    }
}
