import java.util.Date;
//import javax.imageio.ImageIO;
public class Owner extends User
{
   public String ownername;
    public String password;
    public String email;
    public int phonenumber;
    public Date birthdate;
    public String payment_method;
    public String imagePath; // photo_profile
    public int drone_id;
    
    
    public Owner(int user_id, String user_type,String ownername,String password,String email,int phonenumber,Date birthdate, String payment_method,String imagePath,int drone_id)
    {
      super(user_id,user_type);
      this.ownername=ownername;
      this.password=password;
      this.email=email;
      this.phonenumber=phonenumber;
      this.birthdate=birthdate;
      this.payment_method=payment_method;
      this.imagePath=imagePath;
      this.drone_id=drone_id;
        
    }
