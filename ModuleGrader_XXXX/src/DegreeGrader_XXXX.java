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
       
        int modAvg = 50;
        int ismAvg = 50;
        int compFail = 50;
        int outFail = 5;
       
        do {
           
            do {
       
                do {

                    do {
                        Scanner outFailInput = new Scanner(System.in); // Create a Scanner object
                        System.out.println("Enter number of number of outright failed modules (0 to 11):");
                        outFail = outFailInput.nextInt(); // Read user input
                        //outFailInput.close();
                   
                    } while (outFail <= 0 && outFail >= 11);
                   
                    Scanner ismAvgInput = new Scanner(System.in); // Create a Scanner object
                    System.out.println("Enter umber of compensentable failed credits (0 to 180):");
                    ismAvg = ismAvgInput.nextInt(); // Read user input
                    //ismAvgInput.close();
                   
                } while (compFail <= 0 && compFail >= 180);
               
                Scanner ismAvgInput = new Scanner(System.in); // Create a Scanner object
                System.out.println("Enter ISM average (0 to 100):");
                ismAvg = ismAvgInput.nextInt(); // Read user input
                //ismAvgInput.close();
               
            } while (ismAvg <= 0 && ismAvg >= 100);
           
            Scanner modAvgInput = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter module average (0 to 100):");
            modAvg = modAvgInput.nextInt(); // Read user input
            //modAvgInput.close();
           
        } while (modAvg <= 0 && modAvg >= 100);
       
        gradeDegree(modAvg,ismAvg,compFail,outFail);
       
    }


}

