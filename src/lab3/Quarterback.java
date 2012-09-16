
package lab3;

/**
 *
 * @author Greg
 */
public class Quarterback extends FootballPlayer implements Athlete  {
    
    private String name;
    private String position;
    private String abilities;
    
    public Quarterback() {
    }
    
    
    
    public final String getName() {
        return name;
    }
    
    public final void setName(String name) {
        this.name = name;
    }
    
    public void setAbilities(String abilities) {
        this.abilities = abilities;
        
    }

    
    public void setPosition(String position) {
        this.position = position;
    }

           
}
