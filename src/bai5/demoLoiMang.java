package bai5;

public class demoLoiMang {
public static void main(String[] args) {
	int [] mang1 = null;
	int [] mang2 = {1,2,3};
	//mang2[2] = "Siuuuu"; //Compile Error
	
	// Runtime Error!
	System.out.print(mang1.length);//NullPointerException
	//System.out.print(mang2.length);
	//mang2[3] =1;//ArrayIndexOutOfBoundsException
	
//	int [] mang3 = new int[3];
//	mang3[0]=1;
	}
}
