package lab1;

import javax.swing.JOptionPane;

/**
 * This class is responsible for the properties and methods of Intro to 
 * Programming.
 * @author      Greg Bahr
 * @version     4.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    
    private double credits;
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4.0;
    private static final String CREDIT_ERROR_MESSAGE = "Error: credits must be "
            + "in the of range 0.5 to 4.0";
    
    public IntroToProgrammingCourse() {
    }
           
    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    CREDIT_ERROR_MESSAGE);
            System.exit(0);
        }
        this.credits = credits;
    }

    public final double getCredits() {
        return credits;
    }
}
