import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args){
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);
        boolean gotten = false;
        do{
            System.out.println("Guess a number through 1 and 10");
            if(input.hasNextInt()) {
                int valueInputted = input.nextInt();
                if (valueInputted < val) {
                    System.out.println("Your input was less than the value");
                } else if (valueInputted > val) {
                    System.out.println("Your input was greater than the value");
                } else {
                    System.out.println("You got the number!!!");
                    gotten = true;
                }

            }else{
                System.out.println("WRONG INPUT TYPE :( you inputted '"+input.nextLine()+"' Please re-input >:|");
            }
        }while (!gotten);

    }
}
