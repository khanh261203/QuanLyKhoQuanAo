/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Mapper;

/**
 *
 * @author ADMIN
 */
import CONTRACT.Dtos.UserCreateDto;
import DATAACCESSOR.Model.User;

public class MapperUser {
    public static User MapperUserCreateDto(UserCreateDto udto){
    	long millis=System.currentTimeMillis();   java.sql.Date date=new java.sql.Date(millis); 
        User user= new User(udto.getMakh(),udto.getTenkh(),udto.getDiachi(),udto.getSdt(),date,true);
    return user;
    }
}
