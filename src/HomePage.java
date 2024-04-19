import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage extends JFrame implements ActionListener {
    JPanel panel;
    JLabel welcome;
    JButton RegisterM;
    JButton contribution;
    JButton loans;
    JButton report;
    JButton RegisterG;
    JButton logout;

    HomePage(){
        JLabel label=new JLabel(new ImageIcon("Images//tech1.png"));
        label.setBounds(10,30,600,500);
        this.setTitle("Mwanzo Baraka Information Management System Home Page");
        this. setBounds(400,110,600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        panel=new JPanel();
        panel.setBounds(0,0,600,500);
        panel.setBackground(Color.lightGray);
        panel.add(label);
        welcome =new JLabel();
        //"<html>Hello Welcome to Mwanzo Group Infomation system<br><br>\n" +
        //                "What would you like to do."
        welcome.setIcon(new ImageIcon("Images//tech1.png"));
        welcome.setBounds(-10,0,600,600);
        welcome.setFont(new Font("consolas", Font.ITALIC, 18));

       // Objects.requireNonNull(getClass().getResource

        ImageIcon icon1=new ImageIcon("Images//p1.png");
        RegisterM=new JButton("Register Individual");
        RegisterM.setIcon(icon1);
        RegisterM.setBounds(50,100,170,30);
        RegisterM.setFocusable(false);
        RegisterM.setBackground(Color.cyan);
        RegisterM.addActionListener(this);


        ImageIcon icon5=new ImageIcon("Images//c1.png");
        contribution= new JButton("Contributions");
        contribution.setBounds(50,200,150,30);
        contribution.setFocusable(false);
        contribution.setIcon(icon5);
        contribution.setBackground(Color.cyan);
        contribution.addActionListener(this);

        ImageIcon icon6=new ImageIcon("Images//loan.png");
        loans= new JButton("Loans");
        loans.setBounds(50,350,150,30);
        loans.setFocusable(false);
        loans.setIcon(icon6);
        loans.setBackground(Color.cyan);
        loans.addActionListener(this);

        ImageIcon icon4=new ImageIcon("Images//r1.png");
        report= new JButton("Reports");
        report.setBounds(350,200,150,30);
        report.setFocusable(false);
        report.setIcon(icon4);
        report.setBackground(Color.cyan);
        report.addActionListener(this);

        ImageIcon icon2=new ImageIcon("Images//p2.png");
        RegisterG= new JButton("Register Group");
        RegisterG.setBounds(350,100,150,30);
        RegisterG.setFocusable(false);
        RegisterG.setIcon(icon2);
        RegisterG.setBackground(Color.cyan);
        RegisterG.addActionListener(this);

        ImageIcon icon3=new ImageIcon("Images//logout.png");
        logout = new JButton("Logout");
        logout.setBounds(350,350,150,30);
        logout.setFocusable(false);
        logout.setIcon(icon3);
        logout.setBackground(Color.cyan);
        logout.addActionListener(this);

        this.add(RegisterM);
        this.add(contribution);
        this.add(RegisterG);
        this.add(logout);
        this.add(loans);
        this.add(report);
        this.add(welcome);
        this.add(panel);
        this.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==RegisterM){
            new IndividualReg();
           this.dispose();
        }
        if(e.getSource()==contribution){
            new Contributions();

            this.dispose();
        }

        if (e.getSource()==RegisterG){
            new RegisterG();
            this.dispose();
        }
        if (e.getSource()==logout){
            UserLogin login= new UserLogin();
            new Login(login.logininfo);
            this.dispose();
        }
        if (e.getSource()==report){
            new Report();
            this.dispose();
        }
        if (e.getSource()==loans){
            new Loans();
            this.dispose();
        }
    }
}

