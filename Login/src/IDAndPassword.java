import java.util.HashMap;

public class IDAndPassword {
    HashMap<String,String> loginInfo=new HashMap<String,String>();
    IDAndPassword(){
        loginInfo.put("Shan","password");
        loginInfo.put("John","abcdef");
        loginInfo.put("Silva","258258258");
        loginInfo.put("Krishan","11111111");
        loginInfo.put("DilShan","12345678");
    }
    protected HashMap getloginInfo(){
        return loginInfo;
    }
}
