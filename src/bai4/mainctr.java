package bai4;

public class mainctr { //Lớp chính để chay chương trình

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonHoc2 mh = new MonHoc2();
		mh.hienthiMonHoc();
		
		MonHoc monhoc = new MonHoc("ENG301", "Ngoại ngữ 1", 8.0);
		
		
		System.out.println("---------------------");
		SinhVien1 sv = new SinhVien1();
		sv.themMonHoc(mh);
		sv.hienthiSinhVien();
	}

}
