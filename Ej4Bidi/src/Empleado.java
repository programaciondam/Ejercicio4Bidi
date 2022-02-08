
import fechas.Fecha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dam
 */
public class Empleado {

    private String nombre;
    private Fecha fechaAlta;
    private int categoria;
    private Hijo[] hijos;

    public Empleado(String nombre, Fecha fechaAlta,
            int Categoria, int nHijos) {
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.categoria = Categoria;
        if (nHijos != 0) {
            hijos = new Hijo[nHijos];
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public int getCategoria() {
        return categoria;
    }

    public Hijo[] getHijos() {
        return hijos;
    }

    public void setUnHijo(Hijo hijo, int pos) {
        hijos[pos] = hijo;
    }

    public void setUnHijo(Fecha fNacimiento, boolean ingresos, int pos) {
        Hijo hijo = new Hijo(fNacimiento, ingresos);
        hijos[pos] = hijo;
    }

    public int NhijosComputables() {
        int total = 0;
        if (hijos != null) {
            for (int nHijos = 0; nHijos < hijos.length; nHijos++) {
                if (hijos[nHijos].ValidarHijo()) {
                   total++;
                }
            }
        }
        return total;
    }
}
