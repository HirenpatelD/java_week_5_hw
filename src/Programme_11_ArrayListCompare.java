import java.util.ArrayList;

public class Programme_11_ArrayListCompare {

    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("REd");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Compare the two ArrayLists

        if (c1.equals(c2)) {
            System.out.println("The two ArrayList are equal");
        }else{
            System.out.println("The two ArrayList are not equal");
        }
        }
}
