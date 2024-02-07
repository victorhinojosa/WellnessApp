package  app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        // Data about exercise
        System.out.println("How many minutes of exercise did you do today?");
        user.setExerciseMinutes(scanner.nextFloat());
        System.out.println("How motivated did you feel during your session?(1-10)");
        user.setExerciseMotivationLevel(scanner.nextInt());

        // Data about alimentation
        System.out.println("How satisfied and energized did you feel after your main meals, on a scale from 1 to 10?");
        user.setSatisfactionAndEnergyLevel(scanner.nextInt());
        System.out.println("Did you consume nutrient-rich foods such as proteins, healthy fats, and complex carbohydrates?(true for yes/false for no)");
        user.setHealthFoodConsumed(scanner.nextBoolean());

        // Data about sleep
        System.out.println("How many hours did you sleep last night?");
        user.setHoursSlept(scanner.nextFloat());
        System.out.println("How restorative do you consider your sleep was?(1-10)");
        user.setSleepQualityRating(scanner.nextInt());
        System.out.println("Did you wake up during the night?(true for yes/false for no)");
        user.setWokeUpDuringNight(scanner.nextBoolean());


        // Data about meditation/reflection
        System.out.println("Did you spend time on meditation/reflection today?(true for yes/false for no)");
        user.setMeditatedToday(scanner.nextBoolean());
        System.out.println("How calm and/or relaxed did you feel during your meditation/reflection session?(1-10)");
        user.setSessionRelaxationRating(scanner.nextInt());

        System.out.println("\nSummary of data entered:");
        System.out.println("Minutes of exercise: " + user.getExerciseMinutes());
        System.out.println("Motivation level during exercise: " + user.getExerciseMotivationLevel());
        System.out.println("Satisfaction and energy level after meals: " + user.getSatisfactionAndEnergyLevel());
        System.out.println("Consumed healthful foods: " + user.isHealthFoodConsumed());
        System.out.println("Hours slept: " + user.getHoursSlept());
        System.out.println("Sleep quality rating: " + user.getSleepQualityRating());
        System.out.println("Woke up during the night: " + user.getWokeUpDuringNight());
        System.out.println("Meditated today: " + user.wereMeditatedToday());
        System.out.println("Session relaxation rating: " + user.getSessionRelaxationRating());


        // Cerrar el scanner
        scanner.close();
    }
}
