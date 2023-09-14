package mysql_zoologico;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Ventana1 extends javax.swing.JFrame {

    String[] cabecera = {"IDZOO", "DESCRIPCION", "CIUDAD", "SUPERFICIE", "PRESUPUESTO", "PAIS"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    public Ventana1() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
        cargarDatosTable();
    }

    public void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(swing07.Ventana1.class.getResource("mac.jpg")));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setResizable(false);
        this.setTitle("GUI");
    }

    public void cargarDatosTable() {
        String url = "jdbc:mysql://localhost:3306/zoologico";  //protocolo-ip-puerto-bd
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                String query = "SELECT * FROM Zoologico";
                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                System.out.printf("%5s  %-26s  %-8s  %10s\n", "IDZOO", "DESCRIPCION", "CIUDAD", "SUPERFICIE");
                System.out.printf("%5s  %-26s  %-8s  %10s\n", "-----", "-----------", "------", "----------");

                String[] fblanco = {"", "", "", "", "", ""};
                int i = 0;
                while (rs.next()) {
                    String idZoo = rs.getString(1);
                    String descripcion = rs.getString(2);
                    String ciudad = rs.getString(3);
                    double superficie = rs.getDouble(4);
                    double presupuesto = rs.getDouble(5);
                    String pais = rs.getString(6);

                    dtm.addRow(fblanco);

                    dtm.setValueAt(idZoo, i, 0);
                    dtm.setValueAt(descripcion, i, 1);
                    dtm.setValueAt(ciudad, i, 2);
                    dtm.setValueAt(superficie, i, 3);
                    dtm.setValueAt(presupuesto, i, 4);
                    dtm.setValueAt(pais, i, 5);

                    i = i + 1;
                }
                conexion.close();
                //JOptionPane.showMessageDialog(this, "OK CONEXION", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "ERROR: CONEXION", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void personalizar_JTable() {
        tblContenido.setModel(dtm);
        tblContenido.setFont(new java.awt.Font("Lucida Console", 0, 14)); // Cambia la fuente de letra, el estilo y el tamaño de letra
        tblContenido.setBackground(Color.BLACK); // Cambia el color de fondo del table
        tblContenido.setForeground(Color.WHITE); // Cambia el color de letra
        tblContenido.setGridColor(Color.BLUE); // Cambia el color del grid
        tblContenido.setRowHeight(20);

        //tblContenido.setShowGrid(false); // Muestra el grid con true y lo oculta con false
        tblContenido.setShowHorizontalLines(false); // Muestra la línea horizontal del grid con true y lo oculta con false
        tblContenido.setShowVerticalLines(true); // Muestra la línea vertical del grid con true y lo oculta con false	

        tblContenido.getTableHeader().setBackground(Color.BLACK); // Cambia el color de fondo de la cabecera
        tblContenido.getTableHeader().setForeground(Color.WHITE); // Cambia el color de letra de la cabecera
        tblContenido.getTableHeader().setFont(new java.awt.Font("Courier New", 0, 14)); // Cambia la fuente, estilo y tamaño de letra de la cabecera
        tblContenido.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232))); // Cambia de color el border de la cabecera

        DefaultTableCellRenderer centerRenderer_center = new DefaultTableCellRenderer();
        centerRenderer_center.setHorizontalAlignment(JLabel.CENTER);
        tblContenido.getColumnModel().getColumn(0).setCellRenderer(centerRenderer_center); // Selecciono la columna 0 para justificar al centro el texto

        DefaultTableCellRenderer centerRenderer_right = new DefaultTableCellRenderer();
        centerRenderer_right.setHorizontalAlignment(JLabel.RIGHT);
        tblContenido.getColumnModel().getColumn(3).setCellRenderer(centerRenderer_right); // Selecciono la columna 2 para justificar a la derecha el texto
        tblContenido.getColumnModel().getColumn(4).setCellRenderer(centerRenderer_right);
    }

    public void limpiarTable() {
        int nf = dtm.getRowCount();
        for (int i = 0; i < nf; i++) {
            dtm.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        cmdRefrescar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tblContenido.setBackground(new java.awt.Color(0, 0, 0));
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
        jScrollPane1.setViewportView(tblContenido);

        cmdRefrescar.setBackground(new java.awt.Color(0, 0, 0));
        cmdRefrescar.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cmdRefrescar.setForeground(new java.awt.Color(255, 255, 255));
        cmdRefrescar.setText("REFRESCAR");
        cmdRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefrescarActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MOSTRAR TABLA ZOOLOGICO");
        lblTitulo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(cmdRefrescar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(cmdRefrescar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefrescarActionPerformed
        limpiarTable();
        cargarDatosTable();
    }//GEN-LAST:event_cmdRefrescarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
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
