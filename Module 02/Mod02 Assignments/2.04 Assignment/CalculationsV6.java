
/**
 * The CalculationsV6 class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Bhaskar Mishra
 * @version 06/11/18
 */
public class CalculationsV6{
    public static void main(String[ ] args){
        // Addition
        int addInt1 = 25, addInt2 = 9;
        double addDouble1 = 43.21, addDouble2 = 3.14, addDouble3 = 10.0;
        System.out.println("Addition");
        System.out.println(addInt1 + " + " + addInt2 + " = " + (addInt1 + addInt2));
        System.out.print(addDouble1 + " + " + addDouble2 + " + " + addDouble3 + " = ");
        System.out.println(addDouble1 + addDouble2 + addDouble3);
        System.out.println();
        
        // Subtraction
        int subInt1 = 11, subInt2 = 9, subInt3 = 25;
        double subDouble1 = 3.14, subDouble2 = 10.0;
        System.out.println("Subtraction");
        System.out.print(subInt1 + " - " + subInt2 + " - " + subInt3 + " = ");
        System.out.println(subInt1 - subInt2 - subInt3);
        System.out.println(subDouble1 + " - " + subDouble2 + " = " + (subDouble1 - subDouble2));
        System.out.println();
        
        // Multiplication
        int mulInt1 = 25, mulInt2 = 9;
        double mulDouble1 = 3.14, mulDouble2 = 10.0, mulDouble3 = 10.0;
        System.out.println("Multiplication");
        System.out.println(mulInt1 + " * " + mulInt2 + " = " + (mulInt1 * mulInt2)); 
        System.out.print(mulDouble1 + " * " + mulDouble2 + " * " + mulDouble3 + " = ");
        System.out.println(mulDouble1 * mulDouble2 * mulDouble3);
        System.out.println();
        
        // Division
        int divInt1 = 9, divInt2 = 25;
        double divDouble1 = 43.21, divDouble2 = 10.0;
        System.out.println("Division");
        System.out.println(divInt1 + " / " + divInt2 + " = " + (divInt1 / divInt2));
        System.out.println(divDouble1 + " / " + divDouble2 + " = " + (divDouble1 / divDouble2));
        System.out.println();
        
        // Modulus operator
        int modInt1 = 11, modInt2 = 9;
        double modDouble1 = 10.0, modDouble2 = 3.14;
        System.out.println("Modulus");
        System.out.println(modInt1 + " % " + modInt2 + " = " + (modInt1 % modInt2));
        System.out.println(modDouble1 + " % " + modDouble2 + " = " + (modDouble1 % modDouble2));
        System.out.println();
        
        // 2.03 Additional int Equations
        int newInt1 = 5, newInt2 = 7, newInt3 = 9;
        System.out.println("Additional Int Equations");
        System.out.print(newInt1 + " + " + newInt2 + " - " + newInt3 + " = ");
        System.out.println(newInt1 + newInt2 - newInt3);
        System.out.print(newInt1 + " * " + newInt2 + " % " + newInt3 + " = ");
        System.out.println(newInt1 * newInt2 % newInt3);
        System.out.print(newInt1 + " + " + newInt3 + " / " + newInt2 + " = ");
        System.out.println(newInt1 + newInt3 / newInt2);
        System.out.println();
        
        //2.04 Additional double Equations
        double newDouble1 = 3.14159, newDouble2 = 2.71828, newDouble3 = 1.61803;
        System.out.println("Additional Double Equations");
        System.out.print(newDouble1 + " + " + newDouble2 + " - " + newDouble3 + " = ");
        System.out.println(newDouble1 + newDouble2 - newDouble3);
        System.out.print(newDouble1 + " * " + newDouble2 + " % " + newDouble3 + " = ");
        System.out.println(newDouble1 * newDouble2 % newDouble3);
        System.out.print(newDouble1 + " + " + newDouble3 + " / " + newDouble2 + " = ");
        System.out.println(newDouble1 + newDouble3 / newDouble2);
    }
}
