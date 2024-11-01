public class Swap {
    public static void main(String[] args) {

        int first = 10;
        int second = 20;

        System.out.println("Before Swap: first=" + first + " second=" + second);

        first = first + second;  //first = 30
        second = first - second; //second = 10
        first = first - second;  //first = 20

        System.out.println("After Swap: first=" + first + " second=" + second);

    }
}
