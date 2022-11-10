package test5;

import java.util.Scanner;

public class Array
{
	//declare method for check array elements
   public static void checkarray(int arr[])throws Exception
   {
	   //if statement
	   if(arr[0]==0 || arr[1]==0 || arr[2]==0 || arr[3]==0 || arr[4]==0)
	   {
		   throw new Zeromembererror("Invalid entry:-Do not enter 0");
	   }
	   else
	   {
		   
		   System.out.println("Valid entry");  
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter Array Elements");
      Scanner sc=new Scanner(System.in);
      int[] arr=new int[5];
      int n;
      int i;
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();//user input array
      }
     // System.out.println(arr[i]);
      try
      {	  
         checkarray(arr);
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
	}
}
