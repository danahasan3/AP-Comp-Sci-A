
/**
 * Economics Course
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public class Economics extends Homework{
    public Economics(){
        super();
    }
    
    public void createAssignment(int numPages){
        setNumPages(numPages);
        setType("Economics");
    }
    
    public String toString(){
        return String.format("%s - read %d pages.", getType(), getNumPages());
    }
}
