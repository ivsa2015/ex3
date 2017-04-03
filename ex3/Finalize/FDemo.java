package ex3.Finalize;

/**
 * Created by Dendi on 4/3/2017.
 */
public class FDemo {
    int x;
    FDemo (int i){
        this.x = i;
    }
    protected void finalize(){
        System.out.println("Финализация: " + x);
    }

    void generator(int i){
        FDemo ob = new FDemo(i);
    }
}
