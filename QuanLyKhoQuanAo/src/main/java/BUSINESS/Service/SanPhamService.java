/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Service;

/**
 *
 * @author ADMIN
 */


import BUSINESS.Interface.ISanPham;
import BUSINESS.Mapper.MapperSanPham;
import CONTRACT.Dtos.SanPhamCreateDto;
import CONTRACT.Dtos.SanPhamDto;
import DATAACCESSOR.Model.SanPham;
import MANAGEMENT.Controller.InputStream;
import MANAGEMENT.Controller.OutputStreamSanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SanPhamService implements ISanPham {
	
	private ArrayList<SanPham> list;
	public SanPhamService(ArrayList<SanPham> list) {
		this.list = list;
	}
	public SanPhamService() {
            this.list = new OutputStreamSanPham().ReadSanPham();
	}
    @Override
    public SanPham AddSP(SanPhamCreateDto sanPhamThem) {
        SanPham sp = MapperSanPham.MapperSanPhamCreateDto(sanPhamThem);
       // InputStream.AppendDataFileSP(sanPhamThem);
        InputStream.AppendDataFileSP(sp);
      
        System.out.println(sp.toString());
        System.out.println("Them Thanh Cong");
        return sp;
    }

    @Override
  public SanPhamDto GetSanPhamDto(String masp) {
	  SanPhamDto spt = new SanPhamDto(); 
	  for(int i = 0 ; i < list.size(); i++) {
		  if(list.get(i).getMasp().equals(masp)) {
			  //System.out.println(list.get(i));
			  SanPhamDto sptResponse = new SanPhamDto();
			  sptResponse = MapperSanPham.MapperSanPhamDto(list.get(i));
			  spt = new SanPhamDto(sptResponse.getMasp(),sptResponse.getTensp(),sptResponse.getGiaban(),sptResponse.getSoluongtonkho(),sptResponse.getMotasanpham());
			  
			  }
	  }
	  if(spt.getMasp() == null) {
		  System.out.println("khong ton tai");
		  return null;
	  }
	 return spt;
  }
  @Override
  public SanPham GetSanPham(String masp) {
	  SanPham spt = new SanPham(); 
	  for(SanPham i : this.list) {
		  if(i.getMasp().equals(masp)) {
			  
			  spt = i;
			  }
	  }
	  if(spt == null){
		  System.out.println("khong ton tai");
		  return null;
	  }
	 return spt;
  }
  @Override
  public SanPham DeleteSP(String masp) {
	  SanPhamService sv = new SanPhamService(this.list);
	  SanPham  sp = new SanPham();
	  sp = sv.GetSanPham(masp);
	  if(sp == null) {
		  System.out.println("khong ton tai");
		  return null;
	  }
	  this.list.remove(sp);
	  System.out.println("xoa thanh cong");
	  return sp;
	  
  }
  @Override
  public SanPham EditSP(String masp) {
	  SanPhamService sv = new SanPhamService(this.list);
	  SanPham  sp = new SanPham();
	  sp = sv.GetSanPham(masp);
	  if(sp == null) {
		  System.out.println("khong ton tai");
		  return null;
	  }
	  Scanner sc = new Scanner(System.in);
	  System.out.println("nhap gia ban");
      int giaban = Integer.parseInt(sc.nextLine());
      System.out.println("nhap ma san pham");
      String ma = sc.nextLine();
      System.out.println("nhap ten san pham");
      String ten = sc.nextLine();
      System.out.println("nhap so luong ton kho");
      int soluongtonkho = Integer.parseInt(sc.nextLine());
      System.out.println("nhap mo ta san pham");
      String mota = sc.nextLine();
      System.out.println("nhap ma nha cung cap");
      String ncc = sc.nextLine();
	  
      sp.setGiaban(giaban);
      sp.setMasp(ma);
      sp.setTensp(ten);
      sp.setSoluongtonkho(soluongtonkho);
      sp.setMotasanpham(mota);
      sp.setNhacungcap(ncc);
      
      System.out.println("san pham da duoc sua lai thanh");
      System.out.println(sp.toString());
	  return sp;
	  
  }
  @Override
  public ArrayList<SanPham> SortSP() {
	  Collections.sort(list, new Comparator<SanPham>() {
          @Override
          public int compare(SanPham sv1, SanPham sv2) {
              return (sv1.getMasp().compareTo(sv2.getMasp()));
              // Muốn đảo danh sách các bạn đối thành
              //return (sv2.hoTen.compareTo(sv1.hoTen));
          }
      });
	  
	  return list;
  }
  @Override
  public ArrayList<SanPham> FillWithPrice(float price) {
    ArrayList<SanPham> arr = new ArrayList<SanPham>();
    for(SanPham i: list){
    if(i.getGiaban()>=price)
        arr.add(i);
    }  
      return arr;
  }
  @Override
  public void UploadSanPham(ArrayList<SanPham> list){
      InputStream.UploadSanPham(list);
  }
  

}

