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
public class Retangulo extends D2 {
    public int base, largura;
    
    @Override
    public float area() { return base * largura;}
    
    @Override
    public float perimetro() { return 2 * (base + largura); }
    
    @Override public void desenhar(Graphics g){
        super.desenhar(g); 
        g.setColor (cor);
        g.fillRect(x, y, base, largura);
        g.setColor (corExterna);
        g.drawRect(x, y, base, largura);
    }
}
