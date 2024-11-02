package scenariobased.array;

import basics.Printing;

public class NearestFloor {
    public static void main(String[] args) {
        int[] floors = {7, 1, 9, 5, 3}; // Unsorted array of floor numbers
        int currentFloor = 4; // Current floor
        int nearestFloor = -1;
        int diff = Integer.MAX_VALUE;
        for(int floor : floors){
             if(diff > diff(currentFloor,floor)){
                 diff = diff(currentFloor,floor);
                 nearestFloor = floor;
             }
         }
        Printing.printArray("Initial Floors",floors);
        System.out.println("Nearest floor from current floor "+currentFloor + " is "+ nearestFloor );




    }

    private static int diff(int first, int second){
        if(first>second){
            return first - second;
        }
        else if (second > first){
            return second - first;
        }
        else
            return 0;
    }
}
