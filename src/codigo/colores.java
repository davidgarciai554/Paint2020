/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;

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
        Rojo = new javax.swing.JLabel();
        Azul = new javax.swing.JLabel();
        Verde = new javax.swing.JLabel();
        Rosa = new javax.swing.JLabel();
        Negro = new javax.swing.JLabel();
        Gris = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        Rojo.setBackground(new java.awt.Color(255, 0, 0));
        Rojo.setToolTipText("");
        Rojo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Rojo.setOpaque(true);

        Azul.setBackground(new java.awt.Color(0, 0, 255));
        Azul.setOpaque(true);

        Verde.setBackground(new java.awt.Color(51, 255, 0));
        Verde.setOpaque(true);

        Rosa.setBackground(new java.awt.Color(255, 153, 153));
        Rosa.setOpaque(true);

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
                .addComponent(Verde, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Azul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rosa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rosa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gris, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Negro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Verde, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Azul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NegroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NegroMousePressed
        colorSeleccionado= Color.BLUE;
    }//GEN-LAST:event_NegroMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Azul;
    private javax.swing.JLabel Gris;
    private javax.swing.JLabel Negro;
    private javax.swing.JLabel Rojo;
    private javax.swing.JLabel Rosa;
    private javax.swing.JLabel Verde;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
