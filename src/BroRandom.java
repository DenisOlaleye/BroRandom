import javax.swing.JOptionPane;

public class BroRandom 
{
	public static void main (String [] args)
	{
		int random = 1+(int)Math.random()*10;
		
		String input = JOptionPane.showInputDialog("Enter your number from 1 to 10");
		int userNumber = Integer.parseInt(input);
		
		boolean isEqual = (random==userNumber);
		
		
		JOptionPane.showMessageDialog(null, isEqual);
		
		
		 
	}

}
