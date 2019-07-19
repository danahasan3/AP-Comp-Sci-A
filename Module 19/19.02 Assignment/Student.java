
/**
 * Implementation class for student data
 *
 * @author Bhaskar Mishra
 * @version 5/11/2019
 */
public class Student{
    private String firstName;
    private String lastName;
    private double[] scores;
    private String grade;
    
    public Student(String firstName, String lastName, double[] scores){
        setFirstName(firstName);
        setLastName(lastName);
        setScores(scores);
        calcGrade(scores);
    }
    
    public void setFirstName(String firstName){
        if(firstName.length() == 0){
            throw new IllegalArgumentException("First name can not be empty");
        }
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        if(lastName.length() == 0){
            throw new IllegalArgumentException("Last name can not be empty");
        }
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setScores(double[] scores){
        if(scores.length == 0){
            throw new IllegalArgumentException("Scores list cannot be empty");
        }
        this.scores = scores;
    }
    
    public double[] getScores(){
        return scores;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }
    
    public String getGrade(){
        return grade;
    }
    
    public void calcGrade(double[] scores){
        if(scores.length == 0){
            throw new IllegalArgumentException("Scores list cannot be empty");
        }
        double average = 0;
        for(double score : scores){
            average += score;
        }
        average /= scores.length;
        if(average < 59.5){
            grade = "F";
        }else if(average < 69.5){
            grade = "D";
        }else if(average < 79.5){
            grade = "C";
        }else if(average < 89.5){
            grade = "B";
        }else{
            grade = "A";
        }
    }
    
    public String toString(){
        String s = String.format("%-10s %-10s - %s:", firstName, lastName, grade);
        for(double score : scores){
            s += String.format("%7.2f", score);
        }
        return s;
    }
}
