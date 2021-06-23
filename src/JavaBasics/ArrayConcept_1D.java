package JavaBasics;

public class ArrayConcept_1D {

	public static void main(String[] args) {
		
		
		int i[]=new int[4];  //Homogenize data 
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]+i[2]);
		
		System.out.println(i.length);  // get the size for array
		
		//print all the value for array
		for (int j=0;j<4;j++){
			System.out.print(i[j]+ " ");
		
			//=> Disadvantages 	of array : similar data type(integer,string) we need to object array to resolve this problem 
			
			Object Obj[]=new Object[5];   //different Data Type at the same time  //heterogeneous data 
			Obj[0]="Tom";
			Obj[1]=12;
			Obj[2]=14.55;
			Obj[3]=12/11/1990;
			Obj[4]='M';
			
		}
		}
}

