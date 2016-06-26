package chapter5.cancelTask;

import java.util.Random;

/**
 * Created by sakhtar on 09/09/2014.
 */
public class ArrayGenerator {
    public int[] generateArray(int size) {
        int array[]=new int[size];
        Random random=new Random();
        for (int i=0; i<size; i++){
            array[i]=random.nextInt(10);
        }
        return array;
    }
}
