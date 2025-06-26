package bai8;

public class LopString {
    public static void main(String[] args) {
        String s = "Hello, World!"; 
        
        StringBuffer sb = new StringBuffer("Hello");
       
        
        
        // Độ dài của chuỗi
        System.out.println("Length: " + s.length()); // Kết quả: 13 
        // Trả về ký tự tại vị trí chỉ định
        System.out.println("Char at index 1: " + s.charAt(1)); // Kết quả: 'e' 
        // Kiểm tra chuỗi có bắt đầu bằng "Hello" không
        System.out.println("Starts with 'Hello': " + s.startsWith("Hello")); // Kết quả: true 
        // Chuyển chuỗi thành chữ hoa
        System.out.println("Uppercase: " + s.toUpperCase()); // Kết quả: "HELLO, WORLD!" 
        // Tạo chuỗi con
        System.out.println("Substring: " + s.substring(7, 12)); // Kết quả: "World" 
        // Thay thế ký tự
        System.out.println("Replace 'l' with 'x': " + s.replace('l', 'x')); // Kết quả: "Hexxo, Worxd!"
        // So sánh
        String s1="ABc", s2="AbC";
       
        System.out.println("So sánh s1 và s2 có phân biệt chữ hoa/thường:" + s1.equals(s2));
        System.out.println("So sánh s1 và s2 KHÔNG phân biệt chữ hoa/thường:" + s1.equalsIgnoreCase(s2));
        System.out.println("So sánh s1 và s2 dùng compare:" + s1.compareTo(s2));
        System.out.println("So sánh s1 và s2 dùng compareToIgnoreCase:" + s1.compareToIgnoreCase(s2));
    }
}
