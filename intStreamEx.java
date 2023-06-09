package javas;



public class intStreamEx {
    public static void main(String[] args) {
        java.util.List<String> items = java.util.List.of("123", "456", "789", "abc", "def");
        java.util.stream.IntStream numbers = numbers(items);
        numbers.forEach(System.out::println);
    }

    public static java.util.stream.IntStream numbers(java.util.List<String> items) {
        return items.stream()
                .mapToInt(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        return Integer.MIN_VALUE;
                    }
                })
                .filter(value -> value != Integer.MIN_VALUE);
    }
}
