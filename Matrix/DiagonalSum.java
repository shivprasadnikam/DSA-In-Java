package Matrix;

public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) {

        int left = 0;
        int right = matrix[0].length - 1;

        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (left == right) {
                diagonalSum += matrix[i][left];
            } else {
                int temp = matrix[i][left] + matrix[i][right];
                diagonalSum += temp;
            }
            left++;
            right--;
        }
        return diagonalSum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int res = diagonalSum(matrix);
        System.out.println("Diagonal sum is : " + res);
    }

}
