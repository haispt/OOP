package bai6;

public class Person {

}

class Person {
    private String hoTen;
    private String diaChi;
    private int namSinh;

    Person() {}

    // Person(String ht, String dc, int ns) {}

    Person(String ht, String dc) {}

    Person(String hoTen, String diaChi, int namSinh) {}

    public String nhapXau() {}

    public int doiInt(String st) {}

    public void nhapTT() {}

    public void hienThiTT() {}
}

public class NhanVien extends Person {
    private int tongLuong;

    NhanVien() {}

    NhanVien(String ht, String dc, int ns, int tl) {
        super(ht, dc, ns);
        tongLuong = tl;
    }

    public void nhapTT() {
        super.nhapTT();
        System.out.print("Tong luong :");
        tongLuong = doiInt(nhapXau());
    }
}
