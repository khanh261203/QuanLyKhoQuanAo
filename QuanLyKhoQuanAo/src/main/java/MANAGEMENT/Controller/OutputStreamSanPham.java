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
import CONTRACT.Dtos.UserLoginDto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import DATAACCESSOR.Model.SanPham;

public class OutputStreamSanPham {

    public ArrayList<SanPham> ReadSanPham() {

        File f = new File("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\docghiSanPham");
        ArrayList<SanPham> arr = new ArrayList<SanPham>();
        try {

            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String spls[] = line.split("=");
                SanPham sp = new SanPham();
                sp.setMasp(spls[0]);
                sp.setTensp(spls[1]);
                sp.setGiaban(Float.parseFloat(spls[2]));
                sp.setSoluongtonkho(Integer.parseInt(spls[3]));
                sp.setMotasanpham(spls[4]);
                sp.setManhacungcap(spls[5]);
                sp.setNhacungcap(spls[6]);
                sp.setNgayTao(new SimpleDateFormat("yyyy-MM-dd").parse(spls[7]));
                sp.setDelete(Boolean.parseBoolean(spls[8]));
                arr.add(sp);
           

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    public ArrayList<UserLoginDto> ReadUser() {

        File f = new File("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\docghiSanPham");
        ArrayList<UserLoginDto> arr = new ArrayList<UserLoginDto>();
        try {

            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = br.readLine();
                //System.out.println(line);
                if (line == null) {
                    break;
                }
                String spls[] = line.split("=");
                UserLoginDto sp = new UserLoginDto();
                sp.setUsername(spls[0]);
                sp.setPassword(spls[1]);
                sp.setIDUser(spls[3]);
                arr.add(sp);
           

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    public static void main(String[] args) throws Exception {
        OutputStreamSanPham out = new OutputStreamSanPham();
        
        ArrayList<SanPham> arr = new ArrayList<SanPham>();
        arr = out.ReadSanPham();
        for (SanPham i : arr) {
            System.out.println(i.toString());

        }

    }


}


