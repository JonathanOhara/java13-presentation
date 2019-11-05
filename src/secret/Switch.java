package secret;

import java.time.DayOfWeek;

public class Switch {

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SATURDAY;
        int numberOfLetters =
        switch(day){
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> numberOfLetters= 0;
        };
        System.out.println("Number of Letters: "+numberOfLetters);
    }

}
