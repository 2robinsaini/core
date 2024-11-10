package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringExamples extends FunctionalInterfacesImpl {


    public static void main(String[] args) {
        StringExamples stringExamples = new StringExamples();
        stringExamples.concatExample();
        stringExamples.flatMapExample();
        stringExamples.listMapExample();

    }


    private void concatExample(){
        List<String> batsman = Arrays.asList("Rohit","Virat","Surya");
        List<String> bowler = Arrays.asList("Bumrah","Kuldeep","Ashwin");
        List<String> players = Stream.concat(batsman.stream(),bowler.stream()).collect(Collectors.toList());
        printStringList.printList("Concated List" , players);
    }

    private void flatMapExample(){
        List<String> batsman = Arrays.asList("Rohit","Virat","Surya");
        List<String> bowler = Arrays.asList("Bumrah","Kuldeep","Ashwin");
        List<String> allRounder = Arrays.asList("Hardik","Jadeja");
        List<List<String>> playersList = Arrays.asList(batsman,bowler,allRounder);
        List<String> allPlayers = playersList.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
        printStringList.printList("Flatted list" , allPlayers);
    }

    private void listMapExample(){
        List<String> players = Arrays.asList("Rohit","Virat","Surya","Bumrah","Rohit","Surya","Kuldeep","Ashwin","Kohli",
                "Hardik","Jadeja","Kohli");
        Map<String,Long> playerCountMap = players.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        printStringLongMap.printMap("Players count map:",playerCountMap);
    }

}
