import java.util.ArrayList;
import java.util.*;
import java.util.jar.JarOutputStream;

public class FindingaValueinanArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        for(int i=0; i<10; i++){
            list.add((rand.nextInt(50)+1));
        }
        System.out.println("ArrayList: "+list);
        System.out.println("Value to find");
        int s = scan.nextInt();

        if(list.contains(s)){
            System.out.println(s+" is int the ArrayList.");
        }
        else{ }
        }
    }