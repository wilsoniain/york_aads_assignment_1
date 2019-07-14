//York University Algorithms and Data Structures - Assignment 1 - Part B

import java.util.Scanner;

public class DegreeGrader_XXXX {
    
// gradeDegree takes degree marks and returns the degree grade description.
   
    public void gradeDegree(int modAvg, int ismAvg, int compFail, int outFail) {
       
       
        if (modAvg >= 70 && ismAvg >= 70 && compFail == 0 && outFail == 0) {
            System.out.println("Distinction");
        } else if (modAvg >= 60 && ismAvg >= 60 && compFail <= 15 && outFail == 0) {
            System.out.println("Merit");
        } else if (modAvg >= 50 && ismAvg >= 50 && compFail <= 30 && outFail == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
   
// getUserResults takes user keyboard input and passes this to gradeDegree. Provides against invalid (out of range) user input.
   
    public void getUserResults() {
       
        int modAvg = 1000;
        int ismAvg = 1000;
        int compFail = 1000;
        int outFail = 1000;
        
        while (modAvg < 0 || modAvg > 100) {
           
            Scanner modAvgInput = new Scanner(System.in);
            System.out.println("Enter module average (0 to 100):");
            modAvg = modAvgInput.nextInt();
        }
        
        while (ismAvg < 0 || ismAvg > 100) {
               
        	Scanner ismAvgInput = new Scanner(System.in);
            System.out.println("Enter ISM average (0 to 100):");
            ismAvg = ismAvgInput.nextInt();
            
        }

     
        while (compFail < 0 || compFail > 180) {
                   
        	Scanner compFailInput = new Scanner(System.in);
            System.out.println("Enter number of compensentable failed credits (0 to 180):");
            compFail = compFailInput.nextInt();
                   
        } 
        
        while (outFail < 0 || outFail > 11) {
       
        	Scanner outFailInput = new Scanner(System.in);
        	System.out.println("Enter number of number of outright failed modules (0 to 11):");
        	outFail = outFailInput.nextInt();
        }
       
        gradeDegree(modAvg,ismAvg,compFail,outFail);
       
    }
    
// startDegreeGrading calls getUserResults. Provides user keyboard input loop to repeat getUserResults call.   

    public void startDegreeGrading() {

        System.out.println("*********** Degree Classification Program *********");

        String answerType = "y";
        getUserResults();

        while (!answerType.equals("N")) {
            Scanner answerInput = new Scanner(System.in);
            System.out.println("Would you like to continue (Y/N)");
            answerType = answerInput.nextLine().toUpperCase();

            if (answerType.equals("N")) {
             System.out.println("Bye");
             answerInput.close();
               

            } else if (answerType.equals("Y")) {

                getUserResults();
            }
           
        }

    }

}

