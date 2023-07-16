/*
 Write a program to calculate the volume of a warehouse needed to place 100 containers.
 The warehouse can arrange 4 containers in a row and 5 containers in each row.
 Each container has a length, width, and height: 12m, 2.4m, 2.5m.
 */
public class VolumeOfWarehouse {
    public static void main(String[] args) {
        double volume1container = 12 * 2.4d * 2.5d; // the volume of one container
        int num = 100; // the number of containers
        double volume100container = volume1container * 100; // the volume of 100 container
        System.out.println(volume100container);
    }
}
