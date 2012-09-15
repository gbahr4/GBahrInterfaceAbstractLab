
package lab1;


public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public abstract void setCourseNumber(String CourseNumber);
    

    public final double getCredits() {
        return credits;
    }
    
    public abstract void setCredits(double credits);
    
        
    public final String getCourseName() {
        return courseName;
    }
}