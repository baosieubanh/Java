/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JFrame;
/**
 *
 * @author Admin
 */
public class Bai4 extends JFrame {

    DefaultListModel<Integer> dlm = new DefaultListModel<>();
    ArrayList<Integer> aListSoChan = new ArrayList<Integer>();
    ArrayList<Integer> aListSoLe = new ArrayList<Integer>();
    ArrayList<Integer> aListSNT = new ArrayList<Integer>();
    int[] number;
    public Bai4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnTodensochan = new javax.swing.JButton();
        btnTodensole = new javax.swing.JButton();
        btntodensont = new javax.swing.JButton();
        btnBotoden = new javax.swing.JButton();
        btnXoasotoden = new javax.swing.JButton();
        btntinhTonglist = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDongct = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNhap = new javax.swing.JButton();
        txtNhapSo = new javax.swing.JTextField();
        cbChonhapsoam = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSo = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thao tác trên JList");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Thao tác trên JList - Checkbox");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Chọn tác vụ"));

        btnTodensochan.setText("Tô đen số chẵn");
        btnTodensochan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodensochanActionPerformed(evt);
            }
        });

        btnTodensole.setText("Tô đen số lẻ");
        btnTodensole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodensoleActionPerformed(evt);
            }
        });

        btntodensont.setText("Tô đen số nguyên tố");
        btntodensont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntodensontActionPerformed(evt);
            }
        });

        btnBotoden.setText("Bỏ tô đen");
        btnBotoden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotodenActionPerformed(evt);
            }
        });

        btnXoasotoden.setText("Xóa các giá trị đang tô đen");
        btnXoasotoden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoasotodenActionPerformed(evt);
            }
        });

        btntinhTonglist.setText("Tổng giá trị trong JList");
        btntinhTonglist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntinhTonglistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTodensochan)
                    .addComponent(btnTodensole)
                    .addComponent(btntodensont)
                    .addComponent(btnBotoden)
                    .addComponent(btnXoasotoden)
                    .addComponent(btntinhTonglist))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnTodensochan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTodensole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntodensont)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBotoden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoasotoden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntinhTonglist))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        btnDongct.setText("Đóng chương trình");
        btnDongct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongctActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btnDongct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDongct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Nhập thông tin:"));

        btnNhap.setText("Nhập");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        cbChonhapsoam.setText("Cho nhập số âm");

        jScrollPane1.setViewportView(listSo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNhapSo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbChonhapsoam)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhap)
                    .addComponent(txtNhapSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbChonhapsoam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTodensochanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodensochanActionPerformed
        if(dlm.isEmpty()){
            JOptionPane.showConfirmDialog(null,"Không có giá trị để tô đen!", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(int i=0; i<dlm.getSize(); i++){
                if(dlm.getElementAt(i) % 2 == 0)
                {
                    aListSoChan.add(i);
                }
            }
            number = convertIntegers(aListSoChan);
            listSo.setSelectedIndices(number);
        }
    }//GEN-LAST:event_btnTodensochanActionPerformed

    private void btnDongctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongctActionPerformed
        int ret=JOptionPane.showConfirmDialog(null,"Bạn muốn thoát chương trình?", "Thoát",JOptionPane.YES_NO_OPTION);
        if(ret==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnDongctActionPerformed

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        String number = txtNhapSo.getText();
        int so=0;
        try{
            so=Integer.parseInt(number);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Nhập sai định dạng!");
            txtNhapSo.selectAll();
            txtNhapSo.requestFocus();
            return;
        }
        if(so < 0)
        {
            if(cbChonhapsoam.isSelected())
            {
                dlm.addElement(so);
                listSo.setModel((DefaultListModel)dlm);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Không được nhập số âm !");
            }  
        }else
        {
            dlm.addElement(so);
            listSo.setModel((DefaultListModel)dlm);
        }
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btntinhTonglistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntinhTonglistActionPerformed
        int tong = 0;
        for (int i = 0; i<dlm.getSize(); i++) {
            tong += dlm.getElementAt(i);
        }
        JOptionPane.showMessageDialog(null, "Tổng giá trị trong list: " + tong);
    }//GEN-LAST:event_btntinhTonglistActionPerformed

    private void btnXoasotodenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoasotodenActionPerformed
        if (listSo.getSelectedIndices().length > 0) {
            int[] selectedIndices = listSo.getSelectedIndices();
            for (int i = selectedIndices.length - 1; i >= 0;
                    i--) {
                dlm.removeElementAt(selectedIndices[i]);
            }
        }
    }//GEN-LAST:event_btnXoasotodenActionPerformed

    private void btnTodensoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodensoleActionPerformed
        if(dlm.isEmpty()){
            JOptionPane.showConfirmDialog(null,"Không có giá trị để tô đen!", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(int i=0; i<dlm.getSize(); i++){
                if((dlm.getElementAt(i) % 2) != 0)
                {
                    aListSoLe.add(i);
                }
            }
            number = convertIntegers(aListSoLe);
            listSo.setSelectedIndices(number);
        }
    }//GEN-LAST:event_btnTodensoleActionPerformed

    private void btnBotodenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotodenActionPerformed
        listSo.clearSelection();
    }//GEN-LAST:event_btnBotodenActionPerformed

    private void btntodensontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntodensontActionPerformed
        if(dlm.isEmpty()){
            JOptionPane.showConfirmDialog(null,"Không có giá trị để tô đen!", "Warning",JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(int i=0; i<dlm.getSize(); i++){
                if(KTSoNguyenTo(dlm.getElementAt(i)))
                {
                    aListSNT.add(i);
                }
            }
            number = convertIntegers(aListSNT);
            listSo.setSelectedIndices(number);
        }
    }//GEN-LAST:event_btntodensontActionPerformed
    
    public boolean KTSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] convertIntegers(ArrayList<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i<ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBotoden;
    private javax.swing.JButton btnDongct;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnTodensochan;
    private javax.swing.JButton btnTodensole;
    private javax.swing.JButton btnXoasotoden;
    private javax.swing.JButton btntinhTonglist;
    private javax.swing.JButton btntodensont;
    private javax.swing.JCheckBox cbChonhapsoam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listSo;
    private javax.swing.JTextField txtNhapSo;
    // End of variables declaration//GEN-END:variables
}
