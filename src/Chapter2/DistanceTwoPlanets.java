/*
Write a program to convert the distance between Earth and Neptune by kilometers
if we know that the distance is 30 AU (Astronomical Unit). 1 AU = 150 million kilometers.
 */
public class DistanceTwoPlanets {
    public static void main(String[] args) {
        long distance;
        long au = 150000000;
        distance = (30 * au);
        System.out.println (distance);
    }
}
