import java.util.ArrayList;
import java.util.Scanner;

public class Lab6Bai3 {
	public static void main(String[] args){
		ArrayList<SinhVien> arrSV = new ArrayList<SinhVien>();
		for(Integer i = 0; i < 5; i++){
			Scanner sc = new Scanner(System.in);
			outer:
			System.out.print("Nhập tên sinh viên "+i+": ");
			String tenSV = sc.nextLine();
			System.out.print("Nhập email "+i+": ");
			String email = sc.nextLine();
			String reEmail = "\\w+@\\w+\\.\\w+";
			while(!email.matches(reEmail)){
				System.out.print("Không đúng định dạng email vui lòng nhập lại: ");
				email = sc.nextLine();
			}
			System.out.print("Nhập số điện thoại "+i+": ");
			String soDienThoai = sc.nextLine();
			String reSoDienThoai = "0\\d{9,10}";
			while(!soDienThoai.matches(reSoDienThoai)){
				System.out.print("Không đúng định dạng số điện thoại vui lòng nhập lại: ");
				soDienThoai = sc.nextLine();
			}
			System.out.print("Nhập chứng minh nhân dân "+i+": ");
			String soCMND = sc.nextLine();
			String reSoCMND = "[0-9]{12}";
			while(!soCMND.matches(reSoCMND)){
				System.out.print("Không đúng định dạng số chứng minh nhân dân vui lòng nhập lại: ");
				soCMND = sc.nextLine();
			}
			arrSV.add(new SinhVien(tenSV,email,Integer.parseInt(soDienThoai),Long.parseLong(soCMND)));
			System.out.println();
		}
		for(SinhVien index : arrSV){
			System.out.println("Tên sinh viên: "+index.getHoTen());
			System.out.println("Email  sinh viên: "+index.getEmail());
			System.out.println("Số điện thoại sinh viên: "+index.getSoDienThoai());
			System.out.println("Chứng minh nhân dân sinh viên: "+index.getSoCMND());
			System.out.println("--------------------------------------");
		}
	}
}
