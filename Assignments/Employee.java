public class Employee{
		private String maNV,hoTen;
		double luong;
		
		public Employee(){
		}
		public Employee(String maNV, String hoTen, double luong){
				this.maNV = maNV;
				this.hoTen = hoTen;
				this.luong = luong;
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
}
