package java;

public class Test_Data_Structures {
    public static void main(String[] args) {

    }

//  Implement a method removeNegatives(List<Integer> numbers) that returns a list with the elements of the numbers list without the negative numbers.

    public static java.util.List<Integer> removeNegatives(java.util.List<Integer> numbers){
        java.util.List<Integer> nonNegatives = numbers.stream()
                .filter(n -> n >= 0)
                .collect(java.util.stream.Collectors.toList());
        return nonNegatives;

    }
    //Implement the public int[] findSum(int[] numbers, int n) that returns an array with two numbers
    // from the numbers array the sum of which is equal to n. In case no such numbers exist the method return an empty array.
    public static int[] findSum(int[] numbers, int n){
        int[]res = new int[2];
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                if(numbers[i] + numbers[j]  == n){

                    res[0] = numbers[i];
                    res[1] = numbers[j];
                    return res;
                }
            }
        }
        return new int[0];
    }
}
