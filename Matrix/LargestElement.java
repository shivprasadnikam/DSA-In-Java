package Matrix;

public class LargestElement {

    public static int largestElement(int[][] matrix) {
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] >= largestElement) {
                    largestElement = matrix[i][j];
                }
            }
        }
        return largestElement;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int largestElement = largestElement(matrix);
        System.out.println("Largest Element is : " + largestElement);

    }

}
