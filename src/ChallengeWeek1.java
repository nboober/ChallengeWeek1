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

        do{

            System.out.println("Would you like to generate a random number? If not you will be prompted to enter your own number (yes/no). \nTo quit the program type \"quit\".");
            option = scanner.next();

            if(option.equalsIgnoreCase("no")){

                do{

                    System.out.println("Enter a non-decimal number. I will let you know if it is a prime number :) : ");
                    myNum = scanner.nextInt();

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
                    if(conf.equals("Prime")){
                        System.out.println(myNum + " is a Prime Number!");
                    }else{
                        System.out.println(myNum + " is NOT a Prime Number!");
                    }

                    System.out.println("Would you like to enter another number? (yes/no). To quit the program type \"quit\".");
                    cont = scanner.next();

                }while(cont.equalsIgnoreCase("yes"));

            }else if(option.equalsIgnoreCase("yes")){

                do{

                    System.out.println("What would you like the range to go up to, starting from 1? ");
                    range = scanner.nextInt();
                    System.out.println("Generating a random number...");
                    myNum = 1 + rand.nextInt(range);

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
                    if(conf.equals("Prime")){
                        System.out.println(myNum + " is a Prime Number!");
                    }else{
                        System.out.println(myNum + " is NOT a Prime Number!");
                    }

                    System.out.println("Would you like to test another random number? (yes/no). To quit the program type \"quit\".");
                    cont = scanner.next();

                }while(cont.equalsIgnoreCase("yes"));

            }else if(option.equalsIgnoreCase("quit")){
                break;
            }else{
                System.out.println("That is not an applicable entry.");
                cont = "no";
            }

        }while(!cont.equalsIgnoreCase("yes"));


    }

}
