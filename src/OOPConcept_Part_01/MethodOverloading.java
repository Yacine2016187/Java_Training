package OOPConcept_Part_01;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(1);
		obj.sum(1, 3);

/* you can not create a method inside a method */	
/* duplicate methods --i.e same method name with same number of arguments are not allowed */
		
/*  method overloading --> when the method name is same with diff arguments or input para within the same class */
	}
	public void sum() {  // 0 input para
	System.out.println("sum method without para");
	}
	public void sum(int i) {
	System.out.println("sum method with 1 input para");	
	}
	
	public void sum(double d) {
		System.out.println("sum method with 1 input para with diff input datatype");	
		}
	public void sum(int k,int j) {
	System.out.println("sum method with 2 input para");
	}
	}

