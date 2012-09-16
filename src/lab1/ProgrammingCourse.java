
package lab1;

import javax.swing.JOptionPane;
/**
 * This abstract class is responsible for the common methods for all three 
 * classes.
 * @author      Greg Bahr
 * @version     3.00
*/

public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private static final String courseNameErrorMessage = 
            "Error: courseName cannot be null of empty string";
    private static final String courseNumberErrorMessage = "Error: courseNumber"
            + " cannot be null of empty string";
    
    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0){
             JOptionPane.showMessageDialog(null, courseNameErrorMessage);
             System.exit(0);
        } 
        this.courseName = courseName;
    
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null, courseNumberErrorMessage);
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);
    }
           
    
    
    
        
    
