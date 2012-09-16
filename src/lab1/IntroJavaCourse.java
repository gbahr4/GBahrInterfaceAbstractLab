package lab1;

import javax.swing.JOptionPane;


/**
 * This class is responsible for the properties and methods of Intro to Java.
 * @author      Greg Bahr
 * @version     3.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    
    private String prerequisites;
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4.0;
    private static final String creditErrorMessage = "Error: credits must "
            + "be in the range 0.5 to 4.0";
    private static final String prerequisiteErrorMessage = "Error: "
            + "prerequisites cannot be null of empty string";
    
    public IntroJavaCourse() {
    }

           
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    creditErrorMessage);
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            System.out.println(creditErrorMessage);
            System.exit(0);
        }
        this.setCredits(credits);
        
        }
 }
