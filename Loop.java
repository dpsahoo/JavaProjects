/**
 * Created by dsahoo2 on 28/02/2018.
 */
import java.util.Scanner;

public class Loop {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        //test while loop with break  codition
        while (true){
            System.out.println("I can program");

            System.out.println("Continue? ('no' to quit)? ");
            String command = reader.nextLine();
            if (command.equals("no")){
                break;
            }

        }
        System.out.println("Take a break! See you later");
    }

}
