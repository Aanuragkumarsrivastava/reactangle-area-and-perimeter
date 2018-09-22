import java.util.Scanner;

public class Main 
{
  
	public static void main(String[] args) 
	{
 
		Scanner input = new Scanner(System.in);
  
		System.out.println("enter the length of rectangle");
  
		int length = input.nextInt();
  // taking input from user for length of rectangle	
		System.out.println("enter the breadth of rectangle");
  
		int breadth = input.nextInt();
  //taking input from user for breadth of rectangle
		int area = length*breadth;
  //calculating area of rectangle and storing the value to variable area
		int a = length+breadth;
  //adding length and breath of rectangle and storing the value to variable a which is used in calculating perimeter
		int perimeter = 2*a;
  //calculating the perimeter of rectangle and storing the value to variable perimeter
		System.out.println("legth is\n"+length+"\nbreadth is\n"+breadth+"\narea is\n"+area+"\nperimeter is\n"+perimeter);
  
	} 

}
