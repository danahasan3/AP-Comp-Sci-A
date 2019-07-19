
/**
 * Trigonometry Course
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public class Trigonometry extends Homework{
    public Trigonometry(){
        super();
    }
    
    public void createAssignment(int numPages){
        setNumPages(numPages);
        setType("Trigonometry");
    }
    
    public String toString(){
        return String.format("%s - read %d pages.", getType(), getNumPages());
    }
}
