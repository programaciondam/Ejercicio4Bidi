
import fechas.Fecha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dam
 */
public class Hijo {

    private Fecha fNac;
    private boolean ingresos;

    public Hijo() {
    }

    public Hijo(Fecha fNac, boolean ingresos) {
        this.fNac = fNac;
        this.ingresos = ingresos;
    }

    public void informacionHijo(Fecha fNac, boolean ingresos) {
        this.fNac = fNac;
        this.ingresos = ingresos;

    }

    public Fecha getfNac() {
        return fNac;
    }

    public boolean isIngresos() {
        return ingresos;
    }
    public boolean ValidarHijo(){
        boolean computable=false;
       if(!ingresos&&fNac.Nannos()<25){
           computable=true;
       }
       return computable;
    }
}
