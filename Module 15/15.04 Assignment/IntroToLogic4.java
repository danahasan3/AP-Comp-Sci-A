
/**
 * IntroToLogic Course
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public class IntroToLogic4 extends Homework4{
    public IntroToLogic4(){
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
