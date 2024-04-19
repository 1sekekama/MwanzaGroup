import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegistresMembers extends JFrame implements ActionListener {
    JTable table;
    JButton back;

    RegistresMembers(){
        this.setTitle("Individual Registration Page");
        this. setBounds(40,110,1200,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        back=new JButton("Back");
        back.setBounds(10,40,3,1);
        back.addActionListener(this);

        String[][] tableData = {
                {"ew","ew","ew","male","ew","ew","ew","ew","11"}

        };

        String [] columnNames={"First Name","Last Name","D.O.B","Gender","Email","User Name","Password","Address","Phone",};

        table = new JTable(tableData,columnNames);

        JScrollPane jScrollPane = new JScrollPane(table);
        this.add(back);
        this.add(jScrollPane);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            new IndividualReg();
            this.dispose();
        }
    }
}




