import java.util.Arrays;

public class GenEx {
    @SuppressWarnings("unchecked")
    public static  <T extends Comparable<T>> T findMax(T... array)
    {


        // Initialize maximum element

        T max = array[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < array.length; i++){
            if (array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;




    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"apple", "banana", "orange"};

        Integer maxInt = GenEx.findMax(intArray);
        Double maxDouble = GenEx.findMax(doubleArray);
        String maxString = GenEx.findMax(stringArray);

        System.out.println("Max integer: " + maxInt); // prints "Max integer: 5"
        System.out.println("Max double: " + maxDouble); // prints "Max double: 5.5"
        System.out.println("Max string: " + maxString); // prints "Max string: orange"
    }
}
