
package lab1;


public class StartUp {
    private static String courseName;
    private static String courseNumber;
    
        
    public static void main(String[] args) {
         
        IntroToProgrammingCourse introToProgrammingCourse = new
                IntroToProgrammingCourse();
        introToProgrammingCourse.setCourseName("Intro to Programming");
        introToProgrammingCourse.setCourseNumber("12345");
                        
        IntroJavaCourse introJavaCourse = new IntroJavaCourse();
        introJavaCourse.setCourseName("Intro to Java");
        introJavaCourse.setCourseNumber("12346");
                                        
        AdvancedJavaCourse advancedJavaCourse = new AdvancedJavaCourse();
        advancedJavaCourse.setCourseName("Advanced Java");
        advancedJavaCourse.setCourseNumber("12347");
                
        
        System.out.print(introToProgrammingCourse.getCourseName());
        System.out.println("  Course Number: " + 
                introToProgrammingCourse.getCourseNumber());
        
        System.out.print(introJavaCourse.getCourseName());
        System.out.println("   Course Number: " + 
                introJavaCourse.getCourseNumber());
       
        System.out.print(advancedJavaCourse.getCourseName());
        System.out.println("   Course Number: " + 
                advancedJavaCourse.getCourseNumber());
        
      
    
    }
}