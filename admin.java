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
        this.adminname=adminname;
        this.email=email;
        this.password=password;
        this.birthdate=birthdate;
    }
    public void approve_owner() {
        drone newdrone=new drone(0,".",0,".",0,".",0,0,0); 
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
         
         public void drone_management() {
        drone newdrone2=new drone(0,".",0,".",0,".",0,0,0,0,0);
        for (int i=0; i < newdrone.droneList.size(); i++) {
            if (newdrone.droneList.get(i).inspected==0) {
                System.out.println(droneList(i));
            }
        }
        System.out.println("Choose a drone to inspect");

        Scanner droneid = new Scanner(System.in);   
        int drone_id = droneid.nextLine();
        int selected_drone = Integer.parseInt(drone_id);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose action for selected drone:");
        System.out.println("1. Inspect Drone");
        System.out.println("2. Delete Drone");
        System.out.println("3. Set Availability");

        String choice = keyboard.nextInt();
        int ichoice =Integer.parseInt(choice);

        if (ichoice == 1) {
            //emfanise tou malaka tou admin eikones pou xei anevasei o malakas o owner
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
            newdrone2 = null; //diagrafh drone apo vash
        }
        else if (ichoice == 3) {
            //troll
        }
        }
    }
}
