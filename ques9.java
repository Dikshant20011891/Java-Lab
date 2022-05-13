/*Create two dimensional integer array and insert, search and traverse this array.*/

import java.util.*;
public class main
{
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        arr[i][j] = sc.nextInt();
		    }
		}
		System.out.print("\nEnter the element to search = ");
		int x = sc.nextInt();
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        if(arr[i][j] == x)
		            System.out.println("Element Found");
		    }
		}
		System.out.println("Traverse");
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}



