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
        totalSteps+=steps;
    }

    public double averageSteps() {
            return (double) totalSteps / numDays;
    }

    public int activeDays() {

        return numActiveDays;
    }

}
