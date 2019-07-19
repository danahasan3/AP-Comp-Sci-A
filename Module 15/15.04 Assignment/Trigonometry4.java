
/**
 * Trigonometry Course
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public class Trigonometry4 extends Homework4{
    public Trigonometry4(){
        super();
    }
    
    public void createAssignment(int numPages){
        setNumPages(numPages);
        setType("Trigonometry");
    }
    
    public void doHomework(int pages){
        setNumPages(Math.max(getNumPages() - pages, 0));
    }
    
    public String toString(){
        return String.format("%s - read %d pages.", getType(), getNumPages());
    }
}
