package clases;

import java.util.Arrays;

public class Triangulo extends Figura {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double labo2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = labo2;
        this.lado3 = lado3;
        this.nombre = "Triangulo";
    }

    public Triangulo() {
        this.lado1 = 1;
        this.lado2 = 1;
        this.lado3 = 1;
        this.nombre = "Triangulo";
    }

    @Override
    public double area() {
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }

    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLabo2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public String toString() {
        return nombre + ", Lados: " + lado1 + "," + lado2 + "," + lado3;
    }
///metodo q determina la existencia del triangulo
    //si el mayor de los dados es menor que la suma de los otros 2
    // y mayor qque la diferencia de los otros dos entonce existe

    public boolean existe() {
        boolean ok = false;
        double mayor = lado1;
        if (lado2 > mayor) {
            mayor = lado2;
        }
        if (lado3 > mayor) {
            mayor = lado3;
        }
        double suma = (lado1 + lado2 + lado3 - mayor);
        double resta = suma * 2 - mayor;//verificar
        ok = (suma > mayor && mayor > resta);
        return ok;
    }
    /*
     Determine la existencia del triangulo.
     Si el mayor de los lados es menor que la suma de los otros dos
     y mayor que la diferencia de los otros dos entonces
     existe el triangulo
     3 4 5 ==> existe
     3 4 15 ==> NO EXISTE
     */

    public boolean verifica() {
        boolean ok = false;
        double[] nLados = {this.lado1, this.lado2, this.lado3};
        Arrays.sort(nLados);
        double mayor = nLados[2];
        double suma = (Arrays.stream(nLados).sum() - mayor);
        //double suma =  nLados[1] + nLados[0]; //suma de lados menores
        double resta = nLados[1] - nLados[0];
        ok = (suma > mayor && mayor > resta);
        return ok;
    }

}//fin clase

