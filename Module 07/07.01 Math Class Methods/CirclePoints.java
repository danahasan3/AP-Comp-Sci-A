
/**
 * Generate various points of a circle
 *
 * @author BHASKAR MISHRA
 * @version 7/2/2018
 */

import java.util.Scanner;

public class CirclePoints{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter incremental value: ");
        double increment = sc.nextDouble();
        
        System.out.printf("Points on a Circle with a Radius of %.1f%n", radius);
        System.out.printf("%13s%13s%13s%n", "x", "yPos", "yNeg");
        printRepeated("*", 39, true);
        for(double x = -radius; x <= radius; x += increment){
            System.out.printf("%13.2f%13.2f%13.2f%n", x, yPos(radius, x), -yPos(radius, x));
        }
        
        boolean[][] circle = new boolean[41][19];
        for(int r = 0; r <= 20; r+= 10){
            for(double x = -r; x <=r; x+=0.01){
                circle[(int)Math.round(x + 20)][(int)Math.round((yPos(r, x) + 20)*(8.0/18))] = true;
                circle[(int)Math.round(x + 20)][(int)Math.round((-yPos(r, x) + 20)*(8.0/18))] = true;
            }
        }
        
        System.out.println("\nAnd because I got bored:\n");
        
        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 41; j++){
                if(circle[j][i]){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    // y_pos = sqrt(r^2-x^2)
    private static double yPos(double r, double x){
        return Math.sqrt(Math.pow(r, 2) - Math.pow(x, 2));
    }
    
    private static void printCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    private static void printRepeated(String str, int times, boolean newLine){
        for(int i = 0; i < times; i++){
            System.out.print(str);
        }
        if(newLine){
            System.out.println();
        }
    }
}
