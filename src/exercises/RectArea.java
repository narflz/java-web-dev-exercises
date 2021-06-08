package exercises;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of rectangle?");
        Double length = input.nextDouble();
        System.out.println("Width of rectangle?");
        Double width = input.nextDouble();
        Double area = width * length;
        System.out.println("The area of the rectangle is " + area);
    }
}
