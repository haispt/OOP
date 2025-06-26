package bai5;

public class vidu5 {
    public static void main(String[] args) {
        try {
            checkAge(15);
        	//checkAge(19);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Ngoại lệ xảy ra: " + e.getMessage());
        }
    }
    
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Tuổi phải từ 18 trở lên để đăng ký.");
        } else {
            System.out.println("Đăng ký thành công!");
        }
    }
}
