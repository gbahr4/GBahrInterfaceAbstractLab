
package lab3;

 /**
  * @author Greg Bahr
  */

public class StartUp {
        
    public static void main(String[] args) {
        
         Quarterback quarterback = new Quarterback();
         quarterback.setName("Aaron Rodgers");
          
         System.out.println("My name is " + quarterback.getName());
         System.out.println("I'm a " + quarterback.getSport() + " player");
         System.out.println("I play " + quarterback.getPosition());
         System.out.println(quarterback.getResponsibilities());
    }
}
