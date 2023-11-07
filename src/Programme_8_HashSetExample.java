import java.util.HashSet;

public class Programme_8_HashSetExample {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set ");
            }
        }
    }
}
