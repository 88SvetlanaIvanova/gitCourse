package javas;

import java.util.stream.Stream;

public class stremEx {
    public static void main(String[] args) {

    }
    static int x;
    static {
        x = 10;
        int result = Stream.of(10, 20, 30, 40).map( ( y ) -> { x+=y; return x;}).reduce(x, (a,b) -> {return a + b;});
        System.out.println(result);
    }
}
