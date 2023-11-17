package conditionalStatements;

import java.util.Scanner;

public class ComplexConditionals {

    Scanner reader = new Scanner(System.in);

// Similar to our other if statements, this method below is checking if a String entered contains any of the letters included in sOne or sTwo.
// 'input' is whatever text the user enters which is why that is the variable being compared against the other two. we used &&(and) to make sure entered text matches both sOne and sTwo,
// alternatively we could have used || (or) to see if it was contained in either of the variables instead of both.
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
