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

    public void addDailySteps(int steps) {
        totalSteps+=steps;
    }

    public double averageSteps() {
            return (double) totalSteps / numDays;
    }

    public static void main(String[] args) {

    }
}
