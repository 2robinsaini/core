public class Factorial {
    public static void main(String[] args) {
        int number = 7;
        Factorial factorialObject = new Factorial();
        int factorialVale1 = factorialObject.calculateFactorialByLoop(number);
        int factorialVale2 = factorialObject.calculateFactorialByIteration(number);

        System.out.println("Factorial of " + number + " by Loop is: " + factorialVale1);
        System.out.println("Factorial of " + number + " by Iteration is: " + factorialVale2);
    }

    private int calculateFactorialByLoop(int number) {
        int value = 1;
        for(int i=number;i>=1;i--){
            value = value * i;
        }
        return value;
    }

    private int calculateFactorialByIteration(int number) {
        if(number == 0 || number == 1){
            return 1;
        }
        else{
            return number * calculateFactorialByIteration(number-1);
        }
    }
}
