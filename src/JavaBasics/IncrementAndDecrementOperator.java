package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
	int i=1;
	int j=i++;  			//post increment => first j=i and than i=1+1
	System.out.println(i);
	System.out.println(j);
	
	System.out.println("************************");
	
	int a=1;
	int b=++a;
	System.out.println(a);
	System.out.println(b);  // pre-increment => j=+1+1;i=+1+1
	
	System.out.println("************************");
	
	int m=1;
	int n=m--;
	System.out.println(m);
	System.out.println(n);
	
	System.out.println("************************");
	
	int p=1;
	int q=--p;
	System.out.println(p);
	System.out.println(q);
	
		
	}

}
