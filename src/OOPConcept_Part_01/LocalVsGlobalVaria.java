package OOPConcept_Part_01;

public class LocalVsGlobalVaria {
	
	//global variable
	String name="Tom";
	int age=25;
	
	public static void main(String[] args) {
		
		int i = 10; //local variable
		System.out.println(i);
		LocalVsGlobalVaria obj=new LocalVsGlobalVaria();
		System.out.println( obj.name);
		System.out.println( obj.age);
		obj.sum();
	}
	public void sum() {
		int i=15;//local variable
		int j=20;
		int sum_=i+j;
		System.out.println(sum_);
	}
}
