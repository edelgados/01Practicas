package clases;

public class Fecha2016 {

    
    public static int getAnio() {
        return anio;
    }
   private int dia; 
   private int mes;
   private static int anio;///no usar la ñ
   static {anio=2016;}
///constructor

    public Fecha2016(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }
    public Fecha2016() {
        this.dia = 1;
        this.mes = 1;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    //obtener el estado de los atributos
    public String getEstado(){
        return dia+"/"+mes+"/"+anio;  
    }
    ///determinar si la fecha existe
    public boolean existe(){
        boolean fechaOK=false;
        boolean mesOK=(mes>=1 && mes <=12);//mesOk si esta en ese rango = true
        fechaOK=mesOK;
        /// validacion para dias
        //estructura condicional multiple
        boolean diaOK=false;
        switch(mes){ //selector avariable
            
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                diaOK=(dia>=1 && dia <=31);
                break;
            case 4: case 6: case 9: case 11:
                 diaOK=(dia>=1 && dia <=30);
                break;
            case 2:
                 diaOK=(dia>=1 && dia <=29);
                break;
                
        } //fin switch
            fechaOK=mesOK && diaOK;
            return fechaOK;
    } //fin  existe
    /*
    determina los dias transcurridos desde el inicio del año
    argumetnos: no tiene
    retorno: un entero dias transcurridos
    */
    public int diasTrans(){
        int total=0;
        //hallar dias trancurridos hasta el mes anterior
        for (int m=1; m < mes; m++){
            switch(m){ // contador de mes
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
               total+=31;
                break;
            case 4: case 6: case 9: case 11:
               total+=30;
                break;
            case 2:
                 total+=29;
                break;
                
        } //fin switch
        } //fin for
        
        //acumular los dias del mes actual
        total+=dia;
        return total;
    } //fin dias
    ///CALCULAR EL DIA DE LA SEMANA
    public String diaSemana(){
        String d=null;
        int r=diasTrans()%7;
        switch(r){
            case 1: d="VIERNES"; break;
            case 2: d="SABADO"; break;
            case 3: d="DOMINGO"; break;
            case 4: d="LUNES"; break;
            case 5: d="MARTES"; break;
            case 6: d="MIERCOLES"; break;
            case 0: d="JUEVES"; break;
        }
        return d;
        
    }
}//fin clase
