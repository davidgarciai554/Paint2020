/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author usuario
 */
public class escribeTexto {

    public int x, y;
    String texto;

    public escribeTexto(int posX, int posY, String _texto) {
        this.x = posX;
        this.y = posY;
        texto = _texto;
    }
    
    public void escribe(Graphics2D g2,int posX ,int posY,String texto){
        Font font = new Font("Tahoma", Font.PLAIN, 11);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        Rectangle2D bounds = font.getStringBounds(texto, frc);
        g2.drawString(texto, (float) posX, (float) posY);
//        g2.dispose();
        
    }

}
