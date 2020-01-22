/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author usuario
 */
public class Circulo extends Ellipse2D.Double {
    
    public Color color = Color.black;
    public boolean relleno = false;
    
    public Circulo(int posX, int posY, int diametro, Color _color, boolean _relleno) {
        super();
        x = posX;  //asigno las posX a la propiedad x del constructor de ellips2D.double
        y = posY;
        width = diametro;
        height = diametro;
        color = _color;
        relleno = _relleno;
        
    }
    
    public void dibujate(Graphics2D g2, int posX) {
        int diametro = Math.abs((int) x - posX);
        width = diametro;
        height = diametro;
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }
}
