package basic.programing.assessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        String dogName;
        int sum = 100;
        int percentOfBreed;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("What is your dog's name?");
        dogName = scanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.");
        System.out.println(dogName + "is: ");
        percentOfBreed = random.nextInt(sum - 1) + 1;
        sum -= percentOfBreed;
        System.out.println(percentOfBreed + "% St. Bernard");
        percentOfBreed = random.nextInt(sum - 1) + 1;
        sum -= percentOfBreed;
        System.out.println(percentOfBreed + "% Chihuahua");
        percentOfBreed = random.nextInt(sum - 1) + 1;
        sum -= percentOfBreed;
        System.out.println(percentOfBreed + "% Dramatic RedNosed Asian Pug");
        percentOfBreed = random.nextInt(sum - 1) + 1;
        sum -= percentOfBreed;
        System.out.println(percentOfBreed + "% Common Cur");
        System.out.println(sum + "% King Doberman");
        System.out.println("Wow, that's QUITE ");
    }
}
