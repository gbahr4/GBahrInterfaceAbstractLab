package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for the properties and methods of Advanced Java.
 * @author      Greg Bahr
 * @version     2.0
 */
public class AdvancedJavaCourse implements ProgrammingCourse{
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private static final String COURSE_NAME_ERROR_MESSAGE = 
            "Error: courseName cannot be null of empty string";
    private static final String COURSE_NUMBER_ERROR_MESSAGE = "Error: "
            + "courseNumber cannot be null of empty string";
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4.0;
    private static String creditErrorMessage = "Error: credits must be in "
            + "the range 0.5 to 4.0";
    private static String prerequisiteErrorMessage = "Error: prerequisites "
            + "cannot be null of empty string";

    public AdvancedJavaCourse() {
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    COURSE_NUMBER_ERROR_MESSAGE);
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    creditErrorMessage);
            System.exit(0);
        }
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    prerequisiteErrorMessage);
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    COURSE_NAME_ERROR_MESSAGE);
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
