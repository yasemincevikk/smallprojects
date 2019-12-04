import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists3 {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i=0; i<1000; i++){
            list.add((rand.nextInt(90)+10));
        }

        System.out.println(list);

    }
}