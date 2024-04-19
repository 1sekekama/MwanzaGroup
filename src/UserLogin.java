import java.util.HashMap;

public class UserLogin {
    HashMap<String,String> logininfo= new HashMap<>();
    UserLogin(){
        logininfo.put("1","2");
    }
    private HashMap getLogininfo(){
        return logininfo;
    }
}