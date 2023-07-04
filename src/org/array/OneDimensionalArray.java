package org.array;

public class OneDimensionalArray {

	public static void main(String[]args) {
	
		// to declare array we have to use the syntax
		
		int a[]=new int[6];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		
		/* to call these all index we cant call one by one by using index
		 * it will take much time so as usual we use loop statements to call this 
		 * in one single line
		*/
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println("---------------------");
		
			/*like we used for loop now we are going to use
			 * for each loop otherwise called as enhanced loop
			 */			
		for(int b:a) {
			System.out.println(b);
		}
		
		/*here in for each loop or enhanced loop the values of
		 * a will be swapped into value of b one by one
		 * so the same answer will be printed as we print a
		 */
		
		
		
		
		
		
		
		
		
		
	}
	}
	

