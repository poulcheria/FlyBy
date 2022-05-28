import java.util.Date;
import java.time.LocalTime;
public class history
{
  public drone drone;
  public String location;
  public Customer customer;
  public Date date;
  public LocalTime time;
  public Owner owner;
  public int flight_id;
  public int photo_id;
  public int payment_id;
  public String flight_path;
  
  public history( drone drone,String location,Customer customer,Date date, LocalTime time,Owner owner,int flight_id,int photo_id,int payment_id,String flight_path){
     this.drone=drone;
     this.location=location;
     this.owner=owner;
     this.payment_id=payment_id;
     this.photo_id=photo_id;
     this.customer=customer;
     this.date=date;
     this.time=time;
     this.flight_id=flight_id;
     this.flight_path=flight_path;
    }
