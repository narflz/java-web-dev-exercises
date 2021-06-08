package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of miles driven?");
        Double miles = input.nextDouble();
        System.out.println("Gas consumed (in gallons)?");
        Double gasUsed = input.nextDouble();
        Double mpg = miles / gasUsed;
        System.out.println("Your current MPG is " + mpg);
    }
}
