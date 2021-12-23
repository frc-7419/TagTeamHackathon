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

    public static void main(String[] args) {
        

    }
    public void addDailySteps(int steps) {
        this.totalSteps += steps;
        this.numDays++;
        if (steps >= this.minSteps) {
            this.numActiveDays++;
        }
    }       

    public double averageSteps() {
        return this.totalSteps/this.numDays;
    }

    public int activeDays() {
        return this.numActiveDays;
    }
}
