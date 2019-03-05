//Convert feet into meters
// feet = 0.305 meters

import java.util.Scanner;

public class FeetConvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input feet:");
        double feet = input.nextDouble();
        double i = 0.305;
        System.out.println(feet + " feet = " + feet*i + " metres.");

    }
}
