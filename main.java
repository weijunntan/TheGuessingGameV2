import java.util.Scanner;

public class main 
{   
    static Scanner input = new Scanner(System.in);
    
    public static void main(String [] args)
    {
        //Start of the program.
        System.out.println("Let's play a guessing game!");
        System.out.println("");
        
        do
        {
            playARound();
        }
        while(askForAnotherRound());
        
        System.out.println("Thank you for playing.");
    }
    
    public static void playARound()
    {
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.print("What do you think it is: ");
        
        if(getGuess() == getRandomNumber()) //If guess number and random number is the same.
        {
            System.out.println("You're right!");
            System.out.println("");
        }
        else
        {
            System.out.println("You're wrong! The number was " + getRandomNumber());
            System.out.println("");
        }
    }
    
    public static int getRandomNumber()
    {
        //Random number generator.
        int randomNum = (int)(Math.random() * 10) + 1;
        return randomNum;
    }
    
    public static int getGuess()
    {
        //Declaration.
        int guess;
        
        while(true)
        {
            guess = input.nextInt();
            
            if(guess < 0 || guess > 10) //If user input less than 0 or more than 10.
            {
                System.out.print("I said, between 1 and 10. Try again: ");
            }
            else
            {
                return guess;
            }
        }
    }
    
    public static boolean askForAnotherRound()
    {
        while(true)
        {
            String replay;
            System.out.print("Play again?(Y or N): ");
            replay = input.next();
            
            if(replay.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if(replay.equalsIgnoreCase("N"))
            {
                return false;
            }
        }
    }       
}