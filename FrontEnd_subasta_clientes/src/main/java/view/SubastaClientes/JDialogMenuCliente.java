package view.SubastaClientes;

import java.util.ArrayList;
import java.util.List;
import models.Producto;
import services.ProductoServices;
import view.SubastaProductos.JPanelConsultarProducto;
import view.SubastaProductos.JPanelConsultarSubasta;
import view.SubastaProductos.JPanelOfrecerOferta;
import view.SubastaProductos.JPanelProductsSubastados;

/**
 *
 * @author YazminG, ErikaC
 */
public class JDialogMenuCliente extends javax.swing.JDialog {
    private JPanelConsultarProducto objConsultarProducto;
    private JPanelConsultarSubasta objConsultarSubasta;
    private JPanelOfrecerOferta objOfrecerOferta;
    private JPanelProductsSubastados objProductsSubast;
    //JPanel jPanelCentral;
    /**
     * Creates new form JDialogMenuCliente
     */
    public JDialogMenuCliente(JDialogInicioSesionCli parent, boolean modal) {
        super(parent, modal);
        this.objConsultarProducto = new JPanelConsultarProducto();
        this.objConsultarSubasta = new JPanelConsultarSubasta();
        this.objOfrecerOferta = new JPanelOfrecerOferta();
        this.objProductsSubast = new JPanelProductsSubastados();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIzq = new javax.swing.JPanel();
        btnProductSubast = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnProductSubast.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnProductSubast.setText("Productos subastados");
        btnProductSubast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductSubastActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jButton1.setText("Consultar producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProductoActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jButton2.setText("Consultar subasta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSubastaActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jButton3.setText("Ofrecer oferta producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfrecerOfertaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIzqLayout = new javax.swing.GroupLayout(jPanelIzq);
        jPanelIzq.setLayout(jPanelIzqLayout);
        jPanelIzqLayout.setHorizontalGroup(
            jPanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIzqLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductSubast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelIzqLayout.setVerticalGroup(
            jPanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIzqLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductSubast, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCentral.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("MENÚ CLIENTES");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(338, 338, 338))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProductoActionPerformed
        consultarProducto();
    }//GEN-LAST:event_btnConsultarProductoActionPerformed

    private void btnProductSubastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductSubastActionPerformed
        consultarProductosSubast();
    }//GEN-LAST:event_btnProductSubastActionPerformed

    private void btnOfrecerOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfrecerOfertaActionPerformed
        ofrecerOfertaProduct();
    }//GEN-LAST:event_btnOfrecerOfertaActionPerformed

    private void btnConsultarSubastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSubastaActionPerformed
        consultarSubasta();
// TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarSubastaActionPerformed

    public void consultarProducto(){
        this.jPanelCentral.remove(this.objConsultarSubasta);
        this.jPanelCentral.remove(this.objOfrecerOferta);
        this.jPanelCentral.remove(this.objProductsSubast);
        this.jPanelCentral.add(this.objConsultarProducto);
        this.jPanelCentral.revalidate();
        this.jPanelCentral.repaint();
    }
    public void consultarProductosSubast(){
        this.jPanelCentral.remove(this.objConsultarSubasta);
        this.jPanelCentral.remove(this.objOfrecerOferta);
        this.jPanelCentral.remove(this.objConsultarProducto);
        this.jPanelCentral.add(this.objProductsSubast);
        this.jPanelCentral.revalidate();
        this.jPanelCentral.repaint();
    }

    public void ofrecerOfertaProduct(){
        this.jPanelCentral.remove(this.objConsultarSubasta);
        this.jPanelCentral.remove(this.objProductsSubast);
        this.jPanelCentral.remove(this.objConsultarProducto);
        this.jPanelCentral.add(this.objOfrecerOferta);
        this.jPanelCentral.revalidate();
        this.jPanelCentral.repaint();
    }
    public void consultarSubasta(){
        this.jPanelCentral.remove(this.objOfrecerOferta);
        this.jPanelCentral.remove(this.objProductsSubast);
        this.jPanelCentral.remove(this.objConsultarProducto);
        this.jPanelCentral.add(this.objConsultarSubasta);
        this.jPanelCentral.revalidate();
        this.jPanelCentral.repaint();
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                JDialogMenuCliente dialog = new JDialogMenuCliente(new JDialogInicioSesionCli, true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProductSubast;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelIzq;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
