public class SanPham{
	private String tenSP,hang;
	private Double donGia;
	public SanPham(String tenSP, Double donGia , String hang){
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.hang = hang;
	}
	public String getTenSP() {
		return tenSP;
	}
	public String getHang() {
		return hang;
	}
	public Double getDonGia() {
		return donGia;
	}
}
