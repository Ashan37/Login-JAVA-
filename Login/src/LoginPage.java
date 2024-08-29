import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton loginButton=new JButton("Login");
    JButton resetButton=new JButton("Reset");
    JTextField userIDField=new JTextField();
    JPasswordField userPasswordFeild=new JPasswordField();
    JLabel userIDLabel=new JLabel("User ID:");
    JLabel userPassswordLabel=new JLabel("User Password:");
    JLabel message=new JLabel();

    HashMap<String,String>loginInfo=new HashMap<String,String>();
    LoginPage(HashMap<String,String> loginInfoOriginal){
        loginInfo=loginInfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userPassswordLabel.setBounds(50,150,75,25);


        frame.add(userIDLabel);
        frame.add(userPassswordLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
