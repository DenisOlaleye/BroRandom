import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BroRandom 
{
	public static void main (String [] args)
	{
		
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		
//		System.out.println("Enter number from 1 to 10");
		JOptionPane.showInputDialog("Enter your number from 1 to 10");
		a = scanner.nextInt();	
		scanner.close();
		
		b = random.nextInt(10)+1;
		
		if (a==b)
		{
			JOptionPane.showMessageDialog(null, "You win!");
//			System.out.println("You win!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You loose!");
//			System.out.println("You loose!");
			
		}
		
		
/*		int a = random.nextInt(); //generate random int number
		int b = random.nextInt(10); //generate random int number between 0-9
		int c = random.nextInt(10)+1; //generate random int number between 1-10
		double d = random.nextDouble(); //generate random double number between 0-1
		double e = random.nextDouble(10); //generate random double number btw 0-10
		double f = random.nextDouble(10)+1; //generate random double btw 1-11 
		
		//зробити рандом від 1-10 і додати вікно
		//додати вікно -- порівняти введений результат з рандомом--вивести він/луз
		*/
//		System.out.println(a+" "+b);
	}

}
