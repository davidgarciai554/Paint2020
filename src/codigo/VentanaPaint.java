/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import codigo.formas.Circulo;
import codigo.formas.Cuadrado;
import codigo.formas.Estrella;
import codigo.formas.Forma;
import codigo.formas.Pentagono;
import codigo.formas.Rectangulo;
import codigo.formas.Triangulo;
import codigo.formas.creaRecta;
import codigo.formas.Pincel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author usuario
 */
public class VentanaPaint extends javax.swing.JFrame {

    BufferedImage buffer, buffer2 = null;

    Graphics2D bufferGraphics, bufferGraphics2, jPanelGraphics = null;

    Forma miForma = null;
    creaRecta recta = null;
    Rectangulo rectangulo=null;
    Pincel pincel = null;
    Boolean relleno = false;
    
    String grosor="4";

    /*
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(640, 450);
        System.out.println("Viva hitler");
    }

    private void inicializaBuffers() {
        // creo una imagen del mismo alto y ancho que el jPanel
        buffer = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());//El buffer es el lienzo sobre el que pintaremos
        buffer2 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        //Creo una imagen modificable
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();
        //inicializo el buffer para que se pinte de blanco entero
        bufferGraphics.setColor(Color.WHITE);
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        bufferGraphics2.setColor(Color.WHITE);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());

        jPanelGraphics = (Graphics2D) jPanel1.getGraphics();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        jPanelGraphics.drawImage(buffer, 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        colores = new codigo.colores();
        herramientas1 = new codigo.herramientas();
        Relleno = new javax.swing.JCheckBox();
        masColores = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancelar)
                .addGap(223, 223, 223))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Cancelar))
                .addGap(32, 32, 32))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        colores.setBackground(new java.awt.Color(255, 255, 255));

        Relleno.setText("Relleno");
        Relleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenoActionPerformed(evt);
            }
        });

        masColores.setText("Mas colores");
        masColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masColoresActionPerformed(evt);
            }
        });

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setText("Grosor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Relleno)
                            .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(masColores)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(Relleno)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(masColores)
                .addGap(21, 21, 21))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        switch (herramientas1.formaElegida) {
            case 0:
                pincel.dibujate(bufferGraphics2, evt.getX(), evt.getY(),grosor);
                break;
            case 1:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 3:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 5:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 4:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 7015:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 6:
                recta.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 7:
                rectangulo.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;

        }
        repaint(0, 0, 1, 1);


    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        switch (herramientas1.formaElegida) {
            case 0:
                pincel = new Pincel(evt.getX(), evt.getY(), colores.colorSeleccionado);
                pincel.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
            case 1:
                miForma = new Circulo(evt.getX(), evt.getY(), 256, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), 3, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), 5, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 7015:
                miForma = new Estrella(evt.getX(), evt.getY(), 256, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 6:
                recta = new creaRecta(evt.getX(), evt.getY(), colores.colorSeleccionado);
                recta.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
            case 7:
                rectangulo = new Rectangulo(evt.getX(), evt.getY(), colores.colorSeleccionado);
                rectangulo.dibujate(bufferGraphics, evt.getX(), evt.getY(),grosor);
                break;
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void RellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenoActionPerformed
        if (Relleno.isSelected()) {
            relleno = true;
        } else {
            relleno = false;
        }
    }//GEN-LAST:event_RellenoActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased

        if(herramientas1.formaElegida > 0 && herramientas1.formaElegida < 6 || herramientas1.formaElegida == 7015){
            miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(),grosor);
        }
        else if(herramientas1.formaElegida == 6){
            recta.dibujate(bufferGraphics2, evt.getX(), evt.getY(),grosor);
        }
        else if(herramientas1.formaElegida == 7){
            rectangulo.dibujate(bufferGraphics2, evt.getX(), evt.getY(),grosor);
        }
        else if(herramientas1.formaElegida == 0){
            pincel.dibujate(bufferGraphics2, evt.getX(), evt.getY(),grosor);
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        jDialog1.setVisible(false);
        colores.colorSeleccionado = jColorChooser1.getColor();
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void masColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masColoresActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_masColoresActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        grosor=Integer.toString(jSlider1.getValue()/15)+"f";
    }//GEN-LAST:event_jSlider1StateChanged

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JCheckBox Relleno;
    private codigo.colores colores;
    private codigo.herramientas herramientas1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton masColores;
    // End of variables declaration//GEN-END:variables
}
