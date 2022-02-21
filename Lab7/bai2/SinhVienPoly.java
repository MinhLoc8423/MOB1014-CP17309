package bai2;

abstract public class SinhVienPoly{
	private String hoTen,nganh;
	
	public SinhVienPoly(){
	}

	public SinhVienPoly(String hoTen, String nganh){
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	abstract public Double getDiem();
	public String getHocLuc(){
		if(this.getDiem() < 5) {
			return "Yeu";
		}else if(this.getDiem() < 6.5){
			return "Trung Binh";
		}else if(this.getDiem() < 7.5){
			return "Kha";
		}else if(this.getDiem() < 9){
			return "Gioi";
		}else{
			return "Xuat Sac";
		}
	}
	public void xuat(){
		System.out.println("Ho ten: "+this.hoTen);
		System.out.println("Nganh: "+this.nganh);
		System.out.println("Diem: "+this.getDiem());
		System.out.println("Hoc luc: "+this.getHocLuc());
	}
}
