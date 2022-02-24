public class TiepThi extends NhanVien{
	private Double doanhSo,hoaHong;

	public TiepThi(){
	}

	public TiepThi(String maNV, String hoTen, Double luong, String chucVu, Double doanhSo, Double hoaHong){
		super(maNV,hoTen,luong,chucVu);
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}

	public Double getDoanhSo() {
		return doanhSo;
	}
	public Double getHoaHong() {
		return hoaHong;
	}
	public void setDoanhSo(Double doanhSo) {
		this.doanhSo = doanhSo;
	}
	public void setHoaHong(Double hoaHong) {
		this.hoaHong = hoaHong;
	}

	@Override
	public Double getThuNhap(){
		return super.luong + this.hoaHong + this.doanhSo;	
	}
}
