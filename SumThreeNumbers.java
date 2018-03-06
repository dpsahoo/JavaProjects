/**
 * Created by dsahoo2 on 6/03/2018.
 * Type the first number: 3
 * Type the second number: 6
 * Type the third number: 12
 *
 * Sum: 21
 */
import java.util.Scanner;

public class SumThreeNumbers {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        //int read;

        // WRITE YOUR PROGRAM HERE
        // USE ONLY THE VARIABLES sum, reader AND read!
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter the "+i+"th number : " );
            sum += Integer.parseInt(reader.nextLine());

            System.out.println("Sum-pre : "+ sum);

        }



        System.out.println("Sum : "+ sum);


    }
}
