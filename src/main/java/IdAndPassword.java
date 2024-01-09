import java.util.HashMap;

public class IdAndPassword {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IdAndPassword(){
        loginInfo.put("Jose","Pizza");
        loginInfo.put("Jose1","Password");
        loginInfo.put("Jose2","abc123");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
