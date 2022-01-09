import java.util.Scanner;
import java.math.*;
public class Lab1Bai2{
		public static void main(String[] args){
				Scanner scanner = new Scanner(System.in);
				System.out.print("Chieu dai: ");
				Integer chieu_dai = scanner.nextInt();
				System.out.print("Chieu rong: ");
				Integer chieu_rong = scanner.nextInt();
				System.out.println("Chu vi: " + (chieu_dai + chieu_rong)*2);
				System.out.println("Dien tich: " + chieu_dai * chieu_rong);
				System.out.println("Canh nho nhat: " + Math.min(chieu_dai,chieu_rong));
		}
}
