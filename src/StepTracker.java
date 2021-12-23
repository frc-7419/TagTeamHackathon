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
        if (steps >= minSteps) {
            numActiveDays++;
        }
        numDays ++;
        totalSteps += steps;
    }
    
    public double averageSteps() {
    	double averageSteps = totalSteps/ numDays;
    	if (numDays == 0) {
    		return 0;
    	}
    	return averageSteps;
    }

    public int activeDays(){
        return numActiveDays;
    }

}
