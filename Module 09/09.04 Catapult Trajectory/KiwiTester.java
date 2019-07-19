
/**
 * Class to test Kiwi class
 *
 * @author Bhaskar Mishra
 * @version 8/4/2018
 */
public class KiwiTester{
    public static void main(String[] args){
        double[] angles = new double[]{25, 30, 35, 40, 45, 50};
        double[] speeds = new double[]{20, 25, 30, 35, 40, 45, 50};
        
        Kiwi[][] kiwis = new Kiwi[speeds.length][angles.length];
        for(int i = 0; i < speeds.length; i++){
            for(int j = 0; j < angles.length; j++){
                kiwis[i][j] = new Kiwi(speeds[i], angles[j]);
                kiwis[i][j].calcDist();
            }
        }
        
        System.out.println(stringCenter("Projectile Distance (meters)", 70, false));
        System.out.printf("%10s%10s%10s%10s%10s%10s%10s%n", "KPH", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");
        System.out.print(stringRepeated("=", 70, false));
        for(int i = 0; i < speeds.length; i++){
            System.out.printf("%n%10.0f", speeds[i]);
            for(int j = 0; j < angles.length; j++){
                System.out.printf("%10.1f", kiwis[i][j].getDist());
            }
        }
    }
    
    /**
     * Generates a string surrounded by space characters such that the original string is at the center
     * @param str string that needs to be centered
     * @param fieldWidth amount of characters in which the string needs to be centered
     * @param newLine whether or not to add \n character at the end of the string
     * @return string of length fieldWidth with the string str centered in a bunch of space characters
     */
    private static String stringCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        return String.format("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    /**
     * Generates a string with a certain string repeated a certain number of times
     * @param str string that needs to be repeated
     * @param times number of times the string needs to be repeated
     * @param newLine whether or not to print a \n character at the end
     * @return string that consists of the string str repeated times times
     */
    private static String stringRepeated(String str, int times, boolean newLine){
        String s = "";
        for(int i = 0; i < times; i++){
            s += str;
        }
        if(newLine){
            s += "\n";
        }
        return s;
    }
}
