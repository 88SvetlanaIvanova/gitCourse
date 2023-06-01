package javas;



public class gitFib {
    public static void main(String[] args) {


        java.util.stream.Stream<FibNumber> stream = fib();
        java.util.Iterator<FibNumber> iterator = stream.iterator();
        for(int i = 0; i < 9999; i++ ) {
            iterator.next();
        }
        System.out.println(iterator.next().getCurrent().intValue());
    }
    static class FibNumber {
        public FibNumber(java.math.BigInteger previous, java.math.BigInteger current) {
            this.previous = previous;
            this.current = current;
        }

        private java.math.BigInteger previous;
        private java.math.BigInteger current;

        public java.math.BigInteger getPrevious() {
            return previous;
        }

        public java.math.BigInteger getCurrent() {
            return current;
        }

}

    public static java.util.stream.Stream<FibNumber> fib() {
        return java.util.stream.Stream.iterate(
                new java.math.BigInteger[]{java.math.BigInteger.ONE, java.math.BigInteger.ONE},
                f -> new java.math.BigInteger[]{f[1], f[0].add(f[1])}
        ).map(f -> new FibNumber(f[0], f[1]));



    }

}

