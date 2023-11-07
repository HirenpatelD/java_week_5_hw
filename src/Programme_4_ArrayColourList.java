import java.util.ArrayList;

public class Programme_4_ArrayColourList {

    public static void main(String[] args) {
        Programme_4_ArrayColourList obj = new Programme_4_ArrayColourList();
        obj.colour();
    }

    public void colour() {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Blue");
        colourList.add("Yellow");
        colourList.add("Pink");

        //Print out the collection using a for-each loop
        System.out.println("Colors in the ArrayList:");
        for (String colour : colourList) {
            System.out.print(colour + "," + " ");

        }
    }
}