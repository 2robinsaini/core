package mixed;

import java.util.ArrayList;
import java.util.List;

public class TimeSearies {
    public static void main(String[] args) {
        List<String> timeList = new ArrayList<>();
        for(int hour=0;hour<=12;hour++){
            for (int minute=0;minute<60;minute++){
                for (int second=0;second<60;second++){
                    timeList.add(getDoubleDigitNumber(hour)+":"+getDoubleDigitNumber(minute)+":"+getDoubleDigitNumber(second));
                }
            }
        }
        for(String time : timeList){
            if(checkPalindrome(time)) {
                System.out.println(time);
            }
        }
    }

    private static String getDoubleDigitNumber(int num){
        return num < 10 ? "0"+num : ""+num;
    }

    private static boolean checkPalindrome(String time){
        time = time.replaceAll(":","");
        for(int i=0;i<time.length()/2;i++){
             if(time.charAt(i)!=time.charAt(time.length()-i-1)){
                 return false;
             }
        }
        return true;
    }
}
