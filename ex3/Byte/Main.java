package ex3.Byte;

/**
 * Created by Dendi on 4/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        long a= 123;
//        System.out.println((long)1<<62);
        ToByte tb = new ToByte();
        tb.toByte(a);
    }
}
