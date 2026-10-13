public class GradeReport {
    public static void main(String[] args) {
        int[] marks = {78, 82, 91, 65, 34}; // Example marks
        int total = 0;
        double average;
        boolean failFlag = false;

        // Check for fail condition and calculate total
        for (int mark : marks) {
            if (mark < 35) {
                failFlag = true;
                break; // Fail immediately if any subject < 35
            }
            total += mark;
        }

        if (failFlag) {
            System.out.println("Result: Fail");
        } else {
            average = total / 5.0;
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

            if (average >= 90) {
                System.out.println("Grade: A");
            } else if (average >= 75) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
    }
}
