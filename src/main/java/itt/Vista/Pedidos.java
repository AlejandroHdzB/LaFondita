package itt.Vista;

import itt.DAO.DAOPedidosImpl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import itt.Interfaces.DAOPedidos;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import static itt.Vista.InicioSesion.*;

public class Pedidos extends javax.swing.JPanel {

    private DAOPedidos dao;
    private DefaultTableModel model;
    
    private final String PENDIENTE = "PENDIENTE";
    private final String ENTREGADO = "ENTREGADO";
    private final String CANCELADO = "CANCELADO";
    

    public Pedidos() {
        initComponents();
        this.setValueComponents();
    }

    private void setValueComponents() {
        this.btnCancelar.putClientProperty("JButton.buttonType", "roundRect");
        this.btnEntregar.putClientProperty("JButton.buttonType", "roundRect");

        //Colocar objeto
        this.dao = new DAOPedidosImpl();
        this.model = (DefaultTableModel) this.jTable.getModel();
        this.setTableContents();
        this.setFormatTable();
    }
    
    private void setFormatTable(){
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < this.jTable.getColumnCount(); i++) {
            this.jTable.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
        
    }

    private void setTableContents() {
        try {
            dao.listar("PENDIENTE").forEach(o -> model.addRow(new Object[]{
                o.getIdVenta(),
                o.getIdMesa(),
                o.getHora(),
                o.getIdPlatillo().getNombre(),
                o.getCantidad(),
                o.getSubtotal()}));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void removeRowsModel() {
        while (!model.getDataVector().isEmpty()) {
            model.removeRow(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBg = new javax.swing.JPanel();
        opciones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnEntregar = new javax.swing.JButton();
        tablaContenido = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jPanelBg.setPreferredSize(new java.awt.Dimension(750, 560));

        btnCancelar.setText("CANCELAR PEDIDO");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEntregar.setText("MARCAR ENTREGADO");
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnEntregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(25, 25, 25))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUENTA", "MESA", "HORA", "PRODUCTO", "CANTIDAD", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout tablaContenidoLayout = new javax.swing.GroupLayout(tablaContenido);
        tablaContenido.setLayout(tablaContenidoLayout);
        tablaContenidoLayout.setHorizontalGroup(
            tablaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        tablaContenidoLayout.setVerticalGroup(
            tablaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelBgLayout = new javax.swing.GroupLayout(jPanelBg);
        jPanelBg.setLayout(jPanelBgLayout);
        jPanelBgLayout.setHorizontalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablaContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBgLayout.setVerticalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgLayout.createSequentialGroup()
                .addComponent(tablaContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.cambiarEstado(CANCELADO);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        this.cambiarEstado(ENTREGADO);
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void cambiarEstado(String estado){
        try {
            if (this.jTable.getRowSelectionAllowed()) {
                int row = this.jTable.getSelectedRow();
                int id = Integer.parseInt(String.valueOf(this.jTable.getValueAt(row, 0)));
                String platillo = String.valueOf(this.jTable.getValueAt(row, 3));
                String hora = String.valueOf(this.jTable.getValueAt(row, 2));

                int e = dao.actualizar(id, platillo, vg.fechaSistema, hora, estado);
                if (e != 0) {
                    JOptionPane.showMessageDialog(null, "Cambio exitoso");
                    this.removeRowsModel();
                    this.setTableContents();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al cambiar el estado del pedido");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel opciones;
    private javax.swing.JPanel tablaContenido;
    // End of variables declaration//GEN-END:variables
}
