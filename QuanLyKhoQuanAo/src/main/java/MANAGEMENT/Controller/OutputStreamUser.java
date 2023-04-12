/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANAGEMENT.Controller;

/**
 *
 * @author ADMIN
 */


import CONTRACT.Dtos.UserLoginDto;
import DATAACCESSOR.Model.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class OutputStreamUser {

    public ArrayList<UserLoginDto> ReadUser() {

        File f1 = new File("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\docghiUser");
        ArrayList<UserLoginDto> arr = new ArrayList<UserLoginDto>();
        try {

            BufferedReader brUser = Files.newBufferedReader(f1.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = brUser.readLine();
                if (line == null) {
                    break;
                }
                String spls[] = line.split("=");
                UserLoginDto sp = new UserLoginDto();
                sp.setUsername(spls[0]);
                sp.setPassword(spls[1]);
                arr.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    public ArrayList<User> Readin4User() {

        File f1 = new File("C:\\Users\\ADMIN\\Documents\\OOP\\QuanLyKhoQuanAo\\src\\main\\java\\MANAGEMENT\\Controller\\in4User");
        ArrayList<User> arr = new ArrayList<User>();
        try {

            BufferedReader brUser = Files.newBufferedReader(f1.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = brUser.readLine();
                if (line == null) {
                    break;
                }
                String spls[] = line.split("=");
                User u = new User();
                u.setMakh(spls[0]);
                u.setTenkh(spls[1]);
                u.setDiachi(spls[2]);
                u.setSdt(spls[3]);
                u.setNgaytao(Date.valueOf(spls[4]));
                u.setDelete(Boolean.valueOf(spls[5]));
                arr.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
     

    public static void main(String[] args) throws Exception {
        OutputStreamUser out = new OutputStreamUser();
        
        ArrayList<UserLoginDto> arr = new ArrayList<UserLoginDto>();
        arr = out.ReadUser();
        for (UserLoginDto i : arr) {
            System.out.println(i.toString());

        }

    }
}

