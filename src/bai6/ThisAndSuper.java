package bai6;

class TheDog {    
    String name;  
    float weight=1;
    
    public TheDog(){
        this("Milu"); //gọi đến constructor
    } 
    
   //Constructor 
    public TheDog(String name) {       
        this.name = name;
    }    
    public void display() {        
        System.out.println("Tên con chó là: " + this.name);    
    }
}
// Khai báo lớp GermanDog kế thừa từ lớp Dog
class GermanDog extends TheDog{
	float weight; //Thuộc tính của lớp con
    public GermanDog(float m){
       super();
       this.weight = super.weight + m;
    }
    @Override
    public void display() {        
        System.out.println("Tên con GermanDog  là: " + this.name);
        System.out.println("Con chó cân nặng: " + this.weight + "kg.");  
    }
}

public class ThisAndSuper{
	public static void main(String[] args) {
		GermanDog gmD = new GermanDog(10);
		gmD.display();
	}
}
		