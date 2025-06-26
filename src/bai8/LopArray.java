package bai8;

import java.util.Arrays;

public class LopArray {
   public static void main(String[] args) {
		int[] array = {5, 3, 8, 1, 2};
		System.out.println("Array: " + Arrays.toString(array));  // Chuyển mảng -> chuỗi => Kq: [5, 3, 8, 1, 2]
		
		Arrays.sort(array); // Sắp xếp mảng
		System.out.println("Sorted array: " + Arrays.toString(array));  // Kết quả: [1, 2, 3, 5, 8]
		int index = Arrays.binarySearch(array, 3); // Tìm kiếm nhị phân
		System.out.println("Index of 3: " + index);  // Kết quả: 2
		int[] newArray = Arrays.copyOf(array, 7); // Sao chép mảng
		System.out.println("Copied array: " + Arrays.toString(newArray));  // Kết quả: [1, 2, 3, 5, 8, 0, 0]
		int[] array2 = {1, 2, 3, 5, 8};
		boolean isEqual = Arrays.equals(array, array2); // Kiểm tra mảng bằng nhau
		System.out.println("Arrays equal: " + isEqual);  // Kết quả: true
		Arrays.fill(newArray, 10); // Điền giá trị vào mảng
		System.out.println("Filled array: " + Arrays.toString(newArray));  // Kquả: [10, 10, 10, 10, 10, 10, 10]
		
		//Phương thức Arrays.mismatch(int[], int[]) chỉ có từ Java 9 trở đi.
		//int mismatchIndex = Arrays.mismatch(array, array2); // Tìm vị trí khác nhau giữa hai mảng
		int mismatchIndex = findMismatchIndex(array, array2); // Tìm vị trí khác nhau giữa hai mảng
		System.out.println("Mismatch index: " + mismatchIndex);  // Kết quả: -1 (không khác nhau)
	}
   
   //Viết một hàm tìm kiếm vị trí khác, phù hợp Java 8 trở xuống
   public static int findMismatchIndex(int[] array1, int[] array2) {
       int minLength = Math.min(array1.length, array2.length);
       for (int i = 0; i < minLength; i++) {
           if (array1[i] != array2[i]) {
               return i; // Trả về vị trí khác nhau đầu tiên
           }
       }
       // Nếu tất cả phần tử trùng nhau nhưng độ dài khác, mismatch tại chỉ số bằng minLength
       if (array1.length != array2.length) {
           return minLength;
       }
       return -1; // Hai mảng giống nhau hoàn toàn
   }
   
}


