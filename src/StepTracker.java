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
        totalSteps += steps;
    }
    int exampleVar;
    int exampleVar2;
    int exampleVar3;
    int exampleVar4;

    public int averageSteps() {
        return totalSteps/numDays;
    }
    public static String exampleMethod(int i) {
        return "good stuff";
    }
}
