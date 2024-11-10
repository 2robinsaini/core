import java.time.Duration;
import java.time.LocalDateTime;

import static java.util.concurrent.TimeUnit.DAYS;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDateTime dob = LocalDateTime.of(2014,04,04,0,0,0);
        LocalDateTime now = LocalDateTime.now();

        Duration age = Duration.between(dob, now);
        System.out.println("Age is " + age.getSeconds()/86400 + " days.");
    }
}
