/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUSINESS.Interface;

/**
 *
 * @author ADMIN
 */

import CONTRACT.Dtos.PhieuXuatCreateDto;
import DATAACCESSOR.Model.PhieuXuat;

public interface IPhieuXuat {
    PhieuXuat AddPhieuXuat(PhieuXuatCreateDto ThemPhieuXuat);
}
