/**
 * Created by dsahoo2 on 28/02/2018.
 */
public class Dps1 {
    public static void main(String[] args) {

        String text = "includes text";
        int wholeNumber = 123;
        double decimalNumber = 3.141592653;
        boolean isTrue = true;

        System.out.println("The variable's type is text. Its value is " + text);
        System.out.println("The variable's type is integer. Its value is  " + wholeNumber);
        System.out.println("The variable's type is decimal number. Its value is " + decimalNumber);
        System.out.println("The variable's type is truth value. Its value is " + isTrue);

        int calcWithParens = (1 + 1) + 3 * (2 + 5);  // 23
        int calcWithoutParens = 1 + 1 + 3 * 2 + 5;   // 13

        System.out.println(calcWithParens);
        System.out.println(calcWithoutParens);

    }
}
