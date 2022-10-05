package guis;

import entidades.Ficha;
import entidades.Jugador;
import entidades.Partida;
import javax.swing.JOptionPane;
import org.greenrobot.eventbus.Subscribe;

/**
<<<<<<< HEAD
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
=======
 *
 * @author 
 * Luis Gonzalo Cervantes Rivera 00000228549
 * Gabriel Francisco Piñuelas Ramos 00000230626
 * Ricardo Pacheco Urias 00000229178
 * Abraham Sered Gómez Martínez 00000228796
 * 
>>>>>>> 34dc71bf8be41c78dfb73f7772d71ab049224947
 */
public class FrmPartida14 extends javax.swing.JFrame {

    /**
     * Creates new form FrmPartida10
     */
    public FrmPartida14(Partida partida) {
        initComponents();
        this.partida = partida;
        iniciarlbl();
    }
    
    public FrmPartida14(){
        initComponents();
        iniciarlbl();
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
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablero Grande");
        setPreferredSize(new java.awt.Dimension(950, 940));

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 928));

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tableroGrande.png"))); // NOI18N

        hacerApuesta.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        hacerApuesta.setText("Hacer Apuesta");
        hacerApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerApuestaActionPerformed(evt);
            }
        });

        lanzarCañas.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
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

        btn_Salir.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jugador1)
                .addGap(10, 10, 10)
                .addComponent(jugador4)
                .addGap(10, 10, 10)
                .addComponent(jugador2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jugador3))
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
                .addGap(49, 49, 49)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hacerApuesta)
                    .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jugador1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jugador4))
                    .addComponent(jugador2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jugador3))
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
                            .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hacerApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hacerApuestaActionPerformed

    private void lanzarCañasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarCañasActionPerformed
        try {
            this.LanzarDados();

            for (int i = 0; i < partida.getListaJugadores()[0].getFichas().length; i++) {
                Ficha f = partida.getListaJugadores()[0].getFichas()[i];
                if (!verificarDentro(f.getId(), partida.getListaJugadores()[0])) {
                    int Posicion = partida.getListaJugadores()[0].getFichas()[i].getPosicion();
                    partida.getListaJugadores()[0].getFichas()[i].setPosicion(Posicion + determinarMovimiento());
                    System.out.println(Posicion + determinarMovimiento());

                    return;
                } else {
                    if (this.determinarMovimiento() > 0) {
                        partida.getListaJugadores()[0].getFichas()[i].setPosicion(0);

                        return;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_lanzarCañasActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        int opcionSeleccionado = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas abandonar la partida?", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (opcionSeleccionado == JOptionPane.NO_OPTION) {
            return;
        }
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SalirActionPerformed

    public void LanzarDados() {
        //caña1
        partida.getDados()[0].generarLado();
        partida.getDados()[1].generarLado();
        partida.getDados()[2].generarLado();
        partida.getDados()[3].generarLado();
        partida.getDados()[4].generarLado();
        if (partida.getDados()[0].getLado()) {
            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        //caña2
        if (partida.getDados()[1].getLado()) {
            caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        //caña3
        if (partida.getDados()[2].getLado()) {
            caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        //caña4
        if (partida.getDados()[3].getLado()) {
            caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        //caña5
        if (partida.getDados()[4].getLado()) {
            caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
    }
    
    public void iniciarlbl() {
        caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
    }
    
    public int determinarMovimiento() {
        int movimiento = 0;
        for (int i = 0; i < partida.getDados().length; i++) {
            if (partida.getDados()[i].getLado()) {
                movimiento++;
            }
        }
        if (movimiento == 5) {
            movimiento = 10;
        }
        return movimiento;
    }
    
    public boolean verificarDentro(int Id, Jugador jugador) {
        Jugador j = jugador;

        for (int i = 0; i < j.getFichas().length; i++) {
            if (j.getFichas()[i].getId() == Id) {
                Ficha f = j.getFichas()[i];
                if (f.getPosicion() == -1) {
                    //posicion diferene a 0
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    
    @Subscribe
    public void establecerPartida(Partida partida){
        this.partida = partida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
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
