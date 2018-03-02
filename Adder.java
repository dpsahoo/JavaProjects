/**
 * Created by dsahoo2 on 28/02/2018.
 */
import java.util.Scanner;

public class Adder {
    public static void main(String args[]) {
        //Create a new Scanner object and assign it to a new Scanner variable
        Scanner reader = new Scanner(System.in);

        //Type a number
        System.out.print("Type a number: ");
        int Number1 = Integer.parseInt(reader.nextLine());

        //Type another number
        System.out.print("Type another number: ");
        int Number2 = Integer.parseInt(reader.nextLine());

        //Sum of the numbers
        System.out.print("Sum of the numbers: " + (Number1 + Number2));
    }
}
