package bai2;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        //Đây là chú thích 1 dòng
        System.out.println("Các phần tử trong mảng:");       
        for (int num : numbers) {
            System.out.println(num);
        }
        
    }
}