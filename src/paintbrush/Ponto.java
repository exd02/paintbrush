/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author 12871625689
 */
public class Ponto {
    public int x, y;
    public Color cor;
    
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x, y);
    }
}
