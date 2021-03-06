/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rennspiel;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author bbsuser
 */
public class Autorennspiel extends javax.swing.JFrame implements RundenListener {

    private final StartPage startPage;
    private final Spiel spiel;
    private boolean spielerAFertig = false;
    private boolean spielerBFertig = false;
    private Aktion spielerAAktion;
    private Aktion spielerBAktion;
    private int streckenLaenge;

    /**
     * Creates new form Autorennspiel
     */
    public Autorennspiel() {
        initComponents();
        startPage = new StartPage();
        startPage.setAutorennspiel(this);
        startPage.setVisible(true);
        streckenLaenge = 1000;
        spiel = new Spiel(_lblSpielerA.getText(), _lblSpielerB.getText(), streckenLaenge);
        spiel.addRundenListener((this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _btnWeiterSpA = new javax.swing.JButton();
        _btnBremsenSpA = new javax.swing.JButton();
        _btnBeschleunigenSpA = new javax.swing.JButton();
        _btnWeiterSpB = new javax.swing.JButton();
        _btnBremsenSpB = new javax.swing.JButton();
        _btnBeschleunigenSpB = new javax.swing.JButton();
        _lblWetter = new javax.swing.JLabel();
        _panelRennbahnSpA = new java.awt.Panel();
        _lblAutoARot = new javax.swing.JLabel();
        _panelRennbahnSpB = new java.awt.Panel();
        _lblAutoBBlau = new javax.swing.JLabel();
        _panelSpA = new javax.swing.JPanel();
        _proBarTankSpA = new javax.swing.JProgressBar();
        _lblSpielerA = new javax.swing.JLabel();
        _lblTankImageSpA = new javax.swing.JLabel();
        _lblGeschwindigkeitSpA = new javax.swing.JLabel();
        _panelSpB = new javax.swing.JPanel();
        _proBarTankSpB = new javax.swing.JProgressBar();
        _lblSpielerB = new javax.swing.JLabel();
        _lblTankImageSpB = new javax.swing.JLabel();
        _lblGeschwindigkeitSpB = new javax.swing.JLabel();
        _lblZiellinieSpA = new javax.swing.JLabel();
        _lblZiellinieSpB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rennspiel");
        setResizable(false);

        _btnWeiterSpA.setText("Weiter");
        _btnWeiterSpA.setFocusPainted(false);
        _btnWeiterSpA.setPreferredSize(new java.awt.Dimension(101, 23));
        _btnWeiterSpA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnWeiterSpAActionPerformed(evt);
            }
        });

        _btnBremsenSpA.setText("Bremsen");
        _btnBremsenSpA.setFocusPainted(false);
        _btnBremsenSpA.setMaximumSize(new java.awt.Dimension(101, 23));
        _btnBremsenSpA.setMinimumSize(new java.awt.Dimension(101, 23));
        _btnBremsenSpA.setPreferredSize(new java.awt.Dimension(101, 23));
        _btnBremsenSpA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnBremsenSpAActionPerformed(evt);
            }
        });

        _btnBeschleunigenSpA.setText("Beschleunigen");
        _btnBeschleunigenSpA.setFocusPainted(false);
        _btnBeschleunigenSpA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnBeschleunigenSpAActionPerformed(evt);
            }
        });

        _btnWeiterSpB.setText("Weiter");
        _btnWeiterSpB.setFocusPainted(false);
        _btnWeiterSpB.setPreferredSize(new java.awt.Dimension(101, 23));
        _btnWeiterSpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnWeiterSpBActionPerformed(evt);
            }
        });

        _btnBremsenSpB.setText("Bremsen");
        _btnBremsenSpB.setFocusPainted(false);
        _btnBremsenSpB.setMaximumSize(new java.awt.Dimension(101, 23));
        _btnBremsenSpB.setMinimumSize(new java.awt.Dimension(101, 23));
        _btnBremsenSpB.setPreferredSize(new java.awt.Dimension(101, 23));
        _btnBremsenSpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnBremsenSpBActionPerformed(evt);
            }
        });

        _btnBeschleunigenSpB.setText("Beschleunigen");
        _btnBeschleunigenSpB.setFocusPainted(false);
        _btnBeschleunigenSpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _btnBeschleunigenSpBActionPerformed(evt);
            }
        });

        _lblWetter.setForeground(new java.awt.Color(0, 204, 0));
        _lblWetter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sonne.png"))); // NOI18N
        _lblWetter.setText("Sonnig");

        _panelRennbahnSpA.setBackground(new java.awt.Color(204, 204, 204));
        _panelRennbahnSpA.setForeground(new java.awt.Color(204, 204, 204));
        _panelRennbahnSpA.setLayout(null);

        _lblAutoARot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/auto rot.png"))); // NOI18N
        _lblAutoARot.setToolTipText("");
        _lblAutoARot.setDoubleBuffered(true);
        _panelRennbahnSpA.add(_lblAutoARot);
        _lblAutoARot.setBounds(0, 300, 128, 128);

        _panelRennbahnSpB.setBackground(new java.awt.Color(204, 204, 204));
        _panelRennbahnSpB.setForeground(new java.awt.Color(204, 204, 204));
        _panelRennbahnSpB.setName(""); // NOI18N
        _panelRennbahnSpB.setLayout(null);

        _lblAutoBBlau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/auto blau.png"))); // NOI18N
        _lblAutoBBlau.setToolTipText("");
        _panelRennbahnSpB.add(_lblAutoBBlau);
        _lblAutoBBlau.setBounds(0, 300, 128, 128);

        _lblSpielerA.setForeground(new java.awt.Color(0, 0, 255));
        _lblSpielerA.setText("Spieler A");

        _lblTankImageSpA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tank.png"))); // NOI18N

        _lblGeschwindigkeitSpA.setForeground(new java.awt.Color(255, 0, 51));
        _lblGeschwindigkeitSpA.setText("Geschwindigkeit: 0 km/h");

        javax.swing.GroupLayout _panelSpALayout = new javax.swing.GroupLayout(_panelSpA);
        _panelSpA.setLayout(_panelSpALayout);
        _panelSpALayout.setHorizontalGroup(
            _panelSpALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_panelSpALayout.createSequentialGroup()
                .addGroup(_panelSpALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lblSpielerA)
                    .addGroup(_panelSpALayout.createSequentialGroup()
                        .addComponent(_proBarTankSpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_lblTankImageSpA))
                    .addComponent(_lblGeschwindigkeitSpA))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        _panelSpALayout.setVerticalGroup(
            _panelSpALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _panelSpALayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(_lblSpielerA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lblGeschwindigkeitSpA)
                .addGap(28, 28, 28)
                .addComponent(_proBarTankSpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _panelSpALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(_lblTankImageSpA))
        );

        _lblSpielerB.setForeground(new java.awt.Color(0, 0, 255));
        _lblSpielerB.setText("Spieler B");

        _lblTankImageSpB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tank.png"))); // NOI18N

        _lblGeschwindigkeitSpB.setForeground(new java.awt.Color(255, 0, 51));
        _lblGeschwindigkeitSpB.setText("Geschwindigkeit: 0 km/h");

        javax.swing.GroupLayout _panelSpBLayout = new javax.swing.GroupLayout(_panelSpB);
        _panelSpB.setLayout(_panelSpBLayout);
        _panelSpBLayout.setHorizontalGroup(
            _panelSpBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_panelSpBLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(_lblTankImageSpB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_proBarTankSpB, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _panelSpBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(_panelSpBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lblSpielerB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_lblGeschwindigkeitSpB, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        _panelSpBLayout.setVerticalGroup(
            _panelSpBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_panelSpBLayout.createSequentialGroup()
                .addComponent(_lblSpielerB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_lblGeschwindigkeitSpB)
                .addGap(24, 24, 24)
                .addComponent(_proBarTankSpB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _panelSpBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(_lblTankImageSpB))
        );

        _lblZiellinieSpA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flagge.png"))); // NOI18N

        _lblZiellinieSpB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flagge.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_btnWeiterSpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_btnBremsenSpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_btnBeschleunigenSpA))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_panelRennbahnSpA, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_lblZiellinieSpA, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_lblZiellinieSpB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(_panelRennbahnSpB, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_btnWeiterSpB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_btnBremsenSpB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_btnBeschleunigenSpB)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(_panelSpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(_lblWetter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_panelSpB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_lblWetter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_panelSpA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_panelSpB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(_btnWeiterSpB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_btnBremsenSpB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_btnBeschleunigenSpB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(_btnWeiterSpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_btnBremsenSpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_btnBeschleunigenSpA)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_lblZiellinieSpA)
                            .addComponent(_lblZiellinieSpB))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_panelRennbahnSpA, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_panelRennbahnSpB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _btnWeiterSpAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnWeiterSpAActionPerformed
        spielerAAktion = Aktion.WEITER;
        spielerAFertig = true;
        RundeFahren();
    }//GEN-LAST:event__btnWeiterSpAActionPerformed

    private void _btnWeiterSpBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnWeiterSpBActionPerformed
        spielerBAktion = Aktion.WEITER;
        spielerBFertig = true;
        RundeFahren();
    }//GEN-LAST:event__btnWeiterSpBActionPerformed

    private void _btnBeschleunigenSpAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnBeschleunigenSpAActionPerformed
        spielerAAktion = Aktion.BESCHLEUNIGEN;
        spielerAFertig = true;
        RundeFahren();
    }//GEN-LAST:event__btnBeschleunigenSpAActionPerformed

    private void _btnBeschleunigenSpBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnBeschleunigenSpBActionPerformed
        spielerBAktion = Aktion.BESCHLEUNIGEN;
        spielerBFertig = true;
        RundeFahren();
    }//GEN-LAST:event__btnBeschleunigenSpBActionPerformed

    private void _btnBremsenSpAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnBremsenSpAActionPerformed
        spielerAAktion = Aktion.BREMSEN;
        spielerAFertig = true;
        RundeFahren();
    }//GEN-LAST:event__btnBremsenSpAActionPerformed

    private void _btnBremsenSpBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__btnBremsenSpBActionPerformed
        spielerBAktion = Aktion.BREMSEN;
        spielerBFertig = true;
        RundeFahren();
    }//GEN-LAST:event__btnBremsenSpBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autorennspiel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autorennspiel().setVisible(false);
            }
        });
    }

    public void SetSpielerNamen(String pSpielerA, String pSpielerB) {
        this._lblSpielerA.setText(pSpielerA);
        this._lblSpielerB.setText(pSpielerB);
    }

    public String getSpielernameA() {
        return this._lblSpielerA.getText();
    }

    public String getSpielernameB() {
        return this._lblSpielerB.getText();
    }

    private void RundeFahren() {
        if (spielerAFertig && spielerBFertig) {
            spiel.Fahren(spielerAAktion, spielerBAktion);
            spielerAFertig = spielerBFertig = false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _btnBeschleunigenSpA;
    private javax.swing.JButton _btnBeschleunigenSpB;
    private javax.swing.JButton _btnBremsenSpA;
    private javax.swing.JButton _btnBremsenSpB;
    private javax.swing.JButton _btnWeiterSpA;
    private javax.swing.JButton _btnWeiterSpB;
    private javax.swing.JLabel _lblAutoARot;
    private javax.swing.JLabel _lblAutoBBlau;
    private javax.swing.JLabel _lblGeschwindigkeitSpA;
    private javax.swing.JLabel _lblGeschwindigkeitSpB;
    private javax.swing.JLabel _lblSpielerA;
    private javax.swing.JLabel _lblSpielerB;
    private javax.swing.JLabel _lblTankImageSpA;
    private javax.swing.JLabel _lblTankImageSpB;
    private javax.swing.JLabel _lblWetter;
    private javax.swing.JLabel _lblZiellinieSpA;
    private javax.swing.JLabel _lblZiellinieSpB;
    private java.awt.Panel _panelRennbahnSpA;
    private java.awt.Panel _panelRennbahnSpB;
    private javax.swing.JPanel _panelSpA;
    private javax.swing.JPanel _panelSpB;
    private javax.swing.JProgressBar _proBarTankSpA;
    private javax.swing.JProgressBar _proBarTankSpB;
    // End of variables declaration//GEN-END:variables

    @Override
    public void advertisement(RundenEvent e) {
        this._lblGeschwindigkeitSpA.setText("Geschwindigkeit: " + e.getGeschwindigkeitSpielerA() + " km/h");
        this._lblGeschwindigkeitSpB.setText("Geschwindigkeit: " + e.getGeschwindigkeitSpielerB() + " km/h");
        this._proBarTankSpA.setValue((int) e.getTankA());
        this._proBarTankSpB.setValue((int) e.getTankB());
        int panelStrecke = this._panelRennbahnSpA.getSize().height - this._lblAutoARot.getSize().height;
        double spielerAGefahreneStrecke = e.getGefahreneStreckeA() / streckenLaenge;
        double positionSpielerA = panelStrecke * spielerAGefahreneStrecke;
        double spielerBGefahreneStrecke = e.getGefahreneStreckeB() / streckenLaenge;
        double positionSpielerB = panelStrecke * spielerBGefahreneStrecke;
        _lblAutoARot.setLocation(0, panelStrecke - (int) positionSpielerA);
        _lblAutoBBlau.setLocation(0, panelStrecke - (int) positionSpielerB);
        switch (e.getWetter()) {
            case SONNIG:
                _lblWetter.setText("Sonnig");
                _lblWetter.setIcon(new ImageIcon("src/images/Sonne.png"));
                break;
            case BEWOELKT:
                _lblWetter.setText("Bewölkt");
                _lblWetter.setIcon(new ImageIcon("src/images/Bewoelkt.png"));
                break;
            case REGEN:
                _lblWetter.setText("Regen");
                _lblWetter.setIcon(new ImageIcon("src/images/Regen.png"));
                break;
            case GLAETTE:
                _lblWetter.setText("Glätte");
                _lblWetter.setIcon(new ImageIcon("src/images/Glaette.png"));
                break;
            default:
                throw new AssertionError();
        }
        this.repaint();
        if (e.isSpielersieg()) {
            JOptionPane.showMessageDialog(rootPane, "Sieger:\n" + e.getGewinner(), "Gratulation!", JOptionPane.INFORMATION_MESSAGE);
            spiel.removeRundenListener(this);
            this.dispose();
        }
    }
}
