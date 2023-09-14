/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing_MySql;

import java.awt.Color;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

/**
 *
 * @author pedro
 */
public class JTablet_Insertar extends javax.swing.JFrame {

    String[] cabecera = {"IDZOO","DESCRIPCION", "CIUDAD", "SUPERFICIE","PRESUPUESTO","PAIS"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    public JTablet_Insertar() {
        initComponents();
        personalizar_JTable();
        cargarDatosTable();
    }
    public void personalizar_JFrame(){
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        //this.setLocationRelativeTo(null);
         
       //this.setIconImage(Toolkit.getDefaultToolkit().createImage(Jtable1.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        //this.setSize(500, 500);
        this.setTitle("JTABLE");
    }
public void personalizar_JTable(){
        
        tblContenido.setModel(dtm);
        tblContenido.setFont(new java.awt.Font("Lucinda Console", 0, 14));
        tblContenido.setGridColor(Color.RED);
        tblContenido.getTableHeader().setBackground(Color.BLACK);
        tblContenido.getTableHeader().setForeground(Color.blue);
        tblContenido.getTableHeader().setFont(new java.awt.Font("Calibri", 0, 14));
        //blContenido.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232)));
        DefaultTableCellRenderer centerRenderer_center = new DefaultTableCellRenderer();
        centerRenderer_center.setHorizontalAlignment(JLabel.CENTER);
        tblContenido.getColumnModel().getColumn(0).setCellRenderer(centerRenderer_center);
        
        DefaultTableCellRenderer centerRenderer_right = new DefaultTableCellRenderer();
        centerRenderer_right.setHorizontalAlignment(JLabel.RIGHT);
        tblContenido.getColumnModel().getColumn(3).setCellRenderer(centerRenderer_center);
        tblContenido.getColumnModel().getColumn(4).setCellRenderer(centerRenderer_center);
    }
    
    
    public void cargarDatosTable(){
        
        String url = "jdbc:mysql://localhost:3306/zoologico";      
        
        // el usuario
        
            String usuario ="root";
        //la clave en nuestro caso no tenemos clave
            String clave ="";
        
            try{
                Connection conexion=DriverManager.getConnection(url,usuario,clave);
                
                if (conexion !=null){
                    
                    //System.out.println("OK: Conexion");
                        JOptionPane.showMessageDialog(this,"OK CONEXION","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
                    
                    //vamos a hacer una query desde aqui
                    
                    String query = "Select * from Zoologico";
                    // hay que mandarlo para ello hay que convertir
                    PreparedStatement ps = conexion.prepareStatement(query);
                    
                    //ahora hay que hacer lo que nos muestras 
                    ResultSet rs = ps.executeQuery();
                    
                    System.out.printf("%5s  %-30s  %-15s  %10s\n","IdZoo","Descripcion","Ciudad","Superficie");
                    System.out.printf("%5s  %-30s  %-15s  %10s\n","-----","-----------","------","----------");
                    
                    //hacemos el fblanco
                    String[] fblanco ={"","","","","",""};
                    
                    int i =0;
                    while(rs.next()){
                        
                       //pintamos en la linea en blanco
                       
                       dtm.addRow(fblanco);
                       
                       
                                             
                        
                        // hay que ponerlo en el orden de la tabla usar Describe en bd
                        // cogemos las 4 primeras columnas
                        String idZoo= rs.getString(1);//(1) la posicion en la bd de columna
                        String descripcion=rs.getString(2);
                        String ciudad=rs.getString(3);
                        double superficie=rs.getDouble(4);
                        double presupuesto =rs.getDouble(5);
                        String pais = rs.getString(6);
                        
                        // la impresion
                        System.out.printf("%5s  %-30s  %-15s  %10.2f\n",idZoo,descripcion,ciudad,superficie);
                        
                        //añadimos los valores
                        dtm.setValueAt(idZoo,       i, 0);
                        dtm.setValueAt(descripcion, i, 1);
                        dtm.setValueAt(ciudad,      i, 2);
                        dtm.setValueAt(superficie,  i, 3);
                        dtm.setValueAt(presupuesto, i, 4);
                        dtm.setValueAt(pais,        i, 5);
                        
                        //aqui incrementamos a 1
                        i =i+1;                                 
                    }
                    conexion.close();
                    
                }else{
                    System.out.println("ERROR: Conexion");
                    JOptionPane.showMessageDialog(this,"ERROR: Conexion","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                
            }catch(Exception e){
                
                System.out.println("ERROR: "+e);
                JOptionPane.showMessageDialog(this,"ERROR: "+e,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
       

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        cmdRefrescar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tblContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblContenido.setShowHorizontalLines(true);
        tblContenido.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblContenido);

        cmdRefrescar.setText("REFRESCAR");
        cmdRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefrescarActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(204, 204, 204));
        lblTitulo.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MOSTRAR DATOS ZOOLOGICO");
        lblTitulo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdRefrescar)
                .addGap(341, 341, 341))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdRefrescar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefrescarActionPerformed
        // Llamos a cargar table para ver si se actualizado
        //hay que limpiar toda la tabla para luego volver a cargarla
        limpiarTable();
        cargarDatosTable();
    }//GEN-LAST:event_cmdRefrescarActionPerformed
    public void limpiarTable() {
        int nf = dtm.getRowCount();//mira cuantas filas tiene y empieza a eliminar
        for (int i = 0; i < nf; i++) {
            dtm.removeRow(0);
        }
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
            java.util.logging.Logger.getLogger(JTablet_Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTablet_Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTablet_Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTablet_Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTablet_Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdRefrescar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblContenido;
    // End of variables declaration//GEN-END:variables
}
