import java.util.ArrayList;
import java.util.Scanner;

public class Asm{
		public static ArrayList<Employee> arrNV = new ArrayList<Employee>();

		public static ArrayList<Employee> nhapList(){
				System.out.println("-----------------");
				while(true){
						Employee nv = new Employee();
						Scanner sc = new Scanner(System.in);
						System.out.print("Nhập mã nhân viên: ");
						String ma = sc.nextLine();
						System.out.print("Nhập họ và tên nhân viên: ");
						String ten = sc.nextLine();
						System.out.print("Nhập lương nhân viên: ");
						double luong = sc.nextDouble();
						nv.setMaNV(ma);
						nv.setHoTen(ten);
						nv.setLuong(luong);
						arrNV.add(nv);
						System.out.print("Bạn có muốn nhập thêm không (Y/N) ?");
						if(sc.next().equalsIgnoreCase("N")){
								break;
						}
				}
				System.out.println("-----------------");
				return arrNV;
		}
		public static void xuatList(ArrayList<Employee> arrNV){
				System.out.println("-----------------");
				System.out.println("Danh sach nhân viên");
				for(Employee index:arrNV){
						System.out.println("Mã nhân viên: "+index.getMaNV());
						System.out.println("Tên nhân viên: "+index.getHoTen());
						System.out.println("Lương nhân viên: "+index.getLuong());
						System.out.println();
				}
				System.out.println("-----------------");
		}
		public static void xoaList(ArrayList<Employee> arrNV){
				Scanner sc = new Scanner(System.in);
				System.out.println("-----------------");
				System.out.print("Nhập mã nhân viên cần xóa: ");
				String xoaTen = sc.nextLine();
				Employee found = null;
				for(Employee index : arrNV){
						if(index.getMaNV().equalsIgnoreCase(xoaTen)){
							found = index;
						}
				}
				if(found != null){
						arrNV.remove(found);
						System.out.println("Nhân viên đã được xóa");
				}
				else{
					System.out.println("Không tìm thấy tên nhân viên");
				}
		}
		public static void capNhatList(ArrayList<Employee> arrNV){
		}
		public static void  timList(ArrayList<Employee> arrNV){
				Scanner sc = new Scanner(System.in);
				System.out.println("-----------------");
				System.out.print("Nhập mã nhân viên cần tìm: ");
				String tenCanTim = sc.nextLine();
				Integer i = 0;
				for(Employee index:arrNV){
						if(index.getMaNV().equalsIgnoreCase(tenCanTim)){
								System.out.println("Mã nhân viên: "+index.getMaNV());
								System.out.println("Tên nhân viên: "+index.getHoTen());
								System.out.println("Lương nhân viên: "+index.getLuong());
								i++;
								break;
						}
				}
				if(i == 0){
						System.out.println("Không tìm thấy nhân viên");
				}
				System.out.println("-----------------");
		}
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				while(true){
						System.out.println("***Ứng dụng quản lý nhân viên***");
						System.out.println("Y1: Nhập danh sách nhân viên");
						System.out.println("Y2: Xuất danh sách nhân viên");
						System.out.println("Y3: Tìm và hiện thị nhân viên theo mã");
						System.out.println("Y4: Xóa nhân viên theo mã");
						System.out.println("Y5: Cập nhật thông tin nhân viên theo mã");
						System.out.println("Y6: Tìm và hiện thị nhân viên theo mã nhập");
						System.out.println("Y7: Sắp xếp nhân viên theo họ và tên");
						System.out.println("Y8: Sắp xếp nhân viên theo thu nhập");
						System.out.println("Y9: Xuất 5 nhân viên có thu nhập cao nhất");
						System.out.println("Y0: Thoat chuong trinh");
						System.out.print("Chọn chức năng Y:");
						switch(sc.nextInt()){
								case 1:
										arrNV = nhapList();
										break;
								case 2:
										xuatList(arrNV);
										break;
								case 3: 
										timList(arrNV);
										break;
								case 4:
										xoaList(arrNV);
										break;
								case 5:
										System.out.println("Cập nhật thông tin nhân viên theo mã");
										break;
								case 6:
										System.out.println("Tìm các nhân viên theo khoảng lương");
										break;
								case 7:
										System.out.println("Sắp xếp nhân viên theo họ và tên");
										break;
								case 8:
										System.out.println("Sắp xếp nhân viên theo thu nhập");
										break;
								case 9:
										System.out.println("Xuất 5 nhân viên có thu nhập cao nhất");
										break;
								case 0:
										System.exit(0);
								default:
										System.out.println("Chọn lại chức năng");
										break;
						}
				}
		}
}
