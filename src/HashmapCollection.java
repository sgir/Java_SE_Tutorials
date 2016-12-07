import java.util.HashMap;
import java.util.Map;

/**
 * Created by I850773 on 12/7/2016.
 */
public class HashmapCollection {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        map.put(9,"9");


        String text = map.get(9);
        System.out.println(text);

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            //not sorted
            System.out.println(key + " "+value );
        }
;    }
}
