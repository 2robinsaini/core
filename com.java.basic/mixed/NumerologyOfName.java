package mixed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumerologyOfName {
    static Map<Integer, List<Character>> map = new HashMap<>();
    static {
      map.put(1, Arrays.asList('A','I','Q','Y'));
      map.put(2, Arrays.asList('B','K','R'));
      map.put(3, Arrays.asList('C','G','L','S'));
      map.put(4, Arrays.asList('D','M','T'));
      map.put(5, Arrays.asList('E','H','N','X'));
      map.put(6, Arrays.asList('U','V','W'));
      map.put(7, Arrays.asList('O','Z'));
      map.put(8, Arrays.asList('F','P'));
    }

    public static void main(String[] args) {
        String name = "Supernova";
        String dob = "13104";
        System.out.println("Name: " + name + " Sum of Name: " + getSumOfName(name) + " and Moolank: " + getSumOfNum(Integer.parseInt(dob)));
    }

    private static int getSumOfName(String name){
        char[] chars = name.toUpperCase().toCharArray();

        int sum = 0;
        for(Character c : chars) {
            sum  = sum + map.entrySet().stream().filter(e -> e.getValue().contains(c)).map(e -> e.getKey()).mapToInt(Integer::intValue).sum();
        }
        return getSumOfNum(sum);
    }

    private static int getSumOfNum(int number){
        if(number<10){
           return number;
        }
        else{
            int sum = 0;
            char[] nums =  Integer.valueOf(number).toString().toCharArray();
            for(char c : nums){
                sum = sum + Integer.valueOf(String.valueOf(c));
            }
            if(sum<10){
                return sum;
            }
            else {
                return getSumOfNum(sum);
            }
        }
    }

}
