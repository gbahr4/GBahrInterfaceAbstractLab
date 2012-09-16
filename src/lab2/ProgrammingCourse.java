
package lab2;

/**
 * This interface sets the contract for the three sub classes.
 * @author Greg Bahr
 * @version 1.0
 */
public interface ProgrammingCourse {
    
    public abstract String getCourseName();
    public abstract void setCourseName(String courseName);
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    public abstract double getCredits();
    public abstract void setCredits(double credits);
    
}
