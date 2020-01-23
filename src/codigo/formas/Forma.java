/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author usuario
 */
public class Forma extends Polygon {

    public Color color = null;
    public boolean relleno = false;
    //coordenadas del centro de la forma
    public int x = 0;
    public int y = 0;

    public Forma(int posX, int posY, int numLados, Color _color, boolean _relleno) {
        super(new int[numLados], new int[numLados], numLados);
        this.x = posX;
        this.y = posY;

        color = _color;
        relleno = _relleno;
    }

    public void dibujate(Graphics2D g2, int posX, int posY) {
        calculaVertices(y - posY, x - posX);
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }

    //Este metodo recalcula la posicion de los vertices en un poligono regular
    public void calculaVertices(int radio, double giro) {
        for (int i = 0; i < npoints; i++) {
            xpoints[i] = (int) (x + radio + Math.cos((2 * Math.PI * i + giro / 40) / npoints));
            ypoints[i] = (int) (y + radio + Math.sin((2 * Math.PI * i + giro / 40) / npoints));
        }
    }
}
