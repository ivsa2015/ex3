package ex3.Temp;

/**
 * Created by Dendi on 3/30/2017.
 */
public class Temp {
    public static void main(String[] args) {
        one: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + "\t" +j);
                if (j==3) break one;

            }
            System.out.println("one: " + i);
        }

        for (int i = 0; i < 5; i++)
        one: {
            for (int j = 0; j < 5; j++) {
                System.out.println(j + " - 2 - " + i);
                if (j==3) break one;

            }
            System.out.println("one: " + i);

        }
    }
}
