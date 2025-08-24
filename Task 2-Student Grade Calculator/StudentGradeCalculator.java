import java.util.Scanner;

public class StudentGradeCalculator {

    
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        
        double[] marks = new double[numSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextDouble();
            totalMarks += marks[i];
        }

       
        double averagePercentage = totalMarks / numSubjects;

        
        String grade = calculateGrade(averagePercentage);

       
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + totalMarks + " / " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}