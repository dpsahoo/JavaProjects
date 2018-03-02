/**
 * Created by dsahoo2 on 28/02/2018.
 * Create a program that gives the course grade based on the following table.

 Points	Grade
 0–29	failed
 30–34	1
 35–39	2
 40–44	3
 45–49	4
 50–60	5

 Type the points [0-60]: 37
 Grade: 2

 Type the points [0-60]: 51
 Grade: 5

 */
import java.util.Scanner;

public class FindGrade {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        //Ask the user their points
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());

        if (points >= 0 && points <= 29) {
            System.out.print("Grade: failed");
        } else if (points >= 30 && points <= 34) {
            System.out.print("Grade: 1");
        } else if (points >= 35 && points <= 39) {
            System.out.print("Grade: 2");
        } else if (points >= 40 && points <= 44) {
            System.out.print("Grade: 3");
        } else if (points >= 45 && points <= 49) {
            System.out.print("Grade: 4");
        } else if (points >= 50 && points < 60) {
            System.out.print("Grade: 5");
        } else if (points == 60) {
            System.out.print("Your grade is 5 AND Damn! You topped the course! Congratulations!! :) ");
        }   else  System.out.print("Invalid input. Grade cannot be determined");
    }
}
