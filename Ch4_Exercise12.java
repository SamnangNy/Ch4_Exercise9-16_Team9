
// Exercise12
public class Ch4_Exercise12 {
    public static int secondLargest(int[][] array2D) { 
        int max = Integer.MIN_VALUE; 
        int secondMax = Integer.MIN_VALUE; 
         
        for (int[] row : array2D) { 
            for (int value : row) { 
                if (value > max) { 
                    secondMax = max; 
                    max = value; 
                } else if (value > secondMax && value != max) { 
                    secondMax = value; 
                } 
            } 
        } 
        return secondMax; 
        } 
        public static void main(String[] args) { 
 
            int[][] array2D = {{5, 11, 9}, 
                               {15, 22, 31}, 
                               {33, 44, 18} 
                              }; 
            int secondLargest = secondLargest(array2D); 
            System.out.println("Second Largest: " + secondLargest); 
        } 
}
