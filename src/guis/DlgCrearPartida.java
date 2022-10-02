/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package guis;

import entidades.Apuestas;
import entidades.Casilla;
import entidades.Dado;
import entidades.Ficha;
import entidades.Jugador;
import entidades.Partida;
import entidades.Tablero;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class DlgCrearPartida extends javax.swing.JDialog {

    /**
     * Creates new form DlgCrearPartida
     */
    public DlgCrearPartida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkBox10Casillas = new javax.swing.JCheckBox();
        checkBox12Casillas = new javax.swing.JCheckBox();
        checkBox14Casillas = new javax.swing.JCheckBox();
        checkBox2Jugadores = new javax.swing.JCheckBox();
        checkBox3Jugadores = new javax.swing.JCheckBox();
        checkBox4Jugadores = new javax.swing.JCheckBox();
        checkBox2Fichas = new javax.swing.JCheckBox();
        checkBox3Fichas = new javax.swing.JCheckBox();
        checkBox4Fichas = new javax.swing.JCheckBox();
        checkBox5Fichas = new javax.swing.JCheckBox();
        checkBox6Fichas = new javax.swing.JCheckBox();
        campoTextoFondoApuestas = new javax.swing.JTextField();
        campoTextoMontoPorApuesta = new javax.swing.JTextField();
        botonCrearPartida = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear partida");

        jLabel1.setText("Casillas por aspa");

        jLabel2.setText("Número de jugadores");

        jLabel3.setText("Fichas por jugador");

        jLabel4.setText("Fondo de apuestas");

        jLabel5.setText("Monto por apuesta");

        checkBox10Casillas.setText("10");

        checkBox12Casillas.setText("12");
        checkBox12Casillas.setToolTipText("");

        checkBox14Casillas.setText("14");

        checkBox2Jugadores.setText("2");

        checkBox3Jugadores.setText("3");

        checkBox4Jugadores.setText("4");

        checkBox2Fichas.setText("2");

        checkBox3Fichas.setText("3");

        checkBox4Fichas.setText("4");

        checkBox5Fichas.setText("5");

        checkBox6Fichas.setText("6");

        botonCrearPartida.setText("Crear");
        botonCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPartidaActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBox10Casillas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBox12Casillas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBox14Casillas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBox2Jugadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBox3Jugadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBox4Jugadores))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBox2Fichas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBox3Fichas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBox4Fichas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBox5Fichas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkBox6Fichas))
                            .addComponent(campoTextoFondoApuestas)
                            .addComponent(campoTextoMontoPorApuesta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(botonCrearPartida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(checkBox10Casillas)
                    .addComponent(checkBox12Casillas)
                    .addComponent(checkBox14Casillas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(checkBox2Jugadores)
                    .addComponent(checkBox3Jugadores)
                    .addComponent(checkBox4Jugadores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkBox2Fichas)
                    .addComponent(checkBox3Fichas)
                    .addComponent(checkBox4Fichas)
                    .addComponent(checkBox5Fichas)
                    .addComponent(checkBox6Fichas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTextoFondoApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTextoMontoPorApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrearPartida)
                    .addComponent(botonCancelar))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPartidaActionPerformed
        this.crearPartida();
        this.iniciarPartida();
        dispose();
    }//GEN-LAST:event_botonCrearPartidaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    public boolean validarMonto() {
        try {
            if (esNumero(campoTextoMontoPorApuesta.getText().trim()) && esNumero(campoTextoFondoApuestas.getText().trim())) {

                float maximo = 10000000;

                float monto = Float.parseFloat(campoTextoMontoPorApuesta.getText());
                float fondo = Float.parseFloat(campoTextoFondoApuestas.getText());
                if ((monto > 0 || monto >= maximo) && (fondo > 0 || fondo >= maximo)) {
                    this.confirmacion = 1;
                    JOptionPane.showMessageDialog(null, "Se han validado los datos correctamente");
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Solo se aceptan números");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "LLene correctamente los datos SOLO NÚMEROS");
            return false;
        }
        return false;
    }

    public void vaciar() {
        this.campoTextoMontoPorApuesta.setText("");
        this.campoTextoFondoApuestas.setText("");
    }

    public static boolean esNumero(String numero) {
        return numero.matches("[0-9]*");
    }

    public Partida crearPartida() {
        int numJugadores = 0;
        if (this.checkBox2Jugadores.isSelected()) {
            numJugadores = 2;
        }
        if (this.checkBox3Jugadores.isSelected()) {
            numJugadores = 3;
        }
        if (this.checkBox4Jugadores.isSelected()) {
            numJugadores = 4;
        }

        int fondo = 0;
        int monto = 0;
        if (validarMonto()) {
            monto = Integer.parseInt(campoTextoMontoPorApuesta.getText());
            fondo = Integer.parseInt(campoTextoFondoApuestas.getText());
        }

        int numCasillas = 0;
        if (this.checkBox10Casillas.isSelected()) {
            numCasillas = 10;
        }
        if (this.checkBox12Casillas.isSelected()) {
            numCasillas = 12;
        }
        if (this.checkBox14Casillas.isSelected()) {
            numCasillas = 14;
        }

        int numFichas = 0;
        if (this.checkBox2Fichas.isSelected()) {
            numFichas = 2;
        }
        if (this.checkBox3Fichas.isSelected()) {
            numFichas = 3;
        }
        if (this.checkBox4Fichas.isSelected()) {
            numFichas = 4;
        }
        if (this.checkBox5Fichas.isSelected()) {
            numFichas = 5;
        }
        if (this.checkBox6Fichas.isSelected()) {
            numFichas = 6;
        }

        Apuestas apuestas = new Apuestas(fondo, monto);
        Tablero tablero = new Tablero(this.llenarCasillas(numCasillas * 2 * 4 + 4, numFichas));
        Jugador[] jugadores = this.llenarJugadores(numJugadores, apuestas);

        for (Jugador j : jugadores) {
            j.setFichas(this.llenarFichas(numFichas, j));
        }

        return new Partida(numCasillas, tablero, jugadores, this.llenarDados(), gen());
    }

    public int gen() {
        Random r = new Random(System.currentTimeMillis());
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    public void iniciarPartida() {
        try {
            if (confirmacion == 0) {
                JOptionPane.showMessageDialog(null, "Es necesario que se validen los datos");
                return;
            }
            FrmPartida partida = new FrmPartida();
            FrmMenu.evento.register(partida);
            FrmMenu.evento.post(this.crearPartida());
            partida.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato Erróneo");
        }
    }

    public Dado[] llenarDados() {
        Dado[] dados = new Dado[5];
        for (int i = 0; i < 5; i++) {
            Dado dado = new Dado();
            dados[i] = dado;
        }
        return dados;
    }

    public Jugador[] llenarJugadores(int numJugadores, Apuestas apuesta) {
        Jugador[] jugadores = new Jugador[numJugadores];
        for (int i = 1; i < numJugadores + 1; i++) {
            jugadores[i - 1] = new Jugador(apuesta);
        }
        return jugadores;
    }

    public Casilla[] llenarCasillas(int numCasillas, int numFichas) {
        Casilla[] casillas = new Casilla[numCasillas];
        for (int i = 1; i < numCasillas; i++) {
            casillas[i - 1] = new Casilla(i, new Ficha[numFichas]);
        }
        return casillas;
    }

    public Ficha[] llenarFichas(int numFichas, Jugador jugador) {
        Ficha[] fichas = new Ficha[numFichas];
        for (int i = 1; i < numFichas + 1; i++) {
            fichas[i - 1] = new Ficha(i - 1, -1);
        }
        return fichas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCrearPartida;
    private javax.swing.JTextField campoTextoFondoApuestas;
    private javax.swing.JTextField campoTextoMontoPorApuesta;
    private javax.swing.JCheckBox checkBox10Casillas;
    private javax.swing.JCheckBox checkBox12Casillas;
    private javax.swing.JCheckBox checkBox14Casillas;
    private javax.swing.JCheckBox checkBox2Fichas;
    private javax.swing.JCheckBox checkBox2Jugadores;
    private javax.swing.JCheckBox checkBox3Fichas;
    private javax.swing.JCheckBox checkBox3Jugadores;
    private javax.swing.JCheckBox checkBox4Fichas;
    private javax.swing.JCheckBox checkBox4Jugadores;
    private javax.swing.JCheckBox checkBox5Fichas;
    private javax.swing.JCheckBox checkBox6Fichas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    int confirmacion = 0;
}
