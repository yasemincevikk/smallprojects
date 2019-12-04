import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i=0; i<10;  i++){
            list.add((rand.nextInt(100)+1));
        }

        list.set(9,-7);
        System.out.println("ArrayList 1: "+list);
        list.set(9,(rand.nextInt(100)+1));
        System.out.println("ArrayList 2: "+list);

    }
}