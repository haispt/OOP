package bai3;

public class TamGiac {
    private double Canh1;
    private double Canh2;
    private double Canh3;
    
    //Contructor của tam giác 
    public TamGiac(double side1, double side2, double side3) throws IllegalArgumentException {
        if (!kiemTraHopLe(side1, side2, side3)) {
            throw new IllegalArgumentException("Cac canh khong hop le la do dai cac canh cua mot tam giac.");
        }
        this.Canh1 = side1;
        this.Canh2 = side2;
        this.Canh3 = side3;
    }
//hàm kiểm tra tính hợp lệ về của độ dài một 1 tam giác
     private static boolean kiemTraHopLe(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
//hàm tính chu vi
    public double getChuVi() {
        return Canh1 + Canh2 + Canh3;
    }
//hàm tính diện tích của tam giac
    public double getDienTich() {
        double s = getChuVi() / 2;
        return Math.sqrt(s * (s - Canh1) * (s - Canh2) * (s - Canh3));
    }
//hàm trả về loại của tam giác
    public String getLoaiTamGiac() {
        if (Canh1 == Canh2 && Canh2 == Canh3) {
            return "Tam Giac Deu";
        } else if (Canh1 == Canh2 || Canh2 == Canh3 || Canh1 == Canh3) {
            return "Tam Giac Can";
        } else {
            return "Tam Giac Thuong";
        }
    }
	public double getCanh1() {
		return Canh1;
	}
	public void setCanh1(double canh1) {
		Canh1 = canh1;
	}
	public double getCanh2() {
		return Canh2;
	}
	public void setCanh2(double canh2) {
		Canh2 = canh2;
	}
	public double getCanh3() {
		return Canh3;
	}
	public void setCanh3(double canh3) {
		Canh3 = canh3;
	}
	@Override
	public String toString() {
		return "TamGiac [Canh1=" + Canh1 + ", Canh2=" + Canh2 + ", Canh3=" + Canh3 + "]";
	}

   
}