import java.util.*;
public class posts {
    public int photo_id;
    public User user;
    public int drone_id;
    public int flagged_posts;
    public String comment;
    public ArrayList<posts> postsList;
    public posts(int photo_id, User user, int drone_id, int flagged_posts, String comment) {
        this.photo_id=photo_id;
        this.user=user;
        this.drone_id=drone_id;
        this.flagged_posts=flagged_posts;
        this.comment=comment;
        this.postsList=new ArrayList<posts>();
    }
    public void set_postsList(posts posts) throws FlybyException{
     
    if(this.postsList.contains(posts)){   //ελέγχω αν το αντικελιμενο που θέλω να προσθέσω υπάρχει ήδη στη λίστα 
         throw new FlybyException("Item already exists"); //χρησιμοποιώ κλάση εξαίρεσης αν το αντικείμενο υπα΄ρχει ήδη στη λίστα
        }
        else{                   //αν δεν υπάρχει το προσθέτω στη λίστα
            this.postsList.add(posts);
        }
    }
    
    
    public void print_post(posts posts){
        System.out.print("photo ID: "+ posts.photo_id+"\n");
        System.out.print("user reporting this post: ");
        this.user.print_user(posts.user);
        System.out.print("drone ID: "+posts.drone_id+"\n");
        System.out.print("Comment: "+posts.comment+"\n");
        
        
    }
}
