package javaweek7;

public class GradeCalculator {

    public double calculateAverage(int[] grades) {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (grades.length == 0) ? 0 : (double) sum / grades.length;
    }
}
