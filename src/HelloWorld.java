import conditionalStatements.ComplexConditionals;
import conditionalStatements.IfStatements;
import variables.MathVariables;
import variables.StringVariables;

public class HelloWorld {
    public static void main(String[] args) {
        MathVariables mathVariables = new MathVariables();
        StringVariables stringVariables = new StringVariables();
        IfStatements ifStatements = new IfStatements();
        ComplexConditionals complexConditionals = new ComplexConditionals();


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
//        System.out.println(ifStatements.scanner());
//        System.out.println(ifStatements.stringScanner());

        System.out.println(complexConditionals.containsEqualsTrue());

    }
}
