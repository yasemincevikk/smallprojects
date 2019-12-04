import java.util.ArrayList;
import java.util.*;

public class WhereIsIt {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<10; i++){
            list.add((rand.nextInt(50)+1));
        }

        System.out.println("ArrayList: "+list);

        System.out.println("Value to find: ");
        int s = scan.nextInt();

        if(list.contains(s)){
            System.out.println(s+" is in slot "+list.indexOf(s));
        }
        else{
            System.out.println(s+" is not in the ArrayList.");
        }



    }



}
