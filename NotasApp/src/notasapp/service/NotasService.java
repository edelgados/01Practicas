package notasapp.service;

import java.util.Arrays;

/**
 * @author Ing. Silvino E. Delgado Medina
 * @date 09-ene-2016
 */
public class NotasService {
    public double cMenor(double ... notas){
        Arrays.sort(notas);
        double menor = notas[0];
        return menor;
                
    }
    public double cPromedio(double... notas){
     double menor=cMenor(notas);
     double promedio = (Arrays.stream(notas).sum()-menor)/3;
     return promedio;
    }
            

}
