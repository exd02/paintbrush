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
public class Cilindro extends D3 {
    public int raio;
    
    @Override
    public float area() {
        return ((float)Math.PI * 2 * raio * altura) + ((float)Math.PI * 2 * raio * raio);
    }
    
    @Override
    public float volume() {
        return (float)Math.PI * raio * raio * altura;
    }
    
    @Override
    public float perimetro(){
        return (float)Math.PI * 2 * raio;
    }
    
    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x, y + altura);
        g.drawLine(x + 2*raio, y, x + 2*raio, y + altura);
        g.drawOval(x, y - 10, 2 * raio, 25);
        g.drawOval(x, y + altura - 10, 2 * raio, 25);
    }
}
