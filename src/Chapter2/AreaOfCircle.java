/*
Write a program to calculate the area of a circle with a radius: 12 miles. Convert the area into meters
*/

public class AreaOfCircle {
    public static void main(String[] args) {
        int radiusmile = 12; // the radius is caculated by miles
        float radiusmet = radiusmile *  1609.34f; // the radius is caculated by mets
        double area = radiusmet * radiusmet * 3.14f; // the area of the circle
        System.out.println(area);
    }
}
