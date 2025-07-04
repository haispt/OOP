package bai9;

public class PhamViSoHocJava {
	
	public static void main(String[] args) {
		System.out.println("Kích thước double là " + Double.MAX_VALUE );
		System.out.println("Kích thước float là " + Float.MAX_VALUE );
		System.out.println("Kích thước long là " + Long.MAX_VALUE );
		System.out.println("Kích thước byte là " + Byte.MAX_VALUE );
		System.out.println("Kích thước short là " + Short.MAX_VALUE );
		System.out.println("Kích thước int là " + Integer.MAX_VALUE );
		System.out.println("----------------------------------");
		long aLong, bLong, cLong;
		aLong = Long.MAX_VALUE;//9,223,372,036,854,775,807
		bLong = Long.MAX_VALUE-1;
        aLong = 9223372036854775806L;//Số long - mặc định sẽ coi là int
        cLong = aLong + bLong;
        
        byte a, b, c;
        a = 12;
        b = 2;
        //c = a + b; //err - mặc định khi tính toán sẽ thực hiện ở int
        //muốn để byte phải ép kiểu:  c= (byte) (a+b); 
        int d= a+b;
        //hoặc chuyển về int
        
        System.out.println("Cộng thử 2 số rất lớn trong Java:" + cLong);
        System.out.println("Cộng thử 2 số vượt phạm vi trong Java:" + d); 

	}
	
}
