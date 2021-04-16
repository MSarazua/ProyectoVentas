/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTEND;

import BACKEND.clsDetalle;
import BACKEND.clsProducto;
import BACKEND.clsVenta;
import DATA.clsQuerys;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.lang.Object;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MSarazua
 */
public class frmVenta extends javax.swing.JFrame {
    clsVenta v = new clsVenta();
    clsQuerys q = new clsQuerys();
    clsProducto pro = new clsProducto();
    DefaultTableModel modelo = new DefaultTableModel();
    clsDetalle Dv = new clsDetalle();
    int item;
    double Totalpagar = 0.00;
    /**
     * Creates new form frmVenta
     */
    public frmVenta() {
        initComponents();
    }
    
    private void RegistrarVenta(){
        //Date fecha = new Date(); //fecha y hora actual
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String FECHA = fechas.getText();
        String NIT = ctNit.getText();
        String NOMBRE = ctNombre.getText();
        String DIRECCION = ctDireccion.getText();
        double MONTO_TOTAL = (Double.valueOf(total.getText()));
        int CANTIDAD_PRODUCTOS = (Integer.valueOf(ctCantidad.getText()));
        String ESTATUS = ctStatus.getText();
        
        v.setFECHA(FECHA);
        v.setNIT(NIT);
        v.setNOMBRE(NOMBRE);
        v.setDIRECCION(DIRECCION);
        v.setMONTO_TOTAL(MONTO_TOTAL);
        v.setCANTIDAD_PRODUCTOS(CANTIDAD_PRODUCTOS);
        v.setESTATUS(ESTATUS);
        q.RegistrarVenta(v);
    }

    private void RegistrarDetalle(){
        int FACTURA = q.IdVenta();
        for (int i = 0; i < TableVentas.getRowCount(); i++){
            int cod = (int) TableVentas.getValueAt(i,0);
            int cant = Integer.parseInt(TableVentas.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(TableVentas.getValueAt(i, 3).toString());
            Dv.setCOD_PRODUTO(cod);
            Dv.setCANTIDAD(cant);
            Dv.setPRECIO(precio);
            Dv.setFACTURA(FACTURA);
            q.RegistrarDetalle(Dv);
        }
    }
    
    private void ActualizarStock(){
        for (int i = 0; i < TableVentas.getRowCount(); i++){
            int cod = Integer.parseInt(TableVentas.getValueAt(i, 0).toString());
            int cant = Integer.parseInt(TableVentas.getValueAt(i, 2).toString());
            pro = q.BuscarPro(cod);
            int StockActual = pro.getCantidad() - cant;
            q.ActualizarStock(StockActual, cod);
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ctCodigo = new javax.swing.JTextField();
        ctDesc = new javax.swing.JTextField();
        ctCantidad = new javax.swing.JTextField();
        ctPreciio = new javax.swing.JTextField();
        fechas = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        ctNit = new javax.swing.JTextField();
        ctDireccion = new javax.swing.JTextField();
        ctStatus = new javax.swing.JTextField();
        ctNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ctStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(987, 824));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REGISTRO DE VENTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(209, 209, 209))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("CÓDIGO");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("DESCRIPCIÓN");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("CANTIDAD");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("PRECIO");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Total a pagar: ");

        ctCodigo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ctCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ctCodigoKeyPressed(evt);
            }
        });

        ctDesc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        ctCantidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ctCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ctCantidadKeyPressed(evt);
            }
        });

        ctPreciio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        fechas.setText("FECHA");

        total.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        total.setText("0");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("NIT");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("DIRECCIÓN");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("NOMBRE");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("ESTATUS");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setText("Stock");

        ctStock.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        TableVentas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Cantidad", "Precio", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctNit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(ctStatus))
                        .addGap(50, 50, 50)
                        .addComponent(fechas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total)
                        .addGap(176, 176, 176))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ctCodigo)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel3)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ctDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ctCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ctPreciio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(ctStock, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ctStatus)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ctNit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ctDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ctNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctPreciio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(total)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        RegistrarVenta();
        RegistrarDetalle();
        ActualizarStock();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void ctCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctCodigoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!"".equals(ctCodigo.getText())){
                int COD_PRODUTO = (Integer.valueOf(ctCodigo.getText()));
                pro = q.BuscarPro(COD_PRODUTO);
                if(pro.getNombre() != null){
                    ctDesc.setText(""+pro.getNombre());
                    ctPreciio.setText(""+pro.getPrecio());
                    ctStock.setText(""+pro.getCantidad());
                    ctCantidad.requestFocus();
                }else{
                    ctDesc.setText("");
                    ctPreciio.setText("");
                    ctStock.setText("");
                    ctCodigo.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese el código del producto");
                ctCodigo.requestFocus();
            }
        }
    }//GEN-LAST:event_ctCodigoKeyPressed

    private void ctCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctCantidadKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!"".equals(ctCantidad.getText())){
                int COD_PRODUTO = (Integer.valueOf(ctCodigo.getText()));
                String descripcion = ctDesc.getText();
                int cant = (Integer.parseInt(ctCantidad.getText()));
                double precio = Double.parseDouble(ctPreciio.getText());
                double total = cant * precio;
                int stock = (Integer.parseInt(ctStock.getText()));
                if(stock >= cant){
                    item = item + 1; 
                    modelo = (DefaultTableModel) TableVentas.getModel();
                    item = item + 1; 
                    modelo = (DefaultTableModel) TableVentas.getModel();
                    for(int i = 0; i < TableVentas.getRowCount(); i++){
                        if(TableVentas.getValueAt(i, 1).equals(ctDesc.getText())){
                            JOptionPane.showMessageDialog(null, "El producto ya ha sido ingresado");
                            return;
                        }
                    }
                    ArrayList lista = new ArrayList();
                    lista.add(item);
                    lista.add(COD_PRODUTO);
                    lista.add(descripcion);
                    lista.add(cant);
                    lista.add(precio);
                    lista.add(total);
                    Object[] O = new Object[5];
                    O[0] = lista.get(1);
                    O[1] = lista.get(2);
                    O[2] = lista.get(3);
                    O[3] = lista.get(4);
                    O[4] = lista.get(5);
                    modelo.addRow(O);
                    TableVentas.setModel(modelo);
                    TotalPagar();
                }else{
                    JOptionPane.showMessageDialog(null, "Stock no disponible");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese cantidad");
            }
        }
    }//GEN-LAST:event_ctCantidadKeyPressed

    private void TableVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableVentasMouseClicked

    }//GEN-LAST:event_TableVentasMouseClicked

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
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableVentas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField ctCantidad;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JTextField ctDesc;
    private javax.swing.JTextField ctDireccion;
    private javax.swing.JTextField ctNit;
    private javax.swing.JTextField ctNombre;
    private javax.swing.JTextField ctPreciio;
    private javax.swing.JTextField ctStatus;
    private javax.swing.JTextField ctStock;
    private javax.swing.JLabel fechas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
    
    private void TotalPagar(){
        Totalpagar = 0.00;
        int numFila = TableVentas.getRowCount();
        for (int i = 0; i < numFila; i++){
            double cal = Double.parseDouble(String.valueOf(TableVentas.getModel().getValueAt(i, 4)));
            Totalpagar = (Totalpagar + cal);
        }
        total.setText(String.valueOf(Totalpagar));
    }
}
