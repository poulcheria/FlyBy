import java.util.Date;
//import javax.imageio.ImageIO;

public class customer extends user
{
    public String customername;
    public String password;
    public String email;
    public int phonenumber;
    public Date birthdate;
    public String payment_method;
    public String imagePath;    // photo_profile
   
    
  

    
    public customer(int user_id, String user_type,String customername,String password,String email,int phonenumber,Date birthdate, String payment_method,String imagePath)
    {
      super(user_id,user_type);
      this.customername=customername;
      this.password=password;
      this.email=email;
      this.phonenumber=phonenumber;
      this.birthdate=birthdate;
      this.payment_method=payment_method;
      this.imagePath=imagePath;
      this.phonenumber=phonenumber;
    }

    
   
}
