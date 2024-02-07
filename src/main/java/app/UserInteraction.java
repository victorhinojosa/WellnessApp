package app;

import java.util.ArrayList;
import java.util.List;

public class UserInteraction implements UserInterface {
    private User user;

    public UserInteraction() {
        this.user = new User();
    }

    @Override
    public void recordExercise(float exerciseMinutes, int motivationLevel) {
        user.setExerciseMinutes(exerciseMinutes);
        user.setExerciseMotivationLevel(motivationLevel);
    }

    @Override
    public void recordAlimentation(int satisfactionLevel, boolean healthFoodConsumed) {
        user.setSatisfactionAndEnergyLevel(satisfactionLevel);
        user.setHealthFoodConsumed(healthFoodConsumed);
    }

    @Override
    public void recordSleep(float hoursSlept, int sleepQualityRating, boolean wokeUpDuringNight) {
        user.setHoursSlept(hoursSlept);
        user.setSleepQualityRating(sleepQualityRating);
        user.setWokeUpDuringNight(wokeUpDuringNight);
    }

    @Override
    public void recordMeditation(boolean meditatedToday, int relaxationRating) {
        user.setMeditatedToday(meditatedToday);
        user.setSessionRelaxationRating(relaxationRating);
    }

    @Override
    public void printSummary() {
        // Imprimir resumen en la consola
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
    }

    @Override
    public List<String> getSummary() {
        // Obtener resumen como lista de strings
        List<String> summary = new ArrayList<>();
        summary.add("Minutes of exercise: " + user.getExerciseMinutes());
        summary.add("Motivation level during exercise: " + user.getExerciseMotivationLevel());
        summary.add("Satisfaction and energy level after meals: " + user.getSatisfactionAndEnergyLevel());
        summary.add("Consumed healthful foods: " + user.isHealthFoodConsumed());
        summary.add("Hours slept: " + user.getHoursSlept());
        summary.add("Sleep quality rating: " + user.getSleepQualityRating());
        summary.add("Woke up during the night: " + user.getWokeUpDuringNight());
        summary.add("Meditated today: " + user.wereMeditatedToday());
        summary.add("Session relaxation rating: " + user.getSessionRelaxationRating());
        return summary;
    }
}
