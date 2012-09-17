
package lab3;

/**
 * FootballPlayer abstract class
 * @author Greg Bahr
 */
public abstract class FootballPlayer implements Athlete {
    
  /**
    * sport is declared in FootballPlayer because all positions share 
    * this property
    */
    private String sport = "football";


  /** 
    * getSport method is concrete and final because it will always return 
    * the same value
    */
    public final String getSport() {
        return sport;
    }
    
   /**
    * setSport method is concrete and final because the sport will always 
    * be football
    */
    public final void setSport() {
        this.sport = sport;
        
    }      
    
   /** 
    * setPosition method is abstract because a player can play more than
    * one position.
    */
    public abstract void setPosition();    
   
    /**
     * setResponsibilities position is abstract because certain players who
     * play the same position may have different responsibilities.
     */
    public abstract void setResponsibilities();
    
       
}
