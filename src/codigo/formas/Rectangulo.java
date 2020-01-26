/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author kahzerx
 */
public class Rectangulo extends Polygon {

    public Color color = null;
    public int x = 0;
    public int y = 0;
    public boolean relleno = false;

    public Rectangulo(int posX, int posY, Color _color, boolean _relleno) {
        this.x = posX;
        this.y = posY;

        relleno = _relleno;
        color = _color;
    }

    public void dibujate(Graphics2D g2, int posX, int posY, String grosor) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(Float.parseFloat(grosor)));
        g2.drawLine(x, posY, x, y);
        g2.drawLine(posX, y, x, y);
        g2.drawLine(posX, posY, posX, y);
        g2.drawLine(posX, posY, x, posY);
        if (relleno) {
            g2.fillRect(x, y,( posX-x),( posY-y));
        } else {
            g2.draw(this);
        }
    }
}
