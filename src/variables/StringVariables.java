package variables;

public class StringVariables {

    // 'char' meaning character is used for a single character
    public String charTest(char a, char b, char c, char d, char e) {
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.print(e);
        return null;
    }
// a string is any word contained in quotation marks ""
// Concatenation is seen below returned is s1 + " " + s2.
// This combines the two strings included an empty string in the middle which would print as a space
    public String stringsInJava() {
        String s1 = "Stringone";
        String s2 = "Stringtwo";
        return s1 + " " + s2;
    }
}
