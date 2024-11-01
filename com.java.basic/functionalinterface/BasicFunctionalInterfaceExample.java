package functionalinterface;

import java.time.LocalDateTime;
import java.util.Date;

public class BasicFunctionalInterfaceExample {

    public static void main(String[] args) {

        BasicFunctionalInterface basicFunctionalInterface1 = () ->
                System.out.println("Print Time by Lambda expression 1: " + new Date());
        basicFunctionalInterface1.printTime();

        BasicFunctionalInterface basicFunctionalInterface2 = () ->
                System.out.println("Print Time by Lambda expression 2: " + LocalDateTime.now().toString());

        basicFunctionalInterface2.printTime();

    }
}
