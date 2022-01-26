public class Lab4{
		public static void main(String[] args){
				SanPham sp1 = new SanPham();
				sp1.setTenSp("Hoa Hong");
				sp1.setDonGia(50000);
				sp1.setGiamGia(1000);
				System.out.println(sp1.getTenSp());
				System.out.println(sp1.getDonGia());
				System.out.println(sp1.getGiamGia());
		}
}
