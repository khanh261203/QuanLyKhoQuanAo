/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Service;

import BUSINESS.Interface.IPhieuXuat;
import BUSINESS.Mapper.MapperPhieuXuat;
import CONTRACT.Dtos.PhieuXuatCreateDto;
import DATAACCESSOR.Model.PhieuXuat;

/**
 *
 * @author ADMIN
 */


public class PhieuXuatService implements IPhieuXuat {
    @Override
	public PhieuXuat AddPhieuXuat(PhieuXuatCreateDto ThemPhieuXuat) {
	        PhieuXuat px  =  MapperPhieuXuat.MapperPhieuXuatCreateDto(ThemPhieuXuat);
	        System.out.println(px.toString());
	        System.out.println("them thanh cong");
	        return null;
	}
	
}