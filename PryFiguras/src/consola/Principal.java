package consola;

import clases.*;

public class Principal {

    public static void main(String[] args) {
        Rectangulo rt;
        rt = new Rectangulo(2, 5);
        System.out.println("\nFigura: " + rt.toString());
        System.out.println("Area: " + rt.area());
        System.out.println("Perimetro: "+rt.perimetro());

        Circulo cir = new Circulo(2);
        System.out.println("\nFigura : " + cir.toString());
        System.out.println("Area " + cir.area());
        System.out.println("Perimetro: "+cir.perimetro());
        

        Triangulo tria = new Triangulo(3, 4, 3.5);
        System.out.println("\nFigura " + tria.toString());
        
        if (tria.verifica()) {
            System.out.println("Area      : " + tria.area());
            System.out.println("Perimetro : " + tria.perimetro());
        } else {
            System.out.println("NO EXISTE");
        }
    }

}
