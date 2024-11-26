package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntegerExample extends FunctionalInterfacesImpl{
    public static void main(String[] args) {
        IntegerExample integerExample = new IntegerExample();

        List<Integer> integers = Arrays.asList(10,50,20,40,30,60,80,70,100,90);
        integerExample.sortIntegerStream(integers);
        integerExample.sumIntegerStream(integers);
        integerExample.sumIntegerByReduceStream1(integers);
        integerExample.sumIntegerByReduceStream2(integers);
        integerExample.printMaxInteger(integers);
        integerExample.printSecondHighestInteger(integers);
        integerExample.printThirdHighestInteger(integers);
        integerExample.printFourthHighestInteger(integers);
        integerExample.findMaxByReduceInteger(integers);
        integerExample.useMatch(integers);


    }

    private void sortIntegerStream(List<Integer> integers){
        List<Integer> intList = integers.stream().sorted().collect(Collectors.toList());
        printIntList.printList("sorted list",intList);
    }
    private void sumIntegerStream(List<Integer> integers){
        int sumOfStream = integers.stream().mapToInt(Integer::intValue).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Sum by mapToInt is: "  + sumOfStream);
    }

    private void sumIntegerByReduceStream1(List<Integer> integers){
        Optional<Integer> sumOfStream = integers.stream().reduce((n1,n2) -> n1+n2);
        printIntList.printList("Original list",integers);
        System.out.print("Sum by reduce first is: ");
        sumOfStream.ifPresent(System.out::println);

    }

    private void sumIntegerByReduceStream2(List<Integer> integers){
        Integer sum = integers.stream().reduce(0,(n1,n2) -> n1+n2);
        printIntList.printList("Original list",integers);
        System.out.print("Sum by reduce second method is: " + sum);
        System.out.println();
    }

    private void printMaxInteger(List<Integer> integers){
        int maxValue = integers.stream().sorted((a,b) -> {return b-a;}).
                limit(1).mapToInt(Integer::intValue).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Max value is: "  + maxValue);
    }

    private void printSecondHighestInteger(List<Integer> integers){
        int secondHighest = integers.stream().sorted((a,b) -> {return b-a;}).
                limit(2).mapToInt(Integer::intValue).sorted().limit(1).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Second highest value is: "  + secondHighest);
    }

    private void printThirdHighestInteger(List<Integer> integers){
        int thirdHighest = integers.stream().sorted((a,b) -> {return b-a;}).
                limit(3).mapToInt(Integer::intValue).sorted().limit(1).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Third highest value is: "  + thirdHighest);
    }

    private void printFourthHighestInteger(List<Integer> integers){
        int fourthHighest = integers.stream().sorted((a,b) -> {return b-a;}).
                limit(4).mapToInt(Integer::intValue).sorted().limit(1).sum();
        printIntList.printList("Original list",integers);
        System.out.println("Fourth highest value is: "  + fourthHighest);

        Optional<Integer> fourthHighest2 = integers.stream().sorted((a,b) -> { return (b-a);}).skip(3).peek(i -> System.out.println("*** " + i)).findFirst();
        System.out.println("Fourth highest value by second method is: ");
        fourthHighest2.ifPresent(System.out::println);
    }

    private void findMaxByReduceInteger(List<Integer> integers){
        Optional<Integer> max = integers.stream().sorted().reduce((i1, i2) -> i1 > i2 ? i1 : i2);
        printIntList.printList("Original list",integers);
        System.out.println("Highest value by Reduce is: "  + max.get());
    }

    private void useMatch(List<Integer> integers) {
        System.out.println("use match");
        integers.stream().skip(2).peek(System.out::println);
    }
}
