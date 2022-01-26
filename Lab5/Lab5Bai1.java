import java.util.ArrayList;
import java.util.Scanner;
public class Lab5Bai1{
		public static void main(String[] args){
				ArrayList<Double> arr = new ArrayList<Double>();
				Scanner sc = new Scanner(System.in);
				while(true){
						System.out.print("Nhap so thuc: ");
						Double input = sc.nextDouble();
						arr.add(input);
						sc.nextLine();
						System.out.print("Nhap them (Y/N)? ");
						if(sc.nextLine().equalsIgnoreCase("n")){
								break;
						}
				}
				Double tong = 0.0;
				for(Integer i = 0; i < arr.size(); i++){
						System.out.println(arr.get(i));
						tong += arr.get(i); 
				}
				System.out.println("Tong la: "+tong);
		}
}
