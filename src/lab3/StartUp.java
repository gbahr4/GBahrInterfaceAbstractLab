
package lab3;


public class StartUp {
    private static String position;
    
    
    
    public static void main(String[] args) {
        
    
    Quarterback quarterback = new Quarterback();
    quarterback.setName("Aaron Rodgers");
    quarterback.setPosition(position);
    
    
    
    
    
        System.out.println("My name is " + quarterback.getName());
        System.out.println("I'm a " + quarterback.getSport() + " player.");
        System.out.println("I play " + quarterback.getPosition());
        System.out.println(quarterback.getAbilities());
    }
}
