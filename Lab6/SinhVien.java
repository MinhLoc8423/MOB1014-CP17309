public class SinhVien {
	private String hoTen,email;
	private Integer soDienThoai;
	private Long soCMND;
	public SinhVien(String hoTen,String email,Integer soDienThoai,Long soCMND){
		this.hoTen = hoTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.soCMND = soCMND;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getEmail() {
		return email;
	}
	public Integer getSoDienThoai() {
		return soDienThoai;
	}
	public Long getSoCMND() {
		return soCMND;
	}
}

