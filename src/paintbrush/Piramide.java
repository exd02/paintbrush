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
public class Piramide extends D3 {
    public int base;
    public int largura;
    
    @Override
    public float area() {
        float areaBase = base * largura;
        float areaLateral1 = (base * (float) Math.sqrt((largura / 2) * (largura / 2) + altura * altura));
        float areaLateral2 = (largura * (float) Math.sqrt((base / 2) * (base / 2) + altura * altura));
        return areaBase + 2 * areaLateral1 + 2 * areaLateral2;
    }
    
    @Override
    public float volume() {
        return (base * largura * altura)/3;
    }
    @Override
    public float perimetro(){
        return 2 * (base + largura);
    }
    
    @Override
    public void desenhar(Graphics g) {
        g.setColor(cor);

        // base
        g.drawRect(x, y, base, largura);
        
        
        g.drawLine(x, y, x + base / 2, y - 2 * largura);
        g.drawLine(x + base, y, x + base / 2, y - 2 * largura);
        g.drawLine(x, y + largura, x + base / 2, y - 2 * largura);
        g.drawLine(x + base, y + largura, x + base / 2, y - 2 * largura);
    }
}
