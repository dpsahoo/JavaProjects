/**
 * Created by dsahoo2 on 28/02/2018.
 */
import java.util.Scanner;

public class ProgramBody {
    public static void main(String[] args){
       Scanner reader = new Scanner(System.in); // Create a new object of type Scanner and assign it to a variable of type Scanner.

        System.out.print("What is your name? ");
        String name = reader.nextLine();

        System.out.println("Hi, " + name);

        System.out.print("Type an integer: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.println("You typed " + number);

    }

}