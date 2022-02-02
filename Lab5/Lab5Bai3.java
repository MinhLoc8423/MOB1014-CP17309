import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class Lab5Bai3{
	static ArrayList<SanPham> arrSP = new ArrayList<SanPham>();
	static Comparator<SanPham> comp = new Comparator<SanPham>() {
		@Override
		public int compare(SanPham o1, SanPham o2) {
			return o1.getGiaSP().compareTo(o2.getGiaSP());
		}
	};
	public static void nhapSP(){
		System.out.println("-------------------");
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập tên sản phẩm: ");
			String tenSP = sc.nextLine();
			System.out.print("Nhập giá sản phẩm: ");
			Integer giaSP = sc.nextInt();
			arrSP.add(new SanPham(tenSP,giaSP));
			System.out.print("Bạn có muốn nhập thêm nữa không ?(y/n)");
			if(sc.next().equalsIgnoreCase("N")){
				break;
			}
		}
		System.out.println("-------------------");
	}
	public static void tinhtrungbinhgiaSP(){
		Double avg = 0.0, sum = 0.0;
		System.out.println("-------------------");
		for(SanPham index:arrSP){
			sum += index.getGiaSP();
		}
		avg = sum / arrSP.size();
		System.out.println("Giá trung bình của các sản phẩm là: "+ avg);
		System.out.println("-------------------");
	}
	public static void  timvsxoaSP(){
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.print("Nhập tên sản phẩm cần xóa: ");
		String tenSP = sc.nextLine();
		SanPham found = null; 
		for(SanPham index:arrSP){
			if(index.getTenSP().equalsIgnoreCase(tenSP)){
				found = index;
				break;
			}
		}
		if(found != null){
			arrSP.remove(found);
			System.out.println("Đã xóa sản phẩm");
		}
		else{
			System.out.println("Không tìm thấy sản phẩm");
		}
		System.out.println("-------------------");
	}
	public static void sapxepSP(){
		Collections.sort(arrSP,comp);
	}
	public static void xuatSP(){
		System.out.println("-------------------");
		for(SanPham sp:arrSP){
			System.out.println("Tên sản phẩm: "+ sp.getTenSP() + " \t giá sản phẩm: " + sp.getGiaSP());
		}
		System.out.println("-------------------");
	}
	public static void menu(){
		Integer input;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Menu");
			System.out.println("1. Nhập doanh sách sản phẩm");
			System.out.println("2. Sắp xếp doanh sách và xuất sản phẩm");
			System.out.println("3. Tìm và xóa tên sản phẩm nhập");
			System.out.println("4. Xuất giá trung bình của các sản phẩm");
			System.out.println("0. Thoát chương trình");
			System.out.print("Lựa chọn chương trình: ");
			input = sc.nextInt();
			switch(input){
				case 1:
					nhapSP();
					break;
				case 2:
					sapxepSP();
					xuatSP();
					break;
				case 3: 
					timvsxoaSP();
					break;
				case 4:
					tinhtrungbinhgiaSP();
					break;
				case 0:
					System.out.println("0. Thoát chương trình");
					break;
				default:
					System.out.println("Vui lòng chọn đúng trương trình");
					break;
			}
		} while (input != 0);
	}
	public static void main(String[] args){
		menu();	
	}
}
