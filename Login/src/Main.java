public class Main {
    public static void main(String[] args) {
        IDAndPassword idandPassword=new IDAndPassword();

        LoginPage loginPage=new LoginPage(idandPassword.getloginInfo());


    }
}