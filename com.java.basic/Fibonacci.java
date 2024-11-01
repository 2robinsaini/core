public class Fibonacci {
    public static void main(String[] args) {
        int number = 10;
        Fibonacci fibonacciObj = new Fibonacci();
        fibonacciObj.printFibonacciSeries(number);
        int fibonacciNumber = fibonacciObj.calculateFibonacciNumber(number);
        System.out.println("\nFibonacci series " + number + " is: " + fibonacciNumber);

    }

    private int calculateFibonacciNumber(int number) {
        if(number == 0 || number == 1){
            return number;
        }
        else{
            return calculateFibonacciNumber(number-1) + calculateFibonacciNumber(number-2);
        }
    }

    private void printFibonacciSeries(int number) {
        int first = 0;
        int second = 1;
        int sum;
        for(int i=0;i<number;i++){
            sum = first + second;
            System.out.print(sum + " ");
            second = first;
            first = sum;
        }
    }
}
