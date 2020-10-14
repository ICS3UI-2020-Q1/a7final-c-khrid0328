import java.util.Scanner;
/**
 * This program creates a method called checkCode that calculates the sum of an integer parameter called number. If this sum is divisible by 7, it will call this number valid and return true back to the user.
 * @author Dafna Khripun
 */
public class Main {

  // creating amethod that calculates the sum of an integer 
  public static boolean checkCode( int number){

    // defining a starting sum to add to
    int sum = 0; 

    // "isolating" the digits using a while loop and adding the quotients to the sum
    while (number > 0){

      // by calculating the remaider, we define the last digit of the number.
      int isolatedNum = number % 10;

      // the total sum will be determined by adding the remainders which are the single digits
      sum = sum + isolatedNum;

      // deviding the number by 10 so it can continue to be "devided" into isolated numbers (getting rid of the last digit)
      number = number / 10;

    }
    // determining wether the sum of all the isolated digits is divisble by 7 by finding the remainder
    int devisibleBySeven = sum % 7;

    // determining what should the method return
    if (devisibleBySeven == 0){

      // if the number is divisible by 7, the methos is true
      return true;

    }else{

      // if the number is not divisble by 7, the methoes is false
      return false;
    }
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to enter a number
    System.out.println("Please enter a number");

    // create a variable for user input
    int number = input.nextInt();

    // define the number to start with 
    boolean integer = checkCode(number);

    // print true if the sum of all isolated integers is divisible by 7 or not
    System.out.println(integer);
  }
}
