package bai1;

public class ChuNhat{
	protected Double dai,rong;
	public ChuNhat(Double dai,Double rong){
		this.dai = dai;
		this.rong = rong;
	}
	public Double getChuVi(){
		return (dai+rong)*2;
	}
	public Double getDienTich(){
		return dai*rong;
	}
	public void xuat(){
		System.out.printf("Diện tích HCN: %.2f | Chu Vi HCN: %.2f",getDienTich(),getChuVi());
	}
}
