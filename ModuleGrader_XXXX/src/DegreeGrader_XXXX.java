import java.util.Scanner;

public class DegreeGrader_XXXX {
   
     public static void main(String[] args) {

    }



    public static void gradeDegree(int modAvg, int ismAvg, int compFail, int outFail) {
       
       
       
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
   
   
        public static void getUserResults() {
       
        int modAvg = 1000;
        int ismAvg = 1000;
        int compFail = 1000;
        int outFail = 1000;
        
        while (outFail <= 0 || outFail >= 11); {
       
        	Scanner outFailInput = new Scanner(System.in); // Create a Scanner object
        	System.out.println("Enter number of number of outright failed modules (0 to 11):");
        	outFail = outFailInput.nextInt(); // Read user input
        }
     
        while (compFail <= 0 || compFail >= 180); {
                   
        	Scanner compFailInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter umber of compensentable failed credits (0 to 180):");
            compFail = compFailInput.nextInt(); // Read user input
                   
        } 
        
        while (ismAvg <= 0 || ismAvg >= 100); {
               
        	Scanner ismAvgInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter ISM average (0 to 100):");
            ismAvg = ismAvgInput.nextInt(); // Read user input
            
        }
               
        while (modAvg <= 0 || modAvg >= 100); {
           
            Scanner modAvgInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter module average (0 to 100):");
            modAvg = modAvgInput.nextInt(); // Read user input
        }

        
       
        gradeDegree(modAvg,ismAvg,compFail,outFail);
       
    }

}

