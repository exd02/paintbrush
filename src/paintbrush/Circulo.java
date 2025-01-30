/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

/**
 *
 * @author 12871625689
 */
public class Circulo extends D2 {
    public int raio;
    
    @Override
    public float area() { return (float) Math.PI * raio * raio;}
    
    @Override
    public float perimetro() { return 2 * (float) Math.PI * raio;}
    
    @Override 
    public void desenhar(Graphics g){
        g.setColor(cor);
        g.fillOval(x - raio, y - raio, 2 * raio, 2 * raio);
        g.setColor(corExterna);
        g.drawOval(x - raio, y - raio, 2 * raio, 2 * raio);
        super.desenhar(g);
    }
    
}
