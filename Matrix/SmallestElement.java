package Matrix;

public class SmallestElement {
    public static int smallestElement(int[][] matrix) {
        int smallestElement = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] <= smallestElement) {
                    smallestElement = matrix[i][j];
                }
            }
        }
        return smallestElement;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int smallestElement = smallestElement(matrix);
        System.out.println("SmallestElement Element is : " + smallestElement);

    }

}
