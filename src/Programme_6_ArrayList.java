import java.util.ArrayList;

public class Programme_6_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Pink");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("yellow");

        //The index of the element we want to retrieve
        int index = 3;

        //Retrieve the element at the specified index
        String color = colors.get(index);
        //Print the retrieve element
        System.out.println("The color at index " + index + " is " + color);
    }
}
