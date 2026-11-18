class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        
        int currentNumber = 1;
        
        // Loop until all layers are filled or boundaries cross
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 1. Traverse Right: Fill the top row from left to right
            for (int j = colStart; j <= colEnd; j++) {
                matrix[rowStart][j] = currentNumber++;
            }
            rowStart++; // Move the top boundary down
            
            // 2. Traverse Down: Fill the rightmost column from top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = currentNumber++;
            }
            colEnd--; // Move the right boundary left
            
            // 3. Traverse Left: Fill the bottom row from right to left
            // This step is only needed if there's still a row to traverse (i.e., rowStart <= rowEnd)
            // This check handles cases like n=1 or when rowStart crosses rowEnd after previous steps
            if (rowStart <= rowEnd) { 
                for (int j = colEnd; j >= colStart; j--) {
                    matrix[rowEnd][j] = currentNumber++;
                }
                rowEnd--; // Move the bottom boundary up
            }
            
            // 4. Traverse Up: Fill the leftmost column from bottom to top
            // This step is only needed if there's still a column to traverse (i.e., colStart <= colEnd)
            // This check handles cases like n=1 or when colStart crosses colEnd after previous steps
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = currentNumber++;
                }
                colStart++; // Move the left boundary right
            }
        }
        
        return matrix;
    }
}