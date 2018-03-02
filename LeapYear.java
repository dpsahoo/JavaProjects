/**
 * Created by dsahoo2 on 28/02/2018.
 * A year is a leap year if it is divisible by 4.
 * But if the year is divisible by 100, it is a leap year only when it is also divisible by 400.

 Create a program that checks whether the given year is a leap year.
 *
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        //Ask the user to input a year to be determined as a leap year.
        System.out.print("Enter a year to be determined as a leap year: ");

        int leapYear = Integer.parseInt(reader.nextLine());

        System.out.println("value400 : " + (leapYear%400 ) );
        System.out.println("value100: " + (leapYear%100 ) );
        System.out.println("value4: " + (leapYear%4 ) );

        if (leapYear % 100 == 0) {
            if (leapYear % 400 == 0) {
                System.out.print(leapYear + " is a leap year");
            } else System.out.print(leapYear + " is NOT a leap year");
        } else if (leapYear % 4 == 0) {
            System.out.print(leapYear + " is a leap year");
        } else System.out.print(leapYear + " is NOT a leap year");
    }
}
