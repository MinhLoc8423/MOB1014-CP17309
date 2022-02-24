import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
		public static ArrayList<NhanVien> arrNV = new ArrayList<>();
		static Comparator<NhanVien> comp = new Comparator<NhanVien>(){
			@Override
			public int  compare(NhanVien o1,NhanVien o2){
				return o1.getHoTen().compareTo(o2.getHoTen());
			}
		};
		static Comparator<NhanVien> comp1 = new Comparator<NhanVien>(){
			@Override
			public int  compare(NhanVien o1,NhanVien o2){
				return Double.compare(o1.getLuong(), o2.getLuong());
			}
		};

		public static ArrayList<NhanVien> nhapList(){
				System.out.println("-----------------");
				while(true){
						Scanner sc = new Scanner(System.in);
						System.out.print("Nhập mã nhân viên: ");
						String ma = sc.nextLine();
						while(!ma.matches("\\w{3,8}")){
							System.out.print("Nhập lại mã nhân viên: ");
							ma = sc.nextLine();
						}
						System.out.print("Nhập họ và tên nhân viên: ");
						String ten = sc.nextLine();
						while(!ten.matches("[a-zA-Z]{3,8}")){
							System.out.print("Nhập lại ho ten nhân viên: ");
							ten = sc.nextLine();
						}
						System.out.print("Nhập lương nhân viên: ");
						String luong = sc.nextLine();
						while(!luong.matches("\\d{1,10}")){
							System.out.print("Nhập lại luong nhân viên: ");
							luong = sc.nextLine();
						}
						System.out.print("Nhập chức vụ(TruongPhong/TiepThi)");
						String chucVu = sc.next();
						while (!chucVu.equals("TruongPhong") && !chucVu.equals("TiepThi")) {
							System.out.print("Nhập lại chức vụ nhân viên: ");
							chucVu = sc.nextLine();
						}
						if (chucVu.equals("TruongPhong")) {
							System.out.print("Nhập lương trách nhiệm: ");
							String trachNhiem = sc.next();		
							while(!trachNhiem.matches("\\d{1,10}")){
								System.out.print("Nhập lại luong trach nhiem nhân viên: ");
								trachNhiem = sc.nextLine();
							}
							arrNV.add(new TruongPhong(ma,ten,Double.parseDouble(luong),chucVu,Double.parseDouble(trachNhiem)));
						}
						else{
							System.out.print("Nhap doanh so:");
							String doanhSo = sc.next();
							while(!doanhSo.matches("\\d{1,10}")){
								System.out.print("Nhập lại doanh so nhân viên: ");
								doanhSo = sc.nextLine();
							}

							System.out.print("Nhap hoa hong:");
							String hoaHong = sc.next();
							while(!hoaHong.matches("\\d{1,10}")){
								System.out.print("Nhập lại hoa hong  nhân viên: ");
								hoaHong = sc.nextLine();
							}

							arrNV.add(new TiepThi(ma,ten,Double.parseDouble(luong),chucVu,Double.parseDouble(doanhSo),Double.parseDouble(hoaHong)));
						}
						System.out.print("Bạn có muốn nhập thêm không (Y/N) ?");
						if(sc.next().equalsIgnoreCase("N")){
								break;
						}
				}
				System.out.println("-----------------");
				return arrNV;
		}
		public static void xuatList(ArrayList<NhanVien> arrNV){
				System.out.println("-----------------");
				System.out.println("Danh sach nhân viên");
				for(NhanVien index:arrNV){
					index.xuat();
					System.out.println();
				}
				System.out.println("-----------------");
		}
		public static void xoaList(ArrayList<NhanVien> arrNV){
				Scanner sc = new Scanner(System.in);
				System.out.println("-----------------");
				System.out.print("Nhập mã nhân viên cần xóa: ");
				String xoaTen = sc.nextLine();
				NhanVien found = null;
				for(NhanVien index : arrNV){
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
		public static void capNhatList(ArrayList<NhanVien> arrNV){
				Scanner sc = new Scanner(System.in);
				System.out.println("-----------------");
				System.out.print("Nhập mã nhân viên cần cập nhật: ");
				String tenCanTim = sc.nextLine();
				Integer i = 0,j=0;
				for(NhanVien index:arrNV){
						if(index.getMaNV().equalsIgnoreCase(tenCanTim)){
							System.out.print("Nhập mã nhân viên: ");
							String ma = sc.nextLine();
							while(!ma.matches("\\w{3,8}")){
								System.out.print("Nhập lại mã nhân viên: ");
								ma = sc.nextLine();
							}
							System.out.print("Nhập họ và tên nhân viên: ");
							String ten = sc.nextLine();
							while(!ten.matches("[a-zA-Z]{3,8}")){
								System.out.print("Nhập lại ho ten nhân viên: ");
								ten = sc.nextLine();
							}
							System.out.print("Nhập lương nhân viên: ");
							String luong = sc.nextLine();
							while(!luong.matches("\\d{1,10}")){
								System.out.print("Nhập lại luong nhân viên: ");
								luong = sc.nextLine();
							}
							System.out.print("Nhập chức vụ(TruongPhong/TiepThi)");
							String chucVu = sc.next();
							while (!chucVu.equals("TruongPhong") && !chucVu.equals("TiepThi")) {
								System.out.print("Nhập lại chức vụ nhân viên: ");
								chucVu = sc.nextLine();
							}
							if (chucVu.equals("TruongPhong")) {
								System.out.print("Nhập lương trách nhiệm: ");
								String trachNhiem = sc.next();		
								while(!trachNhiem.matches("\\d{1,10}")){
									System.out.print("Nhập lại luong trach nhiem nhân viên: ");
									trachNhiem = sc.next();
								}
								arrNV.set(j,new TruongPhong(ma,ten,Double.parseDouble(luong),chucVu,Double.parseDouble(trachNhiem)));
							}
							else{
								System.out.print("Nhap doanh so:");
								String doanhSo = sc.next();
								while(!doanhSo.matches("\\d{1,10}")){
									System.out.print("Nhập lại doanh so nhân viên: ");
									doanhSo = sc.next();
								}
								System.out.print("Nhap hoa hong:");
								String hoaHong = sc.next();
								while(!hoaHong.matches("\\d{1,10}")){
									System.out.print("Nhập lại hoa hong nhân viên: ");
									hoaHong = sc.next();
								}

								arrNV.set(j,new TiepThi(ma,ten,Double.parseDouble(luong),chucVu,Double.parseDouble(doanhSo),Double.parseDouble(hoaHong)));
							}
								i++;
								j++;
								break;
						}
				}
				if(i == 0){
						System.out.println("Không tìm thấy nhân viên");
				}
				System.out.println("-----------------");

		}
		public static void  timList(ArrayList<NhanVien> arrNV){
				Scanner sc = new Scanner(System.in);
				System.out.println("-----------------");
				System.out.print("Nhập mã nhân viên cần tìm: ");
				String tenCanTim = sc.nextLine();
				Integer i = 0;
				for(NhanVien index:arrNV){
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
		public static void  timListLuong(ArrayList<NhanVien> arrNV){
				Scanner sc = new Scanner(System.in);
				System.out.println("-----------------");
				System.out.println("Tìm các nhân viên theo khoảng lương");
				System.out.print("Nhập lương nhân viên cần tìm: ");
				Double tenCanTim = sc.nextDouble();
				Integer i = 0;
				for(NhanVien index:arrNV){
						if(index.getLuong() == tenCanTim ){
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
						System.out.println("Y6: Tìm các nhân viên theo khoảng lương");
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
										capNhatList(arrNV);
										break;
								case 6:
										timListLuong(arrNV);
										break;
								case 7:
										System.out.println("Sắp xếp nhân viên theo họ và tên");
										Collections.sort(arrNV,comp);
										xuatList(arrNV);
										break;
								case 8:
										System.out.println("Sắp xếp nhân viên theo thu nhập");
										Collections.sort(arrNV,comp1);
										xuatList(arrNV);
										break;
								case 9:
										System.out.println("Xuất 5 nhân viên có thu nhập cao nhất");
										Collections.sort(arrNV,comp1);
										Collections.reverse(arrNV);
										for(Integer i = 0; i < 5;i++){
											System.out.print("Mã nhân viên: "+arrNV.get(i).getMaNV());
											System.out.print(" | ");
											System.out.print("Tên nhân viên: "+arrNV.get(i).getHoTen());
											System.out.print(" | ");
											System.out.print("Lương nhân viên: "+arrNV.get(i).getLuong());
											System.out.println();
										}
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
