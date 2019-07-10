import java.util.Scanner;

//York University Algorithms and Data Structures - Assignment 1


public class ModuleGrader_XXXX {

    public static void main(String[] args) {

    }

    public static void gradeModule(int moduleGrade) {
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

    public static void getValidModuleMark() {
       
        int markUser = 50;
       
        do {
            Scanner markInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter module mark (0 to 100):");
            markUser = markInput.nextInt(); // Read user input
            gradeModule(markUser);
        } while (markUser > 100 || markUser < 0);
     
    }
    public static void startModuleGrading() {

        System.out.println("*********** Module Grading Program *********");

        String answerType = "y";
        getValidModuleMark();

        while (!answerType.equals("N")) {
            Scanner answerInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Would you like to continue (Y/N)");
            answerType = answerInput.nextLine().toUpperCase(); // Read user input

            if (answerType.equals("N")) {
             System.out.println("Bye");
             answerInput.close();
               

            } else if (answerType.equals("Y")) {

                getValidModuleMark();
            }
           
        }

    }

}




