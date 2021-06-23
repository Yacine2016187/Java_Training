 package JavaBasics;

public class ArrayConcept_2D {

	public static void main(String[] args) {
		
		String x[][]=new String [3][4];
		System.out.println(x.length);// 3--total no of rows
		System.out.println(x[0].length);//4--total no. of columns 
		
		//1st Row
		x[0][0]="AB";
		x[0][1]="ABC";
		x[0][2]="ABCD";
		x[0][3]="ABCDE";
		
		//2nd Row
		x[1][0]="AB1";
		x[1][1]="ABC1";
		x[1][2]="ABCD1";
		x[1][3]="ABCDE1";
		
		//3rd Row
		x[2][0]="AB10";
		x[2][1]="ABC10";
		x[2][2]="ABCD10";
		x[2][3]="ABCDE10";
		
		//print all the values of 2d array: use for loop
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
			
			System.out.println(x[row][col]);
		}
		
		}
	}}

	


