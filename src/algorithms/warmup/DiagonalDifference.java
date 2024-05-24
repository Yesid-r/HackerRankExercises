package algorithms.warmup;

import java.util.List;

/**
 * This class provides a method to calculate the absolute difference between the sums
 * of the diagonals of a square matrix.
 *
 * Problem Description:
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 * For example, the square matrix:
 * 1 2 3
 * 4 5 6
 * 9 8 9
 *
 * The left-to-right diagonal = 1 + 5 + 9 = 15.
 * The right-to-left diagonal = 3 + 5 + 9 = 17.
 * Their absolute difference is |15 - 17| = 2.
 *
 * Function description:
 * Complete the function diagonalDifference below.
 *
 * @param arr a list of lists of integers representing a square matrix
 * @return the absolute diagonal difference
 *
 * Input Format:
 * The first line contains a single integer, n, the number of rows and columns in the square matrix arr.
 * Each of the next n lines describes a row, arr[i], and consists of space-separated integers arr[i][j].
 *
 * Constraints:
 * - 1 <= n <= 100
 * - -100 <= arr[i][j] <= 100
 *
 * Output Format:
 * Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
 *
 * Sample Input:
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 *
 * Sample Output:
 * 15
 *
 * Explanation:
 * The primary diagonal is:
 * 11
 *    5
 *       -12
 *
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 *
 * The secondary diagonal is:
 *       4
 *    5
 * 10
 *
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 * Difference: |4 - 19| = 15
 * Note: |x| is the absolute value of x.
 */
public class DiagonalDifference {

    /**
     * Calculates the absolute difference between the sums of the primary and secondary diagonals of a square matrix.
     *
     * @param arr a list of lists of integers representing the square matrix
     * @return the absolute difference between the sums of the two diagonals
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    leftDiagonal += arr.get(i).get(j); // Sum for the primary diagonal
                }
                if (j == arr.size() - 1 - i) {
                    rightDiagonal += arr.get(i).get(j); // Sum for the secondary diagonal
                }
            }
        }

        // Return the absolute difference between the sums of the two diagonals
        return Math.abs(leftDiagonal - rightDiagonal);
    }
}
