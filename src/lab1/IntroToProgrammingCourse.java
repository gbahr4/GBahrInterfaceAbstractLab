package lab1;

import javax.swing.JOptionPane;

/**
 * This class is responsible for the properties and methods of Intro to 
 * Programming.
 * @author      Greg Bahr
 * @version     3.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4.0;
    private static final String creditErrorMessage = "Error: credits must be "
            + "in the of range 0.5 to 4.0";
    
    public IntroToProgrammingCourse() {
    }

             
    public void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    creditErrorMessage);
            System.exit(0);
        }
        this.setCredits(credits);
    }

   
}
