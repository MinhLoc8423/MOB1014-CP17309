import java.util.ArrayList;
import java.util.Scanner;

public class Lab6Bai2{
	public static void main(String[] args){
		ArrayList<SanPham> arrSP = new ArrayList<SanPham>();
		for(Integer i = 0; i < 5 ; i++){
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập tên sản phẩm "+i+": ");
			String tenSP = sc.nextLine();
			System.out.print("Nhập giá sản phẩm "+i+": ");
			Double donGia = sc.nextDouble();
			System.out.print("Nhập hãng sản phẩm "+i+": ");
			String hang = sc.next();
			arrSP.add(new SanPham(tenSP,donGia,hang));
		}
		System.out.println("---------------------------------");
		for(SanPham index : arrSP){
			if(index.getHang().equals("Nokia")){
				System.out.println("Tên sản phẩm: "+index.getTenSP());
				System.out.println("Giá sản phẩm: "+index.getDonGia());
				System.out.println("Hãng sản phẩm: "+index.getHang());
			}
		}
	}
}
