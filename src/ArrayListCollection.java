import java.util.ArrayList;

/**
 * Created by I850773 on 12/6/2016.
 */
public class ArrayListCollection {

    public static void main(String[] args){

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);


        System.out.println(numbers.get(0));

        System.out.println("Iteration #1");
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }


        System.out.println("Iteration #2");
        for(Integer value: numbers){
            System.out.println(value);
        }


        //relatively fast
        numbers.remove(numbers.size()-1);

        //slow when removing in the beginning or middle - use linkedlist
        numbers.remove(0);


    }

}
