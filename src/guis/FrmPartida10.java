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
    Ficha[] fichasj1; 
    int contadorFichasj1=0;
    /**
     * Creates new form FrmPartida10
     * Si dentro del crear partida se crea un frame de un tablero de 10 casillas se inicializan variables que serán utilizadas en los demás métodos dentro de
     * este JFrame, es importante que cuando se cree un frmPartida se le envie de parámetro la partida configurada.
     * @param partida
     */
    public FrmPartida10(Partida partida) {
        initComponents();
        this.partida = partida;
        jugador1ficha1.setLocation(432, 449);
        ingresado = false;
        primeraVez = true;
        ficha1j1.setEnJuego(ingresado);
        btnMeterFicha.setEnabled(false);
        jugadores = partida.getListaJugadores();
        fichasj1 = jugadores[0].getFichas();
        iniciarlbl();
    }

    public FrmPartida10() {
        initComponents();
        iniciarlbl();
        jugador1ficha1.setLocation(432, 449);
        ingresado = false;
        jugadores = partida.getListaJugadores();
        btnMeterFicha.setEnabled(false);
        this.setLocationRelativeTo(null);
    }


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
        btn_Salir = new javax.swing.JButton();
        btnMeterFicha = new javax.swing.JButton();
        Turno = new javax.swing.JTextField();
        LblnumJugadores = new javax.swing.JLabel();
        jugador1ficha1 = new javax.swing.JLabel();
        jugador1ficha2 = new javax.swing.JLabel();
        jugador1ficha3 = new javax.swing.JLabel();
        jugador1ficha4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablero Chico");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1244, 844));

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

        txtApuesta.setEditable(false);

        caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

        caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png"))); // NOI18N

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
                .addComponent(tablero)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMeterFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(caña1)
                                .addGap(18, 18, 18)
                                .addComponent(caña5)
                                .addGap(18, 18, 18)
                                .addComponent(caña4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(caña3)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caña2))))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(554, 554, 554)
                        .addComponent(LblnumJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jugador1ficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jugador1ficha2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jugador1ficha3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jugador1ficha4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hacerApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lanzarCañas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMeterFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caña1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caña4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caña5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(caña3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(caña2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addComponent(tablero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1ficha1)
                    .addComponent(jugador1ficha2)
                    .addComponent(jugador1ficha3)
                    .addComponent(jugador1ficha4))
                .addGap(42, 42, 42)
                .addComponent(LblnumJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hacerApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hacerApuestaActionPerformed

    private void lanzarCañasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarCañasActionPerformed
        LanzarDados();
         //Si no sale 1 y no hay fichas pasa turno
        if (avance != 1 && ingresado == false) {
            return;
        }
        
        //Si no hay avance y hay fichas "avanza" 0 casillas y pasa turno
        if (avance == 0 && ingresado == true) {
            casillaAvanzada = gd.moverFicha(idAuxiliar, avance, ficha1j1);
        }
        
        
        ///Se compara si el contador de las fichas es menor al tamaño del arreglo de las fichas del jugador 1
        //dicho de forma mas sencilla, si el jugador aún no mete todas sus fichas al tablero y le salió un 1 al arrojar las cañas
        //pues ingresa la ficha correspondiente        
            if (avance == 1 && contadorFichasj1<fichasj1.length) {
            switch (contadorFichasj1) {
                case 0:
                    fichasj1[contadorFichasj1].setLabel(jugador1ficha1);
                    break;
                case 1:
                    fichasj1[contadorFichasj1].setLabel(jugador1ficha2);
                    break;
                case 2:
                    fichasj1[contadorFichasj1].setLabel(jugador1ficha3);
                    break;
                case 3:
                    fichasj1[contadorFichasj1].setLabel(jugador1ficha4);
                    break;                    
                default:
                    break;
            }
                
                gd.ingresarFicha(fichasj1[contadorFichasj1], fichasj1[contadorFichasj1].getLabel(), idAuxiliar);
                fichasj1[contadorFichasj1].setEnJuego(true);
                System.out.println("fichas ingresadas: "+contadorFichasj1);
                contadorFichasj1=contadorFichasj1+1;
                btnMeterFicha.setEnabled(true);
                lanzarCañas.setEnabled(false);
                
            }
        

        //Si hay una ficha en el tablero y el avance es de al menos una casilla entonces se llama al método mover ficha
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

        ///ciclo que recorre las fichas del jugador 1 y las mete al tablero con el método moverFicha
        //en este caso la iteración vale el contador exclusivo de las fichas del jugador 1 el cual es una variable declarada afuera de los métodos
        //y va aumentando cada vez que se ejecuta este método
        //Se usa el -1 porque cuando se pulsa lanzar cañas y sale un 1 cuando aun quedan fichas, el contador de fichas ingresadas aumenta, por tanto
        //si les quitaramos el -1 leeria una ficha con un contador superior la cual no existe, se tiene que "revertir" para que se lea la ingresada
            if (fichasj1[contadorFichasj1-1].isEnJuego()) {
            casillaAvanzada = gd.moverFicha(idAuxiliar, 1, fichasj1[contadorFichasj1-1]);
            btnMeterFicha.setEnabled(false);
            lanzarCañas.setEnabled(true);
                System.out.println("ficha "+contadorFichasj1);
            }
        



    }//GEN-LAST:event_btnMeterFichaActionPerformed

    private void TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurnoActionPerformed

    public int LanzarDados() {
        
        int numJug2 = Integer.parseInt(LblnumJugadores.getText().trim());

        System.out.println("numJ: " + numJug2);
        if (iparaNumJ <= numJug2) { //1 <= 2
            Turno.setText("Turno: J" + (iparaNumJ + 1));

            if (iparaNumJ == numJug2) {
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

    //Le pone las imágenes a las cañas
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
    int idAuxiliar = 0;
    int idAuxiliar2 = 0;

    boolean ingresado;
    boolean primeraVez = true;
    GraphicsDemo gd;
    CasillaPartida c = new CasillaPartida();
    List<Casilla> casillas = c.inicializarCasilla10();
    Casilla casillaAvanzada;
    Ficha ficha1j1 = new Ficha();
    Ficha ficha2j1 = new Ficha();
    JLabel j1 = new JLabel();
    JLabel j2 = new JLabel();
    int fichasMetidas;
}
