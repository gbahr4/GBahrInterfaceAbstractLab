
package lab3;

/**
 * Quarterback class
 * @author Greg Bahr
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
    
    public void setResponsibilities() {
        this.responsibilities = responsibilities;
    }
    
    public void setPosition() {
        this.position = position;
    }

     public String getPosition() {
        return position;
    }
     
     public String getResponsibilities() {
        return responsibilities;
    }
}
