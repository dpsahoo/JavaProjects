/**
 * Created by dsahoo2 on 6/03/2018.
 */
import java.util.Scanner;


public class OneToHundred {
    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);

        int i = 1;
        int y = 100;

        //Print 1 to 100
        System.out.printf("Print 1 to 100");
        while( i < 101 ) {
            System.out.println(i);
            i++;
        }


        System.out.println("-----------------------------------");

        //Print 100 to 1
        System.out.println("Print 100 to 1");
        while ( y > 0 ){
            System.out.println(y);
            y--;
        }

        System.out.println("-----------------------------------");
        System.out.println(" Lower limit and upper limit");
        System.out.print("Enter Lower Limit : ");
        i = Integer.parseInt(reader.nextLine());

        System.out.print("Enter Upper Limit : ");
        y = Integer.parseInt(reader.nextLine());

        while ( i <= y){
            System.out.println(i);
            i++;
        }
    }
}
