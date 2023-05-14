package itt.Vista;

import itt.DAO.DAOMesasImpl;
import itt.DAO.DAOPedidosImpl;
import itt.DAO.DAOPlatillosImpl;
import itt.DAO.DAOVentasImpl;
import itt.Interfaces.DAOMesas;
import itt.Interfaces.DAOPedidos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import itt.Interfaces.DAOPlatillos;
import itt.Interfaces.DAOVentas;
import static itt.Vista.Principal.ventasActivas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Ordenar extends javax.swing.JPanel {

    private DAOPlatillos daoPlatillos;
    private DAOPedidos daoPedidos;
    private DAOMesas daoMesa;
    private DAOVentas daoVenta;
    private DefaultTableModel modelTabla;
    private DefaultComboBoxModel modelBox;
    private int idVenta;
    private int idMesa;

    public Ordenar() {
        initComponents();
        this.setValueComponents();
    }

    public Ordenar(int idMesa) {
        initComponents();
        this.setValueComponents();
        this.jComboBoxMesas.setSelectedIndex(idMesa - 1);
        this.jComboBoxMesas.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBg = new javax.swing.JPanel();
        opciones = new javax.swing.JPanel();
        btnEntradas = new javax.swing.JButton();
        btnPlatosF = new javax.swing.JButton();
        btnPostres = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        tablaContenido = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        acciones = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jComboBoxMesas = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(750, 560));

        jPanelBg.setPreferredSize(new java.awt.Dimension(750, 560));

        opciones.setPreferredSize(new java.awt.Dimension(693, 60));

        btnEntradas.setText("ENTRADAS");
        btnEntradas.setBorder(null);
        btnEntradas.setBorderPainted(false);
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });

        btnPlatosF.setText("PLATOS FUERTES");
        btnPlatosF.setBorder(null);
        btnPlatosF.setBorderPainted(false);
        btnPlatosF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatosFActionPerformed(evt);
            }
        });

        btnPostres.setText("POSTRES");
        btnPostres.setBorder(null);
        btnPostres.setBorderPainted(false);
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });

        btnBebidas.setText("BEBIDAS");
        btnBebidas.setBorder(null);
        btnBebidas.setBorderPainted(false);
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionesLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPlatosF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btnBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPlatosF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tablaContenido.setPreferredSize(new java.awt.Dimension(750, 300));

        jScrollPane.setBorder(null);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TIPO", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout tablaContenidoLayout = new javax.swing.GroupLayout(tablaContenido);
        tablaContenido.setLayout(tablaContenidoLayout);
        tablaContenidoLayout.setHorizontalGroup(
            tablaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane)
        );
        tablaContenidoLayout.setVerticalGroup(
            tablaContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR PEDIDO");

        jLabel2.setText("BUSCAR:");

        jLabel3.setText("ID PRODUCTO:");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setText("MESA:");

        jLabel5.setText("CANTIDAD:");

        javax.swing.GroupLayout accionesLayout = new javax.swing.GroupLayout(acciones);
        acciones.setLayout(accionesLayout);
        accionesLayout.setHorizontalGroup(
            accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accionesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accionesLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(accionesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(accionesLayout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(accionesLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accionesLayout.setVerticalGroup(
            accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBgLayout = new javax.swing.GroupLayout(jPanelBg);
        jPanelBg.setLayout(jPanelBgLayout);
        jPanelBgLayout.setHorizontalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addComponent(tablaContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBgLayout.setVerticalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBgLayout.createSequentialGroup()
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tablaContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        this.setTableContentsType("bebida");
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnPlatosFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatosFActionPerformed
        this.setTableContentsType("fuerte");
    }//GEN-LAST:event_btnPlatosFActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (!this.txtID.getText().isEmpty() && !this.txtCantidad.getText().isEmpty()) {
                String idPla = this.txtID.getText();
                if (daoPlatillos.buscarID(idPla) != null) {
                    String cant = this.txtCantidad.getText();
                    if (Validations.isNumeric(cant)) {
                        if (this.jComboBoxMesas.getSelectedItem() != null) {
                            this.idMesa = Integer.parseInt(String.valueOf(this.jComboBoxMesas.getSelectedItem()));
                            if (daoPlatillos.buscarID(idPla) != null) {

                                int c = Integer.parseInt(cant);

                                if (ventasActivas[idMesa - 1] == 0) {
                                    ventasActivas[idMesa - 1] = daoVenta.agregar();
                                }
                                idVenta = ventasActivas[idMesa - 1];

                                if (daoPedidos.agregar(idVenta, idPla, c, idMesa)) {
                                    JOptionPane.showMessageDialog(null, "Pedido agregado correctamente");
                                    daoMesa.actualizarEstado(idMesa, 0);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al agregar pedido");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "ID de producto no valido");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Ninguna mesa seleccionada");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad no valida");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Platillo no valido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Favor de rellenar todos los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        if (this.jTable.getRowSelectionAllowed()) {
            int row = this.jTable.getSelectedRow();
            String id = String.valueOf(this.jTable.getValueAt(row, 0));
            this.txtID.setText(id);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        this.setTableContentsType("entrada");
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        this.setTableContentsType("postre");
    }//GEN-LAST:event_btnPostresActionPerformed

    private void setValueComponents() {
        this.txtBuscar.putClientProperty("JTextField.placeholderText", "Por ID, nombre o precio");
        this.btnAgregar.putClientProperty("JButton.buttonType", "roundRect");

        //Colocar objeto
        this.daoPlatillos = new DAOPlatillosImpl();
        this.modelTabla = (DefaultTableModel) this.jTable.getModel();
        this.setTableContents();
        this.setFormatTable();

        this.daoPedidos = new DAOPedidosImpl();
        this.daoVenta = new DAOVentasImpl();

        this.daoMesa = new DAOMesasImpl();
        this.modelBox = (DefaultComboBoxModel) this.jComboBoxMesas.getModel();
        this.setBoxContents();

    }

    private void setBoxContents() {
        try {
            daoMesa.listar().forEach(m -> modelBox.addElement(m.getIdMesa()));
        } catch (Exception ex) {
            //HACER ALGO
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
            daoPlatillos.listarTodos().forEach(p -> modelTabla.addRow(new Object[]{
                p.getIdPlatillo(),
                p.getNombre(),
                p.getTipo(),
                p.getPrecio()}));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void setTableContentsType(String tipo) {
        this.removeRowsModel();
        try {
            daoPlatillos.listar(tipo).forEach(p -> modelTabla.addRow(new Object[]{
                p.getIdPlatillo(),
                p.getNombre(),
                p.getTipo(),
                p.getPrecio()}));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void removeRowsModel() {
        while (!modelTabla.getDataVector().isEmpty()) {
            modelTabla.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acciones;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnPlatosF;
    private javax.swing.JButton btnPostres;
    private javax.swing.JComboBox<String> jComboBoxMesas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel opciones;
    private javax.swing.JPanel tablaContenido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
