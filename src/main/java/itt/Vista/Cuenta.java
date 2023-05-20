package itt.Vista;

import itt.DAO.DAOMesasImpl;
import itt.DAO.DAOPedidosImpl;
import itt.DAO.DAOVentasImpl;
import itt.Interfaces.DAOMesas;
import itt.Interfaces.DAOPedidos;
import itt.Interfaces.DAOVentas;
import itt.Modelos.Venta;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static itt.Vista.InicioSesion.*;

public class Cuenta extends javax.swing.JPanel {

    private DAOPedidos daoPedido;
    private DAOVentas daoVenta;
    private DAOMesas daoMesa;
    private Venta venta;
    private DefaultTableModel model;
    private final int idVenta;
    private final int idMesa;

    public Cuenta(int id) {
        initComponents();
        this.idVenta = vg.ventasActivas[id - 1];
        this.idMesa = id;
        this.setValueComponents();
    }

    private void setValueComponents() {

        try {
            daoVenta = new DAOVentasImpl();
            if (daoVenta.actualizar(idVenta) != 0) {

                daoPedido = new DAOPedidosImpl();
                this.model = (DefaultTableModel) this.jTable.getModel();
                this.setTableContents();
                this.setFormatTable();

                venta = daoVenta.getDatosCuenta(idVenta);
                this.lblMesero.setText("MESERO: " + venta.getMesero().getNombre() + " " + venta.getMesero().getApellido());
                this.lblTotal.setText("TOTAL: $" + venta.getTotal());
                this.lblFecha.setText("FECHA: " + venta.getFecha());
                this.lblHora.setText("HORA: " + venta.getHora());
                this.lblMesa.setText("MESA: " + idMesa);
                
                daoMesa = new DAOMesasImpl();
                daoMesa.actualizarEstado(idMesa, 1);
                
                vg.ventasActivas[idMesa - 1] = 0;
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL GENERAR CUENTA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void setFormatTable() {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < this.jTable.getColumnCount(); i++) {
            this.jTable.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }

    }

    private void setTableContents() {
        try {
            daoPedido.listar(idVenta,"2").forEach(o -> model.addRow(new Object[]{
                o.getIdPlatillo().getNombre(),
                o.getIdPlatillo().getPrecio(),
                o.getCantidad(),
                o.getSubtotal()}));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBg = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblMesa = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        lblMesero = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        jLabelTitulo.setFont(new java.awt.Font("NTR", 1, 70)); // NOI18N
        jLabelTitulo.setText("CUENTA");

        lblFecha.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        lblFecha.setText("FECHA:");

        lblHora.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        lblHora.setText("HORA:");

        lblMesa.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        lblMesa.setText("MESA:");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO", "CANTIDAD", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        lblMesero.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        lblMesero.setText("MESERO:");

        lblTotal.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        lblTotal.setText("TOTAL:");

        javax.swing.GroupLayout jPanelBgLayout = new javax.swing.GroupLayout(jPanelBg);
        jPanelBg.setLayout(jPanelBgLayout);
        jPanelBgLayout.setHorizontalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBgLayout.createSequentialGroup()
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBgLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblMesa))
                            .addGroup(jPanelBgLayout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabelTitulo)
                                .addGap(76, 76, 76)
                                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHora)
                                    .addComponent(lblFecha))))
                        .addGap(0, 166, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelBgLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblMesero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addGap(120, 120, 120))
        );
        jPanelBgLayout.setVerticalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBgLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(lblHora)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha)))
                .addGap(12, 12, 12)
                .addComponent(lblMesa)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMesero)
                    .addComponent(lblTotal))
                .addContainerGap(42, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblMesero;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
