import java.util.*;

public class tickets {
    public String comment;
    public User user;
    public String state;
    public ArrayList<tickets> ticketsList;
    public tickets(User user, String comment, String state) {
        this.user=user;
        this.comment=comment;
        this.state=state;
        this.ticketsList=new ArrayList<tickets>();
    }
    public void set_ticketsList(tickets tickets) throws FlybyException{
        if(this.ticketsList.contains(tickets)){   //ελέγχω αν το αντικελιμενο που θέλω να προσθέσω υπάρχει ήδη στη λίστα 
          throw new FlybyException("Item already exists"); //χρησιμοποιώ κλάση εξαίρεσης αν το αντικείμενο υπα΄ρχει ήδη στη λίστα
        }
        else{                   //αν δεν υπάρχει το προσθέτω στη λίστα
            this.ticketsList.add(tickets);
        }
     
    
    }
    public void print_ticket(tickets ticket){
        System.out.print("Ticket comment: "+ ticket.comment+"\n");
        System.out.print("user reporting this post: ");
        this.user.print_user(ticket.user);
        System.out.print("State of ticket: "+ticket.state+"\n");
        
        
        
    }
}
