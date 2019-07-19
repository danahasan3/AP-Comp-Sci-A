/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);
        System.out.println();
        
        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "        Bhaskar has a little brother        ";
        System.out.println("sample = \"" + sample + "\"");
        System.out.println();
        
        //    trim()
        String trimmed = sample.trim();
        System.out.println("sample.trim() = \"" + trimmed + "\"\n");
        
        //    length()
        System.out.println("sample.length() = " + sample.length() + "\n");
        
        //    indexOf with one and two parameters
        System.out.println("sample.indexOf(\"has\") = " + sample.indexOf("has"));
        System.out.println("sample.indexOf(\"has\", 12) = " + sample.indexOf("has", 12) + "\n");
        
        //    substring() with one and two parameters
        System.out.println("sample.substring(8) = \"" + sample.substring(8) + "\"");
        System.out.println("sample.substring(8, 36) = \"" + sample.substring(8, 36) + "\"\n");
        
        //    compareTo()
        System.out.println("sample.compareTo(\"        Dhaskar has a little brother        \") = " + sample.compareTo("        Dhaskar has a little brother        "));
        //    any other String methods you'd like to try

    }

}
