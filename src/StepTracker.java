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

    public void addDailyhSteps(int steps){
        if(steps >= minSteps){
            numActiveDays++;
        }
        numDays ++;
        totalSteps += steps;
    }
}
