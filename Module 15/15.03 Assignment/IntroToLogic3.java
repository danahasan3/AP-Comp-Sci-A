
/**
 * IntroToLogic Course
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public class IntroToLogic3 extends Homework3{
    public IntroToLogic3(){
        super();
    }
    
    public void createAssignment(int numPages){
        setNumPages(numPages);
        setType("Intro To Logic");
    }
    
    public void doHomework(int pages){
        setNumPages(Math.max(getNumPages() - pages, 0));
    }
    
    public String toString(){
        return String.format("%s - read %d pages.", getType(), getNumPages());
    }
}
