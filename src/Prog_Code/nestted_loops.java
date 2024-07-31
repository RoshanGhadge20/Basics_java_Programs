package Prog_Code;

public class nestted_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wants to printout the
//		1234
//		567
//		89
//		10
		int k=1;
		/*
		 * for (int i=0;i<4;i++) { for(int j=0;j<4-i;j++) { System.out.print(k);
		 * System.out.print("\t"); k++; } System.out.println(""); }
		 */
			
		
		// wants to printout the pyramid 
//		1
//		23
//		456
//		78910
		
		System.out.println("****************");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		
		System.out.println("----------------");
		int c=1;
		for(int a=1;a<4;a++)
		{
			for(int b=5-a;b>0;b--)
			{
				System.out.print(c);
				System.out.print("\t");
				c++;
			}
			System.out.println();
		}
			
	}

}
