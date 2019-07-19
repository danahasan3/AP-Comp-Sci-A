
/**
 * AP Computer Science A Course
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public class APCompSci extends Homework{
    public APCompSci(){
        super();
    }
    
    public void createAssignment(int numPages){
        setNumPages(numPages);
        setType("AP Computer Science A");
    }
    
    public String toString(){
        return String.format("%s - read %d pages.", getType(), getNumPages());
    }
}
