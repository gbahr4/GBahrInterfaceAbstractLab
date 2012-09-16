package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private final double MIN_CREDITS = 0.5;
    private final double MAX_CREDITS = 4.0;
     private String creditErrorMessage = "Error: credits must be in "
            + "the range 0.5 to 4.0";
    public IntroToProgrammingCourse() {
    }

             
    public void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    creditErrorMessage);
            System.exit(0);
        }
        this.credits = credits;
    }

   
}
