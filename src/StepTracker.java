public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;

    public StepTracker(int threshold) {
        int minSteps = threshold;
        int totalSteps = 0;
        int numDays = 0;
        int numActiveDays = 0;
    }

    public static void addDailySteps(int steps) {
        totalStepps+=steps;
    }

    public static void main(String[] args) {

    }
}
