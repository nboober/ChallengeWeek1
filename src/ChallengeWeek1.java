import java.util.Scanner;
import java.util.Random;

public class ChallengeWeek1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int myNum;
        String conf = "";
        String cont = "";
        String option = "";
        int range;

        System.out.println("Would you like to generate a random number? (yes/no)");
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

                System.out.println("Would you like to enter another number? (yes/no)");
                cont = scanner.next();

            }while(cont.equalsIgnoreCase("yes"));

        }else{

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

                System.out.println("Would you like to test another random number? (yes/no)");
                cont = scanner.next();

            }while(cont.equalsIgnoreCase("yes"));

        }


    }

}
