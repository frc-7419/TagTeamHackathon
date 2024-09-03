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

    public void addDailySteps(int steps) {
        this.totalSteps += steps;
        this.days++;
        if (steps >= minSteps) {
            this.activeDays++;
        }
    }
    
    public int activeDays() {
        return this.activeDays;
    }

    public double averageSteps() {
        if (this.days == 0) {
            return 0.0;
        }
        return (double) this.totalSteps / this.days;
    }
    
    public static void main(String[] args) {
        StepTracker tracker = new StepTracker(10000);
        tracker.addDailySteps(5000);
        tracker.addDailySteps(12000);
        tracker.addDailySteps(15000);
    
        System.out.println("Active days: " + tracker.activeDays());
        System.out.println("Average steps: " + tracker.averageSteps());
    }
}