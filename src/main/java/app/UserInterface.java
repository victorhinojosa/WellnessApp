package app;
import java.util.List;

public interface UserInterface {
    // Métodos para registrar datos
    void recordExercise(float exerciseMinutes, int motivationLevel);
    void recordAlimentation(int satisfactionLevel, boolean healthFoodConsumed);
    void recordSleep(float hoursSlept, int sleepQualityRating, boolean wokeUpDuringNight);
    void recordMeditation(boolean meditatedToday, int relaxationRating);

    // Métodos para obtener resúmenes
    void printSummary();
    List<String> getSummary();
}
