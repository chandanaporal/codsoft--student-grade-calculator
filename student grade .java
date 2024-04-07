import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject.
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int[] marks = new int[5]; // Assuming 5 subjects
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
        double averagePercentage = (double) totalMarks / marks.length;

        // Grade Calculation: Assign grades based on the average percentage achieved.
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
