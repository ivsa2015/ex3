package ex3.Byte;

/**
 * Created by Dendi on 4/13/2017.
 */
public class ToByte {
    long val=0;
    public long toByte(long val){
        int count=0;
        for (long i = (long)1<<63; i!=0 ; i>>>=1) {
            if((val&i)!=0) {
                System.out.print(1);
                count++;
            }
            else {
                System.out.print(0);
                count++;
            }
            if (count%8==0) System.out.print(" ");
        }
        return val;
    }
//    public int toByte(int val){
//
//        return val;
//    }
//    public byte toByte(byte val){
//
//        return val;
//    }
//    public short toByte(short val){
//
//        return val;
//    }
}
