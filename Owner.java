import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
//import javax.imageio.ImageIO;
public class Owner extends User
{
    public String ownername;
    public String password;
    public String email;
    public int phonenumber;
    public Date birthdate;
    public String payment_method;
    public String imagePath; // photo_profile
    public drone drone;
    public int approveValue;
    public ArrayList<Owner> ownerList;
    
    
    public Owner(int user_id, String user_type,String ownername,String password,String email,int phonenumber,Date birthdate, String payment_method,String imagePath,drone drone,int approveValue)
    {
      super(user_id,user_type);
      this.ownername=ownername;
      this.password=password;
      this.email=email;
      this.phonenumber=phonenumber;
      this.birthdate=birthdate;
      this.payment_method=payment_method;
      this.imagePath=imagePath;
      this.drone=drone;
      this.approveValue=approveValue;
      this.ownerList=new ArrayList<Owner>();  
       }
    public  void owner_Sign_Up()
            {
                Random rand= new Random();
                int upperbound=100;
                int id = rand.nextInt(upperbound); 
                Date birthdate= new Date();
                drone newdrone= new drone(0 ,"." ,0,"." ,0 ,"." ,0,0, 0);
                
                Scanner newOname = new Scanner(System.in);
                System.out.println("please add your name\n");
                String nOname= newOname.nextLine();
                
                Scanner newOemail = new Scanner(System.in);
                System.out.println("please add your email\n");
                String nOemail= newOemail.nextLine();
                
                Scanner newOphone = new Scanner(System.in);
                System.out.println("please add your phonenumber\n");
                int nOphone= newOphone.nextInt();
                
                Scanner newOpass = new Scanner(System.in);
                System.out.println("please add your password\n");
                String nOpass= newOpass.nextLine();
                
                Scanner newOpay = new Scanner(System.in);
                System.out.println("please add your payment method\n");
                String nOpay= newOpay.nextLine();
                
                Scanner newOimg = new Scanner(System.in);
                System.out.println("please add your profile image file path\n");
                String nOimg= newOimg.nextLine();
                
               Owner newowner= new Owner(id,"Owner",nOname,nOpass ,nOemail,nOphone,birthdate,nOpay ,nOimg,newdrone,1);
               this.ownerList.add(newowner);
               System.out.println("You are signed up !\n");
            }
    
}

  

