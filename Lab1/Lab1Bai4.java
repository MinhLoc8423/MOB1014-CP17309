import java.util.Scanner;
import java.math.*;
public class Lab1Bai4{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("ax² + bx +c = 0");
			System.out.print("Nhap a: ");
			Integer a = scanner.nextInt();
			System.out.print("Nhap b: ");
			Integer b = scanner.nextInt();
			System.out.print("Nhap c: ");
			Integer c = scanner.nextInt();
			System.out.println("Delta phuong trinh: " +( Math.pow(b, 2) - 4 * a * c));
		}
}
