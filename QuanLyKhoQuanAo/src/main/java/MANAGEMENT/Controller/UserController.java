/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANAGEMENT.Controller;

/**
 *
 * @author ADMIN
 */

import BUSINESS.Security.Login;
import BUSINESS.Security.Signup;
import BUSINESS.Service.UserService;
import CONTRACT.Dtos.UserCreateDto;
import CONTRACT.Dtos.UserLoginDto;
import DATAACCESSOR.Model.SanPham;
import DATAACCESSOR.Model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserController extends Login {

    public static void SessionLogin() {
        Scanner sc = new Scanner(System.in);
        ArrayList<UserCreateDto> arrUserCreateDto = new ArrayList<UserCreateDto>();
        int count =0;
        while (true){
        
            System.out.println("moi ban dang nhap de thuc hien cac thao tac");
            System.out.println("1 dang nhap");
            System.out.println("2 dang ky");
                
            UserController lg = new UserController();
            int oop = Integer.parseInt(sc.nextLine());
            if (oop == 1) {
               
                
                
                UserLoginDto userdto = new UserLoginDto();
                System.out.println("nhap ID khach hang");
                userdto.setUsername(sc.nextLine());
                System.out.println("nhap Password khach hang");
                userdto.setPassword(sc.nextLine());
                
                if (lg.check(userdto)) {
                    break;
                
                    }else {
                        System.out.println("khong có truong hop khac");

                    }
                    
                
                } else {
                    System.out.println("nhap lai");

                }
            if (oop == 2) {
                Signup userdto = new Signup();
                System.out.println("nhap ID khach hang");
                userdto.setUsername(sc.nextLine());
                System.out.println("nhap Password khach hang");
                userdto.setPassword(sc.nextLine());
                System.out.println("nhap RePassword khach hang");
                userdto.setRePassword(sc.nextLine());
                lg.SignUpUser(userdto);
                
            }

        }
        
        while (true) {
            
               
                
                

                    System.out.println("nhap 1 la khong muon nhap nua");
                    System.out.println("nhap 2 la muon nhap thong tin user");
                    System.out.println("nhap 3 la quan ly san pham");
                    int op = Integer.parseInt(sc.nextLine());
                    if (op == 1) {
                        System.out.println("ban khong nhap them nua");
                      break;

                    }
                    if (op == 2) {
                        UserCreateDto usern = new UserCreateDto();
                        System.out.println("nhap ma khach hang");
                        usern.setMakh(sc.nextLine());
                        System.out.println("nhap ten khach hang");
                        usern.setTenkh(sc.nextLine());
                        System.out.println("nhap dia chi khach hang");
                        usern.setDiachi(sc.nextLine());
                        System.out.println("nhap so dien thoai");
                        usern.setSdt(sc.nextLine());
                       
                        UserService ussv = new UserService();
                        ussv.AddUser(usern);
                        
                    if (op == 3) {
                        SanPhamController.SessionSanPham();
                        SanPham GetSanPham;

                    if(op==4){
                        
                    }    
                    
                
                    }else {
                        System.out.println("khong có truong hop khac");

                    }
                    
                
                } else {
                    System.out.println("nhap lai");

                }

            }
         

        }

    

    public static void main(String[] args) {
        UserController.SessionLogin();

    }
}

