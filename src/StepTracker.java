public class StepTracker {
    private int minStep;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;
    public StepTracker(int threshold) {
        minStep = threshold;
        totalSteps = 0;
        numDays = 0;
        numActiveDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
    }
}
