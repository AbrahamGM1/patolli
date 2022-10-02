/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import entidades.Casilla;
import entidades.Ficha;
import entidades.Jugador;
import entidades.Partida;
import guis.panel.GraphicsDemo;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.greenrobot.eventbus.Subscribe;

/**
 *
 * @author luisg
 */
public class FrmPartida extends javax.swing.JFrame {

    /**
     * Creates new form FrmPartida
     */
    public FrmPartida(Partida partida) {
        initComponents();
        this.partida = partida;
        this.casillas = partida.getNumCasillas();
        mostrarTablero(this.casillas);
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

        panelPartida = new javax.swing.JPanel();
        botonTirarDados = new javax.swing.JButton();
        botonApostar = new javax.swing.JButton();
        campoTextoApuesta = new javax.swing.JTextField();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        dado3 = new javax.swing.JLabel();
        dado4 = new javax.swing.JLabel();
        dado5 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        jugador3 = new javax.swing.JLabel();
        jugador4 = new javax.swing.JLabel();
        panelCodigo = new javax.swing.JPanel();
        codigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1650, 957));

        botonTirarDados.setText("Tirar Dados");
        botonTirarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTirarDadosActionPerformed(evt);
            }
        });

        botonApostar.setText("Apostar");

        jugador1.setText("Jugador 1");

        jugador2.setText("Jugador 2");

        jugador3.setText("Jugador 3");

        jugador4.setText("Jugador 4");

        javax.swing.GroupLayout panelCodigoLayout = new javax.swing.GroupLayout(panelCodigo);
        panelCodigo.setLayout(panelCodigoLayout);
        panelCodigoLayout.setHorizontalGroup(
            panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );
        panelCodigoLayout.setVerticalGroup(
            panelCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPartidaLayout = new javax.swing.GroupLayout(panelPartida);
        panelPartida.setLayout(panelPartidaLayout);
        panelPartidaLayout.setHorizontalGroup(
            panelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPartidaLayout.createSequentialGroup()
                .addGroup(panelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPartidaLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(botonApostar)
                        .addGap(18, 18, 18)
                        .addComponent(campoTextoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPartidaLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dado5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPartidaLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(botonTirarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPartidaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jugador1)
                        .addGap(18, 18, 18)
                        .addComponent(jugador2)
                        .addGap(18, 18, 18)
                        .addComponent(jugador3)
                        .addGap(18, 18, 18)
                        .addComponent(jugador4)))
                .addContainerGap(1154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPartidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPartidaLayout.setVerticalGroup(
            panelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPartidaLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dado5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botonTirarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352)
                .addGroup(panelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonApostar)
                    .addComponent(campoTextoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(panelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1)
                    .addComponent(jugador2)
                    .addComponent(jugador3)
                    .addComponent(jugador4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(panelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTirarDadosActionPerformed
        try {
            this.LanzarDados();
            
            for (int i = 0; i < partida.getListaJugadores()[0].getFichas().length; i++) {
                Ficha ficha = partida.getListaJugadores()[0].getFichas()[i];
                if (!verificarDentro(ficha.getId(), partida.getListaJugadores()[0])) {
                    moverFicha(ficha, ficha.getPosicion() + this.determinarMovimiento());
                    int posicion = partida.getListaJugadores()[0].getFichas()[i].getPosicion();
                    partida.getListaJugadores()[0].getFichas()[i].setPosicion(posicion + determinarMovimiento());
                    System.out.println(posicion + determinarMovimiento());
                    return;
                } else {
                    meterFichaMeta(ficha, this.determinarMovimiento());
                    if (this.determinarMovimiento() > 0) {
                        partida.getListaJugadores()[0].getFichas()[i].setPosicion(0);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_botonTirarDadosActionPerformed

    public void LanzarDados() {
        //caña1
        partida.getDados()[0].GenerarLado();
        partida.getDados()[1].GenerarLado();
        partida.getDados()[2].GenerarLado();
        partida.getDados()[3].GenerarLado();
        partida.getDados()[4].GenerarLado();
        
        if (partida.getDados()[0].getLado()) {
            dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        if (partida.getDados()[1].getLado()) {
            dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        if (partida.getDados()[2].getLado()) {
            dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        if (partida.getDados()[3].getLado()) {
            dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
        if (partida.getDados()[4].getLado()) {
            dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaPunto.png")));
        } else {
            dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        }
    }
    
    public void iniciarlbl() {

        dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("//imagenes/cañaLisa.png")));
        dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
        dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cañaLisa.png")));
    }
    
    public void mostrarTablero(int Casillas) {
        panelT = new GraphicsDemo(Casillas);
        panelT.setLocation(676, 92);
        panelT.setSize(720, 720);
        panelT.setVisible(true);
        panelPartida.add(panelT);
        g = panelT.getGraphics();
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
        for (int i = 0; i < jugador.getFichas().length; i++) {
            if (jugador.getFichas()[i].getId() == Id) {
                Ficha ficha = jugador.getFichas()[i];
                if (ficha.getPosicion() == -1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    
    public void meterFichaMeta(Ficha ficha, int movimientos) {
        if (movimientos > 0) {
            GraphicsDemo g = new GraphicsDemo(casillas);
            gdemo.setx(500 + gdemo.getx());
            gdemo.sety(199 + gdemo.gety());
            gdemo.repaint();
//            gdemo.meterFichaCentral(this.PanelT.getGraphics(), 1);
            Casilla[] casillasP = partida.getTablero().getCasillas();
            this.partida.getTablero().getCasillas()[0].agregarFicha(ficha);
            //Cambiar estado de ficha(posicion)
            System.out.println(casillasP.length);
        } else {
            JOptionPane.showMessageDialog(null, "No se alcanzo el minimo puntaje para entrar");
        }
    }
    
    public void moverFicha(Ficha ficha, int movimientos) {
        if (movimientos > 0) {
            gdemo.setx(199);
            gdemo.sety(566);
            gdemo.AvanzarFicha(this.panelT.getGraphics(), movimientos, 1);
            gdemo.repaint();
        }
    }
    
    @Subscribe
    public void establecerPartida(Partida partida) {
        this.partida = partida;
        this.casillas = partida.getNumCasillas();
        mostrarTablero(casillas);
        gdemo = new GraphicsDemo(casillas);
        codigo.setText(Integer.toString(this.partida.getCodigo()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonApostar;
    private javax.swing.JButton botonTirarDados;
    private javax.swing.JTextField campoTextoApuesta;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JLabel dado5;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JLabel jugador3;
    private javax.swing.JLabel jugador4;
    private javax.swing.JPanel panelCodigo;
    private javax.swing.JPanel panelPartida;
    // End of variables declaration//GEN-END:variables
    Graphics g;
    JPanel panelT;
    Partida partida;
    int casillas;
    GraphicsDemo gdemo;
}
