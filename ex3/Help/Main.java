package ex3.Help;

/**
 * Created by Dendi on 4/2/2017.
 */
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        char choice = 0, ignore = 0;
        boolean s = true;
        Help help = new Help();
        for (; ; ) {

            help.showMenu();
            choice = (char) System.in.read();
            if (help.isValid(choice)) help.ShowTip(choice);
            else System.out.println("Некорректный ввод");
            if (choice == 'q') break;
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');


        }
    }

}
