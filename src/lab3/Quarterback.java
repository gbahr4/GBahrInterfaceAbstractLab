
package lab3;

/**
 * Quarterback class
 * @author Greg Bahr
 * @version 2.0
 */

public class Quarterback extends FootballPlayer implements Athlete  {
    
    /**
     * name, position, and responsibilities are declared in Quarterback
     * because this class is where these properties are determined for each
     * instantiation
     */
     
    private String name;
    private String position = "quarterback";
    private String responsibilities = "I throw and run the football";
    
    public Quarterback() {
    }
          
    public final String getName() {
        return name;
    }
    
    public final void setName(String name) {
        this.name = name;
    }
    
    public final void setResponsibilities() {
        this.responsibilities = responsibilities;
    }
    
    public final void setPosition() {
        this.position = position;
    }

     public final String getPosition() {
        return position;
    }
     
     public String getResponsibilities() {
        return responsibilities;
    }
}
