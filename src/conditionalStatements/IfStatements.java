package conditionalStatements;

import java.util.Objects;
import java.util.Scanner;

public class IfStatements {

    Scanner reader = new Scanner(System.in);

    public String scanner() {
        System.out.println("input now: ");
        int input = reader.nextInt();

        if(input > 10) {
            return "MORE!";
        } else {
            return "LESS!";
        }
    }

    public String stringScanner() {
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
