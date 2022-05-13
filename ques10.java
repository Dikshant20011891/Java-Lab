/*Create a jagged array having three rows. Where 1st row contains 3 columns, 2nd row contains 4 columns and 3rd row contains 2 columns. Insert and traverse it.*/


import java.util.*;
public class jagged
{
	public static void main(String[] args) {
		int arr[][] = new int[3][];
	 arr[0] = new int[3];
	 arr[1] = new int[4];
	 arr[2] = new int[2];
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Insert-");
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<arr[i].length;j++)
		 {
			 arr[i][j] = sc.nextInt();
		 }
	 }
	 System.out.println("Traverse");
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<arr[i].length;j++)
		 {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
	}
}
