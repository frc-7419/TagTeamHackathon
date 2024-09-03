public class StepTracker {
    private int minSteps;      
    private int totalSteps;   
    private int activeDays;    
    private int days;         

    public StepTracker(int threshold) {
        this.minSteps = threshold;
        this.totalSteps = 0;        
        this.activeDays = 0;    
        this.days = 0;             
    }
}