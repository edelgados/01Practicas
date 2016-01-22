
package clases;

public class Circulo extends Figura {
private int radio;

    public Circulo(int radio) {
        this.radio = radio;
        this.nombre="Circulo";
    }
  public Circulo() {
        this.radio = 1;
    }

    @Override
   public double area() {
        //return Math.PI*radio*radio;
        return Math.PI*Math.pow(radio, 2);
    }
    public double area(int radio) {
        //return Math.PI*radio*radio;
        return Math.PI*Math.pow(radio, 2);
    }
public double perimetro(){
    return 2*Math.PI*radio;
}
   
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
       // return toString()
                return nombre+" "+radio;
    }

    
}
