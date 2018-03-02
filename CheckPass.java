/**
 * Created by dsahoo2 on 28/02/2018.
 */
import java.util.Scanner;

public class CheckPass {
    public static void main(String args[]) {
        //Body
        Scanner scanner = new Scanner(System.in); //Create a new Scanner object(Call the program to create a new object and return the reference to the object !)
                                                    // and assign it to a new variable called 'scanner' of type Scanner :)

        //Setup password
        String storedPassword = "Shadow12";


        //Keep looping/repeating until the correct password is entered!
        while (true){

            //Ask the user to input the password
            System.out.print("Enter the password: ");
            String inputPassword = scanner.nextLine();

            //break when the right password is entered
            if (storedPassword.equals(inputPassword)){
                System.out.println(inputPassword+ " : Correct Password! Free to go");
                break;
            }

            System.out.println(inputPassword + " : This is wrong password");
        }

        System.out.print("Goodbye");
    }

}
