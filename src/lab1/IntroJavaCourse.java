package lab1;

import javax.swing.JOptionPane;


/**
 * This class is responsible for the properties and methods of Intro to Java.
 * @author      Greg Bahr
 * @version     4.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    
    private double credits;
    private String prerequisites;
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4.0;
    private static final String CREDIT_ERROR_MESSAGE = "Error: credits must "
            + "be in the range 0.5 to 4.0";
    private static final String PREREQUISITE_ERROR_MESSAGE = "Error: "
            + "prerequisites cannot be null of empty string";
    
    public IntroJavaCourse() {
    }

           
    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    CREDIT_ERROR_MESSAGE);
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            System.out.println(CREDIT_ERROR_MESSAGE);
            System.exit(0);
        }
        this.credits = credits;
        
    }
    
    public final double getCredits() {
        return credits;
    }
 }
