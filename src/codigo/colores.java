/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import codigo.VentanaPaint;

/**
 *
 * @author usuario
 */
public class colores extends javax.swing.JPanel {

    public Color colorSeleccionado = Color.black;

    /**
     * Creates new form colores
     */
    public colores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Negro = new javax.swing.JLabel();
        Gris = new javax.swing.JLabel();
        Rojo = new javax.swing.JLabel();
        Naranja = new javax.swing.JLabel();
        Amarillo = new javax.swing.JLabel();
        Verde = new javax.swing.JLabel();
        Cian = new javax.swing.JLabel();
        Azul = new javax.swing.JLabel();
        Violeta = new javax.swing.JLabel();
        colorActual = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setOpaque(false);

        Negro.setBackground(new java.awt.Color(0, 0, 0));
        Negro.setOpaque(true);
        Negro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NegroMousePressed(evt);
            }
        });

        Gris.setBackground(new java.awt.Color(204, 204, 204));
        Gris.setToolTipText("");
        Gris.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Gris.setOpaque(true);
        Gris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GrisMousePressed(evt);
            }
        });

        Rojo.setBackground(new java.awt.Color(255, 0, 51));
        Rojo.setOpaque(true);
        Rojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RojoMousePressed(evt);
            }
        });

        Naranja.setBackground(new java.awt.Color(255, 102, 0));
        Naranja.setToolTipText("");
        Naranja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Naranja.setOpaque(true);
        Naranja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NaranjaMousePressed(evt);
            }
        });

        Amarillo.setBackground(new java.awt.Color(255, 255, 0));
        Amarillo.setOpaque(true);
        Amarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AmarilloMousePressed(evt);
            }
        });

        Verde.setBackground(new java.awt.Color(0, 255, 0));
        Verde.setToolTipText("");
        Verde.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Verde.setOpaque(true);
        Verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VerdeMousePressed(evt);
            }
        });

        Cian.setBackground(new java.awt.Color(0, 255, 204));
        Cian.setOpaque(true);
        Cian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CianMousePressed(evt);
            }
        });

        Azul.setBackground(new java.awt.Color(0, 0, 255));
        Azul.setToolTipText("");
        Azul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Azul.setOpaque(true);
        Azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AzulMousePressed(evt);
            }
        });

        Violeta.setBackground(new java.awt.Color(204, 0, 204));
        Violeta.setToolTipText("");
        Violeta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Violeta.setOpaque(true);
        Violeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VioletaMousePressed(evt);
            }
        });

        colorActual.setBackground(new java.awt.Color(0, 0, 0));
        colorActual.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Negro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gris, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Verde, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cian, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Azul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Violeta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Violeta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Azul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cian, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Verde, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gris, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Negro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(colorActual, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NegroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NegroMousePressed
        colorSeleccionado = Color.black;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_NegroMousePressed

    private void GrisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrisMousePressed
        colorSeleccionado = Color.gray;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_GrisMousePressed

    private void NaranjaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NaranjaMousePressed
        colorSeleccionado = Color.orange;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_NaranjaMousePressed

    private void RojoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RojoMousePressed
        colorSeleccionado = Color.red;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_RojoMousePressed

    private void CianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CianMousePressed
        colorSeleccionado = Color.cyan;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_CianMousePressed

    private void AzulMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AzulMousePressed
        colorSeleccionado = Color.blue;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_AzulMousePressed

    private void AmarilloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmarilloMousePressed
        colorSeleccionado = Color.yellow;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_AmarilloMousePressed

    private void VerdeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerdeMousePressed
        colorSeleccionado = Color.green;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_VerdeMousePressed

    private void VioletaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VioletaMousePressed
        colorSeleccionado = Color.MAGENTA;
        colorActual.setBackground(colorSeleccionado);
    }//GEN-LAST:event_VioletaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amarillo;
    private javax.swing.JLabel Azul;
    private javax.swing.JLabel Cian;
    private javax.swing.JLabel Gris;
    private javax.swing.JLabel Naranja;
    private javax.swing.JLabel Negro;
    private javax.swing.JLabel Rojo;
    private javax.swing.JLabel Verde;
    private javax.swing.JLabel Violeta;
    public javax.swing.JLabel colorActual;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
