
/**
 * Abstract class Homework - Abstract Class for all courses
 *
 * @author Bhaskar Mishra
 * @version 12/16/2018
 */
public abstract class Homework3 implements Processing{
    private int numPages;
    private String type;
    
    public Homework3(){
        this.numPages = 0;
        this.type = "none";
    }
    
    public abstract void createAssignment(int numPages);
    
    public void setNumPages(int numPages){
        this.numPages = numPages;
    }
    
    public int getNumPages(){
        return this.numPages;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
}
