package DataStructures;

public class Arrays {


    public static String Alphabet(){
        //97
        char[] alpha = new char[26];

        for(int i = 0; i < 26; i++)
        {
            alpha[i] = (char) (97 + i);
        }
        return java.util.Arrays.toString(alpha);
    }
}
