public class Steptracker {
    private int minSteps;
    private  int totalSteps;
    private int numDays;
    private int numActiveDays;

    public Steptracker(int threshold){
        this.minSteps = threshold;
        this.totalSteps = 0;
        this.numDays = 0;
        this.numActiveDays = 0;
    }
}
