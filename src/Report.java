import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Report extends JFrame implements ActionListener {
    JPanel panel;
    JButton memberView;
    JButton groupView;
    JButton loanView;
    JButton loView;
    JButton mcView;
    JButton gcView;
    JButton back;



    Report() {
        JLabel label=new JLabel((new ImageIcon("Images//reportwp.png")));
        label.setBounds(-10,0,600,600);
        this.setTitle("Mwanzo Baraka Information Management System Report Page");
        this.setBounds(400, 110, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.lightGray);


        memberView=new JButton("View Individual details");
        memberView.setBounds(10,100,200,30);
        memberView.setFocusable(false);

        groupView= new JButton("View Group Details");
        groupView.setBounds(300,100,150,30);
        groupView.setFocusable(false);

        loanView= new JButton("View loans");
        loanView.setBounds(10,200,150,30);
        loanView.setFocusable(false);

        loView= new JButton("View Outstanding Loans");
        loView.setBounds(300,200,200,30);
        loView.setFocusable(false);

        mcView= new JButton("View Individual Contributions");
        mcView.setBounds(10,300,200,30);
        mcView.setFocusable(false);

        gcView= new JButton("View group Contributions");
        gcView.setBounds(300,300,200,30);
        gcView.setFocusable(false);

        back= new JButton("Back");
        back.setBounds(100,400,200,30);
        back.setFocusable(false);
        back.addActionListener(this);




        this.add(memberView);
        this.add(groupView);
        this.add(loView);
        this.add(loanView);
        this.add(back);
        this.add(mcView);
        this.add(gcView);
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
