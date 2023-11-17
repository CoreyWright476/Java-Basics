package variables;

public class MathVariables {

    // below we have created various methods that will complete simple math problems such as addition.
    // 'a' & 'b' are passed into the parentheses of the methods, these will be set by the user when they enter their desired numbers back in our main class.
    // 'int' is a whole number, 'float' is a decimal number which when entered would usually be ended with an 'f' such as '22.5f', similar to a double which would be concluded with a 'd'
    public float mathAddition(float a, float b) {
        return a+b;
    }

    public int mathSubtraction(int a, int b) {
        return a-b;
    }

    public long mathMultiply(int a, int b) {
        return (long) a *b;
    }

    public int mathDivide(int a, int b) {
        return a/b;
    }

    public float floatTest(int a, int b) {
        return (float) a/b;
    }

    public double doubleToThePower(double a, double b) {
        return Math.pow(a, b);
    }
}
