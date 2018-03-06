/**
 * Created by dsahoo2 on 6/03/2018.
 */
import java.util.Scanner;

public class PrintSquare {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the size of the square ? : ");
        int i = Integer.parseInt(reader.nextLine());
        printSquare(i);

            }

    public static void printSquare(int sideSize) {
        int x;
        int y = 1;

        while (y <= sideSize) {
            x = 1;
            while (x <= sideSize) {
                printStars();
                x++;
            }

            System.out.println("");
            y++;

        }
    }



    public static void printStars(){
        System.out.print("*");
    }
}
