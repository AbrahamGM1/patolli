/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import entidades.Partida;
import org.greenrobot.eventbus.Subscribe;

/**
 *
 * @author Abraham
 */
public class FrmPartida12 extends javax.swing.JFrame {

    /**
     * Creates new form FrmPartida10
     */
    public FrmPartida12(Partida partida) {
        initComponents();
        this.partida = partida;
    }
    
    public FrmPartida12(){
        initComponents();
        this.setLocationRelativeTo(null);
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
        tablero = new javax.swing.JLabel();
        hacerApuesta = new javax.swing.JButton();
        lanzarCañas = new javax.swing.JButton();
        txtApuesta = new javax.swing.JTextField();
        caña1 = new javax.swing.JLabel();
        caña2 = new javax.swing.JLabel();
        caña3 = new javax.swing.JLabel();
        caña4 = new javax.swing.JLabel();
        caña5 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        jugador3 = new javax.swing.JLabel();
        jugador4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 928));

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tableroMediano.png"))); // NOI18N

        hacerApuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hacerApuesta.setText("Hacer Apuesta");
        hacerApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerApuestaActionPerformed(evt);
            }
        });

        lanzarCañas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lanzarCañas.setText("Lanzar Cañas");
        lanzarCañas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarCañasActionPerformed(evt);
            }
        });

        caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        jugador2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugador1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jugador3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jugador4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jugador2))
            .addComponent(tablero)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(caña2)
                .addGap(6, 6, 6)
                .addComponent(caña3)
                .addGap(6, 6, 6)
                .addComponent(caña4)
                .addGap(6, 6, 6)
                .addComponent(caña5)
                .addGap(6, 6, 6)
                .addComponent(caña1)
                .addGap(176, 176, 176)
                .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jugador1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jugador3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jugador4))
                    .addComponent(jugador2)
                    .addComponent(tablero))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caña2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caña3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caña4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caña5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caña1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hacerApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hacerApuestaActionPerformed

    private void lanzarCañasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarCañasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lanzarCañasActionPerformed

    @Subscribe
    public void establecerPartida(Partida partida){
        this.partida = partida;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caña1;
    private javax.swing.JLabel caña2;
    private javax.swing.JLabel caña3;
    private javax.swing.JLabel caña4;
    private javax.swing.JLabel caña5;
    private javax.swing.JButton hacerApuesta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JLabel jugador3;
    private javax.swing.JLabel jugador4;
    private javax.swing.JButton lanzarCañas;
    private javax.swing.JLabel tablero;
    private javax.swing.JTextField txtApuesta;
    // End of variables declaration//GEN-END:variables
    Partida partida;
}
