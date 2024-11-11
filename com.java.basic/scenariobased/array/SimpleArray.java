package scenariobased.array;

public class SimpleArray {
    public static void main(String[] args) {
        int [] input = {10,30,20,50,40,70,55,60,35};

        SimpleArray simpleArray = new SimpleArray();
        int sumOfArray = simpleArray.sumOfArray(input);
        System.out.println("sum of array = " + sumOfArray);

        int secondHighestNumber = simpleArray.secondHighestElement(input);
        System.out.println("second highest of array = " + secondHighestNumber);

        int secondLowestNumber = simpleArray.secondLowestElement(input);
        System.out.println("second Lowest of array = " + secondLowestNumber);

    }


    public int sumOfArray(int[] inputArray){
        int sum = 0;
        for(int i : inputArray){
            sum = sum + i;
        }
        return sum;
    }

    public int secondHighestElement(int[] inputArray){
        int high = 0;
        int second = 0;
        for(int i : inputArray){
            if(high < i){
                second = high;
                high = i;
            }
            else if(second < i) {
                second = i;
            }
        }
        return second;
    }

    public int secondLowestElement(int[] inputArray){
        int high = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i : inputArray){
            if(high > i){
                second = high;
                high = i;
            }
            else if(second > i) {
                second = i;
            }
        }
        return second;
    }
}
