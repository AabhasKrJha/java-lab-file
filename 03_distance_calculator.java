// Write a program to calculate the distance travelled by a vehicle at regular
// intervals of time given the values of acceleration and u. 
// The program should provide the flexibility to the user to select their own time intervals 
// and repeat calculations for different values of a and u.

import java.util.Scanner;
public class DistanceCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double acceleration, initialVelocity, timeInterval; 
        double distance;

        System.out.print("Enter the acceleration value: "); 
        acceleration = input.nextDouble();

        System.out.print("Enter the initial velocity value: "); 
        initialVelocity = input.nextDouble();

        System.out.print("Enter the time interval value: "); 
        timeInterval = input.nextDouble();

        distance = (initialVelocity * timeInterval) + (0.5 * acceleration * Math.pow(timeInterval, 2));
        System.out.println("The distance travelled is: " + distance); 
    }
}
