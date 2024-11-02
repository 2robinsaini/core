package basics;

public class Printing {
     public static void printArray(int[] input){
        System.out.println("Array is: ");
        for(int num : input){
            System.out.print( num+" ");
        }
         System.out.println();
    }
    public static void printArray(String message, int[] input){
        System.out.println(message);
        for(int num : input){
            System.out.print( num +" ");
        }
        System.out.println();
    }
}
