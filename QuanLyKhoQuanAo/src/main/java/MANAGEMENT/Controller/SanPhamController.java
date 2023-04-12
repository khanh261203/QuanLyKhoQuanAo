/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANAGEMENT.Controller;

/**
 *
 * @author ADMIN
 */

import BUSINESS.Interface.ISanPham;
import BUSINESS.Service.SanPhamService;
import CONTRACT.Dtos.SanPhamCreateDto;
import CONTRACT.Dtos.SanPhamDto;
import DATAACCESSOR.Model.SanPham;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
public class SanPhamController  {
    
    public static void SessionSanPham(){
    Scanner sc = new Scanner(System.in);
    ISanPham iSp = new SanPhamService();

        ArrayList<SanPhamCreateDto> arrSPcreateDto = new ArrayList<SanPhamCreateDto>();
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        list = new OutputStreamSanPham().ReadSanPham();
        while(true)
        {

            System.out.println("nhap 1 la khong muon nhap nua");
            System.out.println("nhap 2 la muon nhap nua");
            System.out.println("nhap 3 la doc ");
            System.out.println("nhap 4 là tim kiem");
            System.out.println("nhap 5 là xoa san pham");
            System.out.println("nhap 6 là sap xep san pham");
            System.out.println("nhap 7 là cap nhat san pham");
            System.out.println("nhap 8 là loc theo Gia cua san pham");
            
            int op = Integer.parseInt(sc.nextLine());
            if(op==1)
            {
                    System.out.println("ban khong muon nhap them nua");
                    break;
            }
            else if(op==2){
                    /* nhập tay */
                    SanPhamCreateDto spn = new SanPhamCreateDto();
                    
                   
                    System.out.println("nhap ma san pham");
                    spn.setMasp(sc.nextLine());
                    System.out.println("nhap ten san pham");
                    spn.setTensp(sc.nextLine());
                     System.out.println("nhap gia ban");
                    int giaban = Integer.parseInt(sc.nextLine());
                    spn.setGiaban(giaban);
                    System.out.println("nhap so luong ton kho");
                    int soluongtonkho = Integer.parseInt(sc.nextLine());
                    spn.setSoluongtonkho(soluongtonkho);
                    System.out.println("nhap mo ta san pham");
                    spn.setMotasanpham(sc.nextLine());
                    System.out.println("nhap ma nha cung cap");
                    spn.setManhacungcap(sc.nextLine());
                    
                    arrSPcreateDto.add(spn);
                    iSp.AddSP(spn);
                    
                }
            else if(op==3){
            	OutputStreamSanPham ot = new OutputStreamSanPham();
            	ArrayList<SanPham> arr = new ArrayList<SanPham>();
            	arr = ot.ReadSanPham();
            	for(SanPham i: arr) {
            		System.out.println(i.toString());
            		
            	}
            }
            else if(op==4) {
              	System.out.println("nhap ma san pham");
                String spn = sc.nextLine();
                System.out.println(iSp.GetSanPhamDto(spn));
              	
            }
            else if(op==5) {          	
            	System.out.println("nhap ma san pham");
                String spn = sc.nextLine();
                iSp.DeleteSP(spn);
            	System.out.println("Danh sach con lai");
            	for(SanPham sp : list) {
            		System.out.println(sp);
            	}
                iSp.UploadSanPham(list);
            }
            else if(op==6) {          	
                list = iSp.SortSP();
            	for(SanPham i: list) {
            		System.out.println(i.toString());
            	}
                iSp.UploadSanPham(list);
            	
            }
            else if(op==7) {          	
            	System.out.println("nhap ma san pham");
                String spn = sc.nextLine();
                SanPham SanPhamEdit = iSp.EditSP(spn);
                iSp.DeleteSP(spn);
                list.add(SanPhamEdit);
                iSp.UploadSanPham(list);
         
            	
            }
            else if(op==8) {          	
            	System.out.println("nhap gia can loc san pham");
                int spn = Integer.parseInt(sc.nextLine());
            	ArrayList<SanPham> arr= new ArrayList<SanPham>();
                arr = iSp.FillWithPrice(spn);
            	for(SanPham i: arr){
                System.out.println(i.toString());
                }
         
            	
            }
            else
            {
                    System.out.println("Khong co truong hop khac");
                    
            }
        }
    }
    public static void main(String []agrs){    
        SanPhamController.SessionSanPham();
    }
}
