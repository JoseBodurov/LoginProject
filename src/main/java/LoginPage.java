import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password");
    JLabel messageLabel = new JLabel("");
    HashMap<String,String> loginInfo = new HashMap<String,String>();
    LoginPage(HashMap<String,String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.PLAIN,12));

        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton){
            userIdField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource()==loginButton){
            String userId = userIdField.getText();
            String userPassword = String.valueOf(userPasswordField.getPassword());

            if (loginInfo.containsKey(userId)){
                if (loginInfo.get(userId).equals(userPassword)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userId);
                }else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password or username");
                }
            }else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Wrong password or username");
            }

        }
    }
}
