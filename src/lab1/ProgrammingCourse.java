
package lab1;

import javax.swing.JOptionPane;

/**
 * This abstract class is responsible for the common methods for all three 
 * classes.
 * @author      Greg Bahr
 * @version     4.00
*/

public abstract class ProgrammingCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private static final String COURSE_NAME_ERROR_MESSAGE = 
            "Error: courseName cannot be null of empty string";
    private static final String COURSE_NUMBER_ERROR_MESSAGE = "Error: "
            + "courseNumber cannot be null of empty string";
    
    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0){
             JOptionPane.showMessageDialog(null, COURSE_NAME_ERROR_MESSAGE);
             System.exit(0);
        } 
        this.courseName = courseName;
    
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null, COURSE_NUMBER_ERROR_MESSAGE);
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public abstract double getCredits(); 
       

    public abstract void setCredits(double credits);
}
           
    
    
    
        
    
