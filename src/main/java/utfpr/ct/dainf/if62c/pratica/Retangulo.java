/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;
import java.io.Serializable;
/**
 *
 * @author Jhonatan
 */
public class Retangulo implements FiguraComLados, Serializable{
    protected double b;
    protected double h;

    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }
    
    @Override
    public double getLadoMenor() {
        if (b<h) return b;
        else return h;
    }

    @Override
    public double getLadoMaior() {
        if (b>h) return b;
        else return h;
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName() + " [" + b + " x " + h + "] ";
    }

    @Override
    public double getPerimetro() {
        return (2*h + 2*b);
    }

    @Override
    public double getArea() {
        return (b*h);
    }
    
}
