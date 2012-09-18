
package lab2;

/**
 * This class is responsible for starting the program.
 * The advantage of using an interface is that because all methods are abstract,
 * no bad code can be inherited. However, the properties and methods must be
 * written for each sub-class.
 * @author Greg Bahr
 * @version 2.0
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        IntroToProgrammingCourse introToProgrammingCourse = new
                IntroToProgrammingCourse();
        introToProgrammingCourse.setCourseName("Intro to Programming");
        introToProgrammingCourse.setCourseNumber("12345");
        introToProgrammingCourse.setCredits(3); 
        
        IntroJavaCourse introJavaCourse = new IntroJavaCourse();
        introJavaCourse.setCourseName("Intro to Java");
        introJavaCourse.setCourseNumber("12346");
        introJavaCourse.setCredits(4);
        
        AdvancedJavaCourse advancedJavaCourse = new AdvancedJavaCourse();
        advancedJavaCourse.setCourseName("Advanced Java");
        advancedJavaCourse.setCourseNumber("12347");
        advancedJavaCourse.setCredits(4);         
        
        System.out.print(introToProgrammingCourse.getCourseName());
        System.out.print("  Course Number: " + 
                introToProgrammingCourse.getCourseNumber());
        System.out.println("  Credits: " + 
                introToProgrammingCourse.getCredits());
        
        System.out.print(introJavaCourse.getCourseName());
        System.out.print("   Course Number: " + 
                introJavaCourse.getCourseNumber());
        System.out.println("  Credits: " + 
                introJavaCourse.getCredits());
        
        System.out.print(advancedJavaCourse.getCourseName());
        System.out.print("   Course Number: " + 
                advancedJavaCourse.getCourseNumber());
        System.out.println("  Credits: " + 
                advancedJavaCourse.getCredits());
        
      
    }
    
}
