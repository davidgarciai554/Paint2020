/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author usuario
 */
public class herramientas extends javax.swing.JPanel {

    public int formaElegida = 0;

    /**
     * Creates new form herramientas
     */
    public herramientas() {
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

        Circulo = new javax.swing.JButton();
        Cuadrado = new javax.swing.JButton();
        Pentagono = new javax.swing.JButton();
        Pincel = new javax.swing.JButton();
        Estrella = new javax.swing.JButton();
        Triangulo = new javax.swing.JButton();

        Circulo.setText("Circulo");
        Circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CirculoActionPerformed(evt);
            }
        });

        Cuadrado.setText("Cuadrado");
        Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadradoActionPerformed(evt);
            }
        });

        Pentagono.setText("Pentagono");
        Pentagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PentagonoActionPerformed(evt);
            }
        });

        Pincel.setText("Pincel");
        Pincel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PincelActionPerformed(evt);
            }
        });

        Estrella.setText("Estrella");
        Estrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstrellaActionPerformed(evt);
            }
        });

        Triangulo.setText("Triangulo");
        Triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Pentagono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pincel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Estrella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pincel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Circulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Triangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pentagono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Estrella)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CirculoActionPerformed
        formaElegida = 1;
    }//GEN-LAST:event_CirculoActionPerformed

    private void CuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadradoActionPerformed
        formaElegida = 4;
    }//GEN-LAST:event_CuadradoActionPerformed

    private void PentagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PentagonoActionPerformed
        formaElegida = 5;
    }//GEN-LAST:event_PentagonoActionPerformed

    private void PincelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PincelActionPerformed
        formaElegida = 0;
    }//GEN-LAST:event_PincelActionPerformed

    private void EstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstrellaActionPerformed
        formaElegida = 7015;
    }//GEN-LAST:event_EstrellaActionPerformed

    private void TrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrianguloActionPerformed
        formaElegida=3;
    }//GEN-LAST:event_TrianguloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Circulo;
    private javax.swing.JButton Cuadrado;
    private javax.swing.JButton Estrella;
    private javax.swing.JButton Pentagono;
    private javax.swing.JButton Pincel;
    private javax.swing.JButton Triangulo;
    // End of variables declaration//GEN-END:variables
}
