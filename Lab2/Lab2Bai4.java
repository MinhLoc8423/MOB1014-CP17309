import java.util.Scanner;
public class Lab2Bai4{
		public static void main(String []args){
				Scanner scanner = new Scanner(System.in);
				System.out.println("+---------------------------------------------------+");
				System.out.println("1. Giải phương trình bậc nhất");
				System.out.println("2. Giải phương trình bậc 2");
				System.out.println("3. Tính tiền điện");
				System.out.println("4. Kết thúc");
				System.out.println("+---------------------------------------------------+");
				System.out.print("Chon chuc nang: ");
				Integer chon = scanner.nextInt();
				switch(chon){
						case 1:{
								System.out.println("ax + b = 0");
								System.out.print("Nhap a: ");
								Float a = scanner.nextFloat();
								if (a != 0) {
										System.out.print("Nhap b: ");
										Float b = scanner.nextFloat();
										System.out.println("Nghiem la: " + -b/a );
								} else {
										System.out.println("a phai khac 0 !!!");	
								}
								break;
						}		
						case 2:{
								System.out.println("ax² + bx +c = 0");	
								System.out.print("Nhap a: ");
								Integer a = scanner.nextInt();
								System.out.print("Nhap b: ");
								Integer b = scanner.nextInt();
								System.out.print("Nhap c: ");
								Integer c = scanner.nextInt();
								if (a == 0) {
										System.out.print("Nghiem cua phuong trinh la: " + (-c/b));
								} else {
										Double delta = Math.pow(b, 2) - 4 * a * c;
										if(delta < 0){
												System.out.println("Vo nghiem");
										}
										else if(delta == 0){
												System.out.println("Nghiem kep: " + -b/(2*a));
										}
										else{
												System.out.println("Nghiem x1: " + (-b+ Math.sqrt(delta))/(2*a) );
												System.out.println("Nghiem x2: " + (-b- Math.sqrt(delta))/(2*a) );
										}
								}
								break;
						}
						case 3:
								System.out.print("Nhap so dien: ");
								Float so_dien = scanner.nextFloat();
								if(so_dien < 50){
											System.out.println("So tien dien la: " + so_dien*1000);
								}
								else{
											System.out.println("So tien dien la: " + (50*1000 + (so_dien-50)*1200) );
								}
								break;
						case 4:
								System.out.println("Ket thuc chuong trinh");
								break;
				}
		}
}
