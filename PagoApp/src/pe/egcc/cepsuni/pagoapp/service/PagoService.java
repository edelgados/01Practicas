/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.cepsuni.pagoapp.service;
import pe.egcc.cepsuni.pagoapp.dto.PagoDto;
/**
 *
 * @author Ceps
 */
public class PagoService {
    public void procesar(PagoDto pagoDto){
        //variables
        double ingresos, renta, neto;
        //procesos
        ingresos = pagoDto.getHorasDia()*pagoDto.getDias()*pagoDto.getPagoHoras();
        if (ingresos >1500.0){
            renta=ingresos * 0.08;
            
        }
        else{
            renta=0.0;
            
        }
        neto= ingresos-renta;
        //salida
        pagoDto.setInresos(ingresos);
        pagoDto.setRenta(renta);
        pagoDto.setNeto(neto);
    }
}
