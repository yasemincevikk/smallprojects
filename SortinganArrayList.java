import  java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SortinganArrayList {
    public static void main(String[]  args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i=0; i<10; i++){
            list.add((rand.nextInt(90)+10));
        }
        System.out.println("ArrayList before: "+list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("ArrayList after: "+ list);
    }
}