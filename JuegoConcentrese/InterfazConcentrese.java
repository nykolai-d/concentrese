package JuegoConcentrese;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class InterfazConcentrese extends javax.swing.JFrame {
    
    String carta01, carta02, carta03, carta04, carta05, carta06, carta07, carta08, carta09, carta10, carta11, carta12;
    String[] contenedorProvisional = {carta01, carta02, carta03, carta04, carta05, carta06, carta07, carta08, carta09, carta10, carta11, carta12};
   
    int trep1, trep2, trep3, trep4, trep5, trep6, trep7, trep8, trep9, trep10, trep11, trep12;
    int[] contenedorCartas = {trep1, trep2, trep3, trep4, trep5, trep6, trep7, trep8, trep9, trep10, trep11, trep12};
    
    JLabel[] concentreseJLabel = new JLabel[12];
    Tablero naipe = new Tablero();
    String string1 = "";
    String string2 = "";
    String posicion1 = "";
    String posicion2 = "";

    public void darNuevaCarta() {
        contenedorProvisional[0] = naipe.getTablero()[0][0];
        contenedorProvisional[1] = naipe.getTablero()[0][1];
        contenedorProvisional[2] = naipe.getTablero()[0][2];
        contenedorProvisional[3] = naipe.getTablero()[0][3];
        contenedorProvisional[4] = naipe.getTablero()[1][0];
        contenedorProvisional[5] = naipe.getTablero()[1][1];
        contenedorProvisional[6] = naipe.getTablero()[1][2];
        contenedorProvisional[7] = naipe.getTablero()[1][3];
        contenedorProvisional[8] = naipe.getTablero()[2][0];
        contenedorProvisional[9] = naipe.getTablero()[2][1];
        contenedorProvisional[10] = naipe.getTablero()[2][2];
        contenedorProvisional[11] = naipe.getTablero()[2][3];

    }

    public void esconderCarta() {
        for (JLabel car1 : concentreseJLabel) {
            rsscalelabel.RSScaleLabel.setScaleLabel(car1, "src/imagenesCartas/Back.jpg");
        }
        for (int i = 0; i < contenedorCartas.length; i++) {
            contenedorCartas[i] = 0;
        }
        naipe.repartirCartas();
        darNuevaCarta();
        this.mostrarAciertos.setText(Integer.toString(naipe.getAciertos()));
        this.mosVidRest.setText(Integer.toString(naipe.getVidas()));
    }

    public InterfazConcentrese() {
        naipe.repartirCartas();
        darNuevaCarta();
        initComponents();
        this.setLocationRelativeTo(null);
        concentreseJLabel[0] = l1;
        concentreseJLabel[1] = l2;
        concentreseJLabel[2] = l3;
        concentreseJLabel[3] = l4;
        concentreseJLabel[4] = l5;
        concentreseJLabel[5] = l6;
        concentreseJLabel[6] = l7;
        concentreseJLabel[7] = l8;
        concentreseJLabel[8] = l9;
        concentreseJLabel[9] = l10;
        concentreseJLabel[10] = l11;
        concentreseJLabel[11] = l12;
        this.mostrarAciertos.setBackground(Color.WHITE);
        this.mosVidRest.setBackground(Color.WHITE);
        this.reiniciar.setBackground(Color.GRAY);
        this.mostrar.setBackground(Color.GRAY);
        esconderCarta();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        vidas = new javax.swing.JTextField();
        mostrarAciertos = new javax.swing.JTextField();
        aciertos = new javax.swing.JTextField();
        mosVidRest = new javax.swing.JTextField();
        reiniciar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });

        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });

        l6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });

        l7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });

        l4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });

        l11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l11MouseClicked(evt);
            }
        });

        l12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l12MouseClicked(evt);
            }
        });

        l9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l9MouseClicked(evt);
            }
        });

        l5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
        });

        l10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l10MouseClicked(evt);
            }
        });

        l8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });

        vidas.setEditable(false);
        vidas.setText("                                Vidas Restantes:");
        vidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidasActionPerformed(evt);
            }
        });

        mostrarAciertos.setEditable(false);
        mostrarAciertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAciertosActionPerformed(evt);
            }
        });

        aciertos.setEditable(false);
        aciertos.setText("                                             Aciertos:");
        aciertos.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        aciertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aciertosActionPerformed(evt);
            }
        });

        mosVidRest.setEditable(false);
        mosVidRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosVidRestActionPerformed(evt);
            }
        });

        reiniciar.setText(" Reiniciar Partida");
        reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reiniciarMouseClicked(evt);
            }
        });
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        mostrar.setText("Mostrar Tablero");
        mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vidas)
                            .addComponent(aciertos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarAciertos)
                            .addComponent(mosVidRest)))
                    .addComponent(reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrarAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mosVidRest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(reiniciar)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mostrar)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vidasActionPerformed

    private void mostrarAciertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAciertosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarAciertosActionPerformed

    private void mosVidRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mosVidRestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mosVidRestActionPerformed

    private void aciertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aciertosActionPerformed

    }//GEN-LAST:event_aciertosActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reiniciarActionPerformed

    private void reiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reiniciarMouseClicked
        esconderCarta();
    }//GEN-LAST:event_reiniciarMouseClicked

    private void mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseClicked
        System.out.println("Mostrar tablero.");
        System.out.println("Salida:");
        System.out.println("");
        System.out.println("Tablero Revelado:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (naipe.getTablero()[i][j].toCharArray().length == 3) {
                    System.out.print(" " + naipe.getTablero()[i][j]);
                } else {
                    System.out.print("  " + naipe.getTablero()[i][j]);
                }
            }
            System.out.println("");
            System.out.println("----+---+---+----");
        }
    }//GEN-LAST:event_mostrarMouseClicked
    public void darMensajeGanador() {
        Icon m = new ImageIcon(getClass().getResource("/JuegoConcentrese/ganador.png"));

        JOptionPane.showMessageDialog(null, "   Ha ganado la batalla", "??Felicitaciones!", JOptionPane.ERROR_MESSAGE, m);
        esconderCarta();
    }

    public void darMensajePerdedor() {
        Icon m = new ImageIcon(getClass().getResource("/JuegoConcentrese/gameover.png"));
        JOptionPane.showMessageDialog(null, "   Ha perdido la batalla", "No tiene m??s vidas", JOptionPane.ERROR_MESSAGE, m);
        esconderCarta();
    }

    public void darMensajeDescache() {
        char[] ca = string2.toCharArray();
        if (ca.length == 3) {
            Icon m = new ImageIcon(getClass().getResource("/JuegoConcentrese/descache.png"));
            JOptionPane.showMessageDialog(null, "Ha destapado el " + ca[0] + ca[1] + " de " + Tablero.convertirEtiquetaAString(Character.toString(ca[2]))
                    + "\n??Ha fallado!",
                    "Error", JOptionPane.ERROR_MESSAGE, m);

        } else {
            Icon m = new ImageIcon(getClass().getResource("/JuegoConcentrese/descache.png"));
            JOptionPane.showMessageDialog(null, "Ha destapado el " + ca[0] + " de " + Tablero.convertirEtiquetaAString(Character.toString(ca[1]))
                    + "\n??Ha fallado!",
                    "Error", JOptionPane.ERROR_MESSAGE, m);
        }
    }

    public void reiniciarDatos() {
        string1 = "";
        string2 = "";
        posicion1 = "";
        posicion2 = "";
    }

    public void darMensajeAcierto() {
        if (esIgual() == false) {
            darMensajeDescache();
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[Integer.parseInt(posicion1)], "src/imagenesCartas/Back.jpg");
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[Integer.parseInt(posicion2)], "src/imagenesCartas/Back.jpg");
            contenedorCartas[Integer.parseInt(posicion1)] = 0;
            contenedorCartas[Integer.parseInt(posicion2)] = 0;
            reiniciarDatos();
            naipe.setVidas(naipe.getVidas() - 1);
            this.mosVidRest.setText(Integer.toString(naipe.getVidas()));
            if (this.mosVidRest.getText().equals("0")) {
                darMensajePerdedor();
            }
        } else if (esIgual() == true) {
            Icon m = new ImageIcon(getClass().getResource("/JuegoConcentrese/acierto.png"));
            JOptionPane.showMessageDialog(null, "   ??Muy bien!", "Acierto", JOptionPane.ERROR_MESSAGE, m);
            contenedorCartas[Integer.parseInt(posicion1)] = 1;
            contenedorCartas[Integer.parseInt(posicion2)] = 1;
            reiniciarDatos();
            naipe.setAciertos(naipe.getAciertos() + 1);
            this.mostrarAciertos.setText(Integer.toString(naipe.getAciertos()));
            if (this.mostrarAciertos.getText().equals("6")) {
                darMensajeGanador();
            }
        }
    }

    public boolean esIgual() {
        boolean carta;
        carta = string1.equals(string2);
        return carta;
    }

    public void agregarPYC(int carta, String posicion) {
        if (string1.equals("")) {
            string1 = contenedorProvisional[carta];
        } else if (string2.equals("")) {
            string2 = contenedorProvisional[carta];
        }
        if (posicion1.equals("")) {
            posicion1 = posicion;
        } else if (posicion2.equals("")) {
            posicion2 = posicion;
        }
    }
    
    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        if (contenedorCartas[0] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[0], "src/imagenesCartas/" + contenedorProvisional[0] + ".jpg");

            agregarPYC(0, "0");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[0] = 1;
            }
        }
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        if (contenedorCartas[1] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[1], "src/imagenesCartas/" + contenedorProvisional[1] + ".jpg");

            agregarPYC(1, "1");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[1] = 1;
            }
        }
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        if (contenedorCartas[2] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[2], "src/imagenesCartas/" + contenedorProvisional[2] + ".jpg");

            agregarPYC(2, "2");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[2] = 1;
            }
        }
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        if (contenedorCartas[3] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[3], "src/imagenesCartas/" + contenedorProvisional[3] + ".jpg");

            agregarPYC(3, "3");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[3] = 1;
            }
        }
    }//GEN-LAST:event_l4MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
        if (contenedorCartas[4] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[4], "src/imagenesCartas/" + contenedorProvisional[4] + ".jpg");

            agregarPYC(4, "4");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[4] = 1;
            }

        }
    }//GEN-LAST:event_l5MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        if (contenedorCartas[5] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[5], "src/imagenesCartas/" + contenedorProvisional[5] + ".jpg");

            agregarPYC(5, "5");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[5] = 1;
            }

        }
    }//GEN-LAST:event_l6MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        if (contenedorCartas[6] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[6], "src/imagenesCartas/" + contenedorProvisional[6] + ".jpg");

            agregarPYC(6, "6");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[6] = 1;
            }

        }
    }//GEN-LAST:event_l7MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
        if (contenedorCartas[7] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[7], "src/imagenesCartas/" + contenedorProvisional[7] + ".jpg");

            agregarPYC(7, "7");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[7] = 1;
            }

        }
    }//GEN-LAST:event_l8MouseClicked

    private void l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l9MouseClicked
        if (contenedorCartas[8] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[8], "src/imagenesCartas/" + contenedorProvisional[8] + ".jpg");

            agregarPYC(8, "8");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[8] = 1;
            }

        }
    }//GEN-LAST:event_l9MouseClicked

    private void l10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l10MouseClicked
        if (contenedorCartas[9] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[9], "src/imagenesCartas/" + contenedorProvisional[9] + ".jpg");

            agregarPYC(9, "9");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[9] = 1;
            }

        }
    }//GEN-LAST:event_l10MouseClicked

    private void l11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l11MouseClicked
        if (contenedorCartas[10] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[10], "src/imagenesCartas/" + contenedorProvisional[10] + ".jpg");

            agregarPYC(10, "10");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[10] = 1;
            }

        }
    }//GEN-LAST:event_l11MouseClicked

    private void l12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l12MouseClicked
        if (contenedorCartas[11] == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(concentreseJLabel[11], "src/imagenesCartas/" + contenedorProvisional[11] + ".jpg");

            agregarPYC(11, "11");

            if (!string2.equals("")) {
                darMensajeAcierto();
            } else {
                contenedorCartas[11] = 1;
            }

        }
    }//GEN-LAST:event_l12MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazConcentrese().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aciertos;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField mosVidRest;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField mostrarAciertos;
    private javax.swing.JButton reiniciar;
    private javax.swing.JTextField vidas;
    // End of variables declaration//GEN-END:variables
}
