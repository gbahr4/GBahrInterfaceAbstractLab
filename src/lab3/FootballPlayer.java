
package lab3;

/**
 *
 * @author Greg
 */
public abstract class FootballPlayer implements Athlete {
      
    private final String sport = "football";
    private String position;
    private String abilities;

    public final String getSport() {
        return sport;
    }
    
    public final void setSport() {
        System.out.print(sport);
        
    }      
    public final String getPosition() {
        return position;
    }

    public abstract void setPosition(String position);    
   

    public final String getAbilities() {
        return abilities;
    }
    
    public abstract void setAbilities(String abilities);
    
       
}
