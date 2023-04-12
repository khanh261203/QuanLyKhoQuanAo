/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANAGEMENT.Controller;

import BUSINESS.Service.PhieuNhapService;
import CONTRACT.Dtos.PhieuNhapCreateDto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class PhieuNhapController {
      public static void SessionPhieuNhap() {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhieuNhapCreateDto> arrPNDto = new ArrayList<PhieuNhapCreateDto>();
        
        while(true){
            System.out.println("Nhap 1 la ngung nhap");
        System.out.println("Nhap 2 la ban muon nhap nua");
        System.out.println("nhap 3 là muon in ra phieu xuat");
        int op = Integer.parseInt(sc.nextLine());
            if(op==1){
                System.out.println("ban khong muon nhap nua");
                break;
            }
            else if(op==2){
                PhieuNhapCreateDto pnn = new PhieuNhapCreateDto();
                System.out.println("nhap ma phieu nhap");
                pnn.setMaphieunhap(sc.nextLine());
                System.out.println("nhap so luong nhap");
                pnn.setSoluongnhap(Integer.parseInt(sc.nextLine()));
                System.out.println("nhap don gia");
                pnn.setDonGia(Double.parseDouble(sc.nextLine()));
                        
                arrPNDto.add(pnn);
                 
                
            }
            else if(op==3){
                for(PhieuNhapCreateDto i: arrPNDto){
                    PhieuNhapService sv = new PhieuNhapService();
                    sv.AddPhieuNhap(i);
                    
                }
            } 
            else{
                System.out.println("khong con truong hop khac"
                        );
                        
            }
        }
    }  
      public static void main(String[] args) {
        PhieuNhapController.SessionPhieuNhap();
    }
}
