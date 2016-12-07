import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by I850773 on 12/7/2016.
 */
public class LinkedListCollection {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

    }

    private static void doTimings(String type, List<Integer> list) {


        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

//        //Add at the end - comparable
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1E5; i++) {
//            list.add(i);
//        }

        //Add at the beginning - Arrraylist takes wayyy longer!
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1E5; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time: "+ (end-start)+ "ms for"+ type);
    }
}