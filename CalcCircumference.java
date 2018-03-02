/**
 * Created by dsahoo2 on 28/02/2018.
 * The circumference of a circle is calculated using the formula 2 * pi * radius.
 * Create a program that asks the user for the radius and then calculates the circumference using the given radius.
 * Java already contains the value of pi in the Math.PI variable, which you can use in your calculation.
 */
import java.util.Scanner;

public class CalcCircumference {
    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);

        //Get the value of radius
        System.out.print("What is the value of Radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        System.out.print("Circumference of the circle: " +  ( 2 * Math.PI * radius ));

    }
}
