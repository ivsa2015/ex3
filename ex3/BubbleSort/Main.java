package ex3.BubbleSort;

/**
 * Created by Dendi on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] s={4,54,324,76,3,657,33,88,-4,89};
        BubbleSort bs = new BubbleSort();
        System.out.println("\nНеотсортированный массив: ");
        for (int i:s) {
            System.out.println(i);
        }
        bs.sort(s);
        System.out.println("\nОтсортированный массив: ");
        for (int h:s
             ) {
            System.out.println(h);
        }
    }

}
