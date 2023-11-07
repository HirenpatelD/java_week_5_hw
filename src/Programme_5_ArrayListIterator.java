import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_ArrayListIterator {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Melon");

        //Get an Iterator for the Arraylist

        Iterator<String> iterator = fruits.iterator();
        //Iterator through the Arraylist using the Iterator
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }

    }
}


