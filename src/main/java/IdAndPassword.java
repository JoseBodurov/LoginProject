import java.util.HashMap;

public class IdAndPassword {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IdAndPassword(){
        loginInfo.put("Hose","Pizza");
        loginInfo.put("Hose1","Password");
        loginInfo.put("Hose2","abc123");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
