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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Circulo = new javax.swing.JButton();
        Cuadrado = new javax.swing.JButton();
        Pentagono = new javax.swing.JButton();
        Pincel = new javax.swing.JButton();
        Estrella = new javax.swing.JButton();
        Triangulo = new javax.swing.JButton();
        Recta = new javax.swing.JButton();
        Rectangulo = new javax.swing.JButton();
        Borrador = new javax.swing.JButton();
        Spray = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        Circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Elipse.png"))); // NOI18N
        Circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CirculoActionPerformed(evt);
            }
        });

        Cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cuadro.png"))); // NOI18N
        Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadradoActionPerformed(evt);
            }
        });

        Pentagono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pentagono.png"))); // NOI18N
        Pentagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PentagonoActionPerformed(evt);
            }
        });

        Pincel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Trazado.png"))); // NOI18N
        Pincel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PincelActionPerformed(evt);
            }
        });

        Estrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Estrella.png"))); // NOI18N
        Estrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstrellaActionPerformed(evt);
            }
        });

        Triangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Triangulo.png"))); // NOI18N
        Triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrianguloActionPerformed(evt);
            }
        });

        Recta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Linea.png"))); // NOI18N
        Recta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectaActionPerformed(evt);
            }
        });

        Rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rectangulo.png"))); // NOI18N
        Rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectanguloActionPerformed(evt);
            }
        });

        Borrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Borrador.png"))); // NOI18N
        Borrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorradorActionPerformed(evt);
            }
        });

        Spray.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Spray.png"))); // NOI18N
        Spray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SprayActionPerformed(evt);
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
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Pincel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Recta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Rectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Borrador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pentagono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Spray, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pincel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Rectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pentagono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(162, Short.MAX_VALUE))
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
        formaElegida = 3;
    }//GEN-LAST:event_TrianguloActionPerformed

    private void RectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectaActionPerformed
        formaElegida = 6;
    }//GEN-LAST:event_RectaActionPerformed

    private void RectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectanguloActionPerformed
        formaElegida = 7;
    }//GEN-LAST:event_RectanguloActionPerformed

    private void BorradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorradorActionPerformed
        formaElegida = 8;
    }//GEN-LAST:event_BorradorActionPerformed

    private void SprayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SprayActionPerformed
        formaElegida=9;
    }//GEN-LAST:event_SprayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrador;
    private javax.swing.JButton Circulo;
    private javax.swing.JButton Cuadrado;
    private javax.swing.JButton Estrella;
    private javax.swing.JButton Pentagono;
    private javax.swing.JButton Pincel;
    private javax.swing.JButton Recta;
    private javax.swing.JButton Rectangulo;
    private javax.swing.JButton Spray;
    private javax.swing.JButton Triangulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
