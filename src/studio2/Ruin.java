package studio2;

import java.util.Scanner;


public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		String result = null;
		
		 System.out.println("How much money do you start with?");
		 Double startAmount = scan.nextDouble();
		 
		 System.out.println("What is the probability that you win in a single day?");
		 Double winChance = scan.nextDouble();
		
		 System.out.println("What is the win limit?");
		 Double winLimit = scan.nextDouble();
		 
		 System.out.println("How many simulations?");
		 int totalSimulation = scan.nextInt();
		

		 
		// int i = totalSimulation ;
		 
		 for(int i = 0; i <= totalSimulation; i ++ )
		 {
	
		 while (startAmount <= winLimit && startAmount > 0)
		 {

				double game = Math.random();
			if (game <= winChance)
			{
				startAmount ++;
			}
			else 
			{
				startAmount --;
		}

			if (startAmount>=winLimit)
			{
				result = "win";
			//System.out.println("win");
			}
		    if (startAmount<=0)
			{
		    	result = "loose"; 
				//System.out.println("lose");
			}
			
		 }
		 System.out.println("Simulation "+ i + ":" + startAmount + "The result is " + result );
		
		 
		 }
	}

}
