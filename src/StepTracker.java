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
    public void addDailySteps(int steps){
        totalSteps += steps;
        numDays++;
        if(steps > minSteps){
            numActiveDays ++;
        }
    }
    public int activeDays(){
        return numActiveDays;
    }
    public double averageSteps(){
        return totalSteps/numDays;
    }
}