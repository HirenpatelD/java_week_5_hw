import java.util.*;

public class Programme_3_ReverseAnArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(array));

        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        Collections.reverse(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
}








