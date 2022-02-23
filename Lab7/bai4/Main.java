package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

import bai2.SinhVienPoly;
import bai3.SinhVienBiz;
import bai3.SinhVienIT;

public class Main{
	static ArrayList<SinhVienPoly> arrSV = new ArrayList<>();
	static Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>(){
		@Override
		public int  compare(SinhVienPoly o1,SinhVienPoly o2){
			return Double.compare(o1.getDiem(), o2.getDiem());
		}
	};
	
	public static void sapXepTheoDiem(){
		Collections.sort(arrSV,comp);
	}

	public static void nhapSV(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập tên sinh viên: ");
			String tenSV = sc.nextLine();
			System.out.print("Nhập ngành sinh viên(IT/Biz): ");
			String nganh = sc.nextLine();
			String reNganhIT = "IT{1}";
			String reNganhBiz = "Biz{1}";
			while(!nganh.matches(reNganhIT) && !nganh.matches(reNganhBiz)){
				System.out.print("Nhập lại ngành sinh viên: ");
				nganh = sc.nextLine();
			}
			if(nganh.equals("IT")){
				System.out.print("Nhập điểm Java: ");
				Double diemJava = sc.nextDouble();
				System.out.print("Nhập điểm Html: ");
				Double diemHtml = sc.nextDouble();
				System.out.print("Nhập điểm Css: ");
				Double diemCss = sc.nextDouble();
				arrSV.add(new SinhVienIT(tenSV,nganh,diemJava,diemHtml,diemCss));
			}
			else{
				System.out.print("Nhập điểm Marketing: ");
				Double diemMarking = sc.nextDouble();
				System.out.print("Nhập điểm Saler: ");
				Double diemSaler = sc.nextDouble();
				arrSV.add(new SinhVienBiz(tenSV,nganh,diemMarking,diemSaler));
			}
			System.out.print("Bạn có muốn nhập thêm không (Y/N) ?");	
			if (sc.next().equalsIgnoreCase("N")) {
				break;
			}
		}
	}
	
	public static void xuatSV(){
		System.out.println("Doanh sách sinh viên: ");
		for(SinhVienPoly index : arrSV){
			index.xuat();
			System.out.println();
		}
	}
	
	public static void xuatSVHSG(){
		System.out.println("Doanh sách sinh viên học sinh giỏi: ");
		for(SinhVienPoly index : arrSV){
			if(index.getHocLuc() == "Gioi")
			{
				index.xuat();
				System.out.println();
			}
		}
	}

	public static void menuSV(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("Chương trình quản lý sinh viên");
			System.out.println("1. Nhập danh sách sinh viên");
			System.out.println("2. Xuất thông tin danh sách sinh viên");
			System.out.println("3. Xuất danh sách sinh viên học lực giỏi");
			System.out.println("4. Sắp xếp sinh viên theo điểm");
			System.out.println("5. Kết thúc");
			System.out.print("Chọn chức năng: ");
			String input = sc.nextLine();
			switch (input) {
				case "1":
					nhapSV();
					System.out.println();
					break;
				case "2":
					xuatSV();
					System.out.println();
					break;
				case "3":
					xuatSVHSG();
					System.out.println();
					break;
				case "4":
					sapXepTheoDiem();
					xuatSV();
					System.out.println();
					break;
				case "5":
					System.out.println("Thoát chương trình");
					System.exit(0);
					break;
				default:
					System.out.println("Vui lòng chọn lại chức năng");
					System.out.println();
					break;
			}
		}
	}

	public static void main(String[] args){
		menuSV();
	}
}
