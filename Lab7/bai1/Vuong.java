package bai1;

public class Vuong extends ChuNhat{
	public Vuong(Double canh){
		super(canh, canh);
		rong = dai;
	}
	public void xuat(){
		System.out.printf("Diện tích Vuông: %.2f | Chu Vi Vuông: %.2f",getDienTich(),getChuVi());
	}
}
