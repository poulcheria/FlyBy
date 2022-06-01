import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    public static int user_id;
    public static String user_type;
    public ArrayList<User> userList;
    public User (int user_id, String user_type)
    {
        this.user_id=user_id;
        this.user_type=user_type;
        this.userList=new ArrayList<User>();
    }
      public void set_userList(User user){
      this.userList.add(user);
    
    }
    public void print_user(User user){
        System.out.print("User id: "+ User.user_id+"\n");
        System.out.print("User type: "+user_type+"\n");
       
    }
}
