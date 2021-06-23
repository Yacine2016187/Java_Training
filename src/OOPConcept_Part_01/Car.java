package OOPConcept_Part_01;

public class Car {

	//Class Variable / Global Variable
	
	int mode;
	int wheel;
	
	
	public static void main(String[] args) {
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		System.out.println("Before assigning the reference");
		a.mode=2012;
		a.wheel=4;
		
		b.mode=2014;
		b.wheel=4;
		
		c.mode=2000;
		c.wheel=4;
		System.out.println(a.mode);
		System.out.println(a.wheel);
		
		
		System.out.println("after shifting the reference");
		a=b;
		b=c;
		c=a;
		
		a.mode=50;
		System.out.println(a.mode);  //=50
		c.mode=70;
		System.out.println(a.mode);  //=70

	}

}
