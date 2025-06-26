package bai7;

abstract class User {
    String name;
    void login() {}
    abstract void accessModule();
}

interface ReporTable {
    void exportReport();
}

class Doctor implements ReporTable {
    @Override
	public void exportReport() {
    	System.out.print("Bác sĩ xuất báo cáo");
    }
}

class LabStaff implements ReporTable {
    @Override
	public void exportReport() {
    	System.out.print("Nhân viên phòng thí nghiệm xuất báo cáo");
    }
}

class FinanceStaff implements ReporTable {
    @Override
	public void exportReport() {
    	System.out.print("Nhân viên kế toán xuất báo cáo");
    }
}

//Chỗ này đang là Visao1
public class ViDuSo1 {
	public static void printReport(ReporTable r) {
	    r.exportReport();
	}
		

	public static void main(String[] args) {
		ReporTable r = new FinanceStaff();
		printReport(r);
	}
}

