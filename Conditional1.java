/**
 * Created by dsahoo2 on 28/02/2018.
 */
import java.util.Scanner;

public class Conditional1 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 10) {
            System.out.println("Number is greater than 10");
        } else if (number < 10 ){
            System.out.println("Number is lesser than 10");
        } else System.out.println("Number is 10");
    }
}