
/**
 * Write a description of class Random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Random{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        while(cont){
            int holesInOne = 0;
            for(int i = 0; i < 18; i++){
                int hole = (int)Math.floor(Math.random()*100);
                if(hole < 12){
                    holesInOne++;
                }
                System.out.printf("%02d", hole);
            }
            System.out.println(" " + holesInOne);
            int t = sc.nextInt();
            if(t == 1){
                cont = true;
            }else{
                cont = false;
            }
        }
    }
}
