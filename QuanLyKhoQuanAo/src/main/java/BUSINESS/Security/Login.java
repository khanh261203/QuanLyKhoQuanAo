/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Security;

/**
 *
 * @author ADMIN
 */
import CONTRACT.Dtos.UserLoginDto;
import MANAGEMENT.Controller.InputStream;
import MANAGEMENT.Controller.OutputStreamSanPham;
import MANAGEMENT.Controller.OutputStreamUser;
import java.util.ArrayList;

public class Login {

    public boolean check(UserLoginDto us) {
        try{
        OutputStreamUser out = new OutputStreamUser();
        
        ArrayList<UserLoginDto> arr = new ArrayList<UserLoginDto>();
        arr = out.ReadUser();
       
        
        
       
        for (UserLoginDto i : arr) {
            String hashMessage = MD5.getMd5(us.getPassword());
            if (!i.getUsername().equals(us.getUsername())) {
                System.out.println("Unvalid Account!!!");
                return false;
            } 
            else if(i.getUsername().equals(us.getUsername()) && i.getPassword().equals(hashMessage)){
            System.out.println("login success");
            return true;
            }
            else {
                if (!i.getPassword().equals(hashMessage)) {
                    System.out.println("Wrong Password!!");
                    return false;

                }

            }
            

        }
        } catch (Exception ignored) {
            ignored.fillInStackTrace();
        }
         System.out.println("Request timeout");
        return false;
    }
    
    public boolean SignUpUser(Signup sg){
        if(sg.getPassword().equals(sg.getRePassword())){
            OutputStreamSanPham out = new OutputStreamSanPham();
            ArrayList<UserLoginDto> arr =new ArrayList<UserLoginDto>();
            arr = out.ReadUser();
            //String mts = sg.MTS(arr);
            UserLoginDto u = new UserLoginDto(sg.getUsername(),MD5.getMd5(sg.getPassword()));
            InputStream.AppendDataFile(u);
            System.out.println("Dang ky thanh cong");
            return true;
        }
        
        
        
        return false;
    }
    
    
    public static void main(String []args) {
    UserLoginDto us = new UserLoginDto("hominhcanh","Abcd1234a@A");
    Login lg = new Login();
    System.out.println(lg.check(us));
    
    
    }

}
