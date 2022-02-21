package bai3;

import bai2.SinhVienPoly;

public class SinhVienBiz extends SinhVienPoly{
	private Double diemMarking,diemSales;	

	public SinhVienBiz(){
	}

	public SinhVienBiz(String hoTen, String nganh, Double diemMarking, Double diemSales){
		super(hoTen,nganh);
		this.diemMarking = diemMarking;
		this.diemSales = diemSales;
	}

	public Double getDiem(){
		return (2*this.diemMarking + this.diemSales)/3;
	}
}
