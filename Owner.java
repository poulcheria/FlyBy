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
       public void owner_interface(Owner owner){
        System.out.println("Press 1 for Sing up and 2 for Log in");
        Scanner silo = new Scanner(System.in);
        int sl= silo.nextInt();
        if(sl==1){
        owner_Sign_Up();
        owner_login(owner);
        }
        else{
            owner_login(owner);
        }
        
        }
       public void owner_login(Owner owner){
       drone d1=new drone(0,"Corfu" ,50,"model0" ,1000,"720p 30x24fps" ,0,1,0 ,1,0,1);
       Customer newcustomer= new Customer(67,"custormer","fg","fg","dfdrg",65,birthdate,"yfghj" ,"fth");
       history h1=new history(d1,"Corfu",10,9 ,newcustomer,birthdate ,1,owner ,0,1,0 ,"path");
       Owner owner1= new Owner(1,"Owner","poul" ,"poulzpass"  ,"poulz@gmail.com",10000,birthdate,"crypto" ,"C:UserspoulcheriaPicturesSaved Pictures",null,1);
       Owner owner2= new Owner(2,"Owner","nikos" ,"nikospass"  ,"nir@gmail.com",10000,birthdate,"crypto" ,"C:UserspPicturesSaved Pictures",null,1);
       Owner owner3= new Owner(3,"Owner","porto" ,"nikipass"  ,"np@gmail.com",10000,birthdate,"card" ,"C:UserspotPicturesSaved Pictures",null,1);
       Owner owner4= new Owner(4,"Owner","pandhs" ,"taspass"  ,"tp@gmail.com",10000,birthdate,"card" ,"C:UsersptasPicturesSaved Pictures",null,1);
        
        
       this.ownerList.add(owner1);
       this.ownerList.add(owner2);
       this.ownerList.add(owner3);
       this.ownerList.add(owner4);
       
        System.out.println("Log in as Owner insert id:");
         Scanner code = new Scanner(System.in);
         int co= code.nextInt();
        for(int i=0;i<owner.ownerList.size();i++){
          if(owner.ownerList.get(i).user_id==co)
            {
            System.out.println("\nChoose options: \n1. Drone Registration\n2. Edit Drone\n3. Browze Histroty\n4. Leave");
            Scanner opt = new Scanner(System.in);
            int op= opt.nextInt();
            if(op==1){ 
                drone_registration(owner);
            }
            else if(op==2){
                d1.edit_drone();
            }
            else if(op==3){
                h1.browse_history();
            }
            else{
            System.exit(0);
            }
        
        
        }
        else{
             System.out.println("ID incorrect try again");
            owner_login(owner);
        }
    }
}
    public  void owner_Sign_Up()
            {
                Random rand= new Random();
                int upperbound=100;
                int id = rand.nextInt(upperbound); 
                Date birthdate= new Date();
                drone newdrone= new drone(0," ." ,50," m" ,2," g", 0, 1,1,1,1,1);
                
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
    

    public void drone_registration(Owner owner){
        if(owner.approveValue==1){
            System.out.println("DRONE REGISTRATION");
            
            Random rand= new Random();
            int upperbound=100;
            int id = rand.nextInt(upperbound); 
            
            Scanner model = new Scanner(System.in);
            System.out.println("please add your drone's model\n");
            String mode= model.nextLine();
                
            Scanner range = new Scanner(System.in);
            System.out.println("please add your drone's range\n");
            float rang= range.nextInt();
                
            Scanner streamq = new Scanner(System.in);
            System.out.println("please add your drone's stream quality\n");
            String stream= streamq.nextLine();
            
            Scanner location = new Scanner(System.in);
            System.out.println("please add your drone's location\n");
            String loc= location.nextLine();
            
            Scanner price = new Scanner(System.in);
            System.out.println("please add your drone's price\n");
            float pri= price.nextInt();
            drone drone=new drone(id,loc,pri,mode,rang,stream,0,1,0,1,1,0);
            try{
            drone.set_droneList(drone);
            }
            catch(FlybyException ex){
         
            }
            System.out.println("DRONE REGISTRATION COMPLETE!");
                
        }
        
        
    
    
    }
}
  

