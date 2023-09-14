public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;
    public StepTracker(int threshold) {
        minSteps = threshold;
        totalSteps = 0;
        numDays = 0;
        numActiveDays = 0;
    }
    public void addDailySteps(int steps) {
        totalSteps += steps;
        numDays++;
        if (steps >= minSteps) {
            numActiveDays++;
        }
    }
    public double averageSteps() {
        return totalSteps == 0 ? 0.0 : totalSteps / (double) numDays;
    }

    public int activeDays() {
        return numActiveDays;
    }
}