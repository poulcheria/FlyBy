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
         
        }
         
    }
}