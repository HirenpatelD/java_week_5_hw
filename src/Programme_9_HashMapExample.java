import java.util.HashMap;

public class Programme_9_HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();

        //add some key value to the map
        people.put("John", 25);
        people.put("Prince", 30);
        people.put("Michael", 35);
        people.put("bob", 40);
        //Iterator over the value in the map using a for each loop
        for (int age : people.values()){
            System.out.println("Age: " + age);}
    }
}
