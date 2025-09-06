package BinarySearch;

import java.util.*;
public class peakElement2 {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,15},
                {21,30,14},
                {7,16,32}
        };
        System.out.println(Arrays.toString(findPeakGrid(matrix)));
    }

    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int left = 0, right = cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            boolean leftIsBigger = mid - 1 >= 0 && mat[maxRow][mid - 1] > mat[maxRow][mid];
            boolean rightIsBigger = mid + 1 < cols && mat[maxRow][mid + 1] > mat[maxRow][mid];

            if (!leftIsBigger && !rightIsBigger) {
                return new int[]{maxRow, mid};
            } else if (rightIsBigger) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }


}
