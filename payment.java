
public class payment
{
  public int drone_id;
  public String location;
  public int costumer_id;
  public String date_and_time;
  public int owner_id;
  public int payment_id;
  public float price;
  public String payment_method;
  
  public payment(int drone_id,String location,float price,String payment_method,int owner_id,int payment_id,String date_and_time,int costumer_id){
     this.drone_id=drone_id;
     this.location=location;
     this.owner_id=owner_id;
     this.payment_id=payment_id;
     this.costumer_id=costumer_id;
     this.date_and_time=date_and_time;
     this.price=price;
     this.payment_method=payment_method;
    }
  
  
}

