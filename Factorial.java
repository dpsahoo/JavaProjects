/**
 * Created by dsahoo2 on 6/03/2018.
 * Create a program that calculates the factorial of the number n.
 * The factorial n! is calculated using the formula 1*2*3*...*n. For example 4! = 1*2*3*4 = 24.
 * Additionally, it is defined that 0! = 1.
 */
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        int i = 1;
        int factorial = 1;

        System.out.printf("Find the factorial of the number : ");
        int num = Integer.parseInt(reader.nextLine());

        while(i<=num){
            factorial = i * factorial;
            System.out.println(factorial);
            i++;
        }



        System.out.println("Factorial : " + factorial);
    }
}
