public class Runner {
    public static void main(String[] args) {
        
        // uncomment the following lines of code to test if you have the correct output

        
        StepTracker tr = new StepTracker(10000);
        System.out.println("number of active days: " + tr.activeDays());
        System.out.println("average number of steps: " + tr.averageSteps());
        tr.addDailySteps(5000);
        tr.addDailySteps(9000);
        System.out.println("number of active days: " + tr.activeDays());
        System.out.println("average number of steps: " +tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println("number of active days: " + tr.activeDays());
        


    }
}
