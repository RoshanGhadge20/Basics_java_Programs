package Prog_Code;

public class Arrays_Multidimensional {
	public static void main(String[] args) {
		 
		/*
		 * int a[][]=new int[3][3]; a[0][1]=1; a[0][2]=2; a[1][0]=1; a[1][1]=2;
		 * a[1][2]=3; a[2][0]=1; a[2][1]=1; a[2][2]=1;
		 * 
		 * 
		 * for(int i=0;i<3;i++) { for (int j=0;j<3;j++) { System.out.println(a[i][j]); }
		 * }
		 */
		
		int a[][]= {{1,2,4},{2,3,5},{5,6,8}};
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
	}

}
