/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTRACT.Dtos;

/**
 *
 * @author ADMIN
 */
public class UserLoginDto {
    private String username;
    private String password;
    private String IDUser;

    public String getIDUser() {
        return IDUser;
    }

    public void setIDUser(String IDUser) {
        this.IDUser = IDUser;
    }

    public UserLoginDto(String username, String password, String IDUser) {
        this.username = username;
        this.password = password;
        this.IDUser = IDUser;
    }
    public UserLoginDto() {
    }

    public UserLoginDto(String username, String password) {
        this.username = username;
        this.password = password;
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
        return "UserLoginDto{" + "username=" + username + ", password=" + password + '}';
    }
    
}