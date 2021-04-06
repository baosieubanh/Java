package Lab_3;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Bai6 extends JFrame implements ActionListener{
    private JButton btn1,btn2,btn3,btn4;
    private JTextField tf1,tf2,tf3;
    private double kq;
    private Container con;
    private JPanel pn1,pn2;
    public Bai6(String title)
    {
        setTitle(title);
        con = this.getContentPane();
        JLabel num1 = new JLabel("First number: ");
        tf1 = new JTextField();
        JLabel num2 = new JLabel("Second number: ");
        tf2 = new JTextField();
        JLabel kq1 = new JLabel("Result: ");
        tf3 = new JTextField();
        tf3.setEditable(false);
        pn1 = new JPanel();
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(num1);
        pn1.add(tf1);
        pn1.add(num2);
        pn1.add(tf2);
        pn1.add(kq1);
        pn1.add(tf3);
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("*");
        btn4 = new JButton("/");
        pn2 = new JPanel();
        pn2.add(btn1);
        pn2.add(btn2);
        pn2.add(btn3);
        pn2.add(btn4);
        con.add(pn1);
        con.add(pn2,"South");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
    }
    public void Cong()
    {
        kq = Double.parseDouble(tf1.getText())+ Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(kq));
    }
    public void Tru()
    {
        kq = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(kq));
    }
    public void Nhan()
    {
        kq = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(kq));
    }
    public void Chia()
    {
        kq = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(kq));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="+")
        {
            if(tf1.getText().equals("")||tf2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Vui long nhap thong tin");
            }else{
                Cong();
            }
        }
        if(e.getActionCommand()=="-")
        {
            if(tf1.getText().equals("")||tf2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Vui long nhap thong tin");
            }else{
                Tru();
            }
        }
        if(e.getActionCommand()=="*")
        {
            if(tf1.getText().equals("")||tf2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Vui long nhap thong tin");
            }else{
                Nhan();
            }
        }
        if(e.getActionCommand()=="/")
        {
            if(tf1.getText().equals("")||tf2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Vui long nhap thong tin");
            }else{
                Chia();
            }
        }
    }
    public static void main(String[] args) {
        Bai6 myUI = new Bai6("Calculator");
        myUI.setSize(350,150);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
