import java.util.*; 
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;
public class Main
{
    
    
    public static void main(String[]args){
        Date birthdate= new Date();
    
        
        admin admin = new admin(10,"admin" ,"flyby@gmail.com" , "123" , birthdate);
 
        Scanner customer_owner = new Scanner(System.in);
        
        System.out.println("Hello, please choose your user type, press 1 for customer and 2 for owner and 0 for admin\n");
        int Usertype= customer_owner.nextInt();
        Customer customer= new Customer(1,"custormer","anon" ,"anon","anon",0,birthdate,"anon" ,"anon");
        Owner owner= new Owner(1,"Owner","anon" ,"anon","anon",0,birthdate,"anon" ,"anon",null,1);
        if(Usertype==1 ){
            customer.customer_interface(customer);
        }
        else if(Usertype==2 ){
            owner.owner_interface(owner);
        }
        else{
        admin.admin_login();
        }
        
        
    }


    
}
