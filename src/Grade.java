import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

//        private String courseName; // name of course this GradeBook represents


        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade_counter = 1;

        // processing phase uses counter-controlled repetition
        while (grade_counter <= 10){
            System.out.print("Enter next grade: ");
            int grade = input.nextInt();
            total += grade;
            grade_counter += 1;

            int average = total / 10;

            System.out.printf("\nTotal of all 10 grades is %d\n", total);
            System.out.printf("Class average is %d\n", average);

        }

    }
}
