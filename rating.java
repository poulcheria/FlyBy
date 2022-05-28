
public class rating
{
  public int drone_id;
  public int costumer_id;
  public int owner_id;
  public String comment;
  public int rent_id;
  public float rating_value;
  
  public rating(int drone_id,String comment,int costumer,int rent_id,int owner_id,float rating_value){
     this.drone_id=drone_id;
     this.owner_id=owner_id;
     this.costumer_id=costumer_id;
     this.rent_id=rent_id;
     this.rating_value=rating_value;
     this.comment=comment;
     
    }
  
  
}