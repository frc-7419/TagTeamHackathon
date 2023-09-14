public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;

    public StepTracker(int threshold) {
        this.minSteps = threshold;
        this.totalSteps = 0;
        this.numDays = 0;
        this.numActiveDays = 0;
    }

    public void addDailySteps(int steps){
        totalSteps += steps;
    }
}
