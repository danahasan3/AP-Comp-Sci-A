
/**
 * Class to create Student objects
 *
 * @author Bhaskar Mishra
 * @version 4/7/2019
 */
public class Student {
    private String name;
    private int[] quizScores;
    
    public Student(String name, int[] quizScores){
        this.name = name;
        this.quizScores = quizScores;
    }
    
    public int getQuiz(int quizNumber){
        return quizScores[quizNumber - 1];
    }
    
    public void setQuiz(int quizNumber, int score){
        quizScores[quizNumber - 1] = score;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String toString(){
        return String.format("%10s%10d%10d%10d%10d%10d", name, quizScores[0], quizScores[1], quizScores[2], quizScores[3], quizScores[4]);
    }
}
