import java.util.ArrayList;
public class BasicArrayList1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(-113);
        list.add(-113);
        list.add(-113);
        list.add(-113);
        list.add(-113);
        list.add(-113);
        list.add(-113);
        list.add(-113);
        list.add(-113);
        list.add(-113);

        for (int i=0; i<=(list.size()-1);i++)
            System.out.println("Slot "+i+" contains a "+list.get(i));
    }
}
