
package Ejercicio1;

import javax.swing.JOptionPane;


public class Principal {
    
    public static void main (String []args){
        Cuadrilatero c1;
        float lado1, lado2;
        lado1= Float.parseFloat(JOptionPane.showInputDialog("Diga el lado 1 del cuadrilatero: "));
        lado2= Float.parseFloat(JOptionPane.showInputDialog("Diga el lado 2 del cuadrilatero: "));
        
        if (lado1==lado2){ //Es un cuadrado
            c1 = new  Cuadrilatero(lado1);
        }else {
            c1 = new Cuadrilatero(lado1,lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
        
    }
    
}
