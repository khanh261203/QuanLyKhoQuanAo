/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUSINESS.Interface;

/**
 *
 * @author ADMIN
 */

import CONTRACT.Dtos.SanPhamCreateDto;
import CONTRACT.Dtos.SanPhamDto;
import DATAACCESSOR.Model.SanPham;
import java.util.ArrayList;

public interface ISanPham {
    SanPham AddSP(SanPhamCreateDto sanPhamThem);
    ArrayList<SanPham> FillWithPrice(float price);
    ArrayList<SanPham> SortSP();
    SanPham EditSP(String masp);
    SanPham DeleteSP(String masp);
    SanPham GetSanPham(String masp);
    SanPhamDto GetSanPhamDto(String masp);
    void UploadSanPham(ArrayList<SanPham> list);
}

