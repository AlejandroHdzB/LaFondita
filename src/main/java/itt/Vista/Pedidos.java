package itt.Vista;

import itt.DAO.DAOPedidosImpl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import itt.Interfaces.DAOPedidos;

public class Pedidos extends javax.swing.JPanel {

    private DAOPedidos dao;
    private DefaultTableModel model;

    public Pedidos() {
        initComponents();
        this.setValueComponents();
    }

    private void setValueComponents() {
        this.btnCancelar.putClientProperty("JButton.buttonType", "roundRect");

        //Colocar objeto
        this.dao = new DAOPedidosImpl();
        this.model = (DefaultTableModel) this.jTable.getModel();
        this.setTableContents();
    }

    private void setTableContents() {
        try {
            dao.listar().forEach(o -> model.addRow(new Object[]{
                o.getIdVenta(),
                o.getIdPlatillo().getNombre(),
                o.getCantidad(),
                (o.getCantidad() * o.getIdPlatillo().getPrecio())}));
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
        tablaContenido = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jPanelBg.setPreferredSize(new java.awt.Dimension(750, 560));

        btnCancelar.setText("CANCELAR PEDIDO");

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesLayout.createSequentialGroup()
                .addContainerGap(555, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(25, 25, 25))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CUENTA", "PRODUCTO", "CANTIDAD", "SUBTOTAL"
            }
        ));
        jScrollPane.setViewportView(jTable);

        javax.swing.GroupLayout tablaContenidoLayout = new javax.swing.GroupLayout(tablaContenido);
        tablaContenido.setLayout(tablaContenidoLayout);
        tablaContenidoLayout.setHorizontalGroup(
            tablaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane)
        );
        tablaContenidoLayout.setVerticalGroup(
            tablaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
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
                .addComponent(tablaContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel opciones;
    private javax.swing.JPanel tablaContenido;
    // End of variables declaration//GEN-END:variables
}
