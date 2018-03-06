/**
 * Created by dsahoo2 on 6/03/2018.
 */


import java.util.Scanner;

    public class PrintTextMethod {
        public static void main(String args[]) {
            Scanner reader = new Scanner(System.in);
            int i;

            System.out.println("Print how many times : ");
            i = Integer.parseInt(reader.nextLine());

            printTextManyTimes(i);
        }

        public static void printText(int x){
            System.out.println("Printing line : " + x);
        }

        public static void printTextManyTimes(int i) {
            int num=1;

            while (num <= i) {
                printText(num);
                num++;
            }
        }
}