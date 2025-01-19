/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Graphics;

/**
 *
 * @author 12871625689
 */
public class Reta extends Ponto {
    public int x1, y1;
    
    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x1, y1);
    }
}
