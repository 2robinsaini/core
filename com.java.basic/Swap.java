public class Swap {
    public static void main(String[] args) {

        Swap swapObject = new Swap();
        swapObject.swapIntegers();
        swapObject.swapIntegersInArray();

    }



    private void swapIntegers() {
        int first = 10;
        int second = 20;

        System.out.println("Integers before Swap: first=" + first + " second=" + second);

        first = first + second;  //first = 30
        second = first - second; //second = 10
        first = first - second;  //first = 20

        System.out.println("Integers after Swap: first=" + first + " second=" + second);
    }

    private void swapIntegersInArray() {

        int[] input = {10,20,40,30,50};  //Swap index 2 and 3

        System.out.print("Array before swap: ");
        for (int val : input ) {
            System.out.print(val+ " ");
        }

        input[2] = input[2] + input[3];  //{10,20,70,30,50}
        input[3] = input[2] - input[3];  //{10,20,70,40,50}
        input[2] = input[2] - input[3];  //{10,20,30,40,50}


        System.out.print("\nArray After swap: ");
        for (int val : input ) {
            System.out.print(val+ " ");
        }


    }


}
