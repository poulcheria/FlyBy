import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class rating
{
  public String comment;
  public rent rent;
  public float rating_value;
  public ArrayList<rating> commentList; //comment list
  public rating(String comment,rent rent,float rating_value){
     this.rent=rent;
     this.rating_value=rating_value;
     this.comment=comment;
     this.commentList=new ArrayList<rating>();
    }
    
  public void comment_rating() {
       Scanner rcrentid = new Scanner(System.in);
       System.out.println("please add the rent id\n");
       String ratingrentid= rcrentid.nextLine();
       int ratingrentidint = Integer.parseInt(ratingrentid);
       
       Scanner newComment = new Scanner(System.in);
       System.out.println("Type your comment\n");
       String nComment= newComment.nextLine();
       
       Scanner newRating = new Scanner(System.in);
       System.out.println("Enter your rating 1-5\n");
       String nRating= newRating.nextLine();
       float fnRating=Float.parseFloat(nRating);  
       
       Date birthdate=new Date();
       drone newdrone=new drone(0,".",0,".",0,".",0,0,0);
       Customer newcustomer=new Customer(0,"costumer","name","pass","email",687,birthdate,"card","filepath");
       Owner newowner= new Owner(55,"Owner","name","nOpass" ,"nOemail",878,birthdate,"nOpay" ,"nOimg",newdrone,0);
       rent nrent=new rent(ratingrentidint,newcustomer,newowner,newdrone);
       
       rating newrating= new rating(nComment,nrent,fnRating );
       
       this.commentList.add(newrating);
    }
  
}