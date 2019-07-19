
/**
 * Tester class for Contact class
 *
 * @author Bhaskar Mishra
 * @version 5/8/2019
 */
public class Tester{
    public static void main(String[] args){
        Contact[] contacts = new Contact[10];
        contacts[0] = new Contact("Bhaskar", "Me", "April 13", "954-997-3919", "bdsmishra@gmail.com");
        contacts[1] = new Contact("Shashi", "Mother", "July 5", "754-226-0735", "shashimishra@live.ca");
        contacts[2] = new Contact("Diwakar", "Father", "March 15", "305-986-7916", "dmishra@live.ca");
        contacts[3] = new Contact("Jay", "Pet Peacock", "September 9", "987-654-3210", "jaypeacock@gmail.com");
        contacts[4] = new Contact("Cheesecake", "Food", "Long time ago", "101-010-1010", "bestcake@gmail.com");
        contacts[5] = new Contact("Gulab Jamun", "Food", "Longer time ago", "333-333-3333", "indiansweet@gmail.com");
        contacts[6] = new Contact("Ash", "Friend", "March 18", "777-777-7777", "gottacatchthemall@gmail.com");
        contacts[7] = new Contact("Alan", "Cool Dude", "June 23", "110-011-0110", "turingtest@gmail.com");
        contacts[8] = new Contact("Fibonacci", "Cool Dude", "Unknown", "112-358-1321", "goldenratio@gmail.com");
        contacts[9] = new Contact("Bob", "Friend", "April 13", "000-000-0000", "notimaginary@gmail.com");
        
        System.out.println();
        
        System.out.println("Original:");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        printContacts(contacts);
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Name, \"Alan\" (Binary Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        sortByName(contacts);
        findName(contacts, "Alan");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Name, \"Reynolds\" (Binary Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        sortByName(contacts);
        findName(contacts, "Reynolds");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Relation, \"Food\" (Binary Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        sortByRelation(contacts);
        findRelation(contacts, "Food");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Relation, \"Uncle\" (Binary Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        sortByRelation(contacts);
        findRelation(contacts, "Uncle");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Birthday, \"Mar\" (Sequential Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        findBirthday(contacts, "Mar");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Birthday, \"Dec\" (Sequential Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        findBirthday(contacts, "Dec");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Phone, \"333-333-3333\" (Sequential Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        findPhone(contacts, "333-333-3333");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Phone, \"999-999-9999\" (Sequential Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        findPhone(contacts, "999-999-9999");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Email, \"bdsmishra@gmail.com\" (Sequential Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        findEmail(contacts, "bdsmishra@gmail.com");
        printRepeated("-", 90, true);
        System.out.println();
        
        System.out.println("Search For Email, \"asdf@gmail.com\" (Sequential Search):");
        printRepeated("-", 90, true);
        System.out.printf("%-15s%-15s%-18s%-15s%-15s%n", "NAME", "RELATION", "BIRTHDAY", "PHONE NUMBER", "EMAIL");
        printRepeated("-", 90, true);
        findEmail(contacts, "asdf@gmail.com");
        printRepeated("-", 90, true);
        System.out.println();
    }
    
    private static void printContacts(Contact[] contacts){
        for(int i = 0; i < contacts.length; i++){
            System.out.println(contacts[i].toString());
        }
    }
    
    public static void sortByName(Contact[] contacts){
        for(int i = contacts.length - 1; i >= 0; i--){
            int posMax = 0;
            for(int k = 0; k <= i; k++){
                if(contacts[k].getName().compareTo(contacts[posMax].getName()) > 0){
                    posMax = k;
                }
            }
            Contact temp = contacts[i];
            contacts[i] = contacts[posMax];
            contacts[posMax] = temp;
        }
    }
    
    public static void sortByRelation(Contact[] contacts){
        for(int i = contacts.length - 1; i >= 0; i--){
            int posMax = 0;
            for(int k = 0; k <= i; k++){
                if(contacts[k].getRelation().compareTo(contacts[posMax].getRelation()) > 0){
                    posMax = k;
                }
            }
            Contact temp = contacts[i];
            contacts[i] = contacts[posMax];
            contacts[posMax] = temp;
        }
    }
    
    public static void findName(Contact[] contacts, String name){
        int high = contacts.length;
        int low = -1;
        
        while(high - low > 1){
            int mid = (high + low)/2;
            if(contacts[mid].getName().compareTo(name) > 0){
                high = mid;
            }else{
                low = mid;
            }
        }
        
        if(low >= 0 && contacts[low].getName().compareTo(name) == 0){
            System.out.println(contacts[low]);
        }else{
            System.out.println(name + " not found");
        }
    }
    
    public static void findRelation(Contact[] contacts, String relation){
        int high = contacts.length;
        int low = -1;
        
        while(high - low > 1){
            int mid = (high + low)/2;
            if(contacts[mid].getRelation().compareTo(relation) > 0){
                high = mid;
            }else{
                low = mid;
            }
        }
        
        if(low >= 0 && contacts[low].getRelation() == relation){
            linearPrint(contacts, low, relation);
        }else{
            System.out.println(relation + " not found");
        }
    }
    
    public static void linearPrint(Contact[] contacts, int index, String relation){
        int start = index, end = index;
        
        while(start > 0 && contacts[start - 1].getRelation().compareTo(relation) == 0){
            start--;
        }
        
        while(end + 1 < contacts.length && contacts[end + 1].getRelation().compareTo(relation) == 0){
            end++;
        }
        
        for(int i = start; i <= end; i++){
            System.out.println(contacts[i]);
        }
    }
    
    public static void findBirthday(Contact[] contacts, String month){
        boolean found = false;
        for(int i = 0;i < contacts.length; i++){
            if(contacts[i].getBirthday().substring(0, month.length()).compareTo(month) == 0){
                System.out.println(contacts[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println(month + " not found");
        }
    }
    
    public static void findPhone(Contact[] contacts, String phone){
        boolean found = false;
        for(int i = 0;i < contacts.length; i++){
            if(contacts[i].getPhone().compareTo(phone) == 0){
                System.out.println(contacts[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println(phone + " not found");
        }
    }
    
    public static void findEmail(Contact[] contacts, String email){
        boolean found = false;
        for(int i = 0;i < contacts.length; i++){
            if(contacts[i].getEmail().compareTo(email) == 0){
                System.out.println(contacts[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println(email + " not found");
        }
    }
    
    /**
     * Prints string surrounded by space characters such that the original is at the center
     * @param str string that needs to be centered
     * @param fieldWidth amount of characters in which the string needs to be centered
     * @param newLine whether or not to add \n character at the end of the string
     */
    private static void printCenter(String str, int fieldWidth, boolean newLine){
        int rightAlign = (int)(Math.floor(fieldWidth/2) + Math.ceil(str.length()/2));
        System.out.printf("%" + rightAlign + "s%" + (fieldWidth - rightAlign) + "s" + (newLine ? "%n" : ""), str, "");
    }
    
    /**
     * Prints a certain string repeatedly
     * @param str string that needs to be repeated
     * @param times number of times the string needs to be repeated
     * @param newLine whether or not to print a \n character at the end
     */
    private static void printRepeated(String str, int times, boolean newLine){
        for(int i = 0; i < times; i++){
            System.out.print(str);
        }
        if(newLine){
            System.out.println();
        }
    }
}
