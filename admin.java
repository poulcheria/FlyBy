import java.util.Date;
public class admin extends User{

    public int admin_id;
    public String adminname;
    public String email;
    public String password;
    public Date birthdate;

    public admin(int admin_id, String adminname, String email, String password, Date birthdate) {
        super(user_id,user_type);
        this.admin_id=admin_id;
        this.adminname=adminname;
        this.email=email;
        this.password=password;
        this.birthdate=birthdate;
    }

}
