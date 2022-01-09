import java.util.Scanner;
import java.math.*;
public class Lab1Bai3{
		public static void main(String[] agrs){
				Scanner scanner = new Scanner(System.in);
				System.out.print("Nhap canh khoi lap phuong: ");
				Integer canh = scanner.nextInt();
				System.out.println("The tich cua khoi chu nhat la: " + Math.pow(canh, 3));
		}
}
