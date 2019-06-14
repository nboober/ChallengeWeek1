import java.util.Scanner;
import java.util.Random;

public class ChallengeWeek1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String option = "";
        int myNum;
        String conf = "";
        String cont = "";
        int range;

        //A do while loop runs this program until the option "quit" is typed
        do{
            //Initialization of program
            System.out.println("Would you like to generate a random number? If not you will be prompted to enter your own number (yes/no). \nTo quit the program type \"quit\".");
            option = scanner.next();

            //Option 1: User Entered Number
            if(option.equalsIgnoreCase("no")){
                do{
                    //User Enters a number which is saved as myNum
                    System.out.println("Enter a non-decimal number. I will let you know if it is a prime number :) : ");
                    myNum = scanner.nextInt();

                    /*
                    **Prime number algorithm**
                    If the algorithm finds a modulo in the range from 2-myNum equal to 0
                    then that is not a prime number and the loop is stopped. conf = Not

                    If the algorithm finds a modulo in the range from 2-myNum !equal to 0
                    then that is a prime number and the loop is stopped. conf = Prime
                    */
                    if(myNum%2 == 0){
                        conf = "Not";

                    }else{
                        for(int test = 3; test < myNum; test++){
                            if(myNum%test == 0){
                                conf = "Not";
                                break;
                            }else{
                                conf = "Prime";
                            }
                        }
                    }

                    //Output is dispayed based on if conf equals "Prime" or "Not"
                    if(conf.equals("Prime")){
                        System.out.println(myNum + " is a Prime Number!");
                    }else{
                        System.out.println(myNum + " is NOT a Prime Number!");
                    }

                    /*
                    This is a loop on Option 1. If yes is typed then option 1 will repeat.
                    Otherwise the entire program will restart.
                    */
                    System.out.println("Would you like to enter another number? (yes/no)");
                    cont = scanner.next();

                }while(cont.equalsIgnoreCase("yes"));

                //Option 2: Random Number Generator
            }else if(option.equalsIgnoreCase("yes")){

                do{
                    /*The user enters a number
                      This will be the end range from 1-range for the random number generator
                    */
                    System.out.println("What would you like the range to go up to, starting from 1? ");
                    range = scanner.nextInt();
                    System.out.println("Generating a random number...");
                    myNum = 1 + rand.nextInt(range);

                    /*
                    **Prime number algorithm**
                    If the algorithm finds a modulo in the range from 2-myNum equal to 0
                    then that is not a prime number and the loop is stopped. conf = Not

                    If the algorithm finds a modulo in the range from 2-myNum !equal to 0
                    then that is a prime number and the loop is stopped. conf = Prime
                    */
                    if(myNum%2 == 0){
                        conf = "Not";

                    }else{
                        for(int test = 3; test < myNum; test++){
                            if(myNum%test == 0){
                                conf = "Not";
                                break;
                            }else{
                                conf = "Prime";
                            }
                        }
                    }
                    //Output is dispayed based on if conf equals "Prime" or "Not"
                    if(conf.equals("Prime")){
                        System.out.println(myNum + " is a Prime Number!");
                    }else{
                        System.out.println(myNum + " is NOT a Prime Number!");
                    }

                    /*
                    This is a loop on Option 2. If yes is typed then option 2 will repeat.
                    Otherwise the entire program will restart.
                    */
                    System.out.println("Would you like to test another random number? (yes/no).");
                    cont = scanner.next();

                }while(cont.equalsIgnoreCase("yes"));

                //Option 3: Quit Program
            }else if(option.equalsIgnoreCase("quit")){
                break;

                //Option 4: Error - Entry Not Applicable. Restarts Program
            }else{
                System.out.println("That is not an applicable entry.");
                cont = "no";
            }

        }while(!cont.equalsIgnoreCase("yes"));


    }

}
