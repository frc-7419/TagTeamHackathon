public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;

    public StepTracker(int minSteps){
        this.minSteps = minSteps;
        this.totalSteps = 0;
        this.numDays = 0;
        this.numActiveDays = 0;
    }

}
