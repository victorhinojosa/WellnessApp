package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInteraction userInteraction = new UserInteraction();
        Scanner scanner = new Scanner(System.in);

        // Excercise
        System.out.println("How many minutes of exercise did you do today?");
        float exerciseMinutes = scanner.nextFloat();
        System.out.println("How motivated did you feel during your session? (1-10)");
        int motivationLevel = scanner.nextInt();
        userInteraction.recordExercise(exerciseMinutes, motivationLevel);

        // Alimentation
        System.out.println("How satisfied and energized did you feel after your main meals, on a scale from 1 to 10?");
        int satisfactionLevel = scanner.nextInt();
        System.out.println("Did you consume nutrient-rich foods such as proteins, healthy fats, and complex carbohydrates? (true/false)");
        boolean healthFoodConsumed = scanner.nextBoolean();
        userInteraction.recordAlimentation(satisfactionLevel, healthFoodConsumed);

        // Sleep
        System.out.println("How many hours did you sleep last night?");
        float hoursSlept = scanner.nextFloat();
        System.out.println("How restorative do you consider your sleep was? (1-10)");
        int sleepQualityRating = scanner.nextInt();
        System.out.println("Did you wake up during the night? (true/false)");
        boolean wokeUpDuringNight = scanner.nextBoolean();
        userInteraction.recordSleep(hoursSlept, sleepQualityRating, wokeUpDuringNight);

        // Meditation/reflection
        System.out.println("Did you spend time on meditation/reflection today? (true/false)");
        boolean meditatedToday = scanner.nextBoolean();
        System.out.println("How calm and/or relaxed did you feel during your meditation/reflection session? (1-10)");
        int relaxationRating = scanner.nextInt();
        userInteraction.recordMeditation(meditatedToday, relaxationRating);

        // Overview
        userInteraction.printSummary();

        scanner.close();
    }
}
