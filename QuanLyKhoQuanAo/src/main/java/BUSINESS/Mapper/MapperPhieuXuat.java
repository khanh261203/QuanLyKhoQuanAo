/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Mapper;

/**
 *
 * @author ADMIN
 */
import BUSINESS.Service.PhieuXuatService;
import CONTRACT.Dtos.PhieuXuatCreateDto;
import DATAACCESSOR.Model.PhieuXuat;

public class MapperPhieuXuat {
	public static PhieuXuat MapperPhieuXuatCreateDto(PhieuXuatCreateDto pxdt) {
		long millis=System.currentTimeMillis();   java.sql.Date date=new java.sql.Date(millis); 
		PhieuXuat phieuxuat = new PhieuXuat(pxdt.getMaphieuxuat(),pxdt.getTensp(),pxdt.getSoluongxuat(),date,true);
			return phieuxuat;
	}
}