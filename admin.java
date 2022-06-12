import java.util.Date;
import java.util.Scanner;
public class admin extends User{

    public int admin_id;
    public String adminname;
    public String email;
    public String password;
    public Date birthdate;

    public admin(int admin_id, String adminname, String email, String password, Date birthdate) {
        super(user_id,user_type);
        this.admin_id=admin_id;
        this.email=email;
        this.password=password;
        
    }
    public void admin_login(){
        System.out.println("Log in as Admin insert code:");// code must be 123
        Scanner code = new Scanner(System.in);
        int co= code.nextInt();
        if(co==123){
            System.out.println("Choose options: \n1. Moderation\n2. Delete User\n3. Approve Owner\n4. Drone Managment \n5.Leave");
            Scanner opt = new Scanner(System.in);
            int op= opt.nextInt();
            if(op==1){ 
                moderation();
            }
            else if(op==2){
                delete_user();
            }
            else if(op==3){
                approve_owner();
            }
            else if(op==4){
                drone_management();
            }
            else{
                System.exit(0);
            }
        
        
        }
        else{
            System.out.println("Password incorrect try again");
            admin_login();
        }
    
    
    }
    public void approve_owner() {
        drone newdrone=new drone(0,".",0,".",0,".",0,0,0,1,1,1); 
        Owner newowner= new Owner(55,"Owner","name","nOpass" ,"nOemail",878,birthdate,"nOpay" ,"nOimg",newdrone,1); 
        System.out.print( newowner.ownername+"\n");
        System.out.print( newowner.password+"\n");
        System.out.print( newowner.email+"\n");
        System.out.print( newowner.phonenumber+"\n");
        System.out.print( newowner.birthdate+"\n");
        System.out.print( newowner.payment_method+"\n");
        System.out.print( newowner.imagePath+"\n");
        System.out.print( newowner.drone+"\n");
        System.out.print( newowner.approveValue+"\n");
        
        
        Scanner newAnswer = new Scanner(System.in);
        System.out.println("Do you approve this owner?Type 1 for yes or 0 for no:");    
        String answer= newAnswer.nextLine();
        int ianswer = Integer.parseInt(answer);
        
        if (ianswer==1) {
         newowner.approveValue=1;
         System.out.println("Owner approved!"+"\n");
         System.out.println("New approve value of owner"+newowner.approveValue);
         
         } 
        else if (ianswer==0){
         newowner.approveValue=0;
         System.out.println("You did not approve this owner"+"\n");
         System.out.println("New approve value of owner\t"+newowner.approveValue);
        }
        admin_login();
    }
    public void delete_user() {
      User u1= new User(1,"costumer");
      User u2= new User(5,"owner"); 
      u1.set_userList(u1);  
      u1.set_userList(u2);
      
      System.out.print( "Hello admin welcome to delete user option \n");
      Scanner iddelete = new Scanner(System.in);
      System.out.println("Please type the user id you want to delete");    
      String id_delete= iddelete.nextLine();
      int id_int_delete = Integer.parseInt(id_delete);
      for(int i=0;i<u1.userList.size();i++){
         if(u1.userList.get(i).user_id==id_int_delete) {
            u1.userList.remove(i);
             System.out.print( "USER DELETED SUCCESSFULLY");
            
            } 
      }
      for(int i=0;i<u1.userList.size();i++){
         System.out.println("User id: "+u1.userList.get(i).user_id);
         System.out.println("User  type: "+u1.userList.get(i).user_type);
      }
      admin_login();
     }
    public void drone_management() {
        drone newdrone=new drone(0,".",0,".",0,".",0,0,0,1,1,1);
        drone newdrone1= new drone(0 ,"Corfu" ,80,"Ryze Tech Tello." ,0 ,"1920x1080" ,1,1, 1,1,1,1);
        drone newdrone2= new drone(1,"Athens" ,5100," DJI Mini 2" ,3500,"960x540 ", 0, 2, 5,2,1,1);
        drone newdrone3= new drone(2,"Thessaloniki" ,570," Ryze Tech Tello" ,1000," 854x480 ", 0, 3, 4,3,1,1);
        drone newdrone4= new drone(3,"Mykonos" ,110," DJI Mini 3 Pro" ,500," 1280x720 ", 0, 4, 2,4,1,1);
        
        try{
        newdrone.set_droneList(newdrone1);
        newdrone.set_droneList(newdrone2);
        newdrone.set_droneList(newdrone3);
        newdrone.set_droneList(newdrone4);
         
         }
         catch(FlybyException ex){
         
        }
        
        for (int i=0; i < newdrone.droneList.size(); i++) {
            if (newdrone.droneList.get(i).inspected==0) {
                for (int j=0; j < newdrone.droneList.size(); j++){
                System.out.println(newdrone.droneList.get(j));
            }
            }
        }
        System.out.println("Choose a drone to inspect by ID");

        Scanner droneid = new Scanner(System.in);   
        int drone_id = droneid.nextInt();
        //int selected_drone = Integer.parseInt(drone_id);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose action for selected drone:");
        System.out.println("1. Inspect Drone");
        System.out.println("2. Delete Drone");
        System.out.println("3. Set Availability");
        System.out.println("4. Leave");

        Scanner choice= new Scanner(System.in);   
        int ichoice = choice.nextInt();

        if (ichoice == 1) {
            
            Scanner newapproved = new Scanner(System.in);

            System.out.println("Set drone status:");
            System.out.println("1. Approve drone");
            System.out.println("2. Decline drone");

            String approved = newapproved.nextLine();
            int iapproved = Integer.parseInt(approved);
            
            if (iapproved == 1) {
                newdrone2.approved = 1;        
                System.out.println("Drone successfuly approved");
            }
           else if (iapproved == 0) {
                newdrone2.approved = 0;
                Scanner comm = new Scanner(System.in);
                System.out.println("Input reason for declining drone:");
                String comment = comm.nextLine();
                //enhmerwse ton owner oti to drone aporifthike kai to logo

            }
        else if (ichoice == 2) {
            System.out.println("Are you sure you want to delete this drone?");
            newdrone2.droneList.remove(newdrone2);
        }
        else if (ichoice == 3) {
            
        }
        else{
        System.exit(0);
       }
        }
        admin_login();
    }
    
    public void moderation(){
         Scanner mod = new Scanner(System.in);
         System.out.println("Choose Category from(1,2or3):\n1.flagged posts\n2.tickets\n3.flagged drones");
         int cat = mod.nextInt();
         User user= new User(7,"customer");
         drone drone= new drone(0 ,"." ,0,"." ,0 ,"." ,1,1, 1,1,1,1);
         posts post= new posts(1,user,1,1,"offensive" );
         posts post1= new posts(1,user,1,1,"ofensive" );
        
         try{
             post.set_postsList(post);
             post.set_postsList(post1);
            }
         catch(FlybyException ex){
         
         }
         tickets tick= new tickets(user,"commenting..","state");
         try{
         tick.set_ticketsList(tick);
         }
         catch(FlybyException ex){
         
         }
        
        
         try{
          drone.set_droneList(drone);
         }
         catch(FlybyException ex){
         
         }
            if(cat==1){
            System.out.println("Choose post:");
            for(int i=0;i<post.postsList.size();i++){
                if(post.postsList.get(i).flagged_posts==1){
                System.out.println(i);
                post.print_post(post.postsList.get(i));
                System.out.println("\n" );
            }
            } 
            Scanner poss = new Scanner(System.in);
            int pos = poss.nextInt();
            System.out.println("Delete this posts? (1=yes, 0=no)\n");
            Scanner yn = new Scanner(System.in);
            int y = yn.nextInt();
            if(y==1){
                post.postsList.remove(pos);
                System.out.println("Post Deleted successful");
            }
            
            }
         else if(cat==2){
            System.out.println("Choose ticket:");
            for(int i=0;i<tick.ticketsList.size();i++){
                System.out.println(i);
                tick.print_ticket(tick.ticketsList.get(i));
                System.out.println("\n" );
            }
            Scanner ticke = new Scanner(System.in);
            int tic = ticke.nextInt();
            System.out.println("Set state of said ticket.\nPress 1 for processing, 2 for rejected, 3 for solved");
            Scanner state = new Scanner(System.in);
            int st = state.nextInt();
            if(st==1){
                tick.ticketsList.get(tic).state="p";
                System.out.println("Ticket state set as processing");
            }
            else if(st==2){
                 tick.ticketsList.get(tic).state="r";
                System.out.println("Ticket state set as rejected");
            }
            else{
                 tick.ticketsList.get(tic).state="s";
                 System.out.println("Ticket state set as solved");
            }
        }
         else{
            System.out.println("Choose drone:");
            for(int i=0;i<drone.droneList.size();i++){
                if(drone.droneList.get(i).flagged_drones==1){
                System.out.println(i+".");
                drone.print_drone(drone.droneList.get(i));
            }
            Scanner dro = new Scanner(System.in);
            int dr = dro.nextInt();
            System.out.println("Set state of said drone.\nPress 1 for suspension, 2 for ingnore");
            Scanner cho = new Scanner(System.in);
            int c = cho.nextInt();
            if(c==1){
                drone.droneList.get(i).flagged_drones=2;
                System.out.println("Drone suspended");
            }
            else{
                drone.droneList.get(i).flagged_drones=0;
                System.out.println("Drone flag ignored");
            }
            }
         admin_login();
    }
    
    
}
}