/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.cepsuni.pagoapp.dto;
//import pe.egcc.cepsuni.pagoapp.dto.PagoDto;

/**
 *
 * @author Ceps
 */
public class PagoDto {
    private int horasDia;

    public int getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPagoHoras() {
        return pagoHoras;
    }

    public void setPagoHoras(double pagoHoras) {
        this.pagoHoras = pagoHoras;
    }

    public double getInresos() {
        return inresos;
    }

    public void setInresos(double inresos) {
        this.inresos = inresos;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
    private int dias;
    private double pagoHoras;
    // resultado
    private double inresos;
    private double renta;
    private double neto;
    
}
