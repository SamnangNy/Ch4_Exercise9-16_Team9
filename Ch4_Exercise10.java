
// Exercise10

import java.util.HashMap;
import java.util.Random;

public class Ch4_Exercise10 {
    
    public static void countOccurences(int... numbers) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int number : numbers) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }
        System.out.println("Occurrences: " + occurrences);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10); // generates numbers from 0 to 9
        }
        countOccurences(numbers);
    }
}

