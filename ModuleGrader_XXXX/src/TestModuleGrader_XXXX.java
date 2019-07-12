public class TestModuleGrader_XXXX {


    public static void main (String[] args) {
        
        ModuleGrader_XXXX Object = new ModuleGrader_XXXX();
        
        Object.gradeModule(0); // Check - Outright Fail
        Object.gradeModule(39); // Check - Outright Fail
        Object.gradeModule(40); // Check - Compensatable Fail
        Object.gradeModule(49); // Check - Compensatable Fail
        Object.gradeModule(50); // Check - Satisfactory
        Object.gradeModule(59); // Check - Satisfactory
        Object.gradeModule(60); // Check - Good
        Object.gradeModule(69); // Check - Good
        Object.gradeModule(70); // Check - Excellent
        Object.gradeModule(80); // Check - Excellent
        Object.gradeModule(100); // Check - Excellent
        Object.gradeModule(-1); // Check - No output
        Object.gradeModule(101); // Check - No output
        
        
        Object.getValidModuleMark(); // Try -1 - Check while loop parameters - Maintains prompt
        Object.getValidModuleMark(); // Try 101 - Check while loop parameters - Maintains prompt
        Object.getValidModuleMark(); // Try 35 - Check integration with gradeModule - Outright Fail
        Object.getValidModuleMark(); // Try 45 - Check integration with gradeModule - Compensatable Fail
        Object.getValidModuleMark(); // Try 55 - Check integration with gradeModule - Satisfactory
        Object.getValidModuleMark(); // Try 65 - Check integration with gradeModule - Good
        Object.getValidModuleMark(); // Try 75 - Check integration with gradeModule - Excellent
        
        Object.startModuleGrading(); // Try 35, 'Y' - Check outright fail, Re-prompt for next input
        Object.startModuleGrading(); // Try 45, 'y' - Check Compensatable Fail, Re-prompt for next input
        Object.startModuleGrading(); // Try 55, 'N' - Check Satisfactory, program exits
        Object.startModuleGrading(); // Try 65, 'n' - Check Good, program exits
        Object.startModuleGrading(); // Try 75, 'N' - Check Excellent, program exits
       
        
    }

    
}
