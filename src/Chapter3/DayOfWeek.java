/*
Have day of week is 4.
Print out the title of day (ex: Monday, Tuesday,...).
The first day of  week, Monday = 1. If can not get the title of day, print out “Invalid day”)
Try again with 7, and 10
 */
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 4;
//        int day = 7;
//        int day = 10;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
