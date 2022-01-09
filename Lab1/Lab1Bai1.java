import java.util.Scanner;
public class Lab1Bai1{
		public static void main(String[] args){
				Scanner scanner = new Scanner(System.in);
				System.out.print("Ho va Ten: ");
				String name = scanner.nextLine();
				System.out.print("Diem TB: ");
				Double diemTB = scanner.nextDouble();
				System.out.println(name + " " + diemTB + " diem");
		}
}
