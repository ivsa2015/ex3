package ex3.Temp;

/**
 * Created by Dendi on 3/30/2017.
 */
public class Temp {

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.printf("\n %s %d %s \t", "Делители числа ", i, ":");
            for (int j = 2; j < i/2; j++) {
                if (i%j==0) System.out.print(j+" ");
            }
        }
    }
}
