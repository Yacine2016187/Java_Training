package OOPConcept_Part_01;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100"; // if we want to convert String to int we need to use Integer.parseInt(x);
		System.out.println(x+20);
		
		//data conversion : String to int:
		int    i=Integer.parseInt(x);
		System.out.println(i+20);
		//Integer,Double,Boolean
		
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		
		//int to String :
		int a=20;
		System.out.println(a+10);
		String s=String.valueOf(a);
		System.out.println(s+10);
		
	}
	
		
		
		
	}

