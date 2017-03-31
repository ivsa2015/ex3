package ex3.Exersice2;

/**
 * Created by Dendi on 3/31/2017.
 */
public class Case {


    public static void main(String[] args) throws java.io.IOException {
        char f = 0, ignore = 0;
        int sum = 0;
        System.out.println("Для выхода введите '.'\n");
        do {
            f = (char) System.in.read();
            if (f>'A'&&f<'Z') {
                f +=32;
                sum++;
                System.out.printlnd(f);
            } else if (f>97&&f<122){
                f -=32;
                sum++;
                System.out.println(f);
            }
        } while (f != '.');
        System.out.printf("\n%s: \t %d", "Количество преобразований регистра", sum);
    }


}
