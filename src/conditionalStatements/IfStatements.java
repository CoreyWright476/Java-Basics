package conditionalStatements;

import java.util.Objects;
import java.util.Scanner;

public class IfStatements {

    //Here we instance a new Scanner assigned to the name 'reader'. A scanner enables the user to input into the console to enter integers for example
    Scanner reader = new Scanner(System.in);

    //The method moreOrLess asks a user to input a number and will return 'MORE!' or 'LESS!' depending on whether the number entered or more or less than 10.
    // reader.nextInt() is set to an 'int' as it requests the user to enter a number or 'Int' set to the name 'input'
    // the if statement will then check this input against the number 10 and will return one of two options depending on the result
    public String moreOrLess() {
        System.out.println("input now: ");
        int input = reader.nextInt();

        if(input > 10) {
            return "MORE!";
        } else {
            return "LESS!";
        }
    }

    //This time we want the user to enter a String, so instead of reader.nextInt() we simply use reader.next()
    // we set a String password assigned to the name password which will be checked against the password that the user enters.
    //For this if statement we use Objects.equals(input, password), this could also be written as input == password
    // and will return a "YES" or a "NO" depending on whether the password matches
    public String passwordChecker() {
        System.out.println("input now: ");
        String input = reader.next();
        String password = "Password1234";
        if(Objects.equals(input, password)){
            return "YES";
        } else {
            return "NO";
        }
    }
}
