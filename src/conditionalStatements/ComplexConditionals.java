package conditionalStatements;

import java.util.Scanner;

public class ComplexConditionals {

    Scanner reader = new Scanner(System.in);

    public String containsEqualsTrue() {
        String input = reader.next();
        String sOne = "abc";
        String sTwo = "Z";

        if(input.contains(sOne) && input.contains(sTwo)){
            return "True";
        } else {
            return "False";
        }
    }
}
