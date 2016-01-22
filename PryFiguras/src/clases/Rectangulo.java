
package clases;

public class Rectangulo extends Figura{
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        nombre="Rectangulo";
    }
    public Rectangulo() {
        this.lado1 = 1;
        this.lado2 = 1;
        nombre="Rectangulo";
    }
     public double area(){
         return lado1*lado2;
     }
     public double perimetro(){
         return 2*lado1+2*lado2;
     }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return nombre+":"+lado1+","+lado2;
    }
    
}//fin clase
