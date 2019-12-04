import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i=0; i<=9; i++){
            list.add(((rand.nextInt(100)+1)));
        }

        System.out.println("ArrayList: "+list);

    }
}
