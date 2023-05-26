package itt.Vista;

import itt.DAO.DAOPlatillosImpl;
import itt.Interfaces.DAOPlatillos;
import itt.Modelos.Platillo;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ModPlatillos extends javax.swing.JPanel {

    private DefaultComboBoxModel boxActualizar;
    private DefaultComboBoxModel boxEliminar;
    private DAOPlatillos daoPlatillo;

    public ModPlatillos() {
        initComponents();
        this.setValueComponents();
    }

    private void setValueComponents() {
        this.txtName.putClientProperty("JTextField.placeholderText", "Ingresa el nombre");
        this.txtActName.putClientProperty("JTextField.placeholderText", "Ingresa el nombre");
        this.txtActPrecio.putClientProperty("JTextField.placeholderText", "Ingresa el precio");

        this.btnAgregar.putClientProperty("JButton.buttonType", "roundRect");
        this.btnActualizar.putClientProperty("JButton.buttonType", "roundRect");
        this.btnEliminar.putClientProperty("JButton.buttonType", "roundRect");

        daoPlatillo = new DAOPlatillosImpl();
        this.boxActualizar = (DefaultComboBoxModel) this.cbxId.getModel();
        this.boxEliminar = (DefaultComboBoxModel) this.cbxElmId.getModel();
        this.setBoxContents();

        this.txtActName.setText("");
        this.txtActPrecio.setText("");

        this.txtElmName.setText("");
        this.txtElmPrecio.setText("");
        this.txtElmTipo.setText("");

        this.txtElmName.setEditable(false);
        this.txtElmTipo.setEditable(false);
        this.txtElmPrecio.setEditable(false);
    }

    private void setBoxContents() {
        try {
            daoPlatillo.listarTodos().forEach(p -> boxActualizar.addElement(p.getIdPlatillo()));
            daoPlatillo.listarTodos().forEach(p -> boxEliminar.addElement(p.getIdPlatillo()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cbxId = new javax.swing.JComboBox<>();
        txtActName = new javax.swing.JTextField();
        txtActPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxActTipo = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        cbxElmId = new javax.swing.JComboBox<>();
        txtElmName = new javax.swing.JTextField();
        txtElmPrecio = new javax.swing.JTextField();
        txtElmTipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel1.setText("                    Agregar un platillo");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel2.setText("                  Actualizar un platillo");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel3.setText("                    Eliminar un platillo");

        txtName.setPreferredSize(new java.awt.Dimension(64, 30));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Fuerte", "Postre", "Bebida" }));
        cbxTipo.setPreferredSize(new java.awt.Dimension(74, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setPreferredSize(new java.awt.Dimension(91, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnAgregarKeyTyped(evt);
            }
        });

        cbxId.setPreferredSize(new java.awt.Dimension(72, 30));
        cbxId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxIdItemStateChanged(evt);
            }
        });

        txtActName.setPreferredSize(new java.awt.Dimension(64, 30));

        txtActPrecio.setPreferredSize(new java.awt.Dimension(64, 30));
        txtActPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActPrecioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("ID:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Precio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tipo:");

        cbxActTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Fuerte", "Postre", "Bebida" }));
        cbxActTipo.setPreferredSize(new java.awt.Dimension(74, 30));
        cbxActTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbxActTipoKeyTyped(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        btnActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnActualizarKeyTyped(evt);
            }
        });

        cbxElmId.setPreferredSize(new java.awt.Dimension(73, 30));
        cbxElmId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxElmIdItemStateChanged(evt);
            }
        });
        cbxElmId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbxElmIdKeyTyped(evt);
            }
        });

        txtElmName.setPreferredSize(new java.awt.Dimension(64, 30));

        txtElmPrecio.setPreferredSize(new java.awt.Dimension(71, 30));

        txtElmTipo.setPreferredSize(new java.awt.Dimension(71, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("ID:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Precio:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Tipo:");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.setPreferredSize(new java.awt.Dimension(83, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        btnEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnEliminarKeyTyped(evt);
            }
        });

        txtPrecio.setPreferredSize(new java.awt.Dimension(64, 30));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Precio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtActName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(txtActPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxActTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxElmId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtElmName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtElmPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtElmTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(jLabel14)
                        .addGap(5, 5, 5)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtActName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtActPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbxActTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtElmName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxElmId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtElmTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtElmPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codigoInsertar() {
        try {
            String tipo = String.valueOf(this.cbxTipo.getSelectedItem()).toLowerCase();
            String nombre = this.txtName.getText();

            if (Validations.isDecimal(this.txtPrecio.getText())) {
                double precio = Double.parseDouble(this.txtPrecio.getText());
                boolean ins = daoPlatillo.agregar(nombre, tipo, precio);

                if (ins) {
                    JOptionPane.showMessageDialog(null, "Platillo agregado");

                    this.txtName.setText("");
                    this.txtPrecio.setText("");

                    this.boxEliminar.removeAllElements();
                    this.boxActualizar.removeAllElements();
                    this.setBoxContents();

                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar platillo");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Campo de precio no valido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void codigoActualizar() {
        try {
            String id = String.valueOf(this.cbxId.getSelectedItem());
            String tipo = String.valueOf(this.cbxActTipo.getSelectedItem()).toLowerCase();
            String nombre = this.txtName.getText();
            if (Validations.isDecimal(this.txtActPrecio.getText())) {
                double precio = Double.parseDouble(this.txtActPrecio.getText());
                boolean ins = daoPlatillo.actualizar(id, nombre, tipo, precio);

                if (ins) {
                    JOptionPane.showMessageDialog(null, "Platillo actualizado");

                    this.txtActName.setText("");
                    this.txtActPrecio.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar platillo");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Campo de precio no valido");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void codigoEliminar() {
        try {
            String id = String.valueOf(this.cbxElmId.getSelectedItem());
            boolean ins = daoPlatillo.eliminar(id);
            if (ins) {
                JOptionPane.showMessageDialog(null, "Platillo eliminado");

                this.txtElmName.setText("");
                this.txtElmPrecio.setText("");
                this.txtElmTipo.setText("");

                this.boxEliminar.removeAllElements();
                this.boxActualizar.removeAllElements();
                this.setBoxContents();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar platillo");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.codigoActualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int b = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar este platillo", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (b == 0) {
            this.codigoEliminar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.codigoInsertar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char tecla = evt.getKeyChar();

        if (tecla == KeyEvent.VK_ENTER) {
            this.codigoInsertar();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void cbxIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxIdItemStateChanged
        try {
            String id = String.valueOf(this.cbxId.getSelectedItem());
            Platillo p = daoPlatillo.buscarID(id);

            this.txtActName.setText(p.getNombre());
            this.txtActPrecio.setText(String.valueOf((double) p.getPrecio()));
            String t = p.getTipo();
            String tipo = t.toUpperCase().charAt(0) + t.substring(1, t.length());
            this.cbxActTipo.setSelectedItem(tipo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_cbxIdItemStateChanged

    private void txtActPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActPrecioKeyTyped
        char tecla = evt.getKeyChar();

        if (tecla == KeyEvent.VK_ENTER) {
            this.codigoActualizar();
        }
    }//GEN-LAST:event_txtActPrecioKeyTyped

    private void cbxActTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxActTipoKeyTyped
        char tecla = evt.getKeyChar();

        if (tecla == KeyEvent.VK_ENTER) {
            this.codigoActualizar();
        }
    }//GEN-LAST:event_cbxActTipoKeyTyped

    private void cbxElmIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxElmIdItemStateChanged
        try {
            String id = String.valueOf(this.cbxId.getSelectedItem());
            Platillo p = daoPlatillo.buscarID(id);

            this.txtElmName.setText(p.getNombre());
            this.txtElmPrecio.setText(String.valueOf((double) p.getPrecio()));
            String t = p.getTipo();
            String tipo = t.toUpperCase().charAt(0) + t.substring(1, t.length());
            this.txtElmTipo.setText(tipo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cbxElmIdItemStateChanged

    private void cbxElmIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxElmIdKeyTyped
        char tecla = evt.getKeyChar();

        if (tecla == KeyEvent.VK_ENTER) {
            this.codigoEliminar();
        }
    }//GEN-LAST:event_cbxElmIdKeyTyped

    private void btnAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarKeyTyped
        char tecla = evt.getKeyChar();

        if (tecla == KeyEvent.VK_ENTER) {
            this.codigoInsertar();
        }
    }//GEN-LAST:event_btnAgregarKeyTyped

    private void btnActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnActualizarKeyTyped
        char tecla = evt.getKeyChar();

        if (tecla == KeyEvent.VK_ENTER) {
            this.codigoActualizar();
        }
    }//GEN-LAST:event_btnActualizarKeyTyped

    private void btnEliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEliminarKeyTyped
        char tecla = evt.getKeyChar();

        if (tecla == KeyEvent.VK_ENTER) {
            this.codigoEliminar();
        }
    }//GEN-LAST:event_btnEliminarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxActTipo;
    private javax.swing.JComboBox<String> cbxElmId;
    private javax.swing.JComboBox<String> cbxId;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtActName;
    private javax.swing.JTextField txtActPrecio;
    private javax.swing.JTextField txtElmName;
    private javax.swing.JTextField txtElmPrecio;
    private javax.swing.JTextField txtElmTipo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
