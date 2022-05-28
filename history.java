public class history
{
  public int drone_id;
  public String location;
  public int costumer_id;
  public String date_and_time;
  public int owner_id;
  public int flight_id;
  public int photo_id;
  public int payment_id;
  public String flight_path;
  
  public history(  int drone_id,String location,int costumer_id,String date_and_time,int owner_id,int flight_id,int photo_id,int payment_id,String flight_path){
     this.drone_id=drone_id;
     this.location=location;
     this.owner_id=owner_id;
     this.payment_id=payment_id;
     this.photo_id=photo_id;
     this.costumer_id=costumer_id;
     this.date_and_time=date_and_time;
     this.flight_id=flight_id;
     this.flight_path=flight_path;
    }
  
  
}
