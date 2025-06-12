class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;
        if (cols == 0) return false;

        if (rows == 1) {
            return binary(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return true;
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (matrix[rStart][cMid] == target) return true;
        if (rStart + 1 < rows && matrix[rStart + 1][cMid] == target) return true;

        if (cMid - 1 >= 0 && target <= matrix[rStart][cMid - 1]) {
            return binary(matrix, rStart, 0, cMid - 1, target);
        } else if (cMid + 1 < cols && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binary(matrix, rStart, cMid + 1, cols - 1, target);
        } else if (rStart + 1 < rows && cMid - 1 >= 0 && target <= matrix[rStart + 1][cMid - 1]) {
            return binary(matrix, rStart + 1, 0, cMid - 1, target);
        } else if (rStart + 1 < rows && cMid + 1 < cols) {
            return binary(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

        return false;
    }

    public boolean binary(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return false;
    }
}
