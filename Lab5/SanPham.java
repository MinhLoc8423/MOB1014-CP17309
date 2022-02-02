public class SanPham{
	private String tenSP;
	private Integer giaSP;
	public SanPham(){

	}
	public SanPham(String tenSP, Integer giaSP){
		this.tenSP = tenSP;
		this.giaSP = giaSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setGiaSP(Integer giaSP) {
		this.giaSP = giaSP;
	}
	public Integer getGiaSP() {
		return giaSP;
	}
}
