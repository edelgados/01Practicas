package consola;

import clases.Fecha2016;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha2016 f1;
        f1 = new Fecha2016(31, 12);
        System.out.println("f1=" + f1.getEstado());
        //instrucciones de control
        if (f1.existe()) {
            System.out.println("existe");
            System.out.println("Dias transcurridos:" + f1.diasTrans());
            System.out.println("El dia es:" + f1.diaSemana());
        } //fin if
        else {
            System.out.println("no existe");
        }
    } /// main

}
