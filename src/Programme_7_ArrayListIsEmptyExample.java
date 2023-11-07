import java.util.ArrayList;

public class Programme_7_ArrayListIsEmptyExample {

    public static void main(String[] args) {

        //Create an empty array list
        ArrayList<String> arrayList = new ArrayList<>();
        if (arrayList.isEmpty()) {
            System.out.println("arraylist is empty");
        } else {

            System.out.println("arraylist is not empty");
        }
        //Printing all the elements available in arraylist
        System.out.println("ArrayList = " + arrayList);

        //Use add() method to add the elements available in the arraylist
        arrayList.add("Red");
        arrayList.add("Orange");
        arrayList.add("Pink");
        arrayList.add("Purple");
        arrayList.add("Blue");
        arrayList.add("Black");
        if (arrayList.isEmpty()) {
            System.out.println("arraylist is empty");
        } else {
            System.out.println("arraylist is not empty");
        }
        //Printing all the elements available in arrayList
        System.out.println("ArrayList = " + arrayList);
    }
}
