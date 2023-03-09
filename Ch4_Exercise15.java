
// Exercise 15
/* 
 (Pattern recognition: four consecutive equal numbers) Write a method that checks whether a 2D
array has four consecutive numbers of the same value, either horizontally, vertically, or diagonally.
*/

public class Ch4_Exercise15 {

    public static boolean isConsecutiveFour(int[][] array2D) {
        // Determine the number of rows and columns in the 2D array
        int numRows = array2D.length;
        int numCols = array2D[0].length;

        // Check rows
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols - 3; j++) {
                if (array2D[i][j] == array2D[i][j+1] &&
                    array2D[i][j] == array2D[i][j+2] &&
                    array2D[i][j] == array2D[i][j+3]) {
                    return true;
                }
            }
        }

        // Check columns
        for (int i = 0; i < numRows - 3; i++) {
            for (int j = 0; j < numCols; j++) {
                if (array2D[i][j] == array2D[i+1][j] &&
                    array2D[i][j] == array2D[i+2][j] &&
                    array2D[i][j] == array2D[i+3][j]) {
                    return true;
                }
            }
        }

        // Check diagonals
        for (int i = 0; i < numRows - 3; i++) {
            for (int j = 0; j < numCols - 3; j++) {
                if (array2D[i][j] == array2D[i+1][j+1] &&
                    array2D[i][j] == array2D[i+2][j+2] &&
                    array2D[i][j] == array2D[i+3][j+3]) {
                    return true;
                }
            }
        }

        for (int i = 3; i < numRows; i++) {
            for (int j = 0; j < numCols - 3; j++) {
                if (array2D[i][j] == array2D[i-1][j+1] &&
                    array2D[i][j] == array2D[i-2][j+2] &&
                    array2D[i][j] == array2D[i-3][j+3]) {
                    return true;
                }
            }
        }

        // If no consecutive four found, return false
        return false;
    }

    public static void main(String[] args) {
        // Initialize a 2D array with 7 columns and 6 rows
        int[][] array2D = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 0, 1, 2, 3, 4},
            {5, 6, 7, 8, 5, 0, 1},
            {2, 3, 4, 5, 5, 7, 8},
            {9, 0, 1, 2, 5, 4, 5},
            {6, 6, 6, 6, 5, 1, 2}
        };
        
        // Call the isConsecutiveFour method to check for four consecutive numbers of the same value
        if (isConsecutiveFour(array2D)) {
            System.out.println("The array contains four consecutive numbers of the same value");
        } else {
            System.out.println("The array does not contain four consecutive numbers of the same value");
        }
    }
}         

