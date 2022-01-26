import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Lab5Bai2{
		public static ArrayList<String> nhapArr(){
				Scanner sc = new Scanner(System.in);
				ArrayList<String> arrString = new ArrayList<String>(); 
				while (true) {
						System.out.print("Nhap ho va ten: ");
						String hoten = sc.nextLine();
						arrString.add(hoten);
						System.out.print("Nhap them (Y/N)?");
						if(sc.nextLine().equalsIgnoreCase("N")){
								break;
						}
				}
				System.out.println("----------------");
				return arrString;
		}
		public static void xuatArr(ArrayList<String> arrString){
				System.out.println("Danh sach ho ten: ");
				for(int i = 0; i< arrString.size();i++){
						System.out.println(arrString.get(i));
				}
				System.out.println("----------------");
		}
		public static ArrayList<String> ngauNghienArr(ArrayList<String> arrString){
				System.out.println("Sap xep ngau nhien ho ten:");
				Collections.shuffle(arrString);
				return arrString;		
		}
		public static ArrayList<String> sapXepArr(ArrayList<String> arrString){
				System.out.println("Sap xep ho ten:");
				Collections.sort(arrString);
				Collections.reverse(arrString);
				return arrString;
		}
		public static ArrayList<String> xoaArr(ArrayList<String> arrString, String tenCanXoa){
				arrString.remove(tenCanXoa);
				return arrString;
		}
 		public static void menu(){
				ArrayList<String> arrString = new ArrayList<String>();
				Scanner sc = new Scanner(System.in);
				Integer choose;
				do{
						System.out.println("Menu");
						System.out.println("1: Nhap");
						System.out.println("2: Xuat");
						System.out.println("3: Sap Xep");
						System.out.println("4: Ngau Nhien");
						System.out.println("5: Xoa ");
						System.out.println("0: Ket Thuc");
						System.out.print("Lua chon chuong trinh: ");
						choose = sc.nextInt();
						switch(choose){
								case 1:
										arrString = nhapArr();
										break;
								case 2:
										xuatArr(arrString);
										break;
								case 3:
										sapXepArr(arrString);
										xuatArr(arrString);
										break;
								case 4:
										ngauNghienArr(arrString);
										xuatArr(arrString);
										break;
								case 5:
										System.out.print("Ho ten muon xoa: ");
										String hoten = sc.next();
										xoaArr(arrString,hoten);
										xuatArr(arrString);
								case 0:
										System.out.println("Ket thuc chuong trinh");
						}
				}while(choose != 0);
		}
		public static void main(String[] args){
				menu();
		}
}

