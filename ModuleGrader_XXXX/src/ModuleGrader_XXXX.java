//York University Algorithms and Data Structures - Assignment 1 - Part A

import java.util.Scanner;

public class ModuleGrader_XXXX {


// gradeModule takes a mark and returns the grade description.

    public void gradeModule(int moduleGrade) {
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
    
// getValidModuleMark takes user keyboard input and passes this to gradeModule.

    public void getValidModuleMark() {
       
        int markUser = 50;
       
        do {
            Scanner markInput = new Scanner(System.in);
            System.out.println("Enter module mark (0 to 100):");
            markUser = markInput.nextInt();
            gradeModule(markUser);
        } while (markUser > 100 || markUser < 0);
     
    }
    
// startModuleGrading calls getValidModuleMark. Provides user keyboard input loop to repeat getValidModuleMark call.

    public void startModuleGrading() {

        System.out.println("*********** Module Grading Program *********");

        String answerType = "y";
        getValidModuleMark();

        while (!answerType.equals("N")) {
            Scanner answerInput = new Scanner(System.in); 
            System.out.println("Would you like to continue (Y/N)");
            answerType = answerInput.nextLine().toUpperCase(); 

            if (answerType.equals("N")) {
             System.out.println("Bye");
             answerInput.close();
               

            } else if (answerType.equals("Y")) {

                getValidModuleMark();
            }
           
        }

    }

}




