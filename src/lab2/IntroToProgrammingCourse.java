package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for the properties and methods of Intro to
 * Programming.
 * @author      Greg Bahr
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    private static final String courseNameErrorMessage = 
            "Error: courseName cannot be null of empty string";
    private static final String courseNumberErrorMessage = "Error: courseNumber"
            + " cannot be null of empty string";
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4.0;
    private static String creditErrorMessage = "Error: credits must be in "
            + "the range 0.5 to 4.0";

    public IntroToProgrammingCourse() {
    }
    
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    courseNumberErrorMessage);
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    creditErrorMessage);
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    courseNameErrorMessage);
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
