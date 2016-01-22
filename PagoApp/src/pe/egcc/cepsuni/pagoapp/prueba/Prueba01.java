
package pe.egcc.cepsuni.pagoapp.prueba;

import pe.egcc.cepsuni.pagoapp.dto.PagoDto;
import pe.egcc.cepsuni.pagoapp.service.PagoService;

/**
 *
 * @author Ceps
 */
public class Prueba01 {
    public static void main(String[] args) {
        PagoDto pagoDto = new PagoDto();
        pagoDto.setHorasDia(6);
        pagoDto.setDias(20);
        pagoDto.setPagoHoras(80.0);
        //proceso
        PagoService pagoService = new PagoService();
        pagoService.procesar(pagoDto);
        
        //reporte
        System.out.println("ingresos" +pagoDto.getInresos()); 
        System.out.println("Renta " +pagoDto.getRenta());
        System.out.println("Neto " +pagoDto.getNeto());
        
    }
 
}
