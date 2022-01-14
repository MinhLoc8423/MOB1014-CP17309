import java.util.*;
public class Lab3Bai3{
		static void nhap_xuat(int index){
				Scanner sc = new Scanner(System.in);
				int[] arr = new int[index];
				for(int i = 0; i<index;i++){
						System.out.print("Nhap gia tri "+(i+1)+": ");
						arr[i] = sc.nextInt();
				}
				Arrays.sort(arr);
				System.out.println(Arrays.toString(arr));
				System.out.println("So nho nhat trong mang la: "+arr[0]);
		}
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Nhap kich thuoc mang: ");
				int kichthuoc = sc.nextInt();
				nhap_xuat(kichthuoc);
		}

}
