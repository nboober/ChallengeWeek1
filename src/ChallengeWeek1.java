import java.util.Scanner;

public class ChallengeWeek1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int myNum;
        String conf = "";
        String cont = "";
        String option = "";

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

            System.out.println("Generating a random number...");

        }


    }

}
