import java.util.Scanner;
import java.util.Arrays;
public class Lab3Bai4{
		static void sortSV(String hoten[],Float diemSV[],Integer cout){
				for(Integer i = 0; i < cout - 1 ; i++){
						for(Integer j = i+1;j < cout ; j++){
								if(diemSV[i] > diemSV[j]){
										String tempht = hoten[i];
										hoten[i] = hoten[j];
                						hoten[j] = tempht;
										Float tempd = diemSV[i];
										diemSV[i] = diemSV[j];
                						diemSV[j] = tempd;
								}
						}
				}
		}

		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				String[] ho_ten = new String[50];
				Float[] diem = new Float[50];
				String input = "y";	
				Integer count = 0;
				do{
						System.out.println("Nhap ho va ten: ");
						ho_ten[count] = sc.nextLine();
						System.out.println("Nhap diem: ");
						diem[count] = sc.nextFloat();
						count++;
						System.out.println("Ban co muon tiep tuc khong ?(y/n)");
						input = sc.next();
						sc.nextLine();
				}while(input.equalsIgnoreCase("y"));
				sortSV(ho_ten,diem,count);
				for(Integer i = 0; i < count ;i++){
						System.out.print("Ho ten: "+ho_ten[i] +" "+"Diem: "+diem[i]);
						if(diem[i] >= 9){
								System.out.println(" Hoc luc xuat xac");
						}
						else if(diem[i] >= 7.5){
								System.out.println(" Hoc luc gioi");
						}
						else if(diem[i] >=6.5){
								System.out.println(" Hoc luc kha");
						}
						else if(diem[i] >= 5){
								System.out.println(" Hoc luc trung binh");
						}
						else{
								System.out.println(" Hoc luc yeu");
						}
				}
		}
}
