import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegisterG extends JFrame implements ActionListener {
    JPanel panel;
    JLabel fname;
    JTextField txtfName;
    JLabel lName;
    JTextField txtLname;
    JLabel DOB;
    JTextField txtDob;
    JLabel email;
    JTextField txtEmail;
    JLabel userName;
    JTextField txtuser;
    JLabel Password;
    JPasswordField jPass;
    JLabel memberID;
    JTextField txtMemberID;
    JLabel phone;
    JTextField txtPhone;
    JLabel gender;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup gengp;
    JButton register;
    JButton reset;
    JButton back;
    JCheckBox pay;
    JLabel groupId;
    JTextField txtGroupid;
    JLabel nomembers;
    JTextField txtnomembers;


    RegisterG() {
        initialize();
        Connect();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mwanzo_baraka" ,"root","2158");
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            ex.printStackTrace();
        }

    }
    private void initialize(){


        JLabel label=new JLabel((new ImageIcon("Images//reportwp.png")));
        label.setBounds(0,0,600,600);

        this.setTitle("Group Registration Page");
        this. setBounds(400,110,600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        fname = new JLabel("First Name:");
        fname.setFont(new Font("Arial", Font.PLAIN, 20));
        fname.setBounds(20,20,150,30);
        fname.setForeground(Color.white);fname.setForeground(Color.white);

        txtfName = new JTextField();
        txtfName.setFont(new Font("Arial", Font.PLAIN, 15));
        txtfName.setBounds(130,25,150,20);

        lName = new JLabel("Last Name:");
        lName.setFont(new Font("Arial", Font.PLAIN, 20));
        lName.setBounds(20,70,150,30);
        lName.setForeground(Color.white);fname.setForeground(Color.white);

        txtLname = new JTextField();
        txtLname.setFont(new Font("Arial", Font.PLAIN, 15));
        txtLname.setBounds(130,75,150,20);

        groupId =new JLabel("Group ID:");
        groupId.setBounds(300,20,150,30);
        groupId.setForeground(Color.white);fname.setForeground(Color.white);

        txtGroupid =new JTextField();
        txtGroupid.setFont(new Font("Arial", Font.PLAIN, 15));
        txtGroupid.setBounds(380,25,150,20);

        nomembers =new JLabel("Number Of Members:");
        nomembers.setBounds(300,70,150,30);
        nomembers.setForeground(Color.white);fname.setForeground(Color.white);

        txtnomembers =new JTextField();
        txtnomembers.setFont(new Font("Arial", Font.PLAIN, 15));
        txtnomembers.setBounds(430,75,150,20);



        memberID = new JLabel("MemberID:");
        memberID.setFont(new Font("Arial", Font.PLAIN, 20));
        memberID.setBounds(20,120,150,30);
        memberID.setForeground(Color.white);fname.setForeground(Color.white);

        txtMemberID = new JTextField();
        txtMemberID.setFont(new Font("Arial", Font.PLAIN, 15));
        txtMemberID.setBounds(130,125,150,20);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setBounds(20,150,150,30);
        gender.setForeground(Color.white);fname.setForeground(Color.white);


        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setBounds(130,160,65,20);
        male.setSelected(false);



        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setBounds(200,160,75,20);


        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        email = new JLabel("Email:");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setBounds(20,190,150,30);
        email.setForeground(Color.white);fname.setForeground(Color.white);

        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        txtEmail.setBounds(130,200,150,20);

        userName = new JLabel("Username:");
        userName.setFont(new Font("Arial", Font.PLAIN, 20));
        userName.setBounds(20,230,150,30);
        userName.setForeground(Color.white);fname.setForeground(Color.white);

        txtuser = new JTextField();
        txtuser.setFont(new Font("Arial", Font.PLAIN, 15));
        txtuser.setBounds(130,240,150,20);

        Password = new JLabel("Password:");
        Password.setFont(new Font("Arial", Font.PLAIN, 20));
        Password.setBounds(20,270,150,30);
        Password.setForeground(Color.white);fname.setForeground(Color.white);

        jPass = new JPasswordField();
        jPass.setFont(new Font("Arial", Font.PLAIN, 15));
        jPass.setBounds(130,280,150,20);

        DOB = new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Arial", Font.PLAIN, 20));
        DOB.setBounds(20,310,150,30);
        DOB.setForeground(Color.white);fname.setForeground(Color.white);

        txtDob = new JTextField();
        txtDob.setFont(new Font("Arial", Font.PLAIN, 15));
        txtDob.setBounds(130,320,150,20);

        phone = new JLabel("Phone:");
        phone.setFont(new Font("Arial", Font.PLAIN, 20));
        phone.setBounds(20,350,150,30);
        phone.setForeground(Color.white);fname.setForeground(Color.white);

        pay = new JCheckBox("Check a registration fee of Kshs.5000 was paid.");
        pay.setFont(new Font("Arial", Font.PLAIN, 20));
        pay.setBounds(20,400,500,30);

        txtPhone = new JTextField();
        txtPhone.setFont(new Font("Arial", Font.PLAIN, 15));
        txtPhone.setBounds(130,360,150,20);


        register= new JButton("Register");
        register.setBounds(0,450,150,30);
        register.setFocusable(false);
        register.addActionListener(this);



        reset= new JButton("Reset");
        reset.setBounds(200,450,150,30);
        reset.setFocusable(false);
        reset.addActionListener(this);

        back= new JButton("Back");
        back.setBounds(400,450,150,30);
        back.setFocusable(false);
        back.addActionListener(this);


        panel=new JPanel();
        panel.setBounds(0,0,600,600);
        panel.setBackground(Color.MAGENTA);

        this.add(fname);
        this.add(txtfName);
        this.add(groupId);
        this.add(txtGroupid);
        this.add(nomembers);
        this.add(txtnomembers);
        this.add(lName);
        this.add(txtLname);
        this.add(DOB);
        this.add(txtDob);
        this.add(gender);
        this.add(male);
        this.add(female);
        this.add(email);
        this.add(txtEmail);
        this.add(userName);
        this.add(txtuser);
        this.add(Password);
        this.add(jPass);
        this.add(memberID);
        this.add(txtMemberID);
        this.add(phone);
        this.add(txtPhone);
        this.add(register);
        this.add(reset);
        this.add(back);
        this.add(pay);
        this.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==reset){
            txtfName.setText("");
            txtGroupid.setText("");
            txtLname.setText("");
            txtDob.setText("");
            txtEmail.setText("");
            txtuser.setText("");
            jPass.setText("");
            txtMemberID.setText("");
            txtPhone.setText("");
            gengp.clearSelection();
        }
        if (e.getSource()==back){
            new HomePage();
            this.dispose();
        }


        if (e.getSource()==register) {
            String fname = txtfName.getText();
            String  Gname= txtGroupid.getText();
            String lname = txtLname.getText();
            String DOB = txtDob.getText();
            String email = txtEmail.getText();
            String user = txtuser.getText();


            String pass = jPass.getText();
            String memberID = txtMemberID.getText();
            String phone = txtPhone.getText();
            if (fname.isEmpty() || Gname.isEmpty() || lname.isEmpty() || DOB.isEmpty() || email.isEmpty() || user.isEmpty()
                    || pass.isEmpty() || memberID.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fill All Fields",
                        "Try Again!", JOptionPane.ERROR_MESSAGE);

            } else {
               // JOptionPane.showMessageDialog(this, "Successfully Registered");
                //==============================================================================================================//
                //creating connection to the database//

                try {
                    String gender = null;
                    if (male.isSelected()){
                        gender  = "Male";
                    } else if (female.isSelected()) {
                        gender = "Female";
                    }else{
                        JOptionPane.showMessageDialog(null, "Select gender");
                    }
                    pst = con.prepareStatement("insert into group_members_details(first_name,last_name,memberID,gender,date_of_birth," +
                            "email,username,password,phone,Group_name)values(?,?,?,?,?,?,?,?,?,?)");
                  //  pst.setString(1, ID);
                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, memberID);
                    pst.setString(4,gender);
                    pst.setString(5,DOB);
                    pst.setString(6,email);
                    pst.setString(7,user);
                    pst.setString(8,pass);
                    pst.setString(9, phone);
                    pst.setString(10, Gname);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Record Added"
                            +"Successfully Registered");

                    txtfName.setText("");
                    txtLname.setText("");
                    txtGroupid.setText("");
                    txtDob.setText("");
                    txtEmail.setText("");
                    txtuser.setText("");
                    jPass.setText("");
                    txtMemberID.setText("");
                    txtPhone.setText("");
                    gengp.clearSelection();
                } catch (SQLException e1) {

                    e1.printStackTrace();
                }


                // ======================================================================================================//


            }
        }
    }
}


