package guis;

import entidades.Jugador;
import entidades.Casilla;
import entidades.Ficha;
import entidades.Partida;
import javax.swing.JOptionPane;
import guis.panel.GraphicsDemo;
import guis.panel.CasillaPartida;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pipesandfilters.TuberiaMensajes;

/**
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class FrmPartida10 extends javax.swing.JFrame implements Runnable {

    Jugador[] jugadores;
    int iparaNumJ = 0;
    Ficha[] fichasj1;
    int contadorFichasj1 = 0;

    /**
     * Creates new form FrmPartida10 Si dentro del crear partida se crea un
     * frame de un tablero de 10 casillas se inicializan variables que serán
     * utilizadas en los demás métodos dentro de este JFrame, es importante que
     * cuando se cree un frmPartida se le envie de parámetro la partida
     * configurada.
     *
     * @param partida
     * @param id
     */
    public FrmPartida10(Partida partida, int id) {
        initComponents();
        
        this.iD = id;
        this.partida = partida;
        jugador1.setLocation(432, 449);
        jugador2.setLocation(434, 329);
        ingresado = false;
        primeraVez = true;
        jugadores = partida.getListaJugadores();
        iniciarlbl();

        try {
            //Se crea el socket con el host y el puerto, se declaran los streams
            //de comunicacion
            cliente = new Socket(host, puerto);

            in = new DataInputStream(cliente.getInputStream());
            out = new DataOutputStream(cliente.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (iD == 0) {
                tuberia.ejecutarTuberia(out, iD, 7);
            } else {
                tuberia.ejecutarTuberia(out, iD, 6);
            }
        } catch (IOException e) {
            Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblnumJugadores = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        jugador3 = new javax.swing.JLabel();
        jugador4 = new javax.swing.JLabel();
        tablero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        caña2 = new javax.swing.JLabel();
        caña3 = new javax.swing.JLabel();
        caña1 = new javax.swing.JLabel();
        caña5 = new javax.swing.JLabel();
        caña4 = new javax.swing.JLabel();
        Turno = new javax.swing.JTextField();
        btnMeterFicha = new javax.swing.JButton();
        lanzarCañas = new javax.swing.JButton();
        hacerApuesta = new javax.swing.JButton();
        txtApuesta = new javax.swing.JTextField();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablero Chico");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1244, 844));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(LblnumJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 1696, 56, 30));
        jPanel1.add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 820, -1, -1));
        jPanel1.add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 820, 37, -1));
        jPanel1.add(jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 820, 37, -1));
        jPanel1.add(jugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 820, 37, -1));

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tableroChico.png"))); // NOI18N
        jPanel1.add(tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 800));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        Turno.setEditable(false);
        Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnoActionPerformed(evt);
            }
        });

        btnMeterFicha.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnMeterFicha.setText("Meter ficha");
        btnMeterFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeterFichaActionPerformed(evt);
            }
        });

        lanzarCañas.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        lanzarCañas.setText("Lanzar Cañas");
        lanzarCañas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarCañasActionPerformed(evt);
            }
        });

        hacerApuesta.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        hacerApuesta.setText("Hacer Apuesta");
        hacerApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerApuestaActionPerformed(evt);
            }
        });

        txtApuesta.setEditable(false);

        btn_Salir.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMeterFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(caña1)
                                .addGap(18, 18, 18)
                                .addComponent(caña5)
                                .addGap(18, 18, 18)
                                .addComponent(caña4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(caña3)
                                .addGap(26, 26, 26)
                                .addComponent(caña2)))
                        .addContainerGap(57, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMeterFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caña1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caña4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caña5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(caña3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(caña2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            casillaAvanzada = gd.moverFicha(idAuxiliar, avance, jugador1, out, iD, tuberia);
            casillaAvanzada = gd.moverFicha(idAuxiliar2, avance, jugador2, out, iD, tuberia);
        }
        try {
            if (avance == 1 && primerTurno == 0) {
                gd.ingresarFicha(jugador1, idAuxiliar, 1);
                ingresado = true;
                btnMeterFicha.setEnabled(true);
                lanzarCañas.setEnabled(false);
                primerTurno = 1;
            }
            if (avance == 1 && primerTurno == 1) {
                gd.ingresarFicha(jugador2, idAuxiliar2, 2);
                ingresado = true;
                btnMeterFicha.setEnabled(true);
                lanzarCañas.setEnabled(false);
                primerTurno = 2;
            }

            if (ingresado == true) {
                if (iparaNumJ == 1) {
                    System.out.println("paraNumJ "+ iparaNumJ);
                    if (avance > 0) {
                        casillaAvanzada = gd.moverFicha(idAuxiliar, avance, jugador1, out, iD, tuberia);
                        
                        if (casillaAvanzada == null) {
                            
                        } else {
                            idAuxiliar = casillaAvanzada.getId();
                            System.out.println(primeraVez);
                            primeraVez = false;
                        }
                        
                        if (avance == 5) {
                            try {
                                tuberia.ejecutarTuberia(out, iD, 3);
                            } catch (IOException e) {
                                Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, e);
                            }
                        }
                        
                        if ((jugador1.getLocation().x == 597 && jugador1.getLocation().y == 298) || 
                                (jugador1.getLocation().x == 627 && jugador1.getLocation().y == 267) ||
                                (jugador1.getLocation().x == 590 && jugador1.getLocation().y == 235) ||
                                (jugador1.getLocation().x == 561 && jugador1.getLocation().y == 264) ||
                                (jugador1.getLocation().x == 369 && jugador1.getLocation().y == 268) ||
                                (jugador1.getLocation().x == 337 && jugador1.getLocation().y == 238) ||
                                (jugador1.getLocation().x == 304 && jugador1.getLocation().y == 271) ||
                                (jugador1.getLocation().x == 335 && jugador1.getLocation().y == 303) ||
                                (jugador1.getLocation().x == 336 && jugador1.getLocation().y == 380) ||
                                (jugador1.getLocation().x == 303 && jugador1.getLocation().y == 514) ||
                                (jugador1.getLocation().x == 340 && jugador1.getLocation().y == 544) ||
                                (jugador1.getLocation().x == 372 && jugador1.getLocation().y == 512) ||
                                (jugador1.getLocation().x == 556 && jugador1.getLocation().y == 520) ||
                                (jugador1.getLocation().x == 586 && jugador1.getLocation().y == 550) ||
                                (jugador1.getLocation().x == 626 && jugador1.getLocation().y == 512) ||
                                (jugador1.getLocation().x == 593 && jugador1.getLocation().y == 483)) {
                            try {
                                tuberia.ejecutarTuberia(out, iD, 0);
                            } catch (IOException e) {
                                Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, e);
                            }
                        }
                    }
                }

                if (iparaNumJ == 2) {
                    System.out.println("paraNumJ "+ iparaNumJ);
                    if (avance > 0) {
                        casillaAvanzada = gd.moverFicha(idAuxiliar2, avance, jugador2, out, iD, tuberia);
                        
                        if (casillaAvanzada == null) {
                            
                        } else {
                            idAuxiliar2 = casillaAvanzada.getId();
                            System.out.println(primeraVez);
                            primeraVez = false;
                        }
                        
                        if (avance == 5) {
                            try {
                                tuberia.ejecutarTuberia(out, iD, 3);
                            } catch (IOException e) {
                                Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, e);
                            }
                        }
                        
                        if ((jugador2.getLocation().x == 597 && jugador2.getLocation().y == 298) || 
                                (jugador2.getLocation().x == 627 && jugador2.getLocation().y == 267) ||
                                (jugador2.getLocation().x == 590 && jugador2.getLocation().y == 235) ||
                                (jugador2.getLocation().x == 561 && jugador2.getLocation().y == 264) ||
                                (jugador2.getLocation().x == 369 && jugador2.getLocation().y == 268) ||
                                (jugador2.getLocation().x == 337 && jugador2.getLocation().y == 238) ||
                                (jugador2.getLocation().x == 304 && jugador2.getLocation().y == 271) ||
                                (jugador2.getLocation().x == 335 && jugador2.getLocation().y == 303) ||
                                (jugador2.getLocation().x == 336 && jugador2.getLocation().y == 380) ||
                                (jugador2.getLocation().x == 303 && jugador2.getLocation().y == 514) ||
                                (jugador2.getLocation().x == 340 && jugador2.getLocation().y == 544) ||
                                (jugador2.getLocation().x == 372 && jugador2.getLocation().y == 512) ||
                                (jugador2.getLocation().x == 556 && jugador2.getLocation().y == 520) ||
                                (jugador2.getLocation().x == 586 && jugador2.getLocation().y == 550) ||
                                (jugador2.getLocation().x == 626 && jugador2.getLocation().y == 512) ||
                                (jugador2.getLocation().x == 593 && jugador2.getLocation().y == 483)) {
                            try {
                                tuberia.ejecutarTuberia(out, iD, 0);
                            } catch (IOException e) {
                                Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, e);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_lanzarCañasActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        int opcionSeleccionado = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas abandonar la partida?", "CONFIRMAR", JOptionPane.YES_NO_OPTION);
        if (opcionSeleccionado == JOptionPane.NO_OPTION) {
            return;
        }
        this.juegoFinalizado = true;
        
        try {
            tuberia.ejecutarTuberia(out, iD, 2);
        } catch (IOException e) {
            Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.exit(0);
        try {
            cliente.close();
        } catch (IOException e) {
            Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btnMeterFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeterFichaActionPerformed

        ///ciclo que recorre las fichas del jugador 1 y las mete al tablero con el método moverFicha
        //en este caso la iteración vale el contador exclusivo de las fichas del jugador 1 el cual es una variable declarada afuera de los métodos
        //y va aumentando cada vez que se ejecuta este método
        //Se usa el -1 porque cuando se pulsa lanzar cañas y sale un 1 cuando aun quedan fichas, el contador de fichas ingresadas aumenta, por tanto
        //si les quitaramos el -1 leeria una ficha con un contador superior la cual no existe, se tiene que "revertir" para que se lea la ingresada   
        lanzarCañas.setEnabled(true);
        casillaAvanzada = gd.moverFicha(idAuxiliar, -1, jugador1, out, iD, tuberia);
        idAuxiliar = idAuxiliar - 1;
        btnMeterFicha.setEnabled(false);
    }//GEN-LAST:event_btnMeterFichaActionPerformed

    private void TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnoActionPerformed

    }//GEN-LAST:event_TurnoActionPerformed

    public int LanzarDados() {

        int numJug2 = Integer.parseInt(LblnumJugadores.getText().trim());

        System.out.println("numJ: " + numJug2);
        if (iparaNumJ <= numJug2) { //1 <= 2
            Turno.setText("Turno: J" + (iparaNumJ + 1));

            if (iparaNumJ == numJug2) {
                iparaNumJ = 0;
                Turno.setText("Turno: J" + (iparaNumJ + 1));
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

    /**
     * Le pone las imágenes a las cañas
     */
    public void iniciarlbl() {
        caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
    }
    
    public void mensajeCasillaRoja() {
        JOptionPane.showMessageDialog(this, "Un jugador ha caído en una casilla roja!!!", "Casilla roja!!", JOptionPane.WARNING_MESSAGE);
    }
    
    public void mensajeFinalizoPartida() {
        JOptionPane.showMessageDialog(this, "La partida ha terminado", "Partida finalizada", JOptionPane.INFORMATION_MESSAGE);
        this.juegoFinalizado = true;
    }
    
    public void mensajeJugadorAbandonoPartida() {
        JOptionPane.showMessageDialog(this, "Un jugador ha abandonado la partida", "Jugador abandonó partida", JOptionPane.WARNING_MESSAGE);
        this.mensajeFinalizoPartida();
    }
    
    public void mensajeJugadorAvanza10() {
        JOptionPane.showMessageDialog(this, "Un jugador avanzó 10 casillas!!!", "Que buena suerte", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mensajeJugadorGanoPartida() {
        JOptionPane.showMessageDialog(this, "Felicidades a jugador (?) has ganado!", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mensajeJugadorPerdio() {
        JOptionPane.showMessageDialog(this, "Mala suerte jugador (?) has perdido", "Suerte a la próxima", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mensajeJugadorSeUnio() {
        JOptionPane.showMessageDialog(this, "Un nuevo jugador se ha unido", "Nuevo jugador", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mensajePartidaInicio() {
        JOptionPane.showMessageDialog(this, "La partida ha iniciado", "Partida creada", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void run() {
        try {
            mensaje = in.readUTF();
            int aux = Integer.parseInt(mensaje);
            iD = aux;

            while (true) {
                String recibidos = in.readUTF();
                String[] recibido = recibidos.split(";");
                
                int metodo = Integer.parseInt(recibido[0]);
                int id = Integer.parseInt(recibido[1]);
                
                switch (metodo) {
                    case 0:
                        this.mensajeCasillaRoja();
                        break;
                    case 1:
                        this.mensajeFinalizoPartida();
                        break;
                    case 2:
                        if (id != this.iD) {
                            this.mensajeJugadorAbandonoPartida();
                        }
                        break;
                    case 3:
                        if (id != this.iD) {
                            this.mensajeJugadorAvanza10();
                        }
                        break;
                    case 4:
                        this.mensajeJugadorGanoPartida();
                        break;
                    case 5:
                        this.mensajeJugadorPerdio();
                        break;
                    case 6:
                        if (id != this.iD) {
                            this.mensajeJugadorSeUnio();
                        }
                        break;
                    case 7:
                        this.mensajePartidaInicio();
                        break;
                    default: 
                        break;
                }
                
                if (juegoFinalizado) {
                    System.exit(0);
                    cliente.close();
                }
                
                metodo = -1;
                id = -1;
            }
        } catch (IOException ex) {
            Logger.getLogger(FrmPartida10.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JLabel jugador3;
    private javax.swing.JLabel jugador4;
    private javax.swing.JButton lanzarCañas;
    private javax.swing.JLabel tablero;
    private javax.swing.JTextField txtApuesta;
    // End of variables declaration//GEN-END:variables
    Partida partida;
    int primerTurno = 0;
    int turno = 0;
    int avance;
    int idAuxiliar;
    int idAuxiliar2;
    int idAuxiliar3;
    int idAuxiliar4;
    boolean ingresado;
    boolean primeraVez = true;
    GraphicsDemo gd = new GraphicsDemo(10);
    CasillaPartida c = new CasillaPartida();
    List<Casilla> casillas = c.inicializarCasilla10();
    Casilla casillaAvanzada;
    private Socket cliente;
    DataOutputStream out;
    DataInputStream in;
    private int puerto = 4444;
    public static String host = "localhost";
    private String mensaje;
    int iD;
    private boolean juegoFinalizado = false;
    TuberiaMensajes tuberia = new TuberiaMensajes();
}
