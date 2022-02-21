package bai3;

import bai2.SinhVienPoly;

public class Main{
	
	public static void main(String[] args){
		SinhVienPoly sv1 = new SinhVienIT("Hung","IT",8.0,9.0,5.6);
		sv1.xuat();
		System.out.println();
		SinhVienPoly sv2 = new SinhVienBiz("khoa", "mk", 6.0,6.0);
		sv2.xuat();
	}
}
