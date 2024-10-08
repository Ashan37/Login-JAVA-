import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame=new JFrame();
    JLabel welcomeLabel=new JLabel("Welcome!");
    WelcomePage(String userID){

        welcomeLabel.setBounds(100,100,200,35);
        welcomeLabel.setFont((new Font(null,Font.BOLD,25)));
        welcomeLabel.setForeground(Color.darkGray);
        welcomeLabel.setText("Welcome "+userID);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
