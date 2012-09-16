
package lab1;

import javax.swing.JOptionPane;


public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String courseNameErrorMessage = 
            "Error: courseName cannot be null of empty string";
    private String courseNumberErrorMessage = "Error: courseNumber cannot "
            + "be null of empty string";
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0){
             JOptionPane.showMessageDialog(null, courseNameErrorMessage);
             System.exit(0);
        } 
        this.courseName = courseName;
    
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null, courseNumberErrorMessage);
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);
    }
           
    
    
    
        
    
