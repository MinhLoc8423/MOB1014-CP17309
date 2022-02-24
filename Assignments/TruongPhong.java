public class TruongPhong extends NhanVien{
	private Double trachNhiem;

	public TruongPhong(){
	}

	public TruongPhong(String maNV, String hoTen, Double luong, String chucVu, Double trachNhiem){
		super(maNV,hoTen,luong,chucVu);
		this.trachNhiem = trachNhiem;
	}

	public Double getTrachNhiem() {
		return trachNhiem;
	}
	public void setTrachNhiem(Double trachNhiem) {
		this.trachNhiem = trachNhiem;
	}

	@Override
	public Double getThuNhap(){
		return super.luong + this.trachNhiem;	
	}
}
