import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Loans extends JFrame implements ActionListener {
    JPanel panel;

    JButton memberloan;
    JButton grouploan;
    JButton back;


    Loans(){

        JLabel label=new JLabel((new ImageIcon("Images//reportwp.png")));
        label.setBounds(0,0,600,600);
        this.setTitle("Mwanzo Baraka Information Management System Loan Page");
        this.setBounds(400, 110, 600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        panel = new JPanel();
        panel.setBounds(0, 0, 600, 500);
        panel.setBackground(Color.orange);


        memberloan=new JButton("View Individual details");
        memberloan.setBounds(10,100,200,30);
        memberloan.setFocusable(false);

        grouploan= new JButton("View Group Details");
        grouploan.setBounds(300,100,150,30);
        grouploan.setFocusable(false);

        back= new JButton("Back");
        back.setBounds(100,200,200,30);
        back.setFocusable(false);
        back.addActionListener(this);




        this.add(memberloan);
        this.add(grouploan);
        this.add(back);
        this.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            new   HomePage();
            this.dispose();
        }
    }
}

