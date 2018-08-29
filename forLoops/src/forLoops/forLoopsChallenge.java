package forLoops;

import java.util.Scanner;

public class forLoopsChallenge
	{
		public static void main(String [] args) {
			challengeOne();
			challengeTwo();
	}

	
		private static void challengeOne()
			{
		int totalSum = 0;
		for(int i = 5; i<=100; i = i + 5) {
			totalSum += i;
			System.out.println(totalSum);
		}
	}
		
		// practice for Github
		private static void challengeTwo(){
			{
				Scanner userInput = new Scanner(System.in);
				
				
				System.out.println("Please choose a lower bound number.");
				int lowerBound = userInput.nextInt();
				
				System.out.println("Please choose an upper bound number.");
				int upperBound = userInput.nextInt();
				
				int totalSum = 0;
				
				for(; lowerBound <= upperBound; lowerBound++) {
					totalSum += lowerBound;
			
				}
				System.out.println(totalSum + "lol what");
				
			}
			// hello hello hello, what the heck is up red rocks

		}



				
	}

	
