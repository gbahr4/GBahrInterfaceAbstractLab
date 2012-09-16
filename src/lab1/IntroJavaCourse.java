package lab1;


/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private final double MIN_CREDITS = 0.5;
    private final double MAX_CREDITS = 4.0;
     private String creditErrorMessage = "Error: credits must be in "
            + "the range 0.5 to 4.0";
    
    public IntroJavaCourse() {
    }

           
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            System.out.println(creditErrorMessage);
            System.exit(0);
        }
        this.credits = credits;
        
        }
 }
