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
        drone newdrone= new drone(0 ,"." ,0,"." ,0 ,"." ,0,0, 0);
        Customer customer= new Customer(1,"custormer","niki" ,"portopass","nikiporto@gmail.com",2000,birthdate,"card" ,"C:UsersnikiPicturesSaved Pictures");
        Owner owner= new Owner(2,"Owner","poul" ,"poulpass"  ,"poulz@gmail.com",10000,birthdate,"crypto" ,"C:UserspoulcheriaPicturesSaved Pictures",newdrone);
        Scanner customer_owner = new Scanner(System.in);
        System.out.println("Hello, please choose your user type, press 1 for customer and 0 for owner\n");
        int Usertype= customer_owner.nextInt();
        if(Usertype==1 ){
            customer.customer_Sign_Up();
        }
        else{
            owner.owner_Sign_Up();
        }
        
    }


    
}
