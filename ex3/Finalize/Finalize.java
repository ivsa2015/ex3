package ex3.Finalize;

/**
 * Created by Dendi on 4/3/2017.
 */
public class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo ob=new FDemo(0);
        for (count = 1; count < 100000; count++) {
            ob.generator(count);
        }
    }
}
