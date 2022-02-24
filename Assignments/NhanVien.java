abstract public class NhanVien{
		private String maNV,hoTen,chucVu;
		protected Double luong;
		
		public NhanVien(){
		}
		public NhanVien(String maNV, String hoTen, Double luong, String chucVu){
			this.maNV = maNV;
			this.hoTen = hoTen;
			this.luong = luong;
			this.chucVu = chucVu;
		}
		public void setMaNV(String maNV) {
			this.maNV = maNV;
		}
		public String getMaNV() {
			return maNV;
		}
		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}
		public String getHoTen() {
			return hoTen;
		}
		public void setLuong(double luong) {
			this.luong = luong;
		}
		public double getLuong() {
			return luong;
		}
		public void setChucVu(String chucVu) {
			this.chucVu = chucVu;
		}
		public String getChucVu() {
			return chucVu;
		}
		abstract public Double getThuNhap();
		public Double getThueTN(){
			if(this.getThuNhap() < 9000000) {
				return 0.0;
			}else if(this.getThuNhap() < 15000000){
				return 0.1;
			}else{
				return 0.12;
			}
		}
		public void xuat(){
			System.out.print("Mã nhân viên: "+this.maNV);
			System.out.print(" | ");
			System.out.print("Họ tên: "+this.hoTen);
			System.out.print(" | ");
			System.out.print("Lương: "+this.luong);
			System.out.print(" | "); 
			System.out.print("Chức vụ: "+this.chucVu);
			System.out.print(" | "); 
			System.out.print("Thu nhập: "+this.getThuNhap());
			System.out.print(" | ");
			System.out.print("Thuế: "+this.getThueTN());
		}
}
