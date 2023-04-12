/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUSINESS.Service;

import BUSINESS.Interface.IPhieuNhap;
import BUSINESS.Mapper.MapperPhieuNhap;
import CONTRACT.Dtos.PhieuNhapCreateDto;
import DATAACCESSOR.Model.PhieuNhap;

/**
 *
 * @author ADMIN
 */

public class PhieuNhapService implements IPhieuNhap{
	@Override
		public PhieuNhap AddPhieuNhap(PhieuNhapCreateDto ThemPhieuNhap) {
	        PhieuNhap pn  =  MapperPhieuNhap.MapperPhieuNhapCreateDto(ThemPhieuNhap);
	        System.out.println(pn.toString());
	        System.out.println("them thanh cong");
	        return null;
	}
}

