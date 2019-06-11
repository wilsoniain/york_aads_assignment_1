import java.util.InputMismatchException;
import java.util.Scanner;

//York University Algorithms and Data Structures - Assignment 1


public class ModuleGrader_XXXX {

    public static void main(String[] args) {

    }

    public static void gradeModule(int a) {
        if (a >= 0 && a < 40) {
            System.out.println("Outright Fail");
        }
        else if (a >= 40 && a < 50) {
            System.out.println("Compensatable fail");
        }
        else if (a >= 50 && a < 60) {
            System.out.println("Satisfactory");
        }
        else if (a >= 60 && a < 70) {
            System.out.println("Good");
        }
        else if (a >= 70 && a <= 100) {
            System.out.println("Excellent");
        }

    }

    public static void getValidModuleMark() {

        int markUser = 101;

        while (markUser > 100) {
            Scanner markInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter mark (0 to 100):");

            try {
                markUser = markInput.nextInt(); // Read user input
            }
            catch (InputMismatchException e) {
                markUser = 101;

            }
        }
        gradeModule(markUser);

    }

}



