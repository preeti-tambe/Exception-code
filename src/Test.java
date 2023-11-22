import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [2];
		Scanner s= new Scanner(System.in);
		try{
		System.out.println("Enter number 1 : ");
		a[1]=Integer.parseInt(s.nextLine());
		
		System.out.println("Enter number 2 : ");
		a[0]=Integer.parseInt(s.nextLine());
		
		int c=a[1]/a[0];
		
		System.out.println( "Result : " +c);
		}
		
		finally
		{
			System.out.println("Important code");
		}
		System.out.println("hello world ");
		
		

	}

}
