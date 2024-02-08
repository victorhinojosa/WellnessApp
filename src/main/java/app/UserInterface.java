package app;
import java.util.List;

public interface UserInterface {
    // Record data
    void recordExercise(float exerciseMinutes, int motivationLevel);
    void recordAlimentation(int satisfactionLevel, boolean healthFoodConsumed);
    void recordSleep(float hoursSlept, int sleepQualityRating, boolean wokeUpDuringNight);
    void recordMeditation(boolean meditatedToday, int relaxationRating);

    // Get overview
    void printSummary();
    List<String> getSummary();
}
