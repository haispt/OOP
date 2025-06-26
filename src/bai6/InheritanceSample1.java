package bai6;

class Employee {
	float salary = 3.14f;
	//float salary2 = 3.14;//?
}

class Programmer extends Employee {
    int bonus = 150;
}

class InheritanceSample1 {
	
	public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary + "usd");
        System.out.println("Bonus of Programmer is: " + p.bonus + "$");
    }
}