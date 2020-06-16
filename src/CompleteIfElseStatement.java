import java.util.Scanner;

public class CompleteIfElseStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompt user for input
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        //Evaluate input and return result
        if (number == 10) {
            System.out.println("Number is equal to 10");
        }
        else if (number < 10) {
            System.out.println("Number is less than 10.");
        } else {
            System.out.println("Number is greater than 10");
        }
    }
}

