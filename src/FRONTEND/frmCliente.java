/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTEND;


import BACKEND.clsClientes;
import BACKEND.clsDetalle;
import BACKEND.clsProducto;
import BACKEND.clsVenta;
import DATA.clsQuerys;
import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.lang.Object;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author geovanni
 */
public class frmCliente extends javax.swing.JFrame {

    /**
     * Creates new form frmCliente
     */
    public frmCliente() {
        initComponents();
        initComponents();
        //ImageIcon imagen = new ImageIcon ("src/img/fondo.jpg");
        //Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblEncabezado.getWidth(), lblEncabezado.getHeight(), Image.SCALE_DEFAULT));
        //lblEncabezado.setIcon(icono);
        //this.repaint();
        Limpiar();
        ctID.setVisible(false);
    }
    public void Limpiar(){
        ctID.setText("");
        ctNombre.setText("");
        ctDireccion.setText("");
        ctNIT.setText("");
        CargarClientes();
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
        tbClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ctNombre = new javax.swing.JTextField();
        ctID = new javax.swing.JTextField();
        ctDireccion = new javax.swing.JTextField();
        ctNIT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "NIT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        jLabel3.setText("NOMBRE:");

        ctNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ctDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ctDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctDireccionActionPerformed(evt);
            }
        });

        ctNIT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setText("NIT:");

        jLabel5.setText("DIRECCION");

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnRecargar.setText("RECARGAR");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ctNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(312, 312, 312)
                                                .addComponent(ctID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(45, 45, 45)
                                                .addComponent(ctDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(ctNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(ctNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ctDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRecargar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar)
                        .addComponent(btnInsertar)
                        .addComponent(btnModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void CargarClientes(){
        
        DefaultTableModel modeloTabla =  (DefaultTableModel)tbClientes.getModel();
        modeloTabla.setRowCount(0); //ELIMINO FILAS
        
        ResultSet rs;  //BD
        ResultSetMetaData rsmd;  // TABLA
        int Columnas;
        
        
        try{
                    
            clsQuerys objBD = new clsQuerys();
            rs = objBD.fncConsultaCliente(0);
            rsmd = rs.getMetaData();
            Columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[Columnas];
                for(int indice = 0; indice < Columnas; indice ++){
                    fila[indice] = rs.getObject(indice + 1 );
                }
                modeloTabla.addRow(fila);
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        
        
    }
    
    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        try{
            int fila = tbClientes.getSelectedRow();
            int Codigo =   Integer.parseInt(  tbClientes.getValueAt(fila, 0).toString()    )  ;
            ResultSet rs;
            clsQuerys objBD = new clsQuerys();
            rs = objBD.fncConsultaCliente(Codigo);

            while(rs.next()){
                ctID.setText(    rs.getString("ID")     );
                ctNombre.setText( rs.getString("NOMBRE")  );
                ctDireccion.setText( rs.getString("USUARIO")  );
                ctNIT.setText( rs.getString("NIT") );
            }
            JOptionPane.showMessageDialog(this,  String.valueOf(Codigo)    );
        }catch(Exception Ex){
            System.out.println( Ex.getMessage());
        }
    }//GEN-LAST:event_tbClientesMouseClicked

    private void ctDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctDireccionActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if(fncValidaFormulario()==1){
            if(ctID.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Debe seleccionar un registro para actualizar");
            }else{
                clsClientes objCliente = new clsClientes();
                objCliente.setID(Integer.valueOf(  ctID.getText()    ) );

                objCliente.setNOMBRE(  ctNombre.getText()   );
                objCliente.setDESCRIPCION(  ctDireccion.getText()   );
                 objCliente.setNIT(Integer.valueOf(  ctNIT.getText()    ) );
                

                clsQuerys objBD = new clsQuerys();  //CREA UN INSTANCIA

                if(  objBD.fncModificaCliente(objCliente)==1){
                    JOptionPane.showMessageDialog(this, "Registro fue Actualizado.");
                    CargarClientes();
                    Limpiar();
                }else{
                    JOptionPane.showMessageDialog(this, "Registro NO Ingresado.");
                }
            }
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        clsQuerys objBD = new clsQuerys();
        if(ctID.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro para eliminar");
        }else{
            if (    objBD.fncEliminaPersona( Integer.valueOf(  ctID.getText()    ) ) ==1 ){
                JOptionPane.showMessageDialog(this, "Se eliminó correctamente el registro.");
                CargarClientes();
                Limpiar();

            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecargarActionPerformed

    
    private int fncValidaFormulario(){
        int Resp =0;
        if( ctNombre.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre de la persona.");
        }else{
            if (ctNIT.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Debe ingresar el usuario de la persona."); 
            }else{
                if (ctDireccion.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Debe ingresar el password de la persona."); 
                }else{
                    if (ctID.getText().equals("")){
                        JOptionPane.showMessageDialog(this, "Debe confirmar el password de la persona.");
                    }else{
                         Resp =1;
                    }
                }
            }
        }
        
        return Resp;
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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JTextField ctDireccion;
    private javax.swing.JTextField ctID;
    private javax.swing.JTextField ctNIT;
    private javax.swing.JTextField ctNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}
