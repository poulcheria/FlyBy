
import java.util.Date;
import java.time.LocalTime;
public class payment
{
  public rent rent;
  public String location;
  public Date date;
  public LocalTime time;
  public int payment_id;
  public float price;
  public String payment_method;
  
  public payment(rent rent,String location,float price,String payment_method,int payment_id,Date date,LocalTime time){
     this.rent=rent;
     this.location=location;
     
     this.payment_id=payment_id;
     
     this.date=date;
     this.time=time;
     this.price=price;
     this.payment_method=payment_method;
    }
  
  
}
