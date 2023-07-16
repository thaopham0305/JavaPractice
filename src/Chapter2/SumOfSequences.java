// Write a program to calculate the sum of sequences of Integers from 1 to 100
public class SumOfSequences {
    public static void main(String[] args) {
        int firstnumber; // the first number of sequences
        int lastnumber;// the last number of sequences
        int distance; // the distance of between numbers continuously
        int sum; // the sum of the first number and last number
        int num; // the number of numbers of sequences
        lastnumber = 100;
        firstnumber = 1;
        distance = 1;
        sum = (firstnumber + lastnumber);
        num = (lastnumber - firstnumber) / distance + 1;
        System.out.println (sum * num / 2);
    }
}
