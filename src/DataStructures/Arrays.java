package DataStructures;

public class Arrays {


    public static String Alphabet() {
        //97
        char[] alpha = new char[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }
        return java.util.Arrays.toString(alpha);
    }

    public int CarCount(Boolean[] Car) {
        int count = 0;

        for (int i = 0; i < Car.length; i++) {
            if (Car[i] != null && Car[i]) {
                count++;
            }
        }
        return count;
    }

    public int SheepCount(Boolean[] Sheep) {
        int count = 0;

        for (Boolean present : Sheep) {
            if (present != null && present) {
                count++;
            }
        }
        return count;
    }
}

