//JAVA Program for Square Star Pattern
import java.util.*;
class IBM 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			String str="";
			for(int j=0;j<i;j++)
			{
				str+=" ";
			}
			for(int j=0;j<n;j++)
			{
				str+="*";
			}
			System.out.println(str);
		}
	}
}

/*
D:\LearnCodeByDoing\LearnCoding\Learn CoreJava>java IBM
Enter number
4
****
 ****
  ****
   ****
*/

//Program for Decimal to Binary Conversion
 class DecToBinConversion
 {
	public static void main(String[]args)
	 {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str="";
		while(n>0)
		 {
			str=n%2+str;
			n=n/2;
		 }
		 System.out.println(str);
	 }
 }
 //Time complexity=(Ologn)

//By using bitwise operators 
 class DecToBinConversion1
 {
	 public static void main(String[]args)
	 {
		 System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str="";
		//let consider sie of integer is 32 bits
		for(int i =31;i>=0;i--)
		 {
			int k=n>>i;
			if((k&1) >0)
				str+=1;
			str+=0;
		 }
		 System.out.println(str);
	 }
 }
 //Time complexity O(1)

 //By using Binary Operators
