package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListSorting {

    public static void main(String[] args) {
        Integer[] input = {7,23,5,29,45,32,78,40,3};
        System.out.println("Before Sorting");
        Arrays.stream(input).forEach(i -> System.out.print(i + " "));   //Use of Arrays.stream
        List<Integer> sortedList = Stream.of(input).sorted().collect(Collectors.toList()); // Use of Stream.of
        System.out.println("\nAfter Sorting");
        sortedList.forEach(i -> System.out.print(i + " "));

    }
}
