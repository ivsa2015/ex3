package ex3.Exercise1;

import java.io.IOException;

/**
 * Created by Dendi on 3/30/2017.
 */
public class Help {
    public static void main(String[] args) throws java.io.IOException {
        char choice = 0, ignore = 0;
        boolean s = true;

        one:
        for (; ; ) {
            do {
                System.out.println("\nСправка по управляющим операторам");
                System.out.printf("\n\t %s", "1. if");
                System.out.printf("\n\t %s", "2. switch");
                System.out.printf("\n\t %s", "3. for");
                System.out.printf("\n\t %s", "4. while");
                System.out.printf("\n\t %s", "5. do-while");
                System.out.printf("\n\t %s", "6. break");
                System.out.printf("\n\t %s", "7. continue");
                System.out.printf("\n\t %s", "q. Выйти из справки");
                System.out.printf("\n\n %s", "Выберите пункт справки: ");

                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            }while (choice < '1'||choice > '7'||choice == 'q');

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

                case '3':
                    System.out.printf("\n%s\n", "Оператор for:");
                    System.out.printf("\t %s \n", "for (инициализация; условие; итерация)");
                    System.out.printf("\t %s \n", "оператор;");
                    break;

                case '4':
                    System.out.printf("\n%s\n", "Оператор while:");
                    System.out.printf("\t %s \n", "while (условие) оператор;");
                    break;

                case '5':
                    System.out.printf("\n%s\n", "Оператор do-while:");
                    System.out.printf("\t %s \n", "do {");
                    System.out.printf("\t %s \n", "оператор;");
                    System.out.printf("\t %s \n", "} while (условие);");
                    break;

                case '6':
                    System.out.printf("\n%s\n", "Оператор break:");
                    System.out.printf("\t %s \n", "break; или break метка;");
                    break;

                case '7':
                    System.out.printf("\n%s\n", "Оператор continue:");
                    System.out.printf("\t %s \n", "continue; или continue метка;");
                    break;

                case 'q':
                    System.out.printf("\n%s\n", "Вы вышли из справки");
                    break one;
            }

        }
    }


}



