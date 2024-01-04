package com.Loops;

public class NestedLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
				
			{
				System.out.println("webdriver");
			}
		}
		 for(int i=1;i<=3;i++)
		 {
			for(int j=1;j<=2;j++)
				
			{
				System.out.println(j);
			}
		 }
		
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println("*");
			if(i==3)
			{
				break;

			}
			System.out.println("*");
		}
		
		
		
		
		
		
		
	}

}
