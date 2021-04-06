package Lab_3;
import javax.swing.*;

public class Bai1 {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Hello World");
        myFrame.setSize(300,150); //kich thuoc JFrame
        myFrame.setVisible(true);
        JLabel lbName = new JLabel();
        lbName.setText("Chao cac ban!");
        myFrame.add(lbName);//them jLabel vao JFrame
    }
}
