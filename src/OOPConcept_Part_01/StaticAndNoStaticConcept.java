package OOPConcept_Part_01;

public class StaticAndNoStaticConcept {

	String name="tom"; //no static global variable
	static int age=25; //static global variable 
	
	public static void main(String[] args) {
		//how to call static method & variables 
		/*  1- direct call */
		sum();
		/*  2-  Calling by class name */
		StaticAndNoStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNoStaticConcept.age);
		
		
		
		//how to call no static method and variable
		StaticAndNoStaticConcept obj=new StaticAndNoStaticConcept();
		
		obj.sendMail();
		
	}

	public  void sendMail() {
		System.out.println("send mail method");
	}
	public static void sum() {
		System.out.println("Sum method");
	}
	
}
