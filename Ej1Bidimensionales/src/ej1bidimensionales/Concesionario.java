/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1bidimensionales;

import numeros.Numero;
import textos.Textos;

/**
 *
 * @author dam
 */
public class Concesionario {

    Modelo[] modelos;
    String[] tipos;
    float[] limites;
    float[][] beneficios;

    public void inicializar() {
        tipos = new String[]{"Turismo", "Deportivo", "Todo Terreno"};
        limites = new float[]{15000f, 30000f, 50000f,
            100000f, Float.MAX_VALUE};
        beneficios = new float[][]{
            {0.15f, 0.10f, 0.10f, 0.18f, 0.06f},
            {0.18f, 0.12f, 0.14f, 0.2f, 0.08f},
            {0.21f, 0.14f, 0.16f, 0.22f, 0.1f}
        };

    }

    public Concesionario() {
        inicializar();
        modelos = new Modelo[15];
    }
     public Concesionario(int numeroModelos) {
        inicializar();
        modelos = new Modelo[numeroModelos];
    }
     
public void crear(){
    for( int pos=0;pos< modelos.length; pos++)
    {
        modelos[pos]=new Modelo();
    }
}
    public void pedirDatos(){
        String nombre;
        int tipo;
        for( int nmodelo=0; nmodelo<modelos.length; nmodelo++)
        {
            nombre= Textos.pedirString("Nombre del modelo: ");
            menu();
            tipo=Numero.pedirNumero("Introduce un tipo:", 
                    0, tipos.length-1);
            modelos[nmodelo].grabar(nombre, tipo);
        }
    }

    private void menu() {
      for( int tipo=0; tipo<tipos.length; tipo++)
      {
          System.out.println(tipo+ "\t"+tipos[tipo]);
      }
    }

}
