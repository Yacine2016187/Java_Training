package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		
		
		//primitive data types : int, double,boolean and char
		
		//1. int:
		int i=10; //declare i=10
			i=20; //replace i=10 to i=20;
		System.out.println(i);
		
		//2. double:
		double d=12.33;
		double d1=34.44;
		double d2=100;
		System.out.println(+d+" "+d1+" "+d2);
		
		//3.char:
		char c = 'a'; //should be written with single quotes and single value  
		char c1='A';
		char c2='1';
		char c3='$';
		System.out.println(+c+" "+c1+" "+c2+" "+c3);
		//4.boolean:
		boolean b1= true ;
		boolean b2=false ;                             
		System.out.println(b1);
		System.out.println(b2);
		
		 int x = 10;
		 int y = 9;
		 boolean z=x>y;
		System.out.println(z);
		
		
		//5.String: is a class,not a data type
		String s ="Hello World";
		String s1="Selenium";
		System.out.print(s+";   "+s1);
	}

}
