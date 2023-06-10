package javas;

 public class matrixMethodSum {
    public static void main(String[] args) {

    }
}


 class MatrixSum {
    public static void main(String[] args) {

        long sum = matrixSum();
        System.out.println("Sum of matrix elements: " + sum);
    }

    public static long matrixSum() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}

