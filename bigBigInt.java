package javas;

public class bigBigInt {
    public static void main(String[] args) {
        java.util.function.Function<Integer, java.math.BigInteger> powerFunction = degree(3);
       // java.math.BigInteger result = powerFunction.applyAsInt(2);
     //  System.out.println(result); // Output: 8
    }
// returns a lambda function to bring a number to a degree n
    public static java.util.function.Function<Integer, java.math.BigInteger> degree(int n) {
        return x -> java.math.BigInteger.valueOf(x).pow(n);
    }
}
