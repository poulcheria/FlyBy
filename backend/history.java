import java.util.Date;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class history
{
  public drone drone;
  public String location;
  public Customer customer;
  public Date date;
  public int time;
  public Owner owner;
  public int flight_id;
  public int photo_id;
  public int payment_id;
  public int price;
  public float rating;
  public String flight_path;
  public ArrayList<history> historyList;
  
  public history( drone drone,String location,int price ,float rating,Customer customer,Date date, int time,Owner owner,int flight_id,int photo_id,int payment_id,String flight_path){
     this.drone=drone;
     this.location=location;
     this.owner=owner;
     this.payment_id=payment_id;
     this.photo_id=photo_id;
     this.customer=customer;
     this.date=date;
     this.time=time;
     this.price=price;
     this.rating=rating;
     this.flight_id=flight_id;
     this.flight_path=flight_path;
     this.historyList=new ArrayList<history>();
    }
  public void set_historyList(history history){
      this.historyList.add(history);
    
    }
  public void browse_history(){
    Date birthdate= new Date();
    //LocalTime  time = new LocalTime();
    drone newdrone= new drone(0," ." ,50," m" ,2," g", 0, 1,1,1,1,1);
    Owner newowner= new Owner(55,"Owner","name","nOpass" ,"nOemail",878,birthdate,"nOpay" ,"nOimg",newdrone,1);
    Customer newcustomer= new Customer(67,"custormer","fg","fg","dfdrg",65,birthdate,"yfghj" ,"fth");
    history h1=new history(newdrone,"Corfu",10,4 ,newcustomer,birthdate ,1,newowner ,0,1,0 ,"path");
    h1.set_historyList(h1);  
    history h2=new history(newdrone,"Komotini",10,3 ,newcustomer,birthdate ,1,newowner ,0,1,0 ,"path");
    h2.set_historyList(h2); 
    
    
    
    Scanner hAnswer = new Scanner(System.in);
    System.out.println("Welcome to drone history");
    System.out.println("If you like to see all your histrory press 1 \n");
    System.out.println("If you like to see histrory based on location press 2 \n");
    System.out.println("If you like to see all your histrory based on Date press 3 \n");
    System.out.println("If you like to see all your histrory based on price press 4 \n");
    System.out.println("If you like to see all your histrory based on rating press 5 \n");
    String hanswer= hAnswer.nextLine();
    int ihanswer = Integer.parseInt(hanswer);
    
    if (ihanswer==1){
     System.out.println("This is all your drone history  \n");
     for(int i=0;i<h1.historyList.size();i++){
                    System.out.println("------------------------------------------------");
                    System.out.println("SELECTED DRONE HISTORY SPECIFICATIONS:"); 
                    System.out.println("------------------------------------------------");
                    newdrone.print_drone(newdrone); 
                    newcustomer.print_customer(newcustomer);
                    System.out.println("Drone location: "+h1.historyList.get(i).location);
                    System.out.println("Date: "+h1.historyList.get(i).date);
                    System.out.println("Time: "+h1.historyList.get(i).time);
                    System.out.println("Rating: "+h1.historyList.get(i).rating);
                    System.out.println("Price: "+h1.historyList.get(i).price);
                    System.out.println("Flight id: "+h1.historyList.get(i).flight_id);
                    System.out.println("Payment id: "+h1.historyList.get(i).payment_id);
                    System.out.println("Photo id: "+h1.historyList.get(i).photo_id);
                    System.out.println("Flight path: "+h1.historyList.get(i).flight_path);
                    System.out.println("------------------------------------------------");
            } 
        
    }
    else if(ihanswer==2){
        System.out.println("Please choose the location you want to browse  \n Corfu \n Athens \n Thessaloniki \n Mykonos \n Santorini \n Komotini");
        Scanner loc = new Scanner(System.in);
        String loca= loc.nextLine();
        for(int i=0;i<h1.historyList.size();i++){
                      if(h1.historyList.get(i).location.equals(loca)){
                    System.out.println("------------------------------------------------");
                    System.out.println("SELECTED DRONE HISTORY SPECIFICATIONS:"); 
                    System.out.println("------------------------------------------------");
                    newdrone.print_drone(newdrone); 
                    newcustomer.print_customer(newcustomer);
                    System.out.println("Drone location: "+h1.historyList.get(i).location);
                    System.out.println("Date: "+h1.historyList.get(i).date);
                    System.out.println("Time: "+h1.historyList.get(i).time);
                    System.out.println("Rating: "+h1.historyList.get(i).rating);
                    System.out.println("Price: "+h1.historyList.get(i).price);
                    System.out.println("Flight id: "+h1.historyList.get(i).flight_id);
                    System.out.println("Payment id: "+h1.historyList.get(i).payment_id);
                    System.out.println("Photo id: "+h1.historyList.get(i).photo_id);
                    System.out.println("Flight path: "+h1.historyList.get(i).flight_path);
                    System.out.println("------------------------------------------------");
            } }
    }
    else if(ihanswer==3){
        System.out.println("Please choose the date you want to browse for");
        Scanner dat = new Scanner(System.in);
        String ndat= dat.nextLine();
        for(int i=0;i<h1.historyList.size();i++){
                      if(h1.historyList.get(i).date.equals(ndat)){
                  System.out.println("------------------------------------------------");
                    System.out.println("SELECTED DRONE HISTORY SPECIFICATIONS:"); 
                    System.out.println("------------------------------------------------");
                    newdrone.print_drone(newdrone); 
                    newcustomer.print_customer(newcustomer);
                    System.out.println("Drone location: "+h1.historyList.get(i).location);
                    System.out.println("Date: "+h1.historyList.get(i).date);
                    System.out.println("Time: "+h1.historyList.get(i).time);
                    System.out.println("Rating: "+h1.historyList.get(i).rating);
                    System.out.println("Price: "+h1.historyList.get(i).price);
                    System.out.println("Flight id: "+h1.historyList.get(i).flight_id);
                    System.out.println("Payment id: "+h1.historyList.get(i).payment_id);
                    System.out.println("Photo id: "+h1.historyList.get(i).photo_id);
                    System.out.println("Flight path: "+h1.historyList.get(i).flight_path);
                    System.out.println("------------------------------------------------");
            } }
        
        
        
        
        
     }
    else if(ihanswer==4){
        System.out.println("Please choose the price you want to browse for");
        Scanner pr = new Scanner(System.in);
        String npr= pr.nextLine();
        int newpr = Integer.parseInt(npr);
       for(int i=0;i<h1.historyList.size();i++){
                      if(h1.historyList.get(i).price==newpr){
                  System.out.println("------------------------------------------------");
                    System.out.println("SELECTED DRONE HISTORY SPECIFICATIONS:"); 
                    System.out.println("------------------------------------------------");
                    newdrone.print_drone(newdrone); 
                    newcustomer.print_customer(newcustomer);
                    System.out.println("Drone location: "+h1.historyList.get(i).location);
                    System.out.println("Date: "+h1.historyList.get(i).date);
                    System.out.println("Time: "+h1.historyList.get(i).time);
                    System.out.println("Rating: "+h1.historyList.get(i).rating);
                    System.out.println("Price: "+h1.historyList.get(i).price);
                    System.out.println("Flight id: "+h1.historyList.get(i).flight_id);
                    System.out.println("Payment id: "+h1.historyList.get(i).payment_id);
                    System.out.println("Photo id: "+h1.historyList.get(i).photo_id);
                    System.out.println("Flight path: "+h1.historyList.get(i).flight_path);
                    System.out.println("------------------------------------------------");
            } }
        
    }
    else if(ihanswer==5){
        System.out.println("Please Please choose the rating you want to browse for");
        Scanner rat = new Scanner(System.in);
        String nrat= rat.nextLine();
        float newrat = Float.parseFloat(nrat);
        for(int i=0;i<h1.historyList.size();i++){
                      if(h1.historyList.get(i).rating==newrat){
                    System.out.println("------------------------------------------------");
                    System.out.println("SELECTED DRONE HISTORY SPECIFICATIONS:"); 
                    System.out.println("------------------------------------------------");
                    newdrone.print_drone(newdrone); 
                    newcustomer.print_customer(newcustomer);
                    System.out.println("Drone location: "+h1.historyList.get(i).location);
                    System.out.println("Date: "+h1.historyList.get(i).date);
                    System.out.println("Time: "+h1.historyList.get(i).time);
                    System.out.println("Rating: "+h1.historyList.get(i).rating);
                    System.out.println("Price: "+h1.historyList.get(i).price);
                    System.out.println("Flight id: "+h1.historyList.get(i).flight_id);
                    System.out.println("Payment id: "+h1.historyList.get(i).payment_id);
                    System.out.println("Photo id: "+h1.historyList.get(i).photo_id);
                    System.out.println("Flight path: "+h1.historyList.get(i).flight_path);
                    System.out.println("------------------------------------------------");
            } }
        
    }
    
    
    }
}

