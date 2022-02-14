/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4bidi;

import fechas.Fecha;
import numeros.Numero;
import textos.Textos;

/**
 *
 * @author dam
 */
public class Empresa {

    Empleado[] empleados;
    final Categoria[] categorias;
    final float[] limites;
    final float[][] irpf;

    public Empresa(int nempleados) {
        empleados = new Empleado[nempleados];
        categorias = new Categoria[]{
            new Categoria("Administrativo", 1000f),
            new Categoria("Programador", 1200f),
            new Categoria("Analista", 1500f),
            new Categoria("Analista-Programador", 1800f),
            new Categoria("Jefe Junior", 2100f),
            new Categoria("Jefe Senior", 2200f)};
        limites = new float[]{1000f, 1300f, 1600f, 2000f,
            Float.MAX_VALUE};
        irpf = new float[][]{
            {0.08f, 0.1f, 0.16f, 0.21f, 0.3f},
            {0.06f, 0.08f, 0.14f, 0.25f, 0.3f},
            {0.04f, 0.05f, 0.12f, 0.17f, 0.21f},
            {0.03f, 0.04f, 0.1f, 0.15f, 0.2f}

        };

    }

    public void pedirDatosEmpleado() {
        String nombre;
        Fecha falta;
        int categoria;
        int numHijos;
        for (int nemple = 0; nemple < empleados.length;
                nemple++) {
            nombre = Textos.pedirString("NOMBRE:");
            falta = Textos.pedirFecha("fecha de alta");
            mostrar();
            categoria = Numero.pedirNumero("Categoria",
                    0, categorias.length - 1);
            numHijos = Numero.pedirNumero("Número de hijos", 0);
            empleados[nemple] = new Empleado(nombre,
                    falta, categoria, numHijos);
        }

    }

    private void mostrar() {
        for (int c = 0; c < categorias.length; c++) {
            System.out.println(c + "\t"
                    + categorias[c].getDenominacion());
        }
    }

    public void pedirHijosTrabajador() {
        int total;
        for (int nemple = 0; nemple < empleados.length; nemple++) {
            if (empleados[nemple].getHijos() != null) {
                System.out.println(empleados[nemple].getNombre());
                total = empleados[nemple].getHijos().length;
                for (int nh = 0; nh < total; nh++) {

                }
            }
        }
    }
}
