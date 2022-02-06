import java.util.Scanner;

public class Lab6Bai1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		String hoTen = sc.nextLine();
		String ho = hoTen.substring(0,hoTen.indexOf(" ")).toUpperCase();
		String ten = hoTen.substring(hoTen.lastIndexOf(" ")+1).toUpperCase();
		String tenDem = hoTen.substring(hoTen.indexOf(" ")+1,hoTen.lastIndexOf(" ")-1).toUpperCase();
		System.out.println("Họ: "+ho);
		System.out.println("Tên đệm: "+tenDem);
		System.out.println("Tên: "+ten);
		sc.close();
	}
}
