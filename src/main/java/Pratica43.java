
import utfpr.ct.dainf.if62c.pratica.FiguraComLados;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhonatan
 */
public class Pratica43 {
    public static void main(String[] args) {
        FiguraComLados r = new Retangulo(4,3);
        FiguraComLados q = new Quadrado(6);
        FiguraComLados t = new TrianguloEquilatero(10);
        
        System.out.println(r.getNome() + r.getPerimetro());
        System.out.println(r.getNome() + r.getArea());
        
        System.out.println(t.getNome() + t.getPerimetro());
        System.out.println(t.getNome() + t.getArea());
        
        System.out.println(q.getNome() + q.getPerimetro());
        System.out.println(q.getNome() + q.getArea());
    }
}
