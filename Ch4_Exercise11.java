
// Exercise11

import java.util.Scanner; 
public class Ch4_Exercise11 { 
 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
         
        System.out.print("Enter a number: "); 
        int number = input.nextInt(); 
        input.close(); 
 
        String words = verbose(number); 
        // Display the result 
        System.out.println(number + ": " + words);  
 
    } 
     
        public static String verbose(int number) { 
            
            if (number == 0) { 
                return "zero"; 
            } 
            if (number < 0) { 
                return "minus " + verbose(-number); 
            } 
            if (number < 20) { 
                return oneTeen[number]; 
            } 
            if (number < 100) { 
                return ty[number / 10] + (number % 10 == 0 ? "" : " " + verbose(number % 10)); 
            } 
            if (number < 1000) { 
                return oneTeen[number / 100] + " hundred" + (number % 100 == 0 ? "" : " " + verbose(number % 100)); 
            } 
            if (number < 1000000) { 
                return verbose(number / 1000) + " thousand" + (number % 1000 == 0 ? "" : ", " + verbose(number % 1000)); 
            } 
            if (number < 1000000000) { 
                return verbose(number / 1000000) + " million" + (number % 1000000 == 0 ? "" : ", " + verbose(number % 1000000)); 
            } 
            // number is too large 
            return "Number is too large"; 
        } 
         
        private static String[] oneTeen = { 
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" 
        }; 
         
        private static String[] ty = { 
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" 
        }; 
         
    }
