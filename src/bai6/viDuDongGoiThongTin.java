package bai6;

class HocSinh {
    private String name;
    private int namsinh;
    public String diachi;
    
    //Contructor
    HocSinh() {
    	this.name = "Nguyễn Văn A";
    }
   
    // Hàm get Năm sinh
    public int getNamsinh() {
		return namsinh;
	}
    // Hàm set năm sinh
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	// Getter - Lấy tên của học sinh
    public String getName() {
        return name;
    }

    // Setter - Đặt tên học sinh theo giá trị truyền vào
    public void setName(String name) {
        this.name = name;
    }
}

class HocSinhChuyen extends HocSinh {
	String lopChuyen;
	
	//Hàm tạo tự sinh
	public HocSinhChuyen(String lopChuyen) {
		super();
		this.lopChuyen = lopChuyen;
	}
	//
	
	@Override
	public String toString() {
		//return this.name;//Lỗi vì name là thuộc tính của lớp cha khai báo là priavate
		//return this.name + " học lớp chuyên " + lopChuyen;
		return this.getName() + " học lớp chuyên " + lopChuyen;
	}
	
}

class viDuDongGoiThongTin{
	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		//String tenhocsinh = hs.name; //Lỗi
		//int ns = hs.namsinh; //Lỗi 
		String dc = hs.diachi;// OK
		
		//Muốn truy cập thuộc tính name phải thông qua hàm getName
		String tenhs = hs.getName();
		System.out.println("Tên học sinh là: " + tenhs);
		hs.setName("Lê Thị B");
		tenhs = hs.getName();
		System.out.println("Tên học sinh sau khi sửa là: " + tenhs);
		
			
		HocSinhChuyen hschuyen = new HocSinhChuyen("Toán");
		String output = hschuyen.toString();
		System.out.print(output);
	}
}
