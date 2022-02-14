/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4bidi;

import numeros.Numero;

/**
 *
 * @author dam
 */
public class Ej4Bidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empresa empresa;
       int nempleados;
       nempleados=Numero.pedirNumero
        ("Introduce el número de empleados", 0);
       empresa= new Empresa(nempleados);
       empresa.pedirDatosEmpleado();
       empresa.pedirHijosTrabajador();
       
    }
    
}
