/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Service;

/**
 *
 * @author ADMIN
 */
import BUSINESS.Interface.IUser;

import BUSINESS.Mapper.MapperUser;

import CONTRACT.Dtos.UserCreateDto;

import DATAACCESSOR.Model.User;
import MANAGEMENT.Controller.InputStream;

import java.util.ArrayList;


public class UserService implements IUser {
    @Override
    public User AddUser(UserCreateDto UserThem) {
        User u = MapperUser.MapperUserCreateDto(UserThem);
        InputStream.AppendDataFileUser(u);
        
        System.out.println(u.toString());
        System.out.println("Them Thanh Cong");
        return null;
    }

}