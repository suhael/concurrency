package chapter3.syncCommonPoint;

/**
 * Created by sakhtar on 11/07/2014.
 */
public class Results {

    private int data[];

    public Results(int size){
        data=new int[size];
    }

    public void setData(int position, int value){
        data[position]=value;
    }

    public int[] getData(){
        return data;
    }

}
