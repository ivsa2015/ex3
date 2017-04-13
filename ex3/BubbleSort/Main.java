package ex3.BubbleSort;

/**
 * Created by Dendi on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        String[] s = {"dsfgfds", "asdfrrvrf", "sdfsdfsdf", "trsytukjs", "serffewewa", "esryrejds", "sarefre", "sergsehs", "saerfa", "strhrsresa"};
        BubbleSort bs = new BubbleSort();
        System.out.println("\nНеотсортированный массив: ");
        for (String i : s) {
            System.out.println(i);
        }
        bs.sort(s);
        System.out.println("\nОтсортированный массив: ");
        for (String h : s) {
            System.out.println(h);
        }
    }
}