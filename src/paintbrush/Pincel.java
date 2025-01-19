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
public class Pincel extends Ponto {
    public int espessura;

    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.fillOval(x - espessura / 2, y - espessura / 2, espessura, espessura);
    }
}
