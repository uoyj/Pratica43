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
public class Elipse implements FiguraComEixos, Serializable {
    protected double  ex;
    protected double  ey;

    public Elipse(double semix, double semiy) {
        ex = 2.0*semix;
        ey = 2.0*semiy;
    }
    
    @Override
    public double getArea()
    {
        return Math.PI*(ex/2.0)*(ey/2.0);
    }
    
    @Override
    public double getPerimetro()
    {
        return Math.PI*(3.0*((ex/2.0)+(ey/2.0))- Math.sqrt((3.0*(ex/2.0)+(ey/2.0))*((ex/2.0)+3.0*(ey/2.0))));
    }

    @Override
    public double getEixoMenor() {
        if(ex < ey) return ex;
        else return ey;
    }

    @Override
    public double getEixoMaior() {
        if(ex > ey) return ex;
        else return ey;
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName() + " [" + ex + " x " + ey + "]";
    }
}