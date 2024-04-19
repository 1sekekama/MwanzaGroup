import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {
    JPanel panel=new JPanel();
    JFrame frame=new JFrame("Login System");
    JButton loginbutton=new JButton("Login");
    JButton resetbutton=new JButton("Reset");
    JButton exit=new JButton("Exit");
    JTextField userfield=new JTextField();
    JPasswordField userpassword=new JPasswordField();
    JLabel userIDlabel=new JLabel("User Name:");
    JLabel userpasswordlabel=new JLabel("password:");
    JLabel messagelabel=new JLabel();
    // private String getuserid;
    JLabel label=new JLabel();
    //"<html>Hello Welcome to Mwanzo Baraka login system<br><br> Username=1 " +
    //            "and password is 2"

    HashMap<String,String> logininfo=new HashMap<String, String>();
    Login(HashMap <String,String> logininfoOriginal) {
        logininfo=logininfoOriginal;
        userIDlabel.setBounds(50,100,75,25);
        userpasswordlabel.setBounds(50,150,75,25);

        messagelabel.setBounds(125,250,400,35);
        messagelabel.setFont(new Font(null,Font.ITALIC,25));
        messagelabel.setForeground(Color.green);
        label.setBackground(new Color(55, 68, 30));
        label.setForeground(Color.GREEN);
        label.setOpaque(true);
        label.setFont(new Font("consoles", Font.ITALIC, 18));
        label.setIcon(new ImageIcon("Images//2.png"));
        panel.add(label);

        panel.setSize(500,500);

        panel.setBackground(Color.cyan);
        panel.add(userIDlabel);
        panel.add(userpasswordlabel);
        panel.add(resetbutton);
        panel.add(loginbutton);
        panel.add(label);

        userfield.setBounds(125,100,200,25);
        userfield.setFont(new Font(null,Font.PLAIN,17));
        userpassword.setBounds(125,150,200,25);

        ImageIcon icon=new ImageIcon("Images//l1.png");
        loginbutton.setBounds(120,200,120,35);
        loginbutton.addActionListener(this);
        loginbutton.setIcon(icon);
        resetbutton.setBounds(245,200,120,35);
        resetbutton.addActionListener(this);

        exit.setBounds(180,300,120,35);
        exit.addActionListener(this);


        frame.add(loginbutton);
        frame.add(panel);
        frame.add(resetbutton);
        frame.add(exit);
        frame.add(userfield);
        frame.add(userpassword);
        frame.add(messagelabel);
        frame.add(userIDlabel);
        frame.add(userpasswordlabel);
        frame.add(panel);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 100, 700, 650);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setForeground(Color.cyan);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loginbutton ){
            String userID=userfield.getText();
            String password =String.valueOf(userpassword.getPassword());

            if (logininfo.containsKey(userID)){
                if (logininfo.get(userID).equals(password)){
                    messagelabel.setForeground(Color.green);
                    messagelabel.setText("Login successful");
                    frame.dispose();

                   new HomePage();

                }
                else  {
                    messagelabel.setForeground(Color.red);
                    messagelabel.setText("check password");

                }

            }
            else {
                messagelabel.setForeground(Color.red);
                messagelabel.setText("check user name");

            }

        } if (e.getSource()==resetbutton) {
            userfield.setText("");
            userpassword.setText("");


        }
        if (e.getSource()==exit){
            frame.dispose();
        }

    }
}
