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
        else if (a >= 70 && a < 100) {
            System.out.println("Excellent");
        }
        else {
            System.out.println("No valid input");
        }

    }

    public static void getValidModuleMark() {
        Scanner markInput = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter mark:\n");
        int markUser = markInput.nextInt(); // Read user input
        System.out.println("Mark is" + markUser);

    }




}



