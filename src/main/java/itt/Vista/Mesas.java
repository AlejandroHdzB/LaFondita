package itt.Vista;

import itt.DAO.DAOMesasImpl;
import itt.DAO.DAOVentasImpl;
import itt.Interfaces.DAOMesas;
import itt.Modelos.Mesa;
import javax.swing.JOptionPane;

public class Mesas extends javax.swing.JPanel {

    private Mesa mesas[];
    DAOMesas daoMesa;

    public Mesas() {
        initComponents();
        this.setValueComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jPanelBg = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        lblMesa1 = new javax.swing.JLabel();
        rB1 = new javax.swing.JRadioButton();
        logo2 = new javax.swing.JLabel();
        logo3 = new javax.swing.JLabel();
        logo4 = new javax.swing.JLabel();
        btnAgregar1 = new javax.swing.JButton();
        btnCuenta1 = new javax.swing.JButton();
        logo5 = new javax.swing.JLabel();
        logo6 = new javax.swing.JLabel();
        logo7 = new javax.swing.JLabel();
        logo8 = new javax.swing.JLabel();
        lblMesa2 = new javax.swing.JLabel();
        rB2 = new javax.swing.JRadioButton();
        btnAgregar2 = new javax.swing.JButton();
        btnCuenta2 = new javax.swing.JButton();
        lblMesa3 = new javax.swing.JLabel();
        rB3 = new javax.swing.JRadioButton();
        btnAgregar3 = new javax.swing.JButton();
        btnCuenta3 = new javax.swing.JButton();
        lblMesa4 = new javax.swing.JLabel();
        rB4 = new javax.swing.JRadioButton();
        btnAgregar4 = new javax.swing.JButton();
        btnCuenta4 = new javax.swing.JButton();
        lblMesa5 = new javax.swing.JLabel();
        rB5 = new javax.swing.JRadioButton();
        btnAgregar5 = new javax.swing.JButton();
        btnCuenta5 = new javax.swing.JButton();
        btnCuenta6 = new javax.swing.JButton();
        btnAgregar6 = new javax.swing.JButton();
        rB6 = new javax.swing.JRadioButton();
        lblMesa6 = new javax.swing.JLabel();
        lblMesa7 = new javax.swing.JLabel();
        rB7 = new javax.swing.JRadioButton();
        btnAgregar7 = new javax.swing.JButton();
        btnCuenta7 = new javax.swing.JButton();
        lblMesa8 = new javax.swing.JLabel();
        rB8 = new javax.swing.JRadioButton();
        btnAgregar8 = new javax.swing.JButton();
        btnCuenta8 = new javax.swing.JButton();

        jScrollPane.setBorder(null);
        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelBg.setPreferredSize(new java.awt.Dimension(748, 758));

        jLabelTitulo.setFont(new java.awt.Font("NTR", 3, 40)); // NOI18N
        jLabelTitulo.setText("MESAS");

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N

        lblMesa1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblMesa1.setText("MESA 1");

        rB1.setText("DISPONIBLE");

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N

        logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N

        logo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N

        btnAgregar1.setText("AGREGAR PEDIDO");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        btnCuenta1.setText("GENERAR CUENTA");
        btnCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuenta1ActionPerformed(evt);
            }
        });

        logo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N

        logo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N

        logo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N

        logo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N

        lblMesa2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblMesa2.setText("MESA 2");

        rB2.setText("DISPONIBLE");

        btnAgregar2.setText("AGREGAR PEDIDO");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        btnCuenta2.setText("GENERAR CUENTA");

        lblMesa3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblMesa3.setText("MESA 3");

        rB3.setText("DISPONIBLE");

        btnAgregar3.setText("AGREGAR PEDIDO");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });

        btnCuenta3.setText("GENERAR CUENTA");

        lblMesa4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblMesa4.setText("MESA 4");

        rB4.setText("DISPONIBLE");

        btnAgregar4.setText("AGREGAR PEDIDO");
        btnAgregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar4ActionPerformed(evt);
            }
        });

        btnCuenta4.setText("GENERAR CUENTA");

        lblMesa5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblMesa5.setText("MESA 5");

        rB5.setText("DISPONIBLE");

        btnAgregar5.setText("AGREGAR PEDIDO");
        btnAgregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar5ActionPerformed(evt);
            }
        });

        btnCuenta5.setText("GENERAR CUENTA");

        btnCuenta6.setText("GENERAR CUENTA");

        btnAgregar6.setText("AGREGAR PEDIDO");
        btnAgregar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar6ActionPerformed(evt);
            }
        });

        rB6.setText("DISPONIBLE");

        lblMesa6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblMesa6.setText("MESA 6");

        lblMesa7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblMesa7.setText("MESA 7");

        rB7.setText("DISPONIBLE");

        btnAgregar7.setText("AGREGAR PEDIDO");
        btnAgregar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar7ActionPerformed(evt);
            }
        });

        btnCuenta7.setText("GENERAR CUENTA");

        lblMesa8.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblMesa8.setText("MESA 8");

        rB8.setText("DISPONIBLE");

        btnAgregar8.setText("AGREGAR PEDIDO");
        btnAgregar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar8ActionPerformed(evt);
            }
        });

        btnCuenta8.setText("GENERAR CUENTA");

        javax.swing.GroupLayout jPanelBgLayout = new javax.swing.GroupLayout(jPanelBg);
        jPanelBg.setLayout(jPanelBgLayout);
        jPanelBgLayout.setHorizontalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBgLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(jPanelBgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(logo1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesa1)
                            .addComponent(rB1)
                            .addComponent(btnAgregar1)
                            .addComponent(btnCuenta1)))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(logo2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesa3)
                            .addComponent(rB3)
                            .addComponent(btnAgregar3)
                            .addComponent(btnCuenta3)))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(logo3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesa5)
                            .addComponent(rB5)
                            .addComponent(btnAgregar5)
                            .addComponent(btnCuenta5)))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(logo4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesa7)
                            .addComponent(rB7)
                            .addComponent(btnAgregar7)
                            .addComponent(btnCuenta7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(logo8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesa8)
                            .addComponent(rB8)
                            .addComponent(btnAgregar8)
                            .addComponent(btnCuenta8)))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(logo7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesa6)
                            .addComponent(rB6)
                            .addComponent(btnAgregar6)
                            .addComponent(btnCuenta6)))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo6)
                            .addComponent(logo5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesa4)
                            .addComponent(rB4)
                            .addComponent(btnAgregar4)
                            .addComponent(btnCuenta4)
                            .addComponent(lblMesa2)
                            .addComponent(rB2)
                            .addComponent(btnAgregar2)
                            .addComponent(btnCuenta2))))
                .addGap(28, 28, 28))
        );
        jPanelBgLayout.setVerticalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo5)
                            .addGroup(jPanelBgLayout.createSequentialGroup()
                                .addComponent(lblMesa1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rB1)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar1)
                                .addGap(18, 18, 18)
                                .addComponent(btnCuenta1))
                            .addComponent(logo1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo2)
                            .addComponent(logo6)
                            .addGroup(jPanelBgLayout.createSequentialGroup()
                                .addComponent(lblMesa3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rB3)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar3)
                                .addGap(18, 18, 18)
                                .addComponent(btnCuenta3))))
                    .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgLayout.createSequentialGroup()
                            .addComponent(lblMesa2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rB2)
                            .addGap(18, 18, 18)
                            .addComponent(btnAgregar2)
                            .addGap(18, 18, 18)
                            .addComponent(btnCuenta2)
                            .addGap(168, 168, 168))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgLayout.createSequentialGroup()
                            .addComponent(lblMesa4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rB4)
                            .addGap(18, 18, 18)
                            .addComponent(btnAgregar4)
                            .addGap(18, 18, 18)
                            .addComponent(btnCuenta4))))
                .addGap(18, 18, 18)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo3)
                    .addComponent(logo7)
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(lblMesa5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rB5)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar5)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuenta5))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(lblMesa6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rB6)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar6)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuenta6)))
                .addGap(18, 18, 18)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo4)
                    .addComponent(logo8)
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(lblMesa7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rB7)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar7)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuenta7))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(lblMesa8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rB8)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar8)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuenta8)))
                .addGap(23, 23, 23))
        );

        jScrollPane.setViewportView(jPanelBg);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setValueVenta(int n){
        try {
            if (daoMesa.verEstado(mesas[n - 1].getIdMesa()) == 1) {
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        Principal.setPanelBase(new Ordenar(n));
    }
    
    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        Principal.setPanelBase(new Ordenar(1));
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        Principal.setPanelBase(new Ordenar(2));
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        Principal.setPanelBase(new Ordenar(3));
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btnAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar4ActionPerformed
        Principal.setPanelBase(new Ordenar(4));
    }//GEN-LAST:event_btnAgregar4ActionPerformed

    private void btnAgregar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar5ActionPerformed
        Principal.setPanelBase(new Ordenar(5));
    }//GEN-LAST:event_btnAgregar5ActionPerformed

    private void btnAgregar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar6ActionPerformed
        Principal.setPanelBase(new Ordenar(6));
    }//GEN-LAST:event_btnAgregar6ActionPerformed

    private void btnCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuenta1ActionPerformed
        Principal.setPanelBase(new Cuenta());
    }//GEN-LAST:event_btnCuenta1ActionPerformed

    private void btnAgregar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar7ActionPerformed
        Principal.setPanelBase(new Ordenar(7));
    }//GEN-LAST:event_btnAgregar7ActionPerformed

    private void btnAgregar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar8ActionPerformed
        Principal.setPanelBase(new Ordenar(8));
    }//GEN-LAST:event_btnAgregar8ActionPerformed

    private void setValueComponents() {
        this.jScrollPane.getVerticalScrollBar().setUnitIncrement(16);

        this.daoMesa = new DAOMesasImpl();

        try {
            this.mesas = daoMesa.listar();
        } catch (Exception ex) {
            //HACER ALGO
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAgregar4;
    private javax.swing.JButton btnAgregar5;
    private javax.swing.JButton btnAgregar6;
    private javax.swing.JButton btnAgregar7;
    private javax.swing.JButton btnAgregar8;
    private javax.swing.JButton btnCuenta1;
    private javax.swing.JButton btnCuenta2;
    private javax.swing.JButton btnCuenta3;
    private javax.swing.JButton btnCuenta4;
    private javax.swing.JButton btnCuenta5;
    private javax.swing.JButton btnCuenta6;
    private javax.swing.JButton btnCuenta7;
    private javax.swing.JButton btnCuenta8;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblMesa1;
    private javax.swing.JLabel lblMesa2;
    private javax.swing.JLabel lblMesa3;
    private javax.swing.JLabel lblMesa4;
    private javax.swing.JLabel lblMesa5;
    private javax.swing.JLabel lblMesa6;
    private javax.swing.JLabel lblMesa7;
    private javax.swing.JLabel lblMesa8;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel logo4;
    private javax.swing.JLabel logo5;
    private javax.swing.JLabel logo6;
    private javax.swing.JLabel logo7;
    private javax.swing.JLabel logo8;
    private javax.swing.JRadioButton rB1;
    private javax.swing.JRadioButton rB2;
    private javax.swing.JRadioButton rB3;
    private javax.swing.JRadioButton rB4;
    private javax.swing.JRadioButton rB5;
    private javax.swing.JRadioButton rB6;
    private javax.swing.JRadioButton rB7;
    private javax.swing.JRadioButton rB8;
    // End of variables declaration//GEN-END:variables
}
