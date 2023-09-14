package mysql_zoologico;

import java.util.List;
import javax.swing.JOptionPane;

public class Ventana4 extends javax.swing.JFrame {

    OperacionesCrud crud = new OperacionesCrud("Zoologico");

    public Ventana4() {
        initComponents();
        llenarComboBox();
    }

    public void llenarComboBox() {
        cboIdZoo.removeAllItems();
        List<String> idzoo_al = crud.getListaIdZoo();
        for (String item : idzoo_al) {
            cboIdZoo.addItem(item);
            System.out.println(item);
        }
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboIdZoo = new javax.swing.JComboBox<>();
        txtIdZoo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtSuperficie = new javax.swing.JTextField();
        txtPresupuesto = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        cmdEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboIdZoo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboIdZooItemStateChanged(evt);
            }
        });

        cmdEliminar.setText("ELIMINAR");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        jButton1.setText("R");

        cmdActualizar.setText("ACTUALIZAR");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboIdZoo, 0, 129, Short.MAX_VALUE)
                    .addComponent(txtIdZoo)
                    .addComponent(txtDescripcion)
                    .addComponent(txtCiudad)
                    .addComponent(txtSuperficie)
                    .addComponent(txtPresupuesto)
                    .addComponent(txtPais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(cmdEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(cmdActualizar)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboIdZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addComponent(txtIdZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdEliminar)
                    .addComponent(cmdActualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboIdZooItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboIdZooItemStateChanged
        try {
        String idZoo = (String) cboIdZoo.getSelectedItem();
        Zoologico zoologico = crud.getObjetoZoologico(idZoo);
        txtIdZoo.setText(zoologico.getIdZoo());
        txtDescripcion.setText(zoologico.getDescripcion());
        txtCiudad.setText(zoologico.getCiudad());
        txtSuperficie.setText(zoologico.getSuperficie() + "");
        txtPresupuesto.setText(zoologico.getPresupuesto() + "");
        txtPais.setText(zoologico.getPais());
        }catch(Exception e) {
            
        }
    }//GEN-LAST:event_cboIdZooItemStateChanged

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        try {
            String idZoo = (String) cboIdZoo.getSelectedItem();
            if (crud.eliminarZoologico(idZoo)) {
                txtIdZoo.setText("");
                txtDescripcion.setText("");
                txtCiudad.setText("");
                txtSuperficie.setText("");
                txtPresupuesto.setText("");
                txtPais.setText("");
                cboIdZoo.setSelectedIndex(0);
                llenarComboBox();
                JOptionPane.showMessageDialog(this, "OK: ELIMINAR", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "ERROR: ELIMINAR", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        String idZoo = (String) cboIdZoo.getSelectedItem();
        String descripcion = txtDescripcion.getText();
        String ciudad = txtCiudad.getText();
        double superficie = Double.parseDouble(txtSuperficie.getText());
        double presupuesto = Double.parseDouble(txtPresupuesto.getText());
        String pais = txtPais.getText();
        Zoologico zNuevo = new Zoologico(idZoo, descripcion,
                ciudad, superficie,
                presupuesto, pais);
        if(crud.actualizarZoologico(zNuevo)) {
           JOptionPane.showMessageDialog(this, "OK: ACTUALIZAR", "INFORMACION", JOptionPane.INFORMATION_MESSAGE); 
        }else {
            JOptionPane.showMessageDialog(this, "ERROR: ACTUALIZAR", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

        //Zoologico z = new 
    }//GEN-LAST:event_cmdActualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboIdZoo;
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdZoo;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JTextField txtSuperficie;
    // End of variables declaration//GEN-END:variables
}
