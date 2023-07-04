package org.array;

public class TwoDimensionalArray {// rows and coloumns

	public static void main(String[]args) {
		
		/*we want to declare array
		here in two dimensional array,the declaration syntax is different
		since two dimensional array totally depends on the rows and coloumns
		we want to decalre both index for rows and as well as coloumns
		*/
		
		int a[][]=new int[5][5];
		
		/* here the both 5 and 5 refers to 
		 * 5 rows and 5 coloumns 
		 * first one refers to rows and second one refers to coloumns
		 * always coloumn depends on the rows
		 */
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
		a[0][4]=50;
		
		a[1][0]=60;
		a[1][1]=70;
		a[1][2]=80;
		a[1][3]=90;
		a[1][4]=100;
		
		a[2][0]=110;
		a[2][1]=120;
		a[2][2]=130;
		a[2][3]=140;
		a[2][4]=150;
		
		a[3][0]=160;
		a[3][1]=170;
		a[3][2]=180;
		a[3][3]=190;
		a[3][4]=200;
		
		a[4][0]=210;
		a[4][1]=220;
		a[4][2]=230;
		a[4][3]=240;
		a[4][4]=250;
		
		
		/* to call the values in single line using loop
		we have to use the two loops one for rowes and one for coloumns
		*/
				
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("----------------");
		
		// to call using for each loop or enhanced loop
				
				for(int[] b:a){
					for(int c:b) {
					System.out.println(c);
				}
				}
			System.out.println("-----------------------------");
				
				String b[][]=new String[3][2];
				
				b[0][0]="Anbu";
				b[0][1]="Rishi";
				
				b[1][0]="Pappu";
				b[1][1]="Shish";
				
				b[2][0]="Karthi";
				b[2][1]="Nellai";		
				
				for(int i=0;i<b.length;i++) {
					for(int j=0;j<b[0].length;j++) {
						System.out.println(b[i][j]);
					}
				}
				System.out.println("--------------------------");
				
				for(String[]c:b) {
					for(String d:c) {
						System.out.println(d);
					}
				}
	}
		
}	
		
		
		
		
		
		
		
		
		
		
	
	

