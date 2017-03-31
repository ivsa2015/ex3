package ex3.Exercise1a;

/**
 * Created by Dendi on 3/31/2017.
 */
public class ReadSymbol {
    public static void main(String[] args) throws java.io.IOException {
        char f = 0, ignore = 0;
        int sum=0;
        System.out.println("Для выхода введите '.'\n");
        do {
            f = (char) System.in.read();
            System.out.println(f);
            if (f==' ') sum++;
        } while (f != '.');
        System.out.printf("\n%s: \t %d", "Количество введенных пробелов", sum);
    }
}
