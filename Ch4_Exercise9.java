
// Exercise9

import java.util.*; 
public class Ch4_Exercise9 {
    
    static int displayLargest(Integer[]a, int total){ 
        List<Integer> list=Arrays.asList(a);    //use to return a fixed-size list backed by the specified array 
        Collections.sort(list);                 //use to sort a list 
        int element=list.get(total-1);          //Returns the element at the specified position in this list 
        return element; 
    } 
    public static void main(String[] args){ 
        Integer a[]={12,34,56,78,998,76,554,333,555,987,1432}; 
        System.out.println("Largest Number is: "+displayLargest(a,11)); 
    } 
}

