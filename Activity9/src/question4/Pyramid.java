//Author:Ankita Galgalikar
//WAP to print a pyramid
package question4;

public class Pyramid {

	public static void main(String[] args) {
		int i, j, row=6;   
		
		for(i=0; i<row; i++)   //outer loop for rows  
		{   
		
		for(j=0; j<=i; j++)   //inner loop for columns  
		{   
		
		System.out.print("* ");   //prints stars   
		}   
		
		System.out.println();   
		}   

	}

}
