//Write a program that reads in the radius
//and length of a cylinder and computes the area and volume using the following
//formulas:
//area = radius * radius * pi
//volume = area * length

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner radius = new Scanner(System.in);
        System.out.println("Radius:");
        double r = radius.nextDouble();
        double pi = 3.14;
        Scanner length = new Scanner(System.in);
        System.out.println("Length:");
        double l = length.nextDouble();
        double area = pi * r * r;
        System.out.println("Area = " + area);
        System.out.println("Volume = " + area * l);

    }
}
