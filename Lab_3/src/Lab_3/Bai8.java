package Lab_3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Bai8 extends JFrame{
    private static final long serialVersionUID = 1L;
    public Bai8(String title)
    {
        setTitle(title);
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        
        JPanel pnNorth = new JPanel();
        JLabel lblTitle=new JLabel("Giai phuong trinh bac 2");
        pnNorth.add(lblTitle);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        pnNorth.setBackground(Color.LIGHT_GRAY);
        lblTitle.setForeground(Color.BLACK);
        Font ft = new Font("arial",Font.BOLD,25);
        lblTitle.setFont(ft);
        
        JPanel pnSouth = new JPanel();
        JButton btnGiai = new JButton("Giai");
        JButton btnXoa = new JButton("Xoa");
        JButton btnThoat = new JButton("Thoat");
        pnSouth.add(btnGiai);
        pnSouth.add(btnXoa);
        pnSouth.add(btnThoat);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        javax.swing.border.Border southborder = BorderFactory.createLineBorder(Color.RED);
        TitledBorder southTitledBorder = new TitledBorder(southborder,"Chon thao tac");
        pnSouth.setBorder(southTitledBorder);
        
        JPanel pnCenter=new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        javax.swing.border.Border  centerborder=BorderFactory.createLineBorder(Color.RED);
        TitledBorder centerTitleBorder=new TitledBorder(centerborder, "Nhap a, b, c:");
        pnCenter.setBorder(centerTitleBorder);

        JPanel pna=new JPanel();
        JLabel lbla=new JLabel("a:");
        final JTextField txta=new  JTextField(15);
        pna.add(lbla);
        pna.add(txta);
        pnCenter.add(pna);
        
        JPanel pnb=new JPanel();
        JLabel lblb=new JLabel("b:");
        final JTextField txtb=new  JTextField(15);
        pnb.add(lblb);
        pnb.add(txtb);
        pnCenter.add(pnb);
        
        JPanel pnc=new JPanel();
        JLabel lblc=new JLabel("c:");
        final JTextField txtc=new  JTextField(15);
        pnc.add(lblc);
        pnc.add(txtc);
        pnCenter.add(pnc);
        
        JPanel pnkq=new JPanel();
        JLabel lblkq=new JLabel("ket Qua:");
        final JTextField txtkq=new  JTextField(15);
        txtkq.setEditable(false);
        pnkq.add(lblkq);
        pnkq.add(txtkq);
        pnCenter.add(pnkq);
        
        lbla.setPreferredSize(lblkq.getPreferredSize());
        lblb.setPreferredSize(lblkq.getPreferredSize());
        lblc.setPreferredSize(lblkq.getPreferredSize());
        
        btnThoat.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            int ret=JOptionPane.showConfirmDialog(null, "Thoat khoi chuong trinh ?", "Thoat", JOptionPane.YES_NO_OPTION);
            if(ret==JOptionPane.YES_OPTION)
                System.exit(0);
            }
        });
        
        btnXoa.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            txta.setText("");
            txtb.setText("");
            txtc.setText("");
            txtkq.setText("");
            txta.requestFocus();
            }
        });
        
        btnGiai.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            String sa=txta.getText();
            float a=0,b=0,c=0;
            try
                {
                    a=Float.parseFloat(sa);;
                }
            catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Nhap sai đinh dang!");
                    txta.selectAll();
                    txta.requestFocus();
                    return;
                }
            String sb=txtb.getText();
            try
            {
                b=Float.parseFloat(sb);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Nhap sai đinh dang!");
                txtb.selectAll();
                txtb.requestFocus();
                return;
             }
            String sc=txtc.getText();
            try
            {
                c=Float.parseFloat(sc);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Nhap sai dinh dang!");
                txtc.selectAll();
                txtc.requestFocus();
                return;
            }
            String kq="";
            PTB2 t=new PTB2(a,b,c);
            kq=t.GiaiPT();
            txtkq.setText(kq);
            }
        });
        Container con=getContentPane();
        con.add(pnBorder);
    }
    public class PTB2 {
        float a,b,c;
        public PTB2(float a, float b, float c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        String GiaiPT(){
            String kq="";
            if(a==0)
                if(b==0)
                    if(c==0)
                        kq="Phuong trinh vo so nghiem";
                    else
                        kq="Phuong trinh vo nghiem";
                else
                    kq="Phuong trinh co 1 nghiem x= "+(-c/b);
            else
            {
                float d=b*b-4*a*c;
                if(d<0)
                   kq="Phuong trinh vo nghiem";
                if (d==0)
                   kq="Phuong trinh co nghiem kep x1=x2= "+(-b/(2*a)); 
                if(d>0)
                { 
                    float x1=((-b-(float)Math.sqrt(d))/(2*a)), 
                          x2=((-b+(float)Math.sqrt(d))/(2*a));
                    kq="x1= "+x1+"; x2= "+x2; 
                }
            }
            return kq;
        }
    }
    public static void main(String[] args) {
        Bai8 myUI = new Bai8("Phuong Trinh Bac 2");
        myUI.setSize(400,300);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
