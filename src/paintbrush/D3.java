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
public abstract class D3 extends Ponto {
    public int altura;
    
    abstract public float area();
    abstract public float volume();
    abstract public float perimetro();
    
    @Override
    abstract public void desenhar(Graphics g);
}
