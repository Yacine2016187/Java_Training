package OOPConcept_Part_02;

public class TestCar  {

	public static void main(String[] args) {

//method overriding --> when same methods is present in child class and also in the parent class with the same number of arg is called method overriding 
		
		
		//static polymorphism ; compile-time polymorphism 
		Bmw obj=new Bmw();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.theftSafty();
		obj.engine();
		System.out.println("**********************");
		
		//Car can not have have access to bmw class --> parent can't have access to child class 
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("**********************");
		
		//top casting
		Car c1=new Bmw(); // child class object can be refereed by parent class reference variable--dynamic polymporphysm/Run  time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();  // 
		
	}

}
