
/**
 * IntroToLogic Course
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public class IntroToLogic extends Homework{
    public IntroToLogic(){
        super();
    }
    
    public void createAssignment(int numPages){
        setNumPages(numPages);
        setType("Intro To Logic");
    }
    
    public String toString(){
        return String.format("%s - read %d pages.", getType(), getNumPages());
    }
}
