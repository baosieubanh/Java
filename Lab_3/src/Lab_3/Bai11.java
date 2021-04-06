package Lab_3;

public class Bai11 extends javax.swing.JFrame {

    public Bai11() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txthienthi = new javax.swing.JTextField();
        btnBackspace = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnnum7 = new javax.swing.JButton();
        btnnum8 = new javax.swing.JButton();
        btnnum9 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnnum4 = new javax.swing.JButton();
        btnnum5 = new javax.swing.JButton();
        btnnum6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnchiadu = new javax.swing.JButton();
        btnnum1 = new javax.swing.JButton();
        btnnum2 = new javax.swing.JButton();
        btnnum3 = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnthapphan = new javax.swing.JButton();
        btnnum0 = new javax.swing.JButton();
        btnamduong = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caculator");

        txthienthi.setEditable(false);
        txthienthi.setBackground(new java.awt.Color(255, 255, 255));
        txthienthi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txthienthi.setText("0.");
        txthienthi.setToolTipText("");

        btnBackspace.setForeground(new java.awt.Color(255, 0, 51));
        btnBackspace.setText("Backspace");

        btnCE.setForeground(new java.awt.Color(255, 0, 51));
        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnC.setForeground(new java.awt.Color(255, 0, 51));
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(4, 5));

        btnnum7.setForeground(new java.awt.Color(51, 51, 255));
        btnnum7.setText("7");
        btnnum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum7);

        btnnum8.setForeground(new java.awt.Color(51, 51, 255));
        btnnum8.setText("8");
        btnnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum8);

        btnnum9.setForeground(new java.awt.Color(51, 51, 255));
        btnnum9.setText("9");
        btnnum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum9);

        btnChia.setForeground(new java.awt.Color(255, 0, 51));
        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnChia);

        btnSqrt.setForeground(new java.awt.Color(51, 51, 255));
        btnSqrt.setText("sqrt");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });
        jPanel1.add(btnSqrt);

        btnnum4.setForeground(new java.awt.Color(51, 51, 255));
        btnnum4.setText("4");
        btnnum4.setToolTipText("");
        btnnum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum4);

        btnnum5.setForeground(new java.awt.Color(51, 51, 255));
        btnnum5.setText("5");
        btnnum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum5);

        btnnum6.setForeground(new java.awt.Color(51, 51, 255));
        btnnum6.setText("6");
        btnnum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum6);

        btnNhan.setForeground(new java.awt.Color(255, 0, 51));
        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });
        jPanel1.add(btnNhan);

        btnchiadu.setForeground(new java.awt.Color(51, 51, 255));
        btnchiadu.setText("%");
        btnchiadu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaduActionPerformed(evt);
            }
        });
        jPanel1.add(btnchiadu);

        btnnum1.setForeground(new java.awt.Color(51, 51, 255));
        btnnum1.setText("1");
        btnnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum1);

        btnnum2.setForeground(new java.awt.Color(51, 51, 255));
        btnnum2.setText("2");
        btnnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum2);

        btnnum3.setForeground(new java.awt.Color(51, 51, 255));
        btnnum3.setText("3");
        btnnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum3);

        btnTru.setForeground(new java.awt.Color(255, 0, 51));
        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });
        jPanel1.add(btnTru);

        btnthapphan.setForeground(new java.awt.Color(51, 51, 255));
        btnthapphan.setText("1/x");
        btnthapphan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthapphanActionPerformed(evt);
            }
        });
        jPanel1.add(btnthapphan);

        btnnum0.setForeground(new java.awt.Color(51, 51, 255));
        btnnum0.setText("0");
        btnnum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum0ActionPerformed(evt);
            }
        });
        jPanel1.add(btnnum0);

        btnamduong.setForeground(new java.awt.Color(51, 51, 255));
        btnamduong.setText("+/-");
        btnamduong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnamduongActionPerformed(evt);
            }
        });
        jPanel1.add(btnamduong);

        btndot.setForeground(new java.awt.Color(51, 51, 255));
        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        jPanel1.add(btndot);

        btnCong.setForeground(new java.awt.Color(255, 0, 51));
        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        jPanel1.add(btnCong);

        btnBang.setForeground(new java.awt.Color(255, 0, 51));
        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        jPanel1.add(btnBang);

        btnMC.setForeground(new java.awt.Color(255, 51, 51));
        btnMC.setText("MC");

        btnMR.setForeground(new java.awt.Color(255, 0, 51));
        btnMR.setText("MR");

        btnMS.setForeground(new java.awt.Color(255, 0, 51));
        btnMS.setText("MS");
        btnMS.setMaximumSize(new java.awt.Dimension(49, 23));
        btnMS.setMinimumSize(new java.awt.Dimension(49, 23));
        btnMS.setPreferredSize(new java.awt.Dimension(49, 23));

        btnM.setForeground(new java.awt.Color(255, 0, 51));
        btnM.setText("M+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnBackspace)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnC)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txthienthi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txthienthi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackspace)
                    .addComponent(btnCE)
                    .addComponent(btnC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnM, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum0ActionPerformed
        input(0);
    }//GEN-LAST:event_btnnum0ActionPerformed

    private void btnnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum1ActionPerformed
        input(1);
    }//GEN-LAST:event_btnnum1ActionPerformed

    private void btnnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum2ActionPerformed
        input(2);
    }//GEN-LAST:event_btnnum2ActionPerformed

    private void btnnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum3ActionPerformed
        input(3);
    }//GEN-LAST:event_btnnum3ActionPerformed

    private void btnnum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum4ActionPerformed
        input(4);
    }//GEN-LAST:event_btnnum4ActionPerformed

    private void btnnum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum5ActionPerformed
        input(5);
    }//GEN-LAST:event_btnnum5ActionPerformed

    private void btnnum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum6ActionPerformed
        input(6);
    }//GEN-LAST:event_btnnum6ActionPerformed

    private void btnnum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum7ActionPerformed
        input(7);
    }//GEN-LAST:event_btnnum7ActionPerformed

    private void btnnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum8ActionPerformed
        input(8);
    }//GEN-LAST:event_btnnum8ActionPerformed

    private void btnnum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum9ActionPerformed
        input(9);
    }//GEN-LAST:event_btnnum9ActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txthienthi.setText("0.");
        sum = 0;
            i = operator.un;
            b = false;
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txthienthi.setText("0.");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        cal(i);
        i = operator.div;
        b = true;
    }//GEN-LAST:event_btnChiaActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        cal(i);
        i = operator.mul;
        b = true;
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        cal(i);
        i = operator.sub;
        b = true;
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        cal(i);
        i = operator.add;
        b = true;
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        try {
                if (i == operator.un) {
                    b = true;
                } else {
                    if (i == operator.add) {
                        sum += Double.parseDouble(txthienthi.getText());

                    }
                    if (i == operator.sub) {
                        sum -= Double.parseDouble(txthienthi.getText());

                    }
                    if (i == operator.mul) {
                        sum *= Double.parseDouble(txthienthi.getText());

                    }
                    if (i == operator.div) {
                        if (Double.parseDouble(txthienthi.getText()) != 0) {
                            sum /= Double.parseDouble(txthienthi.getText());

                        } else {
                            txthienthi.setText("ERROR");
                            b = true;
                            sum = 0;
                        }
                    }
                    if (i == operator.mod) {
                        sum %= Double.parseDouble(txthienthi.getText());
                    }
                    trimIn(sum);
                }
            } catch (Exception ex) {
                txthienthi.setText("ERROR");
                b = true;
                sum = 0;
            }

            sum = 0;
            i = operator.un;
            b = true;
    }//GEN-LAST:event_btnBangActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        if (txthienthi.getText().indexOf('.') == -1) 
        {
            txthienthi.setText(txthienthi.getText() + ".");
        }
    }//GEN-LAST:event_btndotActionPerformed

    private void btnamduongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnamduongActionPerformed
        if (txthienthi.getText().indexOf("-") == -1) {
            txthienthi.setText("-" + txthienthi.getText());
        } else {
            txthienthi.setText(txthienthi.getText().replace('-', '\0'));
        }
    }//GEN-LAST:event_btnamduongActionPerformed

    private void btnchiaduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaduActionPerformed
        cal(i);
        i = operator.mod;
        b = true;
    }//GEN-LAST:event_btnchiaduActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        sum = Math.sqrt(Double.parseDouble(txthienthi.getText()));
        trimIn(sum);
        b = true;
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnthapphanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthapphanActionPerformed
        if (Double.parseDouble(txthienthi.getText()) != 0) {
            sum = 1/Double.parseDouble(txthienthi.getText());
        } else {
            txthienthi.setText("ERROR");
        }
        trimIn(sum);
        b = true;
    }//GEN-LAST:event_btnthapphanActionPerformed
    boolean b = false; 
    double sum = 0; 
    operator i = operator.un; 
    enum operator {
        add, sub, mul, div, mod, sqrt, thapphan, un
    }
    public void cal(operator i) {
        try {
            if (txthienthi.getText() != "ERROR") {
                if (i == operator.un) {
                    sum = Double.parseDouble(txthienthi.getText());
                }
                if (i == operator.add) {
                    sum += Double.parseDouble(txthienthi.getText());
                    trimIn(sum);
                }
                if (i == operator.sub) {
                    sum -= Double.parseDouble(txthienthi.getText());
                    trimIn(sum);
                }
                if (i == operator.mul) {
                    sum *= Double.parseDouble(txthienthi.getText());
                    trimIn(sum);
                }
                if (i == operator.div) {
                    if (Double.parseDouble(txthienthi.getText()) != 0) {
                        sum /= Double.parseDouble(txthienthi.getText());
                        trimIn(sum);
                    } else {
                        txthienthi.setText("ERROR");
                        sum = 0;
                        b = true;
                        i=operator.un;
                    }
                }
                if (i == operator.mod) {
                    sum %= Double.parseDouble(txthienthi.getText());
                    trimIn(sum);
                }
            }
        } catch (Exception ex) {
            txthienthi.setText("ERROR");
            b = true;
        }
    }
    public void input(int i) {
        if (b == true) {
            txthienthi.setText(String.valueOf(i));
            b = false;
        } else {
            if (txthienthi.getText().indexOf('0') == 0) {
                txthienthi.setText(String.valueOf(i));
            } else {
                txthienthi.setText(txthienthi.getText() + String.valueOf(i));
            }
        }
    }
    public void trimIn(double sum) {
        if (String.valueOf(sum).indexOf('.') != -1
                && String.valueOf(sum).endsWith("0")) {
            txthienthi.setText((String.valueOf(sum).substring(0, String.valueOf(sum)
                    .indexOf('.'))));

        } else if (Double.isNaN(sum)) {
            txthienthi.setText("ERROR"); 
            b = true;
            sum = 0;
            i = operator.un;
        } else if (Double.isInfinite(sum)) {
            txthienthi.setText("ERROR");          
            b = true;
            sum = 0;
            i = operator.un;
        } else {
            txthienthi.setText(String.valueOf(sum));
        }
    }
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
            java.util.logging.Logger.getLogger(Bai11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton btnamduong;
    private javax.swing.JButton btnchiadu;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnnum0;
    private javax.swing.JButton btnnum1;
    private javax.swing.JButton btnnum2;
    private javax.swing.JButton btnnum3;
    private javax.swing.JButton btnnum4;
    private javax.swing.JButton btnnum5;
    private javax.swing.JButton btnnum6;
    private javax.swing.JButton btnnum7;
    private javax.swing.JButton btnnum8;
    private javax.swing.JButton btnnum9;
    private javax.swing.JButton btnthapphan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txthienthi;
    // End of variables declaration//GEN-END:variables

}
