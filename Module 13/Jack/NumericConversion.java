import java.util.Scanner;

public class NumericConversion
{
    public static long hexStringDecode(String hex)
    {
        int length;
        short value;
        double sum = 0;
        if (hex.substring(0, 2).equals("0x") || hex.substring(0, 2).equals("0X")){
            length = hex.length() - 2;
            hex = hex.substring(2); //Dropped "0x" in string
        }else{
            length = hex.length();
        }

        for (int x = 0; x < length ; x++)
        {
            char digit = hex.charAt(length - x - 1); //Changed length - x to length - x - 1

            value = hexChardecode(digit);
            System.out.println(value);
            sum = sum + (value * Math.pow(16 , x));
        }
        return (long) sum;
    }

    public static short hexChardecode(char digit)
    {
        short value;
        if (digit == 'a' || digit == 'A')
            value = 10;
        else if (digit == 'b' || digit == 'B')
            value = 11;
        else if (digit == 'c' || digit == 'C')
            value = 12;
        else if (digit == 'd' || digit == 'D')
            value = 13;
        else if (digit == 'e' || digit == 'E')
            value = 14;
        else if (digit == 'f' || digit == 'F')
            value = 15;
        else value = (short) (digit - '0');
        return value;
    }

    public static short binaryStringDecode(String binary)
    {
        int length;
        double sum = 0;

        if (binary.substring(0,2).equals("0b") || binary.substring(0,2).equals("0B"))
            length = binary.length() - 2;
        else
            length = binary.length();
        for (int x = 0; x < length ; x++)
        {
            int value = binary.charAt(length - x);
            sum = value * Math.pow(2 , x);

        }
        return (short) sum;
    }

    public static String binaryToHex (String binary)
    {
        short sum = binaryStringDecode(binary);
        int remainder;
        String hex = "";
        String hexDecimal = "";
        while (sum != 0)
        {
            remainder = sum % 16;
            sum /= 16;

            if (remainder == 10)
                hex = "A";
            else if (remainder == 11)
                hex = "B";
            else if (remainder == 12)
                hex = "C";
            else if (remainder == 13)
                hex = "D";
            else if (remainder == 14)
                hex = "E";
            else if (remainder == 15)
                hex = "F";
            else
                hex = Integer.toString(remainder);

            hexDecimal = hex + hexDecimal;
        }
        return hexDecimal;
    }

    public static void main(String [] args)
    {
        Scanner myScanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit)
        {
            System.out.println("Decoding Menu");
            System.out.println("-------------");
            System.out.println("1. Decode hexadecimal");
            System.out.println("2. Decode binary");
            System.out.println("3. Convert binary to hexadecimal");
            System.out.println("4. Quit" + "\n");

            System.out.print("Please enter an option: ");
            int option = myScanner.nextInt();
            if (option == 1)
            {
                System.out.print("Please enter the numeric string to convert: ");
                String hexDecode = myScanner.next();
                long result = hexStringDecode(hexDecode);
                System.out.println("\n" + "Result: " + result + "\n");
            }
            else if (option == 2)
            {
                System.out.print("Please enter the numeric string to convert: ");
                String binDecode = myScanner.next();
                short result = binaryStringDecode(binDecode);
                System.out.println("\n" + "Result: " + result +"\n");
            }
            else if (option == 3)
            {
                System.out.print("Please enter the numeric string to convert: ");
                String binConvert = myScanner.next();
                String result = binaryToHex(binConvert);
                System.out.println("\n" + "Result: " + result +"\n");
            }
            else
            {
                exit = true;
            }

        }
    }
}


