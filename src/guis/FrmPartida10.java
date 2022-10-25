package guis;

import entidades.Jugador;
import entidades.Casilla;
import entidades.Ficha;
import entidades.Partida;
import javax.swing.JOptionPane;
import guis.panel.GraphicsDemo;
import org.greenrobot.eventbus.Subscribe;
import guis.panel.CasillaPartida;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class FrmPartida10 extends javax.swing.JFrame {
    
    Jugador[] jugadores;
    int iparaNumJ = 0;
    
    /**
     * Creates new form FrmPartida10
     *
     * @param partida
     */
    public FrmPartida10(Partida partida) {
        initComponents();
        this.partida = partida;
        jugador1ficha1.setLocation(432, 449);
        ingresado = false;
        primeraVez = true;
        jugadores=partida.getListaJugadores();
        iniciarlbl();
    }

    public FrmPartida10() {
        initComponents();
        iniciarlbl();
        jugador1ficha1.setLocation(432, 449);
        ingresado = false;
        jugadores=partida.getListaJugadores();
        btnMeterFicha.setEnabled(false);
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
        jugador1ficha1 = new javax.swing.JLabel();
        jugador1ficha2 = new javax.swing.JLabel();
        jugador1ficha3 = new javax.swing.JLabel();
        jugador1ficha4 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        btnMeterFicha = new javax.swing.JButton();
        Turno = new javax.swing.JTextField();
        LblnumJugadores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablero Chico");
        setPreferredSize(new java.awt.Dimension(950, 940));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 940));

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tableroChico.png"))); // NOI18N

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

        jugador1ficha2.setToolTipText("");

        btn_Salir.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btnMeterFicha.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnMeterFicha.setText("Meter ficha");
        btnMeterFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeterFichaActionPerformed(evt);
            }
        });

        Turno.setEditable(false);
        Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jugador1ficha3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jugador1ficha2))
            .addComponent(jugador1ficha1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jugador1ficha4))
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
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Turno)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblnumJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMeterFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jugador1ficha3))
                    .addComponent(jugador1ficha2)
                    .addComponent(jugador1ficha1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jugador1ficha4))
                    .addComponent(tablero))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caña2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caña3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caña4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caña5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caña1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMeterFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LblnumJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hacerApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hacerApuestaActionPerformed

    private void lanzarCañasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarCañasActionPerformed
        LanzarDados();

        if (avance != 1 && ingresado == false) {
            return;
        }
        if (avance == 0 && ingresado == true) {
            casillaAvanzada = gd.moverFicha(idAuxiliar, avance, ficha1j1);
        }
//        try {
        if (avance == 1 && fichasMetidas <= 2) {
            ///INGRESAR CADA FICHA AL TABLERO
            if (ficha1j1 == null) {
                j1 = jugador1ficha1;
                ficha1j1 = new Ficha(1, j1, true);
                gd.ingresarFicha(ficha1j1, j1, idAuxiliar);
                fichasMetidas++;
                ingresado = true;
                btnMeterFicha.setEnabled(true);
                lanzarCañas.setEnabled(false);

            } else if (ficha2j1 == null) {
                j2 = jugador1ficha2;
                ficha2j1 = new Ficha(1, j2, true);
                gd.ingresarFicha(ficha2j1, j2, idAuxiliar2);
                fichasMetidas++;
                ingresado = true;
                btnMeterFicha.setEnabled(true);
                lanzarCañas.setEnabled(false);
            }

        }

        if (ingresado == true) {
            if (avance > 0) {
                casillaAvanzada = gd.moverFicha(idAuxiliar, avance, ficha1j1);
                if (casillaAvanzada == null) {
                } else {
                    idAuxiliar = casillaAvanzada.getId();
                    System.out.println(primeraVez);
                    primeraVez = false;
                }
            }

        }

//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "");
//        }
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

    private void btnMeterFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeterFichaActionPerformed
        lanzarCañas.setEnabled(true);
        if (ficha2j1 != null) {
            casillaAvanzada = gd.moverFicha(idAuxiliar, -1, ficha2j1);
            idAuxiliar = idAuxiliar - 1;
            btnMeterFicha.setEnabled(false);
        }
        if (ficha1j1.isEnJuego()) {
            casillaAvanzada = gd.moverFicha(idAuxiliar2, -1, ficha1j1);
            idAuxiliar2 = idAuxiliar2 - 1;
            btnMeterFicha.setEnabled(false);
        }


    }//GEN-LAST:event_btnMeterFichaActionPerformed

    private void TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurnoActionPerformed

    public int LanzarDados() {
        //caña1
        // avance = 0;
        int numeroJ = Integer.parseInt(LblnumJugadores.getText().trim());
        char lol = LblnumJugadores.getText().charAt(0);
        int numJug2 = Integer.parseInt(LblnumJugadores.getText().trim());

        System.out.println("numJ: " + numJug2);
        if (iparaNumJ <= numJug2) { //1 <= 2
            Turno.setText("Turno: J" + (iparaNumJ + 1));

            if (iparaNumJ == numJug2) {
                System.out.println("Entras?");
                iparaNumJ = 0;
                Turno.setText("Turno J:" + (iparaNumJ + 1));
            }
            iparaNumJ++;
        }
        avance = 0;
        partida.getDados()[0].generarLado();
        partida.getDados()[1].generarLado();
        partida.getDados()[2].generarLado();
        partida.getDados()[3].generarLado();
        partida.getDados()[4].generarLado();

        if (partida.getDados()[0].getLado()) {
            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
            avance++;
        } else {
            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        //caña2
        if (partida.getDados()[1].getLado()) {
            caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
            avance++;
        } else {
            caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        //caña3
        if (partida.getDados()[2].getLado()) {
            caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
            avance++;
        } else {
            caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        //caña4
        if (partida.getDados()[3].getLado()) {
            caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
            avance++;
        } else {
            caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        //caña5
        if (partida.getDados()[4].getLado()) {
            caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
            avance++;
        } else {
            caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        System.out.println("avance: " + avance);
        return avance;

    }

    public void iniciarlbl() {
        caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
    }

    @Subscribe
    public void establecerPartida(Partida partida) {
        this.partida = partida;
        gd = new GraphicsDemo(10);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LblnumJugadores;
    public static javax.swing.JTextField Turno;
    private javax.swing.JButton btnMeterFicha;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel caña1;
    private javax.swing.JLabel caña2;
    private javax.swing.JLabel caña3;
    private javax.swing.JLabel caña4;
    private javax.swing.JLabel caña5;
    private javax.swing.JButton hacerApuesta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugador1ficha1;
    private javax.swing.JLabel jugador1ficha2;
    private javax.swing.JLabel jugador1ficha3;
    private javax.swing.JLabel jugador1ficha4;
    private javax.swing.JButton lanzarCañas;
    private javax.swing.JLabel tablero;
    private javax.swing.JTextField txtApuesta;
    // End of variables declaration//GEN-END:variables
    Partida partida;
    int x = 0;
    int y = 0;
    int ancho = 950;
    int alto = 928;
    int avance;
    int idAuxiliar, idAuxiliar2 = 0;

    boolean ingresado;
    boolean primeraVez = true;
    GraphicsDemo gd;
    CasillaPartida c = new CasillaPartida();
    List<Casilla> casillas = c.inicializarCasilla10();
    Casilla casillaAvanzada;
    Ficha ficha1j1;
    Ficha ficha2j1;
    JLabel j1 = new JLabel();
    JLabel j2 = new JLabel();
    int fichasMetidas;
}
