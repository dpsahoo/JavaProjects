/**
 * Created by dsahoo2 on 6/03/2018.
 */
import java.util.ArrayList;

public class MyArrays {
    public static void main(String args[]){
        ArrayList<String> myArray = new ArrayList<String>();

        myArray.add("Durga");
        myArray.add("Prasad");
        myArray.add("Sahoo");


        System.out.println("Size of myArray : " + myArray.size());
        System.out.println("First name : " + myArray.get(0));
        System.out.println("Middle name : " + myArray.get(1));
        System.out.println("Family name : " + myArray.get(2));

        // Remove middle name
        myArray.remove(1);

        if (myArray.contains("Sahoo")){
            System.out.println("I am on the list");
        } else {
            System.out.println("Not on the list. Try harder!");
        }
    }

}
