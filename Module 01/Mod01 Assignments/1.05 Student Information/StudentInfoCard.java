/**
 * Purpose: Display general information about me in the console.
 *
 * @author Bhaskar Mishra
 * @version 6/11/2018
 */
public class StudentInfoCard {
    public static void main(String[] args){
        //This is the horizontal length of my student information card in characters.
        final int SCL = 86;
        
        printRepeated("*", SCL, true);
        
        System.out.print("*");
        printRepeated(" ", SCL - 2, false);
        System.out.println("*");
        
        System.out.print("*");
        printRepeated(" ", (SCL - 20)/2, false);
        System.out.print("Student Information");
        printRepeated(" ", (SCL - 20)/2 - 1, false);
        System.out.println("*");
        
        System.out.print("*");
        printRepeated(" ", SCL - 2, false);
        System.out.println("*");
        
        printRepeated("*", SCL, true);
        
        System.out.println();
        
        System.out.print("Name: Bhaskar Mishra\t");
        System.out.print("Birthday: April 13, 2001    ");
        System.out.print("Age: 17\t");
        System.out.println("Grade:12th\n");
        
        System.out.println("City: Pembroke Pines, FL");
        System.out.println("School: West Broward High School\n");
        
        System.out.println("Email: bdsmishra@gmail.com, best way to contact me\n");
        
        System.out.println("Mom's contact information");
        System.out.println("Cell Phone: 754-226-7916, call anytime");
        System.out.println("Email: shashimishra@live.ca\n");
        
        System.out.println("Highest Math Class Completed: AP Calculus BC");
        System.out.println("Currently Taking (Online): AP Statistics");
        System.out.println("Math Classes For 2018-2019:\n\t-Linear Algebra\n\t-Differential Equations\n\t-Calculus III\n");
        
        System.out.println("Programming Experience:\n\t-Have been programming since 3rd grade\n\t-Have experience in Java, C#, C++, Python, and various other languages\n\t-Have published two apps to Android and iOS\n");
        
        System.out.println("I am taking APCS because it seems like a fairly easy AP class to take over the summer\n");
        
        printRepeated("*", SCL, false);
    }
    
    //Prints the string str n times. If newLine is set to true, it will print a new line at the end.
    private static void printRepeated(String str, int n, boolean newLine){
        for(int i = 0; i < n; i++){
            System.out.print(str);
        }
        if(newLine){
            System.out.println();
        }
    }
}
