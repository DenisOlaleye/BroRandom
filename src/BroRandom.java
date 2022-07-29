import java.util.Random;


public class BroRandom 
{
	public static void main (String [] args)
	{
		Random random = new Random();
		
		int a = random.nextInt(); //generate random int number
		int b = random.nextInt(10); //generate random int number between 0-9
		int c = random.nextInt(10)+1; //generate random int number between 1-10
		double d = random.nextDouble(); //generate random double number between 0-1
		double e = random.nextDouble(10); //generate random double number btw 0-10
		double f = random.nextDouble(10)+1; //generate random double btw 1-11 
		
		
		System.out.println(f);
	}

}
