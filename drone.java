
import java.util.*;
public class drone
{
  public int drone_id;
  public String location;
  public float price;
  public String model;
  public float flight_range;
  public String quality_stream;
  public int flagged_drones;
  public int location_category;
  public int owner_id;
  public int price_category;
  public int inspected;
  public int approved;
  public ArrayList<drone> droneList;
  
  public drone(int drone_id,String location,float price,String model,float flight_range,String quality_stream, int flagged_drones, int location_category,int price_category,int owner_id,int inspected,int approved){
     this.drone_id=drone_id;
     this.location=location;
     this.price=price;
     this.model=model;
     this.flight_range=flight_range;
     this.quality_stream=quality_stream;
     this.flagged_drones=flagged_drones;
     this.location_category=location_category;
     this.owner_id=owner_id;
     this.inspected=inspected;
     this.approved=approved;
     this.droneList=new ArrayList<drone>();
    }
  public void set_droneList(drone drone) throws FlybyException{
      if(this.droneList.contains(drone)){   //ελέγχω αν το αντικελιμενο που θέλω να προσθέσω υπάρχει ήδη στη λίστα 
          throw new FlybyException("Item already exists"); //χρησιμοποιώ κλάση εξαίρεσης αν το αντικείμενο υπα΄ρχει ήδη στη λίστα
        }
        else{                   //αν δεν υπάρχει το προσθέτω στη λίστα
            this.droneList.add(drone);
        }
      
    
    }
   public void print_drone(drone drone){
        System.out.print("Drone id: "+ drone.drone_id+"\n");
        System.out.print("Drone location: "+drone.location+"\n");
        System.out.print("Drone price: "+drone.price+"\n");
        System.out.print("Drone model: "+drone.model+"\n");
        System.out.print("Drone flight range: "+drone.flight_range+"\n");
        System.out.print("Drone quality stream: "+ drone.quality_stream+"\n");
        System.out.print("Drone flagged drones: "+ drone.flagged_drones+"\n");
        System.out.print("Drone owner id: "+drone.owner_id+"\n");
        System.out.print("Drone location category: "+ drone.location_category+"\n");
    }
   public  void edit_drone() {
      drone newdrone=new drone(0,".",0,".",0,".",0,0,0,1,1,1); 
      
      System.out.println("Welcome to edit drone page \n");  
      Scanner edit = new Scanner(System.in);
      newdrone.print_drone(newdrone);
      System.out.println("Choose which value you will like to change:\n"+"location(1)\n"+"price(2)\n"+"model(3)\n"+"flight_range(4)\n"+"quality_stream(5)\n"+"flagged_drones(6)\n"+"location_category(7)\n");     
      String nedit= edit.nextLine();
      int int_edit = Integer.parseInt(nedit);
    
      if (int_edit==1){ 
        Scanner loc = new Scanner(System.in);
        System.out.println("Type the new location");     
        String loca= loc.nextLine();
        newdrone.location=loca;
        newdrone.print_drone(newdrone);
      }
      else if(int_edit==2){
        Scanner pr = new Scanner(System.in);
        System.out.println("Type the new price");     
        String nprice= pr.nextLine();
        float price = Float.parseFloat(nprice);
        newdrone.price=price;
        newdrone.print_drone(newdrone);
    
        
        
        }
      else if(int_edit==3){
        Scanner m = new Scanner(System.in);
        System.out.println("Type the new model");     
        String model= m.nextLine();
        newdrone.model=model;
        newdrone.print_drone(newdrone);
        }
      else if(int_edit==4){
        Scanner fr = new Scanner(System.in);
        System.out.println("Type the new flight range");     
        String flightr= fr.nextLine();
        float nflightr = Float.parseFloat(flightr);
        newdrone.flight_range=nflightr;
        newdrone.print_drone(newdrone);
          
        }
      else if(int_edit==5){
        Scanner qs = new Scanner(System.in);
        System.out.println("Type the new lquality stream");     
        String quas= qs.nextLine();
        newdrone.quality_stream=quas;
        newdrone.print_drone(newdrone);
        }
      else if(int_edit==6){
        Scanner fv = new Scanner(System.in);
        System.out.println("Type the new flag value");     
        String flagv= fv.nextLine();
        int flag = Integer.parseInt(flagv);
        newdrone.flagged_drones=flag;
        newdrone.print_drone(newdrone);
    
        }
      else if(int_edit==7){
        Scanner lc = new Scanner(System.in);
        System.out.println("Type the new location category");     
        String lcat= lc.nextLine();
        int locat = Integer.parseInt(lcat);
        newdrone.location_category=locat;
        newdrone.print_drone(newdrone);
        }
    
    
    }

}
