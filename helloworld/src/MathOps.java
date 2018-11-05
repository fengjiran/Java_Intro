import java.util.*;

public class MathOps {
    public static void main(String[] args) {
        // Create a seeded random number generator;
        Random rand = new Random();
        int i, j, k;
        // Choose value from 1 to 100;
        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);

        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);

        i = j + k;
        System.out.println("j+k: " + i);

        i = j - k;
        System.out.println("j-k: " + i);

        i = k / j;
        System.out.println("k/j: " + i);

        i = k * j;
        System.out.println("k*j: " + i);

    }
}
