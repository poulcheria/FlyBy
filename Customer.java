import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
//import javax.imageio.ImageIO;

public class Customer extends User
{
    public String customername;
    public String password;
    public String email;
    public int phonenumber;
    public Date birthdate;
    public String payment_method;
    public String imagePath;    // photo_profile
    public ArrayList<Customer> customerList; //customer list
    public ArrayList<String> locationList;  //loaction filter list
  

    
    public Customer(int user_id, String user_type,String customername,String password,String email,int phonenumber,Date birthdate, String payment_method,String imagePath)
    {
      super(user_id,user_type);
      this.customername=customername;
      this.password=password;
      this.email=email;
      this.phonenumber=phonenumber;
      this.birthdate=birthdate;
      this.payment_method=payment_method;
      this.imagePath=imagePath;
      this.customerList=new ArrayList<Customer>();
      this.locationList=new ArrayList<String>();
    }
    
    public  void customer_Sign_Up() {
                Random rand= new Random();
                int upperbound=100;
                int id = rand.nextInt(upperbound); 
                Date birthdate= new Date();
                
                Scanner newCname = new Scanner(System.in);
                System.out.println("please add your name\n");
                String nCname= newCname.nextLine();
                
                Scanner newCemail = new Scanner(System.in);
                System.out.println("please add your email\n");
                String nCemail= newCemail.nextLine();
                
                Scanner newCphone = new Scanner(System.in);
                System.out.println("please add your phonenumber\n");
                int nCphone= newCphone.nextInt();
                
                Scanner newCpass = new Scanner(System.in);
                System.out.println("please add your password\n");
                String nCpass= newCpass.nextLine();
                
                Scanner newCpay = new Scanner(System.in);
                System.out.println("please add your payment method\n");
                String nCpay= newCpay.nextLine();
                
                Scanner newCimg = new Scanner(System.in);
                System.out.println("please add your profile image file path\n");
                String nCimg= newCimg.nextLine();
                
               Customer newcustomer= new Customer(id,"custormer",nCname,nCpass ,nCemail,nCphone,birthdate,nCpay ,nCimg);
               this.customerList.add(newcustomer);
               System.out.println("You are signed up !\n");
               Rent_a_drone(newcustomer);
    }
    public  void Rent_a_drone(Customer customer){
        System.out.println("RENT A DRONE");
        String loc1="Corfu";
        String loc2="Athens";
        String loc3="Thessaloniki";
        String loc4="Mykonos";
        String loc5="Santorini";
        String loc6="Komotini";
        this.locationList.add(loc1);
        this.locationList.add(loc2);
        this.locationList.add(loc3);
        this.locationList.add(loc4);
        this.locationList.add(loc5);
        this.locationList.add(loc6);
        drone d1=new drone(0,"Corfu" ,50,"model0" ,1000,"720p 30x24fps" ,0,1,0);
        d1.set_droneList(d1);
        Scanner filter = new Scanner(System.in);
        System.out.println("Press 1 for location filter 2 for price range filter\n");
        int filt= filter.nextInt();
        if(filt==1){
            for(int i=0;i<this.locationList.size();i++){
                System.out.println(i+1);
                System.out.println(locationList.get(i) );
                System.out.println("\n");
            } 
            Scanner loc = new Scanner(System.in);
            System.out.println("choose locations from 1 to 6\n");
            int loca= loc.nextInt();
            for(int i=0;i<d1.droneList.size();i++){
                    System.out.println("SELECTED DRONE"); 
                    System.out.println(d1.droneList.get(loca-1).drone_id); 
                    System.out.println(d1.droneList.get(loca-1).price);
                    System.out.println(d1.droneList.get(loca-1).flight_range);
                    System.out.println(d1.droneList.get(loca-1).quality_stream);
                    System.out.println(d1.droneList.get(loca-1).location);
            } 
            
        
        }
        else{}
        
    }
    public void print_customer(Customer customer){
        System.out.print("Customer name: "+ customer.customername+"\n");
        System.out.print("Customer password: "+customer.password+"\n");
        System.out.print("Customer email: "+customer.email+"\n");
        System.out.print("Customer phone number: "+customer.phonenumber+"\n");
        System.out.print("Customer birthdate: "+ customer.birthdate+"\n");
        System.out.print("Customer payment method: "+ customer.payment_method+"\n");
        System.out.print("Customer image path: "+customer.imagePath+"\n");
        
    }
} 
