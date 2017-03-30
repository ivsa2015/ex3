package ex3.Exercise1;

import java.io.IOException;

/**
 * Created by Dendi on 3/30/2017.
 */
public class Help {
    public static void main(String[] args) {
        char choice = 0;
        boolean s = true;

        do {
            System.out.println("\nСправка по управляющим операторам");
            System.out.printf("\n\t %s", "1. if");
            System.out.printf("\n\t %s", "2. switch");
            System.out.printf("\n\t %s", "q. Выйти из справки");
            System.out.printf("\n\n %s", "Выберите пункт справки: ");
            char ignore = 0;
            try {
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } catch (IOException e) {
                System.out.println(e.toString());
            }
            switch (choice) {
                case '1':
                    System.out.printf("\n%s\n", "Оператор if:");
                    System.out.printf("\t %s \n", "if (условие) оператор;");
                    System.out.printf("\t %s \n", "else (условие) оператор;");
                    break;

                case '2':
                    System.out.printf("\n%s\n", "Оператор switch:");
                    System.out.printf("\t %s \n", "switch (выражение) {");
                    System.out.printf("\t %s \n", "case константа: ");
                    System.out.printf("\t %s \n", "последовательность операторов;");
                    System.out.printf("\t %s \n", "break;");
                    System.out.printf("\t %s \n", "}");
                    break;

                case 'q':
                    System.out.printf("\n%s\n", "Вы вышли из справки");
                    s = false;
                    break;
                default:
                    System.out.printf("\n%s\n", "Такого пункта нет");
                    break;
            }

        } while (s);
    }


}



