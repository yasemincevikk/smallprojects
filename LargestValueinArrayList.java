import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LargestValueinArrayList {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

                for(int i=0; i<10; i++){
                    list.add((rand.nextInt(100)+1));
                }

        System.out.println("ArrayList: "+list);
        System.out.println("The largest value is "+ Collections.max(list));
    }
}