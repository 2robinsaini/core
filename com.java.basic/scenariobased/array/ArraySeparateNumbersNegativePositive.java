package scenariobased.array;


import basics.Printing;

public class ArraySeparateNumbersNegativePositive {
    public static void main(String[] args) {
        int[] arr = {2, 0, -1, -3, 8, 0, -2, 4, 5, -6};
        Printing.printArray("Before Sort",arr);
        for(int j=0;j<arr.length-1;j++){
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] >= 0 && arr[i + 1] <= 0) {
                   arr[i] = arr[i] + arr[i + 1];
                   arr[i + 1] = arr[i] - arr[i + 1];
                   arr[i] = arr[i] - arr[i + 1];
            }
        }
    }
        Printing.printArray("After Sort",arr);
    }
}
