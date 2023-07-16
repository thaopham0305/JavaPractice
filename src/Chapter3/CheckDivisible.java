/*
Check if number 4530 is divisible by 4.
If it is not divisible, print out (“This number 4530 can not be divisible by 4”).
If it is divisible, print out (“This number 4530 is divisible by 4”).
Try again with 4580.
 */
public class CheckDivisible {
    public static void main(String[] args) {
        int num1 = 4530;
        if (num1 % 4 == 0) {
            System.out.println("This number " + num1 + " can is divisible by 4");
        } else {
            System.out.println("This number " + num1 + " cannot be divisible by 4");
        }
        int num2 = 4580;
        if (num2 % 4 == 0) {
            System.out.println("This number " + num2 + " can is divisible by 4");
        } else {
            System.out.println("This number " + num2 + " cannot be divisible by 4");
        }
    }
}
