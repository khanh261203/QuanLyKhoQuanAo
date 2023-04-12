/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUSINESS.Interface;

/**
 *
 * @author ADMIN
 */
import CONTRACT.Dtos.UserCreateDto;
import DATAACCESSOR.Model.User;

public interface IUser {
    User AddUser(UserCreateDto UserThem);
}
