import java.util.*;
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
    public ArrayList<Integer> priceList;  //price filter list
    public ArrayList<Calendar_custumer> datesList;

    
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
      this.priceList=new ArrayList<Integer>();
      this.datesList=new ArrayList<Calendar_custumer>();
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
        int pr1=50;
        int pr2=150;
        int pr3=500;
        int pr4=1000;
        int pr5=5000;
        int pr6=10000;
        this.priceList.add(pr1);
        this.priceList.add(pr2);
        this.priceList.add(pr3);
        this.priceList.add(pr4);
        this.priceList.add(pr5);
        this.priceList.add(pr6);
        drone d1=new drone(0,"Corfu" ,50,"model0" ,1000,"720p 30x24fps" ,0,1,0 ,1);
        d1.set_droneList(d1);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, +30);
        
        int rent=0;
       while(rent==0){
        Scanner filter = new Scanner(System.in);
        System.out.println("Press 1 for location filter 2 for price range filter\n");
        int filt= filter.nextInt();
        if(filt==1){
            for(int i=0;i<this.locationList.size();i++){
                System.out.println(i+1);
                System.out.println(locationList.get(i) );
            } 
            Scanner loc = new Scanner(System.in);
            System.out.println("choose locations from 1 to 6\n");
            int loca= loc.nextInt();
            for(int i=0;i<d1.droneList.size();i++){
                if(d1.droneList.get(i).location_category==loca){
                    System.out.println("SELECTED DRONE SPECIFICATIONS:"); 
                    System.out.println("Drone ID: "+d1.droneList.get(i).drone_id); 
                    System.out.println("Drone price: "+d1.droneList.get(i).price);
                    System.out.println("Drone price: "+d1.droneList.get(i).flight_range);
                    System.out.println("Drone quality stream: "+d1.droneList.get(i).quality_stream);
                    System.out.println("Drone location: "+d1.droneList.get(i).location);
                }
            } 
            
        
        }
        else{
            for(int i=0;i<this.priceList.size();i++){
                System.out.println(i+1);
                System.out.println("Price range under:" +priceList.get(i)+ " euros" );
                System.out.println("\n");
            } 
            Scanner price = new Scanner(System.in);
            System.out.println("choose price ranges from 1 to 6\n");
            int pr= price.nextInt();
            for(int i=0;i<d1.droneList.size();i++){
                
                if(d1.droneList.get(i).price_category==pr){
                    System.out.println("SELECTED DRONE SPECIFICATIONS:"); 
                    System.out.println("Drone ID: "+d1.droneList.get(i).drone_id); 
                    System.out.println("Drone price: "+d1.droneList.get(i).price);
                    System.out.println("Drone flight range: "+d1.droneList.get(i).flight_range);
                    System.out.println("Drone quality stream: "+d1.droneList.get(i).quality_stream);
                    System.out.println("Drone location: "+d1.droneList.get(i).location);
                }
                }
            
    
            }
        Scanner datee = new Scanner(System.in);
        System.out.println("Would you like to set a date for this drone? yes(1) ,no(0)");
        int date= datee.nextInt();
        if(date==1){
            System.out.println("Available date:"+ calendar.getTime());
            Scanner rentt = new Scanner(System.in);
            System.out.println("If you would like to Rent press 1 if you would like to check out other drones or log out press 0");
            int re= rentt.nextInt();
            if (re==1){
                Calendar_custumer cal= new Calendar_custumer(customer,calendar);
                datesList.add(cal);
                System.out.println("RENTING COMPLETE!");
                break;
            }
            else{
                Scanner leave = new Scanner(System.in);
                System.out.println("Press 1 if you would like to log out ,0 if you would like to check out other drones");
                int le= leave.nextInt();
                if (le==1){
                    System.exit(0);
                 }
                
            }
            
        
        
        
        }
        else{
                Scanner leav = new Scanner(System.in);
                System.out.println("Press 1 if you would like to log out ,0 if you would like to check out other drones");
                int lea= leav.nextInt();
                if (lea==1){
                    System.exit(0);
                 }
                
            }
      }
    }
}
