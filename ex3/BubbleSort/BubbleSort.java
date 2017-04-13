package ex3.BubbleSort;

/**
 * Created by Dendi on 4/3/2017.
 */
public class BubbleSort {
    int temp;
    String tmp;
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
    public String[] sort (String[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                one: for (int k = 0; k < java.lang.Math.min(a[j-1].length(), a[j].length()); k++) {
                    if (a[j-1].charAt(k) > a[j].charAt(k)) {
                        tmp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = tmp;
                        break one;
                    }
                    else if(a[j-1].charAt(k) < a[j].charAt(k)){
                        break one;
                    }

                }
            }
        }
        return a;
    }

}
