import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number");
        double radius = input.nextDouble();
        area(radius);
    }
    
    public static void area(double radius) {
    	System.out.println("The area of the circle is: "+Math.PI * Math.pow(radius, 2));
    }
}