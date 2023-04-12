/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Security;

import CONTRACT.Dtos.UserLoginDto;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Signup {
    private String username;
    private String password;
    private String rePassword;

    public Signup() {
    }

    public Signup(String username, String password, String rePassword) {
        this.username = username;
        this.password = password;
        this.rePassword = rePassword;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Signup{" + "username=" + username + ", password=" + password + ", rePassword=" + rePassword + '}';
    }

    public String PrintUser(){
    return username +"="+ password +"="+ rePassword;
    }
    
    public String MTS(ArrayList<UserLoginDto> list){
        return "US"+list.size()+1;
    }
}
