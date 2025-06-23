import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int subjects = 3;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += sc.nextInt();
        }

        double avg = total / (double)subjects;
        char grade;

        if (avg >= 80) grade = 'A';
        else if (avg >= 60) grade = 'B';
        else if (avg >= 40) grade = 'C';
        else grade = 'F';

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
