/*
 *
 * Ventana principal del Paint
 *
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
import codigo.formas.Pipeta;
import codigo.formas.escribeTexto;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author usuario
 */
public class VentanaPaint extends javax.swing.JFrame {

    Random aleatorio = new Random();

    BufferedImage buffer, buffer2, buffer3, _colorActual = null;//inicializo los buffers

    Graphics2D bufferGraphics, bufferGraphics2, bufferGraphics3, jPanelGraphics = null;//inicializo los graphics

    Forma miForma = null;
    creaRecta recta = null;
    Rectangulo rectangulo = null;
    Pincel pincel = null;
    Pipeta pipeta = null;
    Boolean relleno = false;
    escribeTexto _texto = null;

    int Xtexto = 0;
    int Ytexto = 0;

    String texto = "";

    String grosorGoma = "4";
    String grosor = "4";
    int grosorSpray = 3;
    int tamañoLetra=100;
    
    ArrayList <BufferedImage> buffers = new ArrayList<>();

    /*
    * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(640, 450);
        escribeTexto.setSize(402, 93);
        System.out.println("Viva karel");
    }

    private void inicializaBuffers() {
        // creo una imagen del mismo alto y ancho que el jPanel
        buffer = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());//El buffer es el lienzo sobre el que pintaremos
        buffer2 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        buffer3 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        //Creo una imagen modificable
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();
        bufferGraphics3 = buffer3.createGraphics();
        //inicializo el buffer para que se pinte de blanco entero
        bufferGraphics.setColor(Color.WHITE);
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        bufferGraphics2.setColor(Color.WHITE);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        jPanelGraphics = (Graphics2D) jPanel1.getGraphics();
        bufferGraphics3.drawImage(buffer2, null, this);
        buffers.add(buffer3);
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
        jSeparator1 = new javax.swing.JSeparator();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        escribeTexto = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botonTexto = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        colores = new codigo.colores();
        herramientas1 = new codigo.herramientas();
        Relleno = new javax.swing.JCheckBox();
        masColores = new javax.swing.JButton();
        jSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

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

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        botonTexto.setText("Aceptar");
        botonTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTextoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout escribeTextoLayout = new javax.swing.GroupLayout(escribeTexto.getContentPane());
        escribeTexto.getContentPane().setLayout(escribeTextoLayout);
        escribeTextoLayout.setHorizontalGroup(
            escribeTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escribeTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonTexto)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        escribeTextoLayout.setVerticalGroup(
            escribeTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escribeTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escribeTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botonTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
            .addGap(0, 682, Short.MAX_VALUE)
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

        masColores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Paleta.png"))); // NOI18N
        masColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masColoresActionPerformed(evt);
            }
        });

        jSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderStateChanged(evt);
            }
        });

        jLabel1.setText("Grosor");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lienzo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jMenu1.add(nuevo);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jMenu1.add(guardar);

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        jMenu1.add(abrir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Deshacer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Relleno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(masColores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Relleno)
                            .addComponent(masColores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        switch (herramientas1.formaElegida) {//un switch con todas las diferentes herramientas en el dragged
            case 0:
                pincel.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
                break;
            case 1:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 3:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 5:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 4:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 7015:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 6:
                recta.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 7:
                rectangulo.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 8:
                pincel.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosorGoma);
                break;
            case 9:
                bufferGraphics2.setColor(colores.colorSeleccionado);
                bufferGraphics2.fillOval(evt.getX() - aleatorio.nextInt((int) Math.PI * (grosorSpray * grosorSpray)) / 4, evt.getY() - aleatorio.nextInt((int) Math.PI * (grosorSpray * grosorSpray)) / 4, grosorSpray, grosorSpray);
                break;
            case 12:

                break;
        }
        repaint(0, 0, 1, 1);


    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        switch (herramientas1.formaElegida) {//un switch con todas las diferentes herramientas en el pressed
            case 0:
                pincel = new Pincel(evt.getX(), evt.getY(), colores.colorSeleccionado);
                pincel.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 1:
                miForma = new Circulo(evt.getX(), evt.getY(), 256, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), 3, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), 5, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 7015:
                miForma = new Estrella(evt.getX(), evt.getY(), 256, colores.colorSeleccionado, relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 6:
                recta = new creaRecta(evt.getX(), evt.getY(), colores.colorSeleccionado);
                recta.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 7:
                rectangulo = new Rectangulo(evt.getX(), evt.getY(), colores.colorSeleccionado, relleno);
                rectangulo.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosor);
                break;
            case 8:
                pincel = new Pincel(evt.getX(), evt.getY(), Color.WHITE);
                pincel.dibujate(bufferGraphics, evt.getX(), evt.getY(), grosorGoma);
                break;
            case 10:
                pipeta = new Pipeta(evt.getX(), evt.getY(), buffer2);
                colores.colorSeleccionado = pipeta.cogeColor(evt.getX(), evt.getY(), buffer2, colores.colorSeleccionado);
                colores.colorActual.setBackground(colores.colorSeleccionado);
                break;
        }

    }//GEN-LAST:event_jPanel1MousePressed

    private void RellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenoActionPerformed
        relleno = Relleno.isSelected();
    }//GEN-LAST:event_RellenoActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        //un if else con todas las diferentes herramientas
        if (herramientas1.formaElegida > 0 && herramientas1.formaElegida < 6 || herramientas1.formaElegida == 7015) {
            miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
        } else if (herramientas1.formaElegida == 6) {
            recta.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
        } else if (herramientas1.formaElegida == 7) {
            rectangulo.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
        } else if (herramientas1.formaElegida == 0) {
            pincel.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosor);
        } else if (herramientas1.formaElegida == 8) {
            pincel.dibujate(bufferGraphics2, evt.getX(), evt.getY(), grosorGoma);
        } else if (herramientas1.formaElegida == 11) {
            int xFlood = evt.getX();
            int yFlood = evt.getY();
            int rgb = buffer.getRGB(xFlood, yFlood);
            Color c = new Color(rgb);
            fill(xFlood, yFlood, c, colores.colorSeleccionado);
            jPanelGraphics.drawImage(buffer2, 0, 0, null);
            bufferGraphics2.drawImage(buffer2, 0, 0, null);
        } else if (herramientas1.formaElegida == 12) {
            escribeTexto.setLocation(evt.getX(), evt.getY());//aparece el text area en el lugar
            escribeTexto.setVisible(true);
            Xtexto=evt.getX();
            Ytexto=evt.getY();
        }
        if (herramientas1.formaElegida != 12) {
            buffer3 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
            bufferGraphics3 = buffer3.createGraphics();
            bufferGraphics3.drawImage(buffer2, null, this);
            buffers.add(buffer3);
        }
        jPanelGraphics.drawImage(buffer2, 0, 0, null);
    }//GEN-LAST:event_jPanel1MouseReleased

    public <Queue> void fill(int x, int y, Color colorBase, Color colorNuevo) {//relleno usando recursion
        java.util.Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point pt = queue.remove();
            if (pt.x < 0 || pt.x >= buffer2.getWidth() || pt.y < 0 || pt.y >= buffer2.getHeight() || colorBase.getRGB() != buffer2.getRGB(pt.x, pt.y)) {
                continue;
            }
            buffer2.setRGB(pt.x, pt.y, colorNuevo.getRGB());
            //jPanelGraphics.drawImage(buffer, 0, 0, null);
            queue.add(new Point(pt.x - 1, pt.y));
            queue.add(new Point(pt.x + 1, pt.y));
            queue.add(new Point(pt.x, pt.y - 1));
            queue.add(new Point(pt.x, pt.y + 1));
        }
    }

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        jDialog1.setVisible(false);
        colores.colorSeleccionado = jColorChooser1.getColor();//pone el color seleccionado en la variable
        colores.colorActual.setBackground(colores.colorSeleccionado);
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void masColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masColoresActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_masColoresActionPerformed

    private void jSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStateChanged
        grosor = Integer.toString(jSlider.getValue() / 10) + "f";
        grosorGoma = Integer.toString(jSlider.getValue() / 7) + "f";
        grosorSpray = (jSlider.getValue() / 15);
        if (grosorSpray < 2) {
            grosorSpray = 2;
        }
        tamañoLetra=jSlider.getValue() *2;
    }//GEN-LAST:event_jSliderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //pone el jPanel en blanco es decir borra todo
        bufferGraphics.setColor(Color.WHITE);
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        bufferGraphics2.setColor(Color.WHITE);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        jPanelGraphics.drawImage(buffer, 0, 0, null);
        //para que funcione el ctrl+z despues de borrar todo
        buffer3 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        bufferGraphics3 = buffer3.createGraphics();
        bufferGraphics3.drawImage(buffer2, null, this);
        buffers.add(buffer3);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        int seleccion = jFileChooser1.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {//si entra aqui es porque han pulsado el boton guardar
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());

            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {
                    ImageIO.write(buffer, "png", fichero);
                } catch (IOException e) {

                }
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        bufferGraphics.setColor(Color.WHITE);//acceso directo para dibujo nuevo al igual que el borrar todo
        bufferGraphics.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        bufferGraphics2.setColor(Color.WHITE);
        bufferGraphics2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        jPanelGraphics.drawImage(buffer, 0, 0, null);
    }//GEN-LAST:event_nuevoActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de imagen jpg", "jpg"));//seleccioonar un dibujo previamente guardado
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("arhivos de imagen png", "png"));
        int seleccion = jFileChooser1.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());

            if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")) {
                try {

                    bufferGraphics.drawImage(ImageIO.read(fichero), 0, 0, null);
                    bufferGraphics2.drawImage(ImageIO.read(fichero), 0, 0, null);
                    repaint(0, 0, 1, 1);
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_abrirActionPerformed

    private void botonTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTextoActionPerformed
        texto = jTextArea1.getText();// boton del texto al cual eliges dicha herramienta
        escribeTexto.setVisible(false);
        _texto = new escribeTexto(Xtexto, Ytexto, texto);
        _texto.escribe(jPanelGraphics, Xtexto, Ytexto, texto, colores.colorSeleccionado,tamañoLetra);
        _texto.escribe(bufferGraphics, Xtexto, Ytexto, texto, colores.colorSeleccionado,tamañoLetra);
        _texto.escribe(bufferGraphics2, Xtexto, Ytexto, texto, colores.colorSeleccionado,tamañoLetra);
        jPanelGraphics.drawImage(buffer2, 0, 0, null);
        jTextArea1.setText("");
        buffer3 = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        bufferGraphics3 = buffer3.createGraphics();
        bufferGraphics3.drawImage(buffer2, null, this);
        buffers.add(buffer3);
    }//GEN-LAST:event_botonTextoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (buffers.size() > 1){//acceso directo para el deshacer
            bufferGraphics2.drawImage(buffers.get(buffers.size() - 2), 0, 0, null);
            buffers.remove(buffers.size() - 1);
            jPanelGraphics.drawImage(buffer2, 0, 0, null);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed


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
    private javax.swing.JMenuItem abrir;
    private javax.swing.JButton botonTexto;
    private codigo.colores colores;
    private javax.swing.JDialog escribeTexto;
    private javax.swing.JMenuItem guardar;
    private codigo.herramientas herramientas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton masColores;
    private javax.swing.JMenuItem nuevo;
    // End of variables declaration//GEN-END:variables
}
