/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Mapper;

import CONTRACT.Dtos.PhieuNhapCreateDto;
import DATAACCESSOR.Model.PhieuNhap;

/**
 *
 * @author ADMIN
 */
public class MapperPhieuNhap {
	public static PhieuNhap MapperPhieuNhapCreateDto(PhieuNhapCreateDto pndt) {
		long millis=System.currentTimeMillis();   java.sql.Date date=new java.sql.Date(millis); 
		PhieuNhap phieunhap = new PhieuNhap(pndt.getMaphieunhap(),pndt.getSoluongnhap(),"ABS",pndt.getDonGia(),date,true);
			return phieunhap;
	}  
}
