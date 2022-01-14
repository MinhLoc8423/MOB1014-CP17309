import java.util.Scanner;
import java.math.*;
public class Lab3Bai1{
		public static void main(String[] args) {
        		Scanner s = new Scanner(System.in);
       			System.out.print("Enter a number : ");
       			int n = s.nextInt();
       			if (check_number(n)) {
           				System.out.println(n + " la so nguyen to");
       			} else {
           				System.out.println(n + " khong phai la so nguyen to");
       			}
   		}
  		public static boolean check_number(int n) {
       			if (n <= 1) {
           				return false;
       			}
       			for (int i = 2; i <= Math.sqrt(n); i++) {
           				if (n % i == 0) {
               			return false;
           				}
       			}
       			return true;
   		}
}
