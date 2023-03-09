
// Exercise 13
// Write a method that shuffles the rows in a 2D array of characters

import java.util.Arrays;
import java.util.Random;

public class Ch4_Exercise13 {
   
    public static void main(String[] args) {
        // Create a 2D array of characters
        char[][] array2D = {
                             {'A', 'A', 'A', 'A'},
                             {'B', 'B', 'B', 'B'},
                             {'B', 'B', 'B', 'B'},
                             {'C', 'C', 'C', 'C'}
        };

           // Call the shuffleRows method to shuffle the rows randomly
         shuffleRows(array2D);

           // Print the shuffled array to verify that the rows have been shuffled randomly
         for (char[] row : array2D) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void shuffleRows(char[][] array2D) {
        Random rand = new Random();      // Create a new Random object to generate random numbers
        // Iterate over the rows of the array, starting from the last row
        for (int i = array2D.length - 1; i > 0; i--) {  
            // Generate a random index between 0 and i (inclusive)
            
            int j = rand.nextInt(i + 1);

            // Swap the current row with a randomly selected row
            char[] temp = array2D[i];
            array2D[i] = array2D[j];
            array2D[j] = temp;
        }
    }
} 

