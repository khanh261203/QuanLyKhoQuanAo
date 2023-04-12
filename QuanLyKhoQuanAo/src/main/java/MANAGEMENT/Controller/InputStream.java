/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANAGEMENT.Controller;

/**
 *
 * @author ADMIN
 */

import CONTRACT.Dtos.SanPhamCreateDto;
import CONTRACT.Dtos.SanPhamDto;
import CONTRACT.Dtos.UserLoginDto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;


import DATAACCESSOR.Model.SanPham;
import DATAACCESSOR.Model.User;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
//doc
public class InputStream {
    
    public static void InputSanPham(SanPham sp) {
    	try {
    		PrintWriter pw = new PrintWriter("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\docghiSanPham","UTF-8");
    		pw.append(sp.PrintlnSanPham());
    		pw.flush();
    		pw.close();
    	
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }  
    public static void UploadSanPham(ArrayList<SanPham> list){
    try {
    //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
    FileOutputStream fos = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\docghiSanPham");
    DataOutputStream dos = new DataOutputStream(fos);
    //Bước 2: Ghi dữ liệu
    for(SanPham i: list){
    dos.writeBytes(i.PrintlnSanPham());
    dos.writeBytes("\n");
    }
    //Bước 3: Đóng luồng
    fos.close();
    dos.close();
    System.out.println("Done!");
    }catch (IOException ex) {
    ex.printStackTrace();
  } 
    
    
    }
    public static void InputUser(User u) {
    	try {
    		PrintWriter pw = new PrintWriter("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\in4User","UTF-8");
                pw.append(u.PrintlnUser());
    		pw.flush();
    		pw.close();
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }  
    public static void InputUserLogin(UserLoginDto u) {
    	try {
    		PrintWriter pw = new PrintWriter("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\docghiUser","UTF-8");
                pw.append(u.getUsername()+"="+u.getPassword());
    		pw.flush();
    		pw.close();
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }  
    public static void AppendDataFile(UserLoginDto u){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String data ="\n"+ u.getUsername()+"="+u.getPassword();
            File file = new File("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\docghiUser");
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.append(data);
            System.out.println("Success...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    
    }
    public static void AppendDataFileSP(SanPham sp) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            String data=sp.PrintlnSanPham();
            File file = new File("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\docghiSanPham");
            if(!file.exists()){
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            data = data+"\n";
            bw.append(data);
            System.out.println("Success...");
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
     public static void AppendDataFileUser(User u) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            String data=u.PrintlnUser();
            File file = new File("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\in4User");
            if(!file.exists()){
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            data = "\n" + data;
            bw.append(data);
            System.out.println("Success...");
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}


