package Lab_3;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Bai7 extends JFrame implements ActionListener {
    private JButton btn1,btn2;
    private JTextField tf1;
    private JPasswordField tf2,tf3;
    private Container con;
    private JPanel pn1,pn2;
    public Bai7(String title)
    {
        setTitle(title);
        con = this.getContentPane();
        
        JLabel username = new JLabel("Username: ");
        tf1 = new JTextField();
        JLabel password = new JLabel("Password: ");
        tf2 = new JPasswordField();
        JLabel confirm = new JLabel("Confirm: ");
        tf3 = new JPasswordField();
        
        pn1 = new JPanel();
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(username);
        pn1.add(tf1);
        pn1.add(password);
        pn1.add(tf2);
        pn1.add(confirm);
        pn1.add(tf3);
        
        btn1 = new JButton("Sign Up");
        btn2 = new JButton("Cancel");
      
        pn2 = new JPanel();
        pn2.add(btn1);
        pn2.add(btn2);
        
        con.add(pn1);
        con.add(pn2,"South");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    public static void main(String[] args) {
        Bai7 myUI = new Bai7("Sign Up Form");
        myUI.setSize(350,150);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Sign Up")
        {
            if(tf1.getText().equals("")||tf2.getText().equals("")||tf3.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Vui long nhap thong tin!!!");
            }else if(tf2.getText().compareTo(tf3.getText())==0)
            {
                JOptionPane.showMessageDialog(this, "Dang ky thanh cong.");
            }else{
                JOptionPane.showMessageDialog(this, "Mat khau khong khop!!!");
            }
        }
        if(e.getActionCommand()=="Cancel")
        {
            System.exit(0);
        }
    }
}
