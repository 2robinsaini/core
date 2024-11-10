package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerExample extends FunctionalInterfacesImpl{
    public static void main(String[] args) {
        IntegerExample integerExample = new IntegerExample();

        List<Integer> integers = Arrays.asList(10,50,20,40,30,60,80,70,100,90);
        integerExample.sortIntegerStream(integers);
        integerExample.sumIntegerStream(integers);
        integerExample.printMaxInteger(integers);
        integerExample.printSecondHighestInteger(integers);
        integerExample.printThirdHighestInteger(integers);
        integerExample.printFourthHighestInteger(integers);


    }

    private void sortIntegerStream(List<Integer> integers){
        List<Integer> intList = integers.stream().sorted().collect(Collectors.toList());
        printIntList.printList("sorted list",intList);
    }
    private void sumIntegerStream(List<Integer> integers){
        int sumOfStream = integers.stream().mapToInt(Integer::intValue).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Sum is: "  + sumOfStream);
    }

    private void printMaxInteger(List<Integer> integers){
        int maxValue = integers.stream().sorted((a,b) -> {return b-a;}).
                limit(1).mapToInt(Integer::intValue).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Max value is: "  + maxValue);
    }

    private void printSecondHighestInteger(List<Integer> integers){
        int secondHeighest = integers.stream().sorted((a,b) -> {return b-a;}).
                limit(2).mapToInt(Integer::intValue).sorted().limit(1).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Second highest value is: "  + secondHeighest);
    }

    private void printThirdHighestInteger(List<Integer> integers){
        int secondHighest = integers.stream().sorted((a,b) -> {return b-a;}).
                limit(3).mapToInt(Integer::intValue).sorted().limit(1).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Third highest value is: "  + secondHighest);
    }

    private void printFourthHighestInteger(List<Integer> integers){
        int secondHeighest = integers.stream().sorted((a,b) -> {return b-a;}).
                limit(4).mapToInt(Integer::intValue).sorted().limit(1).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Fourth highest value is: "  + secondHeighest);
    }
}
