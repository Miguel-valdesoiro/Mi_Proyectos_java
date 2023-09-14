package swing01;

import java.awt.Color;
import java.awt.Toolkit;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2() {
        initComponents();
        personalizar_JFrame();
        
    }
    
    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana2.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setSize(500,500);
        this.setTitle("GUI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cmdQuitar = new javax.swing.JButton();
        cmdNombre1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("NOMBRES Y APELLIDOS");
        lblTitulo.setOpaque(true);

        cmdQuitar.setBackground(new java.awt.Color(204, 0, 51));
        cmdQuitar.setForeground(new java.awt.Color(0, 0, 153));
        cmdQuitar.setText("QUITAR NOMBRE");
        cmdQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdQuitarActionPerformed(evt);
            }
        });

        cmdNombre1.setBackground(new java.awt.Color(0, 204, 0));
        cmdNombre1.setForeground(new java.awt.Color(0, 0, 153));
        cmdNombre1.setText("PONER NOMBRE");
        cmdNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNombre1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdQuitar)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(cmdNombre1)
                    .addContainerGap(232, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(cmdQuitar)
                .addGap(70, 70, 70))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(206, Short.MAX_VALUE)
                    .addComponent(cmdNombre1)
                    .addGap(69, 69, 69)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdQuitarActionPerformed
        lblTitulo.setText("NOMBRES Y APELLIDOS");
    }//GEN-LAST:event_cmdQuitarActionPerformed

    private void cmdNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNombre1ActionPerformed
        lblTitulo.setText("WALTER ISMAEL SAGASTEGUI LESCANO");
    }//GEN-LAST:event_cmdNombre1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdNombre1;
    private javax.swing.JButton cmdQuitar;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
