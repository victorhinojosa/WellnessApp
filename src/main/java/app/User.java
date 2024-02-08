package app;


public class User {
    //Exercise
    private float exerciseMinutes;
    private int exerciseMotivationLevel;

    //Alimentation
    private int satisfactionAndEnergyLevel;
    private boolean healthFoodConsumed;

    //Sleep
    private float hoursSlept;
    private int sleepQualityRating;
    private boolean wokeUpDuringNight;

    //Meditation, reflection
    private boolean meditatedToday;
    private int sessionRelaxationRating;

    // Constructor
    public User() {
        // Puedes inicializar los atributos si lo deseas
    }

    //Exercise
    public float getExerciseMinutes() {
        return exerciseMinutes;
    }
    public void setExerciseMinutes(float exerciseMinutes) {
        this.exerciseMinutes = exerciseMinutes;
    }

    public int getExerciseMotivationLevel() {
        return exerciseMotivationLevel;
    }
    public void setExerciseMotivationLevel(int exerciseMotivationLevel) {
        this.exerciseMotivationLevel = exerciseMotivationLevel;
    }
    //Alimentation
    public int getSatisfactionAndEnergyLevel() {
        return satisfactionAndEnergyLevel;
    }

    public void setSatisfactionAndEnergyLevel(int satisfactionAndEnergyLevel) {
        this.satisfactionAndEnergyLevel = satisfactionAndEnergyLevel;
    }

    public boolean isHealthFoodConsumed() {
        return healthFoodConsumed;
    }

    public void setHealthFoodConsumed(boolean healthFoodConsumed) {
        this.healthFoodConsumed = healthFoodConsumed;
    }
    //Sleep
    public float getHoursSlept() {
        return hoursSlept;
    }
    public void setHoursSlept(float hoursSlept) {
        this.hoursSlept = hoursSlept;
    }

    public int getSleepQualityRating() {
        return sleepQualityRating;
    }
    public void setSleepQualityRating(int sleepQualityRating) {
        this.sleepQualityRating = sleepQualityRating;
    }

    public boolean getWokeUpDuringNight() {
        return wokeUpDuringNight;
    }

    public void setWokeUpDuringNight(boolean wokeUpDuringNight) {
        this.wokeUpDuringNight = wokeUpDuringNight;
    }
    //Meditation/reflection

    public boolean wereMeditatedToday() {
        return meditatedToday;
    }

    public void setMeditatedToday(boolean meditatedToday) {
        this.meditatedToday = meditatedToday;
    }
    public int getSessionRelaxationRating() {
        return sessionRelaxationRating;
    }

    public void setSessionRelaxationRating(int sessionRelaxationRating) {
        this.sessionRelaxationRating = sessionRelaxationRating;
    }

}
