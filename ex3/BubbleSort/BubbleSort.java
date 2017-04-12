package ex3.BubbleSort;

/**
 * Created by Dendi on 4/3/2017.
 */
public class BubbleSort {
    int temp;
    public int[] sort (int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j-1]>a[j]) {
                    temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        return a;
    }
}
