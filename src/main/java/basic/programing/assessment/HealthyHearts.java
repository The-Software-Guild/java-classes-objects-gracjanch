package basic.programing.assessment;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        int userAge;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        userAge = Integer.parseInt(scanner.nextLine());

        int maximumAge = 220 - userAge;
        int lowTargetZone = 50 * maximumAge / 100;
        int highTargetZone = 85 * maximumAge / 100;


        System.out.println("Your maximum heart rate should be " +
                + maximumAge + " beats per minute");
        System.out.println("Your target HR Zone is " +
                + lowTargetZone + " - " + highTargetZone + " beats per minute");




    }
}
