
/**
 * Class for entries of contacts lists
 *
 * @author Bhaskar Mishra
 * @version 5/8/2019
 */
public class Contact{
    private String name;
    private String relation;
    private String birthday;
    private String phone;
    private String email;
    
    public Contact(String name, String relation, String birthday, String phone, String email){
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    
    public String getRelation(){
        return relation;
    }
    
    public String getBirthday(){
        return birthday;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String toString(){
        return String.format("%-15s%-15s%-18s%-15s%-15s", name, relation, birthday, phone, email);
    }
}
