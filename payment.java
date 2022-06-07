
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
  public void payment(){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Choose payment method:");
    System.out.println("1. Bank Card");
    System.out.println("2. Cryptocurrency");

    Scanner method= new Scanner(System.in);   
    int imethod = method.nextInt();

    if ( imethod == 1 ) {
        System.out.println()
        //send OTP
        //validate payment
        System.out.println("You successfully rented drone" + this.drone + ", your flight is scheduled for " + this.date + this.time + "and your total payment is " + this.price);
        System.out.println("Your payment number is " + this.payment_id);
        }
    else if ( imethod == 2 ) {
        //Create deposit adress
        System.out.println("You successfully rented drone" + this.drone + ", your flight is scheduled for " + this.date + this.time + "and your total payment is " + this.price);
        System.out.println("Your transaction ID  is " + this.payment_id);
        }
    }
}
  
}
