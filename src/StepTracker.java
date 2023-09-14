public class StepTracker {
    int minSteps;
    int totalSteps;
    int numDays;
    int numActiveDays;
    public StepTracker(int threshold) {
        this.minSteps = threshold;
        this.totalSteps = 0;
        this.numDays = 0;
        this.numActiveDays = 0;
    }
    public void addDailySteps(int steps) {
        totalSteps += steps;
    }
}
