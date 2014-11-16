/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Jhonatan
 */
public class Circulo extends Elipse {

    public Circulo(double raio) {
        super(raio, raio);
    }

    @Override
    public double getPerimetro() {
        return Math.PI*ex; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName() + " [" + ex + "]";
    }
    
    
    
}
