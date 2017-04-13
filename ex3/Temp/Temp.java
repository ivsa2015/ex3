package ex3.Temp;

/**
 * Created by Dendi on 3/30/2017.
 */
public class Temp {

    public static void main(String[] args) {
        Double[] m={2.7, 34.7,23.9, 45.4,4.85,37.5,3.45,87.54,65.63, 56.8};
        Double k=0.0;
        for (Double a : m) {
            k=k+a;
        }
        System.out.println(k/10);

    }
}
