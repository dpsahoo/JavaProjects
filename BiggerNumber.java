/**
 * Created by dsahoo2 on 28/02/2018.
 */

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String args[]) {

        //Create a new Scanner object and assign it to a new Scanner variable
        Scanner reader = new Scanner(System.in);

        //Type a number
        System.out.print("Type a number: ");
        int Number1 = Integer.parseInt(reader.nextLine());

        //Type another number
        System.out.print("Type another number: ");
        int Number2 = Integer.parseInt(reader.nextLine());

        //Find bigger number of the two or identify if they are equal
        if (Number1 == Number2) {
            System.out.print("The numbers are equal");
        } else {
            System.out.print("The bigger number of the two numbers given was: " + (Math.max(Number1, Number2)));

        }
    }
}