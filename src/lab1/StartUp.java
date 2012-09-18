
package lab1;

/**
 * This class is responsible for staring the program.
 * The advantage of using an abstract class is that code for the common 
 * properties and methods could be written once and used in all three sub 
 * classes. However, there is a danger that bad code could be inherited.
 * @author      Greg Bahr
 * @version     4.00
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