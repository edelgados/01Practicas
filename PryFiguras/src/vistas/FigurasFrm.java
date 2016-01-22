package vistas;

import javax.swing.JOptionPane;
//import javax.swing.JPanel.*;
import clases.*;

public class FigurasFrm extends javax.swing.JFrame {

    public FigurasFrm() {
        initComponents();
        lValor1.setVisible(false);
        lValor2.setVisible(false);
        lValor3.setVisible(false);
        tValor1.setVisible(false);
        tValor2.setVisible(false);
        tValor3.setVisible(false);
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        lValor1 = new javax.swing.JLabel();
        lValor2 = new javax.swing.JLabel();
        lValor3 = new javax.swing.JLabel();
        cbFiguras = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tArea = new javax.swing.JTextField();
        tPerimetro = new javax.swing.JTextField();
        tValor1 = new javax.swing.JTextField();
        tValor2 = new javax.swing.JTextField();
        tValor3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AREA Y PERIMETRO DE FIGURAS");

        jLabel1.setText("Fiigura:");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        lValor1.setText("Lado 1");

        lValor2.setText("Lado 2");

        lValor3.setText("Lado 3");

        cbFiguras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Rectácngulo", "Círculo", "Triángulo" }));
        cbFiguras.setKeySelectionManager(null);
        cbFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFigurasActionPerformed(evt);
            }
        });

        jLabel2.setText("Área:");

        jLabel3.setText("Perímetro:");

        tArea.setEditable(false);

        tPerimetro.setEditable(false);

        tValor1.setText("jTextField1");
        tValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tValor1KeyTyped(evt);
            }
        });

        tValor2.setText("jTextField2");

        tValor3.setText("jTextField3");

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Delgado Medina Silvino Elías");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lValor2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lValor3)
                                            .addGap(18, 18, 18)
                                            .addComponent(tValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lValor1)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tArea)
                            .addComponent(tPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor1)
                    .addComponent(tValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor2)
                    .addComponent(tValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor3)
                    .addComponent(tValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        int iValor = cbFiguras.getSelectedIndex();
        double ar, per;

        switch (iValor) {
            default:
                JOptionPane.showMessageDialog(null, "Seleccione una figura", "UNI", 0);
                break;
            case 1: ///rectangulo
                try {
                    int l1 = Integer.parseInt(tValor1.getText());
                    int l2 = Integer.parseInt(tValor2.getText());
                    if (l1 > 0 && l2 > 0) {
                        Rectangulo rec;
                        rec = new Rectangulo(l1, l2);

                        ar = rec.area();
                        per = rec.perimetro();
                        //tresult2.setText(String.format("%.2f", total));
                        tArea.setText(String.valueOf(ar));
                        tPerimetro.setText(String.valueOf(per));
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese Valores mayores que 0", "UNI", 1);
                    }
                } catch (NumberFormatException e) {

                    JOptionPane.showMessageDialog(null, "Ingrese los 2 lados", "UNI", 0);

                }

                break;
            case 2://circulo 
                try {
                    int rad = Integer.parseInt(tValor1.getText());
                    if (rad > 0) {
                        Circulo cir;
                        cir = new Circulo(rad);
                        ar = cir.area();
                        per = cir.perimetro();
                        tArea.setText(String.valueOf(ar));
                        tPerimetro.setText(String.valueOf(per));
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese unvalor mayor que 0", "UNI", 1);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese el radio", "UNI", 0);
                }
                break;
            case 3://triangulo
                try {
                    double lt1 = Integer.parseInt(tValor1.getText());
                    double lt2 = Integer.parseInt(tValor2.getText());
                    double lt3 = Integer.parseInt(tValor3.getText());

                    Triangulo tri;
                    tri = new Triangulo(lt1, lt2, lt3);
                    if (tri.verifica()) {
                        ar = tri.area();
                        per = tri.perimetro();
                        tArea.setText(String.valueOf(ar));
                        tPerimetro.setText(String.valueOf(per));
                    } else {
                        JOptionPane.showMessageDialog(null, "Triangulo no existe");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese los 3 lados", "UNI", 0);
                }

                break;
        }
        //int orden=

    }//GEN-LAST:event_btCalcularActionPerformed

    private void cbFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFigurasActionPerformed
        int iValor = cbFiguras.getSelectedIndex();
        //tValor1.setText(String.valueOf(iValor));
        switch (iValor) {
            default:
                lValor1.setVisible(false);
                lValor2.setVisible(false);
                lValor3.setVisible(false);
                tValor1.setVisible(false);
                tValor2.setVisible(false);
                tValor3.setVisible(false);
                tArea.setText(null);
                tPerimetro.setText(null);
                break;
            case 1: ///rectangulo
                lValor1.setText("Lado 1");
                lValor1.setVisible(true);
                lValor2.setVisible(true);
                lValor3.setVisible(false);
                tValor1.setVisible(true);
                tValor2.setVisible(true);
                tValor3.setVisible(false);
                tValor1.setText(null);
                tValor2.setText(null);
                tValor3.setText(null);
                tArea.setText(null);
                tPerimetro.setText(null);
                break;
            case 2://circulo 
                lValor1.setText("Radio ");
                lValor1.setVisible(true);
                lValor2.setVisible(false);
                lValor3.setVisible(false);
                tValor1.setVisible(true);
                tValor2.setVisible(false);
                tValor3.setVisible(false);
                tValor1.setText(null);
                tValor2.setText(null);
                tValor3.setText(null);
                tArea.setText(null);
                tPerimetro.setText(null);
                break;
            case 3://triangulo
                lValor1.setText("Lado 1");
                lValor1.setVisible(true);
                lValor2.setVisible(true);
                lValor3.setVisible(true);
                tValor1.setVisible(true);
                tValor2.setVisible(true);
                tValor3.setVisible(true);
                tValor1.setText(null);
                tValor2.setText(null);
                tValor3.setText(null);
                tArea.setText(null);
                tPerimetro.setText(null);
                break;
        }
        //int orden= cAnio.getSelectedIndex();
    }//GEN-LAST:event_cbFigurasActionPerformed

    private void tValor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tValor1KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tValor1KeyTyped

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
            java.util.logging.Logger.getLogger(FigurasFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FigurasFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FigurasFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FigurasFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FigurasFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JComboBox cbFiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lValor1;
    private javax.swing.JLabel lValor2;
    private javax.swing.JLabel lValor3;
    private javax.swing.JTextField tArea;
    private javax.swing.JTextField tPerimetro;
    private javax.swing.JTextField tValor1;
    private javax.swing.JTextField tValor2;
    private javax.swing.JTextField tValor3;
    // End of variables declaration//GEN-END:variables
}
