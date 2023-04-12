/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANAGEMENT.Controller;

import BUSINESS.Service.PhieuXuatService;
import CONTRACT.Dtos.PhieuXuatCreateDto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class PhieuXuatController {
    public static void SessionPhieuXuat() {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhieuXuatCreateDto> arrPXDto = new ArrayList<PhieuXuatCreateDto>();
      
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
                PhieuXuatCreateDto pxn = new PhieuXuatCreateDto();
                System.out.println("nhap ma phieu xuat");
                pxn.setMaphieuxuat(sc.nextLine());
                System.out.println("nhap ten san pham xuat");
                pxn.setTensp(sc.nextLine());
                System.out.println("nhap so luong xuat");
                pxn.setSoluongxuat(Integer.parseInt(sc.nextLine()));
               
                                   
                arrPXDto.add(pxn);
                    
                            
                
            }
            else if(op==3){
               for(PhieuXuatCreateDto i: arrPXDto){
                     PhieuXuatService sv = new PhieuXuatService();
                    sv.AddPhieuXuat(i);
               }
            } 
            else{
                System.out.println("khong con truong hop khac"
                        );
                        
            }
        }
    }
    public static void main(String[] args) {
        PhieuXuatController.SessionPhieuXuat();
    }
}
