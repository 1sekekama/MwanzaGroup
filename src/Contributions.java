import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Contributions extends JFrame implements ActionListener {
    JPanel panel;
    JComboBox comboBox1;
    JComboBox comboBox2;
    JLabel memberID;
    JTextField txtMemeberId;
    JLabel grouppID;
    JTextField txtGroupId;
    JLabel    amount;
    JTextField txtAmount;
    JButton add;
    JButton back;
    Contributions(){
        this.setTitle("Mwanzo Baraka Information Management System Contribution page");
        this. setBounds(400,110,600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        String[] choose={"Select","Group","Member"};
        String[] choose2={"Select Month of contribution","Jan","Feb","March",
                "April","May","June","July","Aug","Sept","Oct","Nov","Dec"};

        comboBox1 =new JComboBox(choose);
        comboBox1.setFont(new Font("Arial", Font.PLAIN, 20));
        comboBox1.setBounds(350,20,150,30);

        comboBox2 =new JComboBox(choose2);
        comboBox2.setFont(new Font("Arial", Font.PLAIN, 20));
        comboBox2.setBounds(300,70,280,30);

        memberID= new JLabel("Member ID:");
        memberID.setFont(new Font("Arial", Font.PLAIN, 20));
        memberID.setBounds(20,20,150,30);
        memberID.setForeground(Color.white);

        txtMemeberId = new JTextField();
        txtMemeberId.setFont(new Font("Arial", Font.PLAIN, 15));
        txtMemeberId.setBounds(130,25,150,20);

        grouppID = new JLabel("Group ID:");
        grouppID.setFont(new Font("Arial", Font.PLAIN, 20));
        grouppID.setBounds(20,70,150,30);
        grouppID.setForeground(Color.white);

        txtGroupId = new JTextField();
        txtGroupId.setFont(new Font("Arial", Font.PLAIN, 15));
        txtGroupId.setBounds(130,75,150,20);

        amount = new JLabel("Amount:");
        amount.setFont(new Font("Arial", Font.PLAIN, 20));
        amount.setBounds(20,120,150,30);
        amount.setForeground(Color.white);

        txtAmount= new JTextField();
        txtAmount.setFont(new Font("Arial", Font.PLAIN, 15));
        txtAmount.setBounds(130,125,150,20);

        add=new JButton("Add Contribution");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setFocusable(false);
        add.setBounds(20,200,200,30);
        add.addActionListener(this);

        back=new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN, 20));
        back.setFocusable(false);
        back.setBounds(300,200,150,30);
        back.addActionListener(this);



        JLabel label=new JLabel((new ImageIcon("Images//reportwp.png")));
        label.setBounds(0,0,600,600);

        panel=new JPanel();
        panel.setBounds(0,0,600,600);
        panel.setBackground(Color.orange);

        this.add(memberID);
        this.add(txtMemeberId);
        this.add(comboBox1);
        this.add(comboBox2);
        this.add(grouppID);
        this.add(txtGroupId);
        this.add(amount);
        this.add(txtAmount);
        this.add(add);
        this.add(back);
        this.add(label);
        this.add(panel);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            new HomePage();
            this.dispose();
        }
        if (e.getSource()==add){
            JOptionPane.showMessageDialog(null,"Contribution " +
                    "added successfully.");
            txtMemeberId.setText("");
            txtGroupId.setText("");
            txtAmount.setText("");
        }
    }
}
