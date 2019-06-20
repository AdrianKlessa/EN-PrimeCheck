package primecheck;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int value = Integer.parseInt(input);
		
		boolean flag=false;
		
		for(int x=2; x<=value/2;x++)
		{
		if(value%x==0)
		{
			flag=true;
		}	
		
		};
		if(flag==true||value<=1)
		{
			System.out.println("This is not a prime number");
		}else 
		{
			
			System.out.println("This is a prime number");
		}
		scan.close();
		
		
		
		
	}

}
