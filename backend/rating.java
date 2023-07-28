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
    
  
  
}
