package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for the properties and methods of Intro to Java.
 * @author      Greg Bahr
 * @version     2.0
 */
public class IntroJavaCourse implements ProgrammingCourse {
    
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
    private static final String CREDIT_ERROR_MESSAGE = "Error: credits must be "
            + "in the range 0.5 to 4.0";
    private static final String PREREQUISITE_ERROR_MESSAGE = "Error: "
            + "prerequisites cannot be null of empty string";

    public IntroJavaCourse() {
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
                    CREDIT_ERROR_MESSAGE);
            System.exit(0);
        }
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    PREREQUISITE_ERROR_MESSAGE);
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

     public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    COURSE_NAME_ERROR_MESSAGE);
            System.exit(0);
        }
        this.courseName = courseName;
    }
     
     public final String getCourseName() {
        return courseName;
    }
}
