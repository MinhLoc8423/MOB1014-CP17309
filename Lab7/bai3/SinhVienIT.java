package bai3;

import bai2.SinhVienPoly;

public class SinhVienIT extends SinhVienPoly{
	private Double diemJava,diemHtml,diemCss;	

	public SinhVienIT(){
	}

	public SinhVienIT(String hoTen, String nganh, Double diemJava, Double diemHtml, Double diemCss){
		super(hoTen,nganh);
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
		this.diemCss = diemCss;
	}

	public Double getDiem(){
		return (2*this.diemJava + this.diemHtml + this.diemCss)/4;
	}
}
