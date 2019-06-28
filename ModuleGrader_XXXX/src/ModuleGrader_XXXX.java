import java.util.InputMismatchException;
import java.util.Scanner;

//York University Algorithms and Data Structures - Assignment 1


public class ModuleGrader_XXXX {

    public static void main(String[] args) {

    }

    public static void gradeModule(byte moduleGrade) {
        if (moduleGrade >= 0 && moduleGrade < 40) {
            System.out.println("Outright Fail");
        } else if (moduleGrade >= 40 && moduleGrade < 50) {
            System.out.println("Compensatable Fail");
        } else if (moduleGrade >= 50 && moduleGrade < 60) {
            System.out.println("Satisfactory");
        } else if (moduleGrade >= 60 && moduleGrade < 70) {
            System.out.println("Good");
        } else if (moduleGrade >= 70 && moduleGrade <= 100) {
            System.out.println("Excellent");
        }

    }

    public static void getValidModuleMark(byte markUser) {

        markUser = 101;

        while (markUser > 100 && < 0) {
            Scanner markInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter module mark (0 to 100):");

            try {
                markUser = markInput.nextByte(); // Read user input
            } catch (InputMismatchException e) {
            	System.out.println("Incorrect input type or number out of correct range");
            	markUser = 101;
                markInput.close()

            }

        }
        gradeModule(markUser);
    }


    public static void startModuleGrading() {

        System.out.println("*********** Module Grading Program *********");

        String answerType = "y";
        getValidModuleMark();

        while (!answerType.equals("n")) {
            Scanner answerInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Would you like to continue (y/n)");
            answerType = answerInput.nextLine(); // Read user input

            if (answerType.equals("n")) {
                answerInput.close();
                

            } else if (answerType.equals("y")) {

                getValidModuleMark();
            }
            

        }

    }

}



