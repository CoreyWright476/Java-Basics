package conditionalStatements;

import java.util.Scanner;

public class DoWhile {

    public int whileLoop(int i) {

        while(i > 5){
            System.out.println("Hello World!");
            i--;

        }
        return i;
    }

    public static String doWhileLoop(int i, String input) {

        Scanner reader = new Scanner(System.in);

        String all = "";

        while(!input.equals("Stop")){
            input = reader.nextLine();
            all += input;
            i--;

        }
        return all;
    }
}
