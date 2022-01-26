import java.util.Scanner;
public class SanPham{
		private String tenSp;
		private double donGia;
		private double giamGia;
		private double getThueNhapKhau(){
				return donGia*0.1;
		}
		public void xuat(){
				System.out.println("Ten san pham: "+this.tenSp);
				System.out.println("Don gia: "+this.donGia);
				System.out.println("Giam gia: "+this.giamGia);
				System.out.println("Thue nhap khau: "+ getThueNhapKhau());
		}
		public void nhap(){
				Scanner sc = new Scanner(System.in);
				System.out.print("Nhap ten san pham: ");
				this.tenSp = sc.nextLine();
				System.out.print("Nhap gia san pham: ");
				this.donGia = sc.nextDouble();
				System.out.print("Nhap giam gia: ");
				this.giamGia = sc.nextDouble();
		}
		public SanPham(String tenSp, double donGia,double giamGia){
				this.tenSp = tenSp;
				this.donGia = donGia;
				this.giamGia = giamGia;
		}
		public SanPham(String tenSp, double donGia){
				this.tenSp = tenSp;
				this.donGia = donGia;
				this.giamGia = 0;
		}
		public SanPham(){
		}
		public String getTenSp() {
				return this.tenSp;
		}
		public void setTenSp(String tenSp) {
				this.tenSp = tenSp;
		}
		public void setDonGia(double donGia) {
				this.donGia = donGia;
		}
		public double getDonGia() {
				return this.donGia;
		}
		public void setGiamGia(double giamGia) {
				this.giamGia = giamGia;
		}
		public double getGiamGia() {
				return this.giamGia;
		}
}
