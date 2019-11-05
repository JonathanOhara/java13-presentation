import java.time.DayOfWeek;

public class Switch {

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SATURDAY;
        int numberOfLetters;

        switch(day){
            case MONDAY:
                numberOfLetters = 6;
                break;
            case TUESDAY:
                numberOfLetters = 7;
                break;
            case WEDNESDAY:
                numberOfLetters = 9;
                break;
            case THURSDAY:
                numberOfLetters = 8;
                break;
            case FRIDAY:
                numberOfLetters = 6;
                break;
            case SATURDAY:
                numberOfLetters = 8;
                break;
            case SUNDAY:
                numberOfLetters = 6;
                break;
            default:
                numberOfLetters= 0;
        }
        System.out.println("Number of Letters: "+numberOfLetters);
    }

}
