package bai8;

import java.util.ArrayList;

public class LopArrayList {
	   public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<String>(); // Khởi tạo ArrayList
			
			// Thêm phần tử vào danh sách
			list.add("Apple"); 	
			list.add("Banana"); 	
			list.add("Orange");
			System.out.println("ArrayList: " + list);  //Kết quả: [Apple, Banana, Orange]
			
			String fruit = list.get(1); //Lấy phần tử theo chỉ số
			System.out.println("Phần tử tại chỉ số 1: " + fruit);// Kết quả: Banana
			
			list.set(2, "Grapes"); // Thay đổi giá trị phần tử tại vị trí 2
			System.out.println("Sau khi thay đổi: " + list);  // Kết quả: [Apple, Banana, Grapes]
			
			list.remove(1); // Xóa phần tử theo chỉ số
			System.out.println("Sau khi xóa: " + list);  // Kết quả: [Apple, Grapes]
			
			boolean containsApple = list.contains("Apple"); // "Apple" có thuộc ds không?
			System.out.println("Có chứa Apple: " + containsApple);  // Kết quả: true
			}
	}
