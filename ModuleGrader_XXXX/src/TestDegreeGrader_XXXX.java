public class TestDegreeGrader_XXXX {


    public static void main (String[] args) {
        
        DegreeGrader_XXXX Object = new DegreeGrader_XXXX();
        
        Object.gradeDegree(100, 100, 0, 0); // Check - Distinction
       
        Object.gradeDegree(70, 70, 0, 0); // Check - Distinction
        
        Object.gradeDegree(69, 70, 0, 0); // Check - Merit
        Object.gradeDegree(69, 70, 15, 0); // Check - Merit
        Object.gradeDegree(69, 70, 30, 0); // Check - Pass
        Object.gradeDegree(69, 70, 0, 1); // Check - Fail
        Object.gradeDegree(69, 70, 0, 1); // Check - Fail
        Object.gradeDegree(70, 69, 0, 0); // Check - Merit
        Object.gradeDegree(70, 69, 15, 0); // Check - Merit
        Object.gradeDegree(70, 69, 30, 0); // Check - Pass
        Object.gradeDegree(70, 69, 0, 1); // Check - Fail
        Object.gradeDegree(70, 69, 0, 1); // Check - Fail
        
        Object.gradeDegree(60, 60, 0, 0); // Check - Merit
        
        Object.gradeDegree(59, 60, 0, 0); // Check - Pass
        Object.gradeDegree(59, 60, 15, 0); // Check - Pass
        Object.gradeDegree(59, 60, 30, 0); // Check - Pass
        Object.gradeDegree(59, 60, 0, 1); // Check - Fail
        Object.gradeDegree(59, 60, 0, 1); // Check - Fail
        Object.gradeDegree(60, 59, 0, 0); // Check - Pass
        Object.gradeDegree(60, 59, 15, 0); // Check - Pass
        Object.gradeDegree(60, 59, 30, 0); // Check - Pass
        Object.gradeDegree(60, 59, 0, 1); // Check - Fail
        Object.gradeDegree(60, 59, 0, 1); // Check - Fail
        
        Object.gradeDegree(50, 50, 0, 0); // Check - Pass
        
        Object.gradeDegree(49, 50, 0, 0); // Check - Fail
        Object.gradeDegree(49, 50, 15, 0); // Check - Fail
        Object.gradeDegree(49, 50, 30, 0); // Check - Fail
        Object.gradeDegree(49, 50, 0, 1); // Check - Fail
        Object.gradeDegree(49, 50, 0, 1); // Check - Fail
        Object.gradeDegree(50, 49, 0, 0); // Check - Fail
        Object.gradeDegree(50, 49, 15, 0); // Check - Fail
        Object.gradeDegree(50, 49, 30, 0); // Check - Fail
        Object.gradeDegree(50, 49, 0, 1); // Check - Fail
        Object.gradeDegree(50, 49, 0, 1); // Check - Fail

      
        Object.getUserResults(); // Try -10 and 110, -10 and 110, -10 and 190, 1 and 12 - Check prompt is kept for each input
        Object.getUserResults(); // Try 70, 70, 0, 0 - Check - Distinction
        Object.getUserResults(); // Try 60, 70, 0, 0 - Check - Merit
        Object.getUserResults(); // Try 50, 70, 0, 0 - Check - Pass
        Object.getUserResults(); // Try 40, 70, 0, 0 - Check - Fail
        
       
        Object.startDegreeGrading(); // Try 70, 70, 0, 0, 'Y' - Check - Distinction, Re-prompt for next input
        Object.startDegreeGrading(); // Try 60, 70, 0, 0, 'y' - Check - Merit, Re-prompt for next input
        Object.startDegreeGrading(); // Try 50, 70, 0, 0, 'N' - Check - Pass, program exits
        Object.startDegreeGrading(); // Try 40, 70, 0, 0, 'n' - Check - Fail, program exits

        
    }

    
}