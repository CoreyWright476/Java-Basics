import DataStructures.Arrays;
import conditionalStatements.*;
import variables.MathVariables;
import variables.StringVariables;

public class HelloWorld {
    public static void main(String[] args) {

// To use methods from the classes we have created, we have to instantiate the classes. To do this, we have to call the main Class followed by the name of our new instance.
// This is typically done by calling the class exactly how it was named followed by the same name but with lowercase lettering, this is then set equal to a 'new' instance of the class
// Once done we will then be able to access the methods contained within each class
        MathVariables mathVariables = new MathVariables();
        StringVariables stringVariables = new StringVariables();
        IfStatements ifStatements = new IfStatements();
        ComplexConditionals complexConditionals = new ComplexConditionals();
        SwitchStatements switchStatements = new SwitchStatements();
        DoWhile doWhile = new DoWhile();
        ForLoops forLoops = new ForLoops();
        Arrays arrays = new Arrays();
//// 'System.out.println()' will print whatever is passed in to the users console.
//// in the cases below we are calling the 'println' method and passing in the methods from the classes that we want to print,
//// followed by the arguments we wish to pass in
//        System.out.println(mathVariables.mathAddition(22.0f, 28.76f));
//        System.out.println(mathVariables.mathSubtraction(100, 50));
//        System.out.println(mathVariables.mathMultiply(76, 29));
//        System.out.println(mathVariables.mathDivide(100, 2));
//        System.out.println(mathVariables.floatTest(5, 6));
//        System.out.println(mathVariables.doubleToThePower(4.321, 4.0));
//
//        System.out.println(stringVariables.charTest('h', 'e', 'l', 'l', 'o'));
//        System.out.println(stringVariables.stringsInJava().toUpperCase());
//        System.out.println(stringVariables.stringsInJava().replace('g', 'o'));
//
////        System.out.println(ifStatements.moreOrLess());
////        System.out.println(ifStatements.passwordChecker());
//
//        System.out.println(complexConditionals.containsEqualsTrue());

//        System.out.println(switchStatements.switchStatement(3));
//        System.out.println(doWhile.whileLoop(5));
//        System.out.println(doWhile.doWhileLoop(4, "Hello"));

//        System.out.println(forLoops.forLoop(0));

//        System.out.println(Arrays.Alphabet());
//        System.out.println(arrays.CarCount(new Boolean[]{true, false, true, true, true}));
//        System.out.println(arrays.SheepCount(new Boolean[]{true, false, true, true, true, false, false, false, true, true, true}));
    }
}
