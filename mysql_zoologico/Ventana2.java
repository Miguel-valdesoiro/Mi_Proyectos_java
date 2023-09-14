package mysql_zoologico;

import java.util.List;


public class Ventana2 extends javax.swing.JFrame {
    
    OperacionesCrud crud = new OperacionesCrud("Zoologico");

    public Ventana2() {
        initComponents();
        llenarComboBox();
    }
    
    public void llenarComboBox() {
        List<String> idzoo_al = crud.getListaIdZoo();
        for(String item: idzoo_al) {
            cboIdZoo.addItem(item);
        }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboIdZoo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboIdZooItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboIdZoo, 0, 129, Short.MAX_VALUE)
                    .addComponent(txtIdZoo)
                    .addComponent(txtDescripcion)
                    .addComponent(txtCiudad)
                    .addComponent(txtSuperficie)
                    .addComponent(txtPresupuesto)
                    .addComponent(txtPais))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cboIdZoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
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
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboIdZooItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboIdZooItemStateChanged
        String idZoo = (String)cboIdZoo.getSelectedItem();
        Zoologico zoologico = crud.getObjetoZoologico(idZoo);
        txtIdZoo.setText(zoologico.getIdZoo());
        txtDescripcion.setText(zoologico.getDescripcion());
        txtCiudad.setText(zoologico.getCiudad());
        txtSuperficie.setText(zoologico.getSuperficie()+"");
        txtPresupuesto.setText(zoologico.getPresupuesto()+"");
        txtPais.setText(zoologico.getPais());
    }//GEN-LAST:event_cboIdZooItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboIdZoo;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdZoo;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JTextField txtSuperficie;
    // End of variables declaration//GEN-END:variables
}
