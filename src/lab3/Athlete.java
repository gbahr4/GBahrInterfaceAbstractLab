
package lab3;

/**
 * Athlete interface provides the methods that are common to all athletes, 
 * including football players, so the interface comes before the abstract class.
 * @author Greg Bahr
 */
public interface Athlete {
    
    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setSport();
    public abstract String getSport();
    
}
