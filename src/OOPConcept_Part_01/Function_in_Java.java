package OOPConcept_Part_01;

public class Function_in_Java {

	public static void main(String[] args) {
		// main method ---> starting point of execution
		Function_in_Java obj=new Function_in_Java();
		//one object will be created , obj is the reference variable , referring to this object 
		//after creating the object, the copy of all non static methods will be given to this object 

		
		obj.test();
		
		int sum=obj.pqr();
		System.out.println(sum);
		
		String Se= obj.qa();
		System.out.println(Se);
		
		int div=obj.division(10, 5);
		System.out.println(div);
		
		
		
	}
	
	//no static methods 
	//void --does mean return any value
	//return type void 
	public void test() {  //no input no output
		System.out.println("Test method");
	
	}
	
	
	//return type =integer
	public  int pqr() {  // no input some output
		System.out.println("PQR Method");
		int a=10;
		int b=15;
		int c=a+b;
	return c;
	
	
	
	}
	//return type =String
	public String qa() { //no input some output
		System.out.println("QA method");
		String s="Selenium";
				return s;
	}
	
	//x,y input parameters/arguments
	//return type integer 
	public int division(int x, int y) {
	System.out.println("division method");
	int d=x/y;
	return d;
	}
	}

