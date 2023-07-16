import java.io.IOException;

import static java.lang.System.in;

public class DoWhileCheckInput {
    public static void main(String[] args) throws IOException {
        char ch;
        do {
            System.out.print("Input your day of week: ");
            ch =  (char) System.in.read();
        } while (ch < '1' || ch > '7');
        switch (ch) {
            case '1':
                System.out.println("Monday");
                break;
            case '2':
                System.out.println("Tuesday");
                break;
            case '3':
                System.out.println("Wednesday");
                break;
            case '4':
                System.out.println("Thursday");
                break;
            case '5':
                System.out.println("Friday");
                break;
            case '6':
                System.out.println("Saturday");
                break;
            case '7':
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
